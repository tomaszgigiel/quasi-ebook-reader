(ns pl.tomaszgigiel.quasi-ebook-reader.core
  (:require [clojure.edn :as edn])
  (:require [clojure.java.io :as io])
  (:require [clojure.string :as str])
  (:require [clojure.tools.logging :as log])
  (:require [lock-key.core :as lock-key])
  (:require [pl.tomaszgigiel.quasi-ebook-reader.cmd :as cmd])
  (:gen-class))

(defn- encrypt [prop]
  (let [in (:quasi-ebook-reader.input-path prop)
        out (:quasi-ebook-reader.output-path prop)
        password (:quasi-ebook-reader.password prop)
        plain (slurp in)
        encrypted (String. ^bytes (lock-key/encrypt plain password))]
    (log/debug in)
    (log/info out)
    (log/debug password)
    (log/debug plain)
    (log/debug encrypted)
    (spit out encrypted)))

(defn- work [path]
  (let [props (with-open [r (io/reader path)] (edn/read (java.io.PushbackReader. r)))]
    (doall (map encrypt props))))

(defn -main [& args]
  "quasi-ebook-reader: quasi ebook reader"
    (let [{:keys [uri options exit-message ok?]} (cmd/validate-args args)]
      (if exit-message
        (cmd/exit (if ok? 0 1) exit-message)
        (work (first args)))
      (log/info "ok")
      (shutdown-agents)))
