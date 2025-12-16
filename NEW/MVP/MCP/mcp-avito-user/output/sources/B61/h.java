package b61;

import c61.C26948a;
import c61.C26950c;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.p;

/* compiled from: Remapper.java */
/* loaded from: classes7.dex */
public abstract class h {
    public final String c(String str) {
        return j(B.v(str)).h();
    }

    public final String f(String str) {
        if ("()V".equals(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("(");
        for (B b12 : B.d(str)) {
            sb2.append(j(b12).h());
        }
        B bW2 = B.w(B.r(str), str.length(), str);
        if (bW2 == B.f418135e) {
            sb2.append(")V");
        } else {
            sb2.append(')');
            sb2.append(j(bW2).h());
        }
        return sb2.toString();
    }

    public final String h(String str, boolean z12) {
        if (str == null) {
            return null;
        }
        C26948a c26948a = new C26948a(str);
        C26950c c26950c = new C26950c();
        i iVar = new i(c26950c, this);
        if (z12) {
            C26948a.b(str, 0, iVar);
        } else {
            c26948a.a(iVar);
        }
        return c26950c.f57665a.toString();
    }

    public final String i(String str) {
        if (str == null) {
            return null;
        }
        return j(B.p(str)).k();
    }

    public final B j(B b12) {
        switch (b12.t()) {
            case 9:
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = 0; i12 < b12.j(); i12++) {
                    sb2.append('[');
                }
                sb2.append(j(B.w(b12.f418146c + b12.j(), b12.f418147d, b12.f418145b)).h());
                return B.v(sb2.toString());
            case 10:
                String strA = a(b12.k());
                return strA != null ? B.p(strA) : b12;
            case 11:
                return B.o(f(b12.h()));
            default:
                return b12;
        }
    }

    public final String[] k(String[] strArr) {
        String[] strArr2 = null;
        for (int i12 = 0; i12 < strArr.length; i12++) {
            String strI = i(strArr[i12]);
            if (strI != null) {
                if (strArr2 == null) {
                    strArr2 = (String[]) strArr.clone();
                }
                strArr2[i12] = strI;
            }
        }
        return strArr2 != null ? strArr2 : strArr;
    }

    public final Object l(Object obj) {
        if (obj instanceof B) {
            return j((B) obj);
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            int i12 = pVar.f418256a;
            i = i12 <= 4 ? 1 : 0;
            String str = pVar.f418257b;
            String strI = i(str);
            String str2 = pVar.f418258c;
            String str3 = pVar.f418259d;
            return new p(strI, i != 0 ? d(str, str2) : g(str, str2, str3), i != 0 ? c(str3) : f(str3), i12, pVar.f418260e);
        }
        if (!(obj instanceof net.bytebuddy.jar.asm.h)) {
            return obj;
        }
        net.bytebuddy.jar.asm.h hVar = (net.bytebuddy.jar.asm.h) obj;
        int length = hVar.f418211d.length;
        Object[] objArr = new Object[length];
        while (i < length) {
            objArr[i] = l(hVar.f418211d[i]);
            i++;
        }
        String str4 = hVar.f418208a;
        String str5 = hVar.f418209b;
        return new net.bytebuddy.jar.asm.h(e(str4, str5), c(str5), (p) l(hVar.f418210c), objArr);
    }

    public String a(String str) {
        return str;
    }

    public String b(String str, String str2) {
        return str2;
    }

    public String d(String str, String str2) {
        return str2;
    }

    public String e(String str, String str2) {
        return str;
    }

    public String g(String str, String str2, String str3) {
        return str2;
    }
}
