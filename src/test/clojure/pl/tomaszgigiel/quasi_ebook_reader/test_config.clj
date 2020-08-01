(ns pl.tomaszgigiel.quasi-ebook-reader.test-config
  (:require [clojure.test]))

(defn setup [] ())
(defn teardown [] ())

(defn once-fixture [f]
  (setup)
  (f)
  (teardown))

(defn each-fixture [f]
  (setup)
  (f)
  (teardown))
