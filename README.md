Spring Boot Project:

This case scenario is a Software Engineering Company Information System, this company has three departments: Development, HR, and Sales. 
Each department will have its own  micro service with hardcoded data. 
The development unit has a task to collect the data from the other two departments. 
This will be done via a REST call from the development micro service to the other micro services 
that will send their data to the development unit so that all the data of the company will be available to this unit. Finally, using the discovery server Eureka, the development 
unit will be able to fetch the data from the other micro services without having to know where this data is located or the URL of the micro service its 
getting the data from.
