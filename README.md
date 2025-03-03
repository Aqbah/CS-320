# CS-320 Reflection

Ensuring software functionality and security requires a structured approach that includes proper testing, validation, and security best practices. Throughout my projects, I followed a test-driven development (TDD) approach by writing JUnit tests to validate functionality before deployment. For example, in ContactTest.java, I verified that contact information met the specified constraints, such as enforcing a 10-character limit on names and ensuring phone numbers contained exactly 10 digits.

Security is another crucial aspect of software development. I ensured data integrity by validating user inputs to prevent malformed or unexpected data entries. Additionally, applying encapsulation principles in Contact.java (such as private fields with controlled access through getters and setters) helped restrict direct modifications to data, reducing the risk of accidental corruption or unauthorized changes.

Understanding user needs involves analyzing requirements, constraints, and expected outcomes before designing a solution. In the Contact Service, I interpreted the requirements to ensure that every contact record had a unique ID, a name within the character limit, and a valid phone number. By implementing validation methods (such as valName() and valNo()), I ensured that the system enforced business rules while maintaining usability.

Furthermore, iterative testing played a key role in refining the program based on feedback. Writing unit tests helped identify edge cases that might impact real-world users, such as attempting to delete a nonexistent contact (testDelContNonExist() in ContactServiceTest.java). This proactive approach allowed me to align the program's behavior with user expectations and system constraints.

I approach software design by following a modular and structured methodology that emphasizes scalability, maintainability, and robustness. In my projects, I adhered to object-oriented design principles by organizing the application into separate classes (Contact, ContactService) to improve code reusability and clarity.

Additionally, I incorporated unit testing as an integral part of the design process. Writing tests before implementing features ensured that my solutions met requirements and prevented regression issues. My approach also involved careful consideration of edge cases, such as invalid inputs or boundary conditions, to make the system resilient against unexpected behaviors.

By following best practices in software architecture, testing, and validation, I was able to develop well-structured, functional, and secure applications that align with both technical and user requirements.

