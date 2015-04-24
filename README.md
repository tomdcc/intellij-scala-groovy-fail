# IntelliJ IDEA Play / Scala / Groovy fail example

If you load up the groovy-module as its own project, the compile will work
and the test runs. However in a project that already has scala / play support,
it does not.

You can click through to the `TestHelper` class from `MyTest`, so IDEA clearly
has some idea about what's going on, and it doesn't show `TestHelper` as red
in the editor window, but the main compiler used can't find it.

![Screenshot](http://i.imgur.com/QhqUUzs.png)
