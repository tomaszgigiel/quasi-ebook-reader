(ns pl.tomaszgigiel.quasi-ebook-reader.core-test
  (:require [clojure.test :as tst])
  (:require [pl.tomaszgigiel.quasi-ebook-reader.core :as core])
  (:require [pl.tomaszgigiel.quasi-ebook-reader.test-config :as test-config]))

(tst/use-fixtures :once test-config/once-fixture)
(tst/use-fixtures :each test-config/each-fixture)
