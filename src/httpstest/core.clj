(ns httpstest.core
  (:gen-class :main true))

(defn test-https
  "Try to fetch some HTTPS data from google." []
  (-> (try (slurp "https://google.com")
           (catch Exception e nil))
      (if "Success" "Failure")))

(defn -main [& args]
  (println (test-https)))
