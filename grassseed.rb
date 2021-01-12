cost = gets.to_f
if cost > 0 and cost <=100
   n = gets.to_i
   if n > 0 and n <= 100
       ans = 0
       for i in (0...n)
          l,w = gets.chomp.split.map(&:to_f)
          ans = ans + (l * w)
       end
       print("%.7f"%[ans*cost])
    end
end
