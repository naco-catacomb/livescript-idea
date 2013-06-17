LiveScriptIdea is a plugin for your [JetBrains](http://www.jetbrains.com) IDE.

## Development

LiveScriptIdea is developed with [IntelliJ IDEA 10CE](http://www.jetbrains.com/idea/).

### Development setup

* You must have a JDK 1.6 and Ant installed.
* Download [IntelliJ IDEA 12CE](http://www.jetbrains.com/idea/download/index.html) to develop for the IDEA X platform
and [IntelliJ IDEA 9](http://devnet.jetbrains.net/docs/DOC-1228) to verify the build against the older maia platform.
* Fork LiveScriptIdea and check your personal repository out.
* Open LiveScriptIdea Project with [IntelliJ IDEA 12CE] and Make and Prepare Plugin Module.

### Ant Build
* Check out IntelliJ IDEA Community from `git://git.jetbrains.org/idea/community.git`.
* Go into that directory and build IDEA by just calling `ant` on the command line.
* Make a copy of that freshly cloned git repository for the maia branch.
* Go into that directory and checkout the maia branch.
* Build IDEA for maia by just calling `ant` on the command line.
* Go to the LiveScriptIdea directory, copy `build.properties.sample` to `build.properties` and modify the path to the
source code and installed application for both ideax and maia.
* Open the LiveScriptIdea project in your downloaded IDEA and go to `File > Project Settings`
* Under SDK add a new IntelliJ IDEA Plugin SDK by pointing it to the downloaded IDEA version.
* Add the freshly compiled `<idea>/out/dist.all.ce/lib/idea.jar` to the classpath.
* Add the sources from IDEA repository for easy API discovering.
* Use Ant to run the tests, compile, test and install the plugin.
* You can also debug the plugin by creating a Plugin launch configuration. I added
`-Xmn100M -Xms500M -Xmx500M -XX:MaxPermSize=128m` to the VM parameters and selected make and the compile Ant target
under the 'Before launch' hooks

### Useful links

* [Writing Plugins](http://www.jetbrains.org/display/IJOS/Writing+Plug-ins)
* [The Basics of Plugin Development for IntelliJ IDEA](http://www.jetbrains.com/idea/documentation/howto_03.html)
* [IntelliJ IDEA Plugin Development](http://confluence.jetbrains.net/display/IDEADEV/PluginDevelopment)
* [IntelliJ IDEA Plugin Development FAQ](http://confluence.jetbrains.net/display/IDEADEV/Plugin+Development+FAQ)
* [JFlex Documentation](http://jflex.de/docu.html)
* [IDEA Extension Points](http://git.jetbrains.org/?p=idea/community.git;a=blob;f=platform/platform-resources/src/META-INF/LangExtensionPoints.xml;hb=HEAD)
