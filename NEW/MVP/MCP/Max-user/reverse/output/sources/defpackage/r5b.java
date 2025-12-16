package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class r5b {
    public static final Pattern a = Pattern.compile("[^\\p{L}\\p{Nd} ]+");

    public static CharSequence a(String str, f7b f7bVar) {
        if (str.length() != 0) {
            qb5 qb5Var = f7bVar.j;
            if (qb5Var.a(0, str)) {
                List listC = qb5Var.c(str);
                if (!listC.isEmpty()) {
                    return (CharSequence) ue3.G(listC);
                }
            }
            String strReplaceAll = a.matcher(str).replaceAll("");
            if (strReplaceAll.length() != 0 && !vmf.F(strReplaceAll)) {
                List listS = vmf.S(strReplaceAll, new String[]{" "}, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listS) {
                    if (!vmf.F((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                StringBuilder sb = new StringBuilder();
                int iMin = Math.min(arrayList.size(), 2);
                for (int i = 0; i < iMin; i++) {
                    String str2 = (String) arrayList.get(i);
                    if (str2.length() != 0 && !vmf.F(str2)) {
                        sb.append(Character.toUpperCase(str2.charAt(0)));
                    }
                }
                return sb.toString();
            }
            if (str.length() > 0) {
                if (str.length() != 0) {
                    return String.valueOf(str.charAt(0));
                }
                throw new NoSuchElementException("Char sequence is empty.");
            }
        }
        return "";
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        int i = charSequence2 == null ? 1 : 2;
        Pattern pattern = a;
        String strReplaceAll = pattern.matcher(charSequence).replaceAll("");
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        String strReplaceAll2 = pattern.matcher(charSequence2).replaceAll("");
        StringBuilder sb = new StringBuilder();
        List listJ = ve3.j(vmf.x(strReplaceAll), vmf.x(strReplaceAll2));
        for (int i2 = 0; i2 < i; i2++) {
            Character ch = (Character) ue3.J(i2, listJ);
            if (ch != null) {
                sb.append(ch.charValue());
            }
        }
        return sb.toString();
    }
}
