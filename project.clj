(defproject clj-libtcod "0.1.0-SNAPSHOT"
  :description "Clojure bindings to the libtcod roguelike library."
  :url "https://github.com/cdelorey/clj-libtcod"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-native "0.9.3"]]
  :main clj-libtcod.core
  :source-paths ["src"])
