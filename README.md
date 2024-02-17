MediaWiki support for PhpStorm
==============================

[MediaWiki](https://www.mediawiki.org/wiki/MediaWiki) IntelliJ plugin
for [JetBrains PhpStorm](https://www.jetbrains.com/phpstorm/), mostly providing standardised code styles for PHP,
JavaScript, CSS and HTML. It also provides a shortcut to the [MediaWiki](https://www.mediawiki.org/wiki/MediaWiki)
search from the context menu.

To configure/use the MediaWiki Code Styles, go to Preferences > Editor > Code Style > PHP/CSS/Html/JavaScript, and then
select "Set from..." and select "MediaWiki".

Note, this doesn't provide MediaWiki file or Wikitext syntax highlighting support.

The code style support is now somewhere deprecated now that IntelliJ supports [`mediawiki/mediawiki-codesniffer`](https://www.jetbrains.com/help/idea/using-php-code-sniffer.html#enabling-tool-inspection).

[JetBrains Plugin Repository :: MediaWiki Support](http://plugins.jetbrains.com/plugin/7439)

License : GNU GPL v2 or later

Building a release
==================

`./gradlew buildPlugin`
