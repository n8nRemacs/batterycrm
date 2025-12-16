package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a09 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Uri a;
    public final String b;
    public final vz8 c;
    public final lz8 d;
    public final List e;
    public final String f;
    public final wg7 g;
    public final long h;

    static {
        String str = zxg.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public a09(Uri uri, String str, vz8 vz8Var, lz8 lz8Var, List list, String str2, wg7 wg7Var, long j2) {
        this.a = uri;
        this.b = xz9.n(str);
        this.c = vz8Var;
        this.d = lz8Var;
        this.e = list;
        this.f = str2;
        this.g = wg7Var;
        tg7 tg7VarI = wg7.i();
        for (int i2 = 0; i2 < wg7Var.size(); i2++) {
            g09 g09Var = (g09) wg7Var.get(i2);
            bl3 bl3Var = new bl3();
            bl3Var.d = g09Var.a;
            bl3Var.a = g09Var.b;
            bl3Var.e = g09Var.c;
            bl3Var.b = g09Var.d;
            bl3Var.c = g09Var.e;
            bl3Var.f = g09Var.f;
            bl3Var.g = g09Var.g;
            tg7VarI.a(new f09(bl3Var));
        }
        tg7VarI.i();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a09)) {
            return false;
        }
        a09 a09Var = (a09) obj;
        return this.a.equals(a09Var.a) && Objects.equals(this.b, a09Var.b) && Objects.equals(this.c, a09Var.c) && Objects.equals(this.d, a09Var.d) && this.e.equals(a09Var.e) && Objects.equals(this.f, a09Var.f) && this.g.equals(a09Var.g) && this.h == a09Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        vz8 vz8Var = this.c;
        int iHashCode3 = (iHashCode2 + (vz8Var == null ? 0 : vz8Var.hashCode())) * 31;
        lz8 lz8Var = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (lz8Var == null ? 0 : lz8Var.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((iHashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
