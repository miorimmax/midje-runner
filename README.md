# midje-runner

`midje-runner` is a small library for discovering and running tests in projects using native Clojure deps (i.e, those that use only Clojure's built-in dependency tooling, not Leiningen/boot/etc.).

It is heavily inspired on Cognitect's [test-runner](https://github.com/cognitect-labs/test-runner).

# Usage

Include a dependency on this project in your `deps.edn`. You will probably wish to put it in test alias. You can also include the main namespace invocation using Clojure's :main-opts key. For example:

```clojure
:aliases {:test {:extra-paths ["test"]
                 :extra-deps {midje-runner {:git/url "git@github.com:miorimmax/midje-runner"
                                            :sha "git sha from master"}}
                 :main-opts ["-m" "midje-runner.runner"]}}
```

Then, invoke Clojure via the command line, invoking the `test` alias:

```bash
clj -Atest
```

This will scan your project's `test` directory for any tests defined
using Midje and run them.
