def calculate_sum(a, b):
    return a + b

def calculate_difference(a, b):
    return a - b

def calculate_product(a, b):
    return a * b

def calculate_division(a, b):
    if b == 0:
        raise ZeroDivisionError("Division by zero is not allowed")
    return a / b 


def calculate_power(a, b):
    return a ** b 

def calculate_modulo(a, b):
    if b == 0:
        raise ZeroDivisionError("Division by zero is not allowed")
    return a % b


if __name__ == "__main__":
    x = 10
    y = 5

    print("Sum:", calculate_sum(x, y))
    print("Difference:", calculate_difference(x, y))
    print("Product:", calculate_product(x, y))
    print("Division:", calculate_division(x, y))

    print("Power:", calculate_power(x, y))
    print("Modulo calc:", calculate_modulo(x, y))
