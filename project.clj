(defproject quasi-ebook-reader "1.0.0.0-SNAPSHOT"
  :description "quasi-ebook-reader: quasi ebook reader"
  :url "https://tomaszgigiel.github.io/quasi-ebook-reader/"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.cli "0.4.2"]
                 [org.clojure/tools.logging "0.5.0"]
                 [lock-key "1.5.0"]]

  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure" "src/main/clojure"]
  :resource-paths ["src/main/resources"]
  :target-path "target/%s"
  :jar-name "quasi-ebook-reader.jar"
  :uberjar-name "quasi-ebook-reader-uberjar.jar"
  :main pl.tomaszgigiel.quasi-ebook-reader.core
  :aot [pl.tomaszgigiel.quasi-ebook-reader.core]
  :profiles {:test {:resource-paths ["src/test/resources"]}}
)
