# AddressDataService
Address Data Service to be used along with Postcode Rest Service https://github.com/Vishalckc/postcode_rest_service.git as a 3rd party service
This runs on port 8081. You can change the default port settings in case you want to run on a different port from application.properties
This API serves address data for a given postcode value. This API will be enhanced for future usages
Default Usage- 
                GET ​: ​/api/v1/address/postcodes/{postcode} ​ , which returns
                { ​"type" ​: ​"HOME", ​"postcode" ​: ​"EC2 3CD" ​} ​ in the response for that ​{postcode}
