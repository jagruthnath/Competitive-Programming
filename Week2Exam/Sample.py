from collections import Counter
s = ["anagram","Keep","Mother In Law","School Master","ASTRONOMERS","Toss","joy","Debit Card","SiLeNt CAT","Dormitory"]
t = ["nagaram","Peek","Hitler Woman","The Classroom","NO MORE STARS","Shot","enjoy","Bad Credit","LisTen AcT","Dirty Room"]
for i in range(10):
    counts=Counter(s[i].lower())
    countt=Counter(t[i].lower())
    nols = 0
    nola = 0
    for i in counts.iterkeys():
        if i != " ":
            nols+=1
            if counts.get(i) == countt.get(i):
                nola+=1
    nolt = 0
    for i in countt.iterkeys():
        if i != " ":
            nolt+=1
    big = max(nols,nolt)
    print big == nola