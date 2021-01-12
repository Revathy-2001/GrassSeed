cost = float(input())
if 0 < cost <= 100:
    num = int(input())
    if 0 < num <= 100:
        ans = 0
        for i in range(0,num):
           lst = list(input().split())
           l = float(lst[0])
           w = float(lst[1])
           ans = ans + (l*w)
        print("{:.7f}".format(ans*cost))
     
     
     