# shadow-cljs-devcards

`shadow-cljs` ClojureScript build tool

`devcards` Devcards makes it simple to interactively surface code examples that have a visual aspect into a browser interface

## Setup

This example should provide an overview of how devcards should be configured with `shadow-cljs`. 

Most of the configuration happens in the `shadow-cljs.edn` file. This is where we create `:browser-test` build that picks up all files ending in `-test.*` that are inside the `test` directory. You can easily change that, for more details see `shadow-cljs.edn` file. 

Some other things included are syntax highlighting and markdown support. 