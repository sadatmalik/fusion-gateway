# Fusion Gateway

To see the routes managed by the Gateway server, we can list the routes via the `actuator/gateway/routes` endpoint 
on the Gateway server.

Spring Actuator exposes a POST-based endpoint route, `actuator/gateway/refresh`, that will cause the Gateway server 
to reload its route configuration.