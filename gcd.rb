# cerner_2^5_2018
def greatest_common_divisor(num1,num2)  
  greatest_common_divisor(num2,num2%num1) if num2!=0
  num1
end	

puts  greatest_common_divisor(2,5)