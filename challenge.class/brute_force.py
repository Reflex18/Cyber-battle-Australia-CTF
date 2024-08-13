import hashlib

def to_hex(input_string):
    # Compute MD5 hash and return it in uppercase hexadecimal format
    md5_hash = hashlib.md5(input_string.encode()).hexdigest().upper()
    return md5_hash

def brute_force_target():
    target_hash = "AD2E1C419EB66C002C3BDD7BAD415203"
    
    # Iterate over all possible combinations
    for b in range(1000):  # b000 to b999
        for e in range(10):  # e0 to e9
            for d in range(1000):  # d000 to d999
                input_string = f"ctftech{{b{b:03d}-e{e}ba-{d // 100}d{d % 100:02d}-11ec}}"
                if to_hex(input_string) == target_hash:
                    return input_string

    return None

correct_input = brute_force_target()
if correct_input:
    print(f"Correct input found: {correct_input}")
else:
    print("No matching input found.")
