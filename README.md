# Load Shedding in Spring Boot
- Using concurrent In-Flight requests > 3 to return `503 Server Unavailable`
- Use Servlet Filter to track the inflight requests and check threshold.
