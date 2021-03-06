(defproject common-actors "0.1.3"
  :description "The common actor between calculation and creation"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot [common-actors.core]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.typesafe.akka/akka-actor_2.10 "2.3.6"]
                 [com.typesafe.akka/akka-remote_2.10 "2.3.6"]
                 [com.typesafe.akka/akka-kernel_2.10 "2.3.6"]]
  :plugins [[lein-git-deps  "0.0.1-SNAPSHOT"]]
  :source-paths [".lein-git-deps/okku/src" "src"]
  :git-dependencies [["https://github.com/jacklund/okku.git"]])
