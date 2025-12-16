package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class g8d {
    public static final String a;

    static {
        String str = zxg.a;
        a = Integer.toString(0, 36);
    }

    public static g8d a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = a27.d;
            hsi.b(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(a27.d, false) ? new a27(bundle.getBoolean(a27.e, false)) : new a27();
        }
        if (i == 1) {
            String str3 = eqb.c;
            hsi.b(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(eqb.c, -1.0f);
            return f == -1.0f ? new eqb() : new eqb(f);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(ho7.f(i, "Unknown RatingType: "));
            }
            String str4 = i8g.d;
            hsi.b(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(i8g.d, false) ? new i8g(bundle.getBoolean(i8g.e, false)) : new i8g();
        }
        String str5 = caf.d;
        hsi.b(bundle.getInt(str, -1) == 2);
        int i2 = bundle.getInt(caf.d, 5);
        float f2 = bundle.getFloat(caf.e, -1.0f);
        return f2 == -1.0f ? new caf(i2) : new caf(i2, f2);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
