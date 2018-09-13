# cerner_2^5_2018
def greatest_common_divisor(num1,num2)
  if num2!=0
  	 greatest_common_divisor(num2,num2%num1)
  else
  	num1
  end
end	

puts  greatest_common_divisor(2,5)