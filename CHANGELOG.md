# Changelog

## 2024-01-21 Changing version of Javalin to 5.6.3 and slf4j-simple to 2.0.0. Adding Dockerfile, CHANGELOG.md files.

**Commit by @Frajder for pull request**

### Added
- Added `Dockerfile` to support containerization.

### Changed
- Upgraded Javalin from version 4.0.0 to 5.6.3. This update brings in new features and improvements from the latest Javalin release.
- Updated SLF4J binding from version 1.7.32 to 2.0.0 to resolve compatibility issues with SLF4J 2.0.x's `ServiceLoader` mechanism.
- 'Hello, World!' message has been added to `home.html`

### Fixed
- In Javalin 5.x, the method for handling static files has been changed to `staticFiles.add`.  
- Static files has been moved to `src/main/resources/static`.
