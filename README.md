# Example project for SonarQube-Multi-Project-Plugin for Gradle

This is an example gradle-project using the [SonarQube-Multi-Project-Plugin for Gradle](https://github.com/Argelbargel/sonarqube-multiproject-gradle-plugin)

## Documentation

Simply execute `gradlew`. This will build the project and analyze it with the Sonarqube-Server at `http://localhost:9000`.
Optionally set the URL to your Sonarqube-Server with `gradlew -Dsonar.host.url=<url>`.

This will add the analysis of the project to Sonarqube. It should contain three modules:
- `main` contains the analysis of the root-project's sources
- `common-module` and `extension-module` contains the code of the sub-projects

### License

Licensed under the [GNU Lesser General Public License, Version 3.0](http://www.gnu.org/licenses/lgpl.txt)

