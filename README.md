# Maven Tycho Eclipse example

This example shows how to build a complete (and functional) [P2](https://www.eclipse.org/equinox/p2/) Eclipse update site with [Maven](https://maven.apache.org/) and [Tycho](https://projects.eclipse.org/projects/technology.tycho).
It can be used to create Eclipse update sites from various projects and features *headlessley*, e.g., with the help of a CI pipeline and without the need to run Eclipse tasks manually.

[![CI](https://github.com/maxkratz/maven-tycho-eclipse-example/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/maxkratz/maven-tycho-eclipse-example/actions/workflows/ci.yml)


## Structure

| Name                                                        | Type                        | Purpose                                                                                         |
| ----------------------------------------------------------- | --------------------------- | ----------------------------------------------------------------------------------------------- |
| [org.example.impl](org.example.impl/)                       | Eclipse (plug-in) project   | Contains the implementation of a feature or an Eclipse plug-in (in this case an empty example). |
| [org.example.impl.feature](org.example.impl.feature/)       | Eclipse Feature project     | Contains the necessary information for the feature to export.                                   |
| [org.example.impl.updatesite](org.example.impl.updatesite/) | Eclipse Update Site project | Contains the update site configuration (to include the feature above).                          |
| [org.example.impl.tests](org.example.impl.tests/)           | Eclipse (plug-in) project   | Contains all tests and test-related content.                                                    |
| [ci.yml](.github/workflows/ci.yml)                          | File                        | Example GitHub Actions configuration to build and push the update site.                         |
| [pom.xml](pom.xml)                                          | File                        | Maven configuration file that contains the parent group/porject.                                |


## How to build

- Build the project + feature + update site:  
  `$ mvn clean package`
- Build + install the project to the local `.m2/` folder:  
  `$ mvn clean install`
- Run all tests:  
  `$ mvn clean verify`
- Change the version of the plug-in to a new semver (e.g., before publishing a new release):  
  `$ mvn versions:set -DnewVersion=0.0.2-SNAPSHOT`


## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for more details.
