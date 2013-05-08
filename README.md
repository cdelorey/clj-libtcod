clj-libtcod
=======
Clojure bindings to the [libtcod] library.
`clj-libtcod` uses [clj-native] to generate JNA direct mappings.
`clj-libtcod` currently only provides wrapper functions for libtcod's console module.

[libtcod]: http://doryen.eptalys.net/libtcod/
[clj-native]: https://github.com/bagucode/clj-native


Installation
-----------
Make sure libtcod and SDL are properly installed on your system.
Add the following to your `project.clj`'s dependencies:

    [clj-libtcod "0.1.0-SNAPSHOT"]


Usage
-----
* Add the following to your namespace declaration:

        (:use [clj-libtcod.core])


* Call `(load-libtcod)` before using any libtcod functions.


License
--------
Distributed under the Eclipse Public License.

