package defpackage;

import android.net.Uri;
import java.util.Objects;

/* loaded from: classes.dex */
public class g09 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        String str = zxg.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
    }

    public g09(bl3 bl3Var) {
        this.a = (Uri) bl3Var.d;
        this.b = bl3Var.a;
        this.c = (String) bl3Var.e;
        this.d = bl3Var.b;
        this.e = bl3Var.c;
        this.f = (String) bl3Var.f;
        this.g = (String) bl3Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g09)) {
            return false;
        }
        g09 g09Var = (g09) obj;
        return this.a.equals(g09Var.a) && Objects.equals(this.b, g09Var.b) && Objects.equals(this.c, g09Var.c) && this.d == g09Var.d && this.e == g09Var.e && Objects.equals(this.f, g09Var.f) && Objects.equals(this.g, g09Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
