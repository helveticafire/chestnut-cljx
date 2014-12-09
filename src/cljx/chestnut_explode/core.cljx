(ns chestnut-explode.core
  #+clj(:gen-class))

(defn foo-cljx [x]
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

#+clj
(defn -main [& args]
  (println  "Hello, World!"))
