package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class xl6 {
    public static final yid a = new yid("[^\\p{L}\\p{N}\\p{P}\\p{Z}]");

    public static vl6 a(String str) {
        if (vmf.F(str)) {
            return null;
        }
        String strL = o7e.l(str);
        String upperCase = str.toUpperCase(Locale.getDefault());
        yid yidVar = a;
        String strB = yidVar.b(strL, "");
        vl6 vl6Var = strB.length() > 0 ? new vl6(strB, yidVar.b(upperCase, ""), null) : null;
        return new vl6(strL, upperCase, (fni.a(vl6Var != null ? vl6Var.b : null, upperCase) && fni.a(vl6Var.a, strL)) ? null : vl6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vl6 b(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            tv3 tv3Var = (tv3) it.next();
            if (!tv3Var.equals(tv3.e)) {
                String strA = tv3Var.a();
                if (strA.length() != 0) {
                    vl6Var = strA;
                }
            }
            if (vl6Var != null) {
                arrayList.add(vl6Var);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                vl6 vl6VarA = a((String) it2.next());
                if (vl6VarA != null) {
                    arrayList2.add(vl6VarA);
                }
            }
            if (!arrayList2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                Iterator it3 = arrayList2.iterator();
                int i = 0;
                while (it3.hasNext()) {
                    int i2 = i + 1;
                    vl6 vl6Var = (vl6) it3.next();
                    String str = vl6Var.a;
                    vl6 vl6Var2 = vl6Var.c;
                    sb.append(str);
                    sb2.append(vl6Var.b);
                    String str2 = vl6Var2 != null ? vl6Var2.b : null;
                    if (str2 != null && str2.length() != 0) {
                        sb4.append(vl6Var2 != null ? vl6Var2.b : null);
                    }
                    String str3 = vl6Var2 != null ? vl6Var2.a : null;
                    if (str3 != null && str3.length() != 0) {
                        sb3.append(vl6Var2 != null ? vl6Var2.a : null);
                    }
                    if (i != ve3.i(arrayList2)) {
                        sb.append(',');
                        sb2.append(',');
                        if (sb4.length() > 0) {
                            sb4.append(',');
                        }
                        if (sb3.length() > 0) {
                            sb3.append(',');
                        }
                    }
                    i = i2;
                }
                return new vl6(sb.toString(), sb2.toString(), (sb3.length() > 0 || sb4.length() > 0) ? new vl6(sb3.toString(), sb4.toString(), null) : null);
            }
        }
        return null;
    }

    public static String c(String str) {
        return ho7.i("*", str, "*");
    }

    public static String d(String str) {
        return ho7.i("%", str, "%");
    }

    public static wl6 e(String str) {
        vl6 vl6VarA = a(str);
        if (vl6VarA == null) {
            return null;
        }
        vl6 vl6Var = vl6VarA.c;
        String str2 = vl6VarA.a;
        String str3 = vl6VarA.b;
        return new wl6(new vl6(c(str2), c(str3), vl6Var != null ? vl6.a(vl6Var, c(vl6Var.b)) : null), new vl6(d(str2), d(str3), vl6Var != null ? vl6.a(vl6Var, d(vl6Var.b)) : null));
    }
}
