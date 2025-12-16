package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class k20 {
    public static final k20 h = new k20(0, 0, 1, 1, 0, false);
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public iv6 g;

    static {
        String str = zxg.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
    }

    public k20(int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = z;
    }

    public static k20 a(Bundle bundle) {
        String str = i;
        int i2 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = j;
        int i3 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = k;
        int i4 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = l;
        int i5 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = m;
        int i6 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = n;
        return new k20(i2, i3, i4, i5, i6, bundle.containsKey(str6) ? bundle.getBoolean(str6) : false);
    }

    public final iv6 b() {
        if (this.g == null) {
            this.g = new iv6(this);
        }
        return this.g;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(i, this.a);
        bundle.putInt(j, this.b);
        bundle.putInt(k, this.c);
        bundle.putInt(l, this.d);
        bundle.putInt(m, this.e);
        bundle.putBoolean(n, this.f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k20.class == obj.getClass()) {
            k20 k20Var = (k20) obj;
            if (this.a == k20Var.a && this.b == k20Var.b && this.c == k20Var.c && this.d == k20Var.d && this.e == k20Var.e && this.f == k20Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0);
    }
}
