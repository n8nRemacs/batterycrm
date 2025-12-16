package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class kfg implements lw0 {
    public static final o9g o = new o9g(1);
    public final int a;
    public final String b;
    public final gf6[] c;
    public int d;

    public kfg(String str, gf6... gf6VarArr) {
        fsi.b(gf6VarArr.length > 0);
        this.b = str;
        this.c = gf6VarArr;
        this.a = gf6VarArr.length;
        String str2 = gf6VarArr[0].c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = gf6VarArr[0].o | 16384;
        for (int i2 = 1; i2 < gf6VarArr.length; i2++) {
            String str3 = gf6VarArr[i2].c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", i2, gf6VarArr[0].c, gf6VarArr[i2].c);
                return;
            } else {
                if (i != (gf6VarArr[i2].o | 16384)) {
                    b("role flags", i2, Integer.toBinaryString(gf6VarArr[0].o), Integer.toBinaryString(gf6VarArr[i2].o));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        StringBuilder sb = new StringBuilder(u45.f(u45.f(str.length() + 78, str2), str3));
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        pai.c("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final int a(gf6 gf6Var) {
        int i = 0;
        while (true) {
            gf6[] gf6VarArr = this.c;
            if (i >= gf6VarArr.length) {
                return -1;
            }
            if (gf6Var == gf6VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kfg.class == obj.getClass()) {
            kfg kfgVar = (kfg) obj;
            if (this.a == kfgVar.a && this.b.equals(kfgVar.b) && Arrays.equals(this.c, kfgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = u45.e(527, 31, this.b) + Arrays.hashCode(this.c);
        }
        return this.d;
    }
}
