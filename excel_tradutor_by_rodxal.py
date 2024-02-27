#By Dr. Rodrigo Xavier de Almeida Leão - 2023#

!pip install googletrans

import pandas as pd
from googletrans import Translator

translator = Translator()

#this code translates a excel column from 'l1' to 'l2'
#the column to translate must have its 1st element = 'totrans'

#step1 -> read a file.xlsx

df = pd.read_excel('~/scripts/file.xlsx')
print(df.head())

#step2 -> translate
 
list_trad = list()
for tx in df['totrans']:     
 list_trad.append(translator.translate(tx, dest= 'l1').text)

#step3 -> output to new excel file

df['translation']= pd.DataFrame(list_trad)
df.to_excel('translated.xlsx')
