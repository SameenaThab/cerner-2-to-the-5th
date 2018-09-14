# day 2 submission calculate error percentage of a predicted value cerner_2^5_2018
import numpy as np
def calculate_error_percentage(true_values,predicted_values):
    diff=predicted_values-true_values
    errorindexes=np.where(diff!=0)[0]
    error=errorindexes.shape[0]
    return (error/true_values.shape[0])*100

true_values = np.asarray([3, 23, 5, 60])
predicted_values = np.asarray([3, 21, 5, 66])
print(calculate_error_percentage(true_values,predicted_values))