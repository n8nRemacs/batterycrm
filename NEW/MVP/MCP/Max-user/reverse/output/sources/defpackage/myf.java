package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class myf {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public myf(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.US);
        this.g = vmf.s(upperCase, "INT", false) ? 3 : (vmf.s(upperCase, "CHAR", false) || vmf.s(upperCase, "CLOB", false) || vmf.s(upperCase, "TEXT", false)) ? 2 : vmf.s(upperCase, "BLOB", false) ? 5 : (vmf.s(upperCase, "REAL", false) || vmf.s(upperCase, "FLOA", false) || vmf.s(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof myf)) {
                return false;
            }
            myf myfVar = (myf) obj;
            if (this.d != myfVar.d) {
                return false;
            }
            String str = myfVar.a;
            int i = myfVar.f;
            String str2 = myfVar.e;
            if (!fni.a(this.a, str) || this.c != myfVar.c) {
                return false;
            }
            String str3 = this.e;
            int i2 = this.f;
            if (i2 == 1 && i == 2 && str3 != null && !ze8.b(str3, str2)) {
                return false;
            }
            if (i2 == 2 && i == 1 && str2 != null && !ze8.b(str2, str3)) {
                return false;
            }
            if (i2 != 0 && i2 == i) {
                if (str3 != null) {
                    if (!ze8.b(str3, str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            }
            if (this.g != myfVar.g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.g);
        sb.append("', notNull=");
        sb.append(this.c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        return ho7.l(sb, str, "'}");
    }
}
