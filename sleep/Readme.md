# Minimal Sleep code to test java advanced params

## Prometheus JMX Agent

-javaagent:/home/rgordill/git/java-dynamics/prometheus-agent/jmx_prometheus_javaagent-0.17.0.jar=9090:/home/rgordill/git/java-dynamics/prometheus-agent/config.yaml

## Show memory consumption

-XshowSettings:system

## In containers

podman run --cpus 1.0 -m 1024Mb --rm -it registry.access.redhat.com/ubi8/openjdk-17 java -XshowSettings:system version

## Grafana

podman run -d -p 3000:3000 docker.io/grafana/grafana:9.0.3


## Notes

On 64-bit platforms, the Compressed class space is enabled by default with a default reserved space size of 1 Gigabytes (GB). The reserved space for the Compressed class space is set up at JVM initialization time, and its size can not be changed later. The maximum reserved space size that the Hotspot JVM allows for the Compressed class space is 3GB, and it can be configured using the JVM option -XX:CompressedClassSpaceSize=n.

jcmd wildfly help VM.metaspace

-XX:NativeMemoryTracking=summary


-XX:+UseG1GC 
-Xms512m -Xmx1024m 
-XX:ReservedCodeCacheSize=262m -XX:NonNMethodCodeHeapSize=6m -XX:NonProfiledCodeHeapSize=128m -XX:ProfiledCodeHeapSize=128m 
-XX:MaxMetaspaceSize=192m -XX:CompressedClassSpaceSize=256m