open module ${groupId}.${rootArtifactId}.${artifactId}.test {
    requires ${groupId}.${rootArtifactId}.${artifactId};
    requires ${groupId}.${rootArtifactId}.tck;
    requires org.junit.jupiter.api;
    requires org.junit.jupiter.engine;
    exports ${groupId}.${rootArtifactId}.${artifactId}.test;
}