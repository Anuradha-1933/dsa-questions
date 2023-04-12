class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in s:
            if(i == '(' or i=='{' or i=="["):
                stack.append(i)
            else:
                if i == ')':
                    if(len(stack)>0 and stack[-1] == '('):
                        stack.pop(-1)
                    else:
                        return False
                elif i == '}':
                    if(len(stack)>0 and stack[-1] == '{'):
                        stack.pop(-1)
                    else:
                        return False
                elif i == ']':
                    if(len(stack)>0 and stack[-1] == '['):
                        stack.pop(-1)
                    else:
                        return False
        if(len(stack)==0):
            return True