# Multithreaded Web Server
[Architecture and Learning](https://github.com/PrabeshPP/ThreadServe/blob/master/System%20design.pdf)
## Overview
This project is a high-performance multithreaded web server designed to handle over 1 million requests per minute using a thread pool. The server efficiently manages incoming HTTP requests by distributing them among worker threads, ensuring optimal resource utilization and minimizing response time.

## Features
- **Multithreaded architecture**: Utilizes a thread pool to handle concurrent client requests efficiently.
- **High throughput**: Capable of processing over 1 million requests per minute.
- **Support for TCP and UDP**: Implements networking communication using both protocols.
- **Efficient resource management**: Threads are reused, reducing overhead from frequent thread creation and destruction.
- **TCP Three-Way Handshake**: Implements the TCP connection establishment process for reliable communication.
- **Basic HTTP request handling**: Can serve static files and respond to simple HTTP GET requests.

## Learning Outcomes
Through this project, I gained a deep understanding of:
- Multithreading and thread synchronization techniques.
- Thread pool implementation for managing concurrent tasks.
- TCP three-way handshake process and its significance in reliable communication.
- Differences between TCP and UDP in network communication.
- Handling high-load scenarios in a web server environment.

## Technologies Used
- **Programming Language**: `Java`
- **Networking APIs**: `Java Networking API (java.net)`
- **Threading Model**: `Java Concurrency API (Executors, ThreadPoolExecutor)`

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/PrabeshPP/ThreadServe
   cd multithreaded-web-server
   ```
2. Compile the server:
   ```sh
   javac Server.java
   ```
3. Start the server:
   ```sh
   java WebServer 8010
   ```
4. Test with a web browser or use `curl`:
   ```sh
   curl http://localhost:8010
   ```

## Future Improvements
- Implement support for HTTP/1.1 Keep-Alive connections.
- Add logging and monitoring features.
- Improve request parsing for dynamic content handling.
- Implement load balancing strategies.

## Author
**Prabesh Bista**

## License
This project is licensed under the **MIT License**.




