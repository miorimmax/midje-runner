(ns midje-runner.runner
  (:require [midje.repl :as mr]))

(defn -main [& args]
  (let [[arg1 & arg-rest] (map symbol args)]
    (case arg1
      'auto (mr/autotest)
      nil (mr/load-facts :all)

      (apply mr/load-facts (conj arg-rest arg1)))))
