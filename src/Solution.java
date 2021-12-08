class Solution {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        int tem;
        int[] ch = new int[13]; //逆对应1，4，5，9，10，40，50，90，100，400，500，900，100位置
        for(int i=0;i<13;i++){
            tem =  num / getVal(i);
            if(tem > 0){
                num -= tem * getVal(i);
                ch[i] += tem;
            }
        }
        for(int i=0;i<13;i++){
            while(ch[i] != 0){
                res.append(getStr(i));
                ch[i]--;
            }
        }
        return res.toString();
    }

    public int getVal(int i){
        switch (i){
            case 0: return 1000;
            case 1: return 900;
            case 2: return 500;
            case 3: return 400;
            case 4: return 100;
            case 5: return 90;
            case 6: return 50;
            case 7: return 40;
            case 8: return 10;
            case 9: return 9;
            case 10:return 5;
            case 11:return 4;
            case 12:return 1;
            default:return 0;
        }
    }

    public String getStr(int i){
        switch (i){
            case 0: return "M";
            case 1: return "CM";
            case 2: return "D";
            case 3: return "CD";
            case 4: return "C";
            case 5: return "XC";
            case 6: return "L";
            case 7: return "XL";
            case 8: return "X";
            case 9: return "IX";
            case 10:return "V";
            case 11:return "IV";
            case 12:return "I";
            default:return "";
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.intToRoman(4012);
        System.out.println("s = " + s);
    }
}