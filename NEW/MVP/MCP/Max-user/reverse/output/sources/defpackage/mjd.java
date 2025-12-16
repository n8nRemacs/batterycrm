package defpackage;

import android.util.TypedValue;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class mjd {
    public static final String[] g = {"RU", "BY"};
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final z41 e;
    public final bwf f = new bwf(new ffb(26, this));

    public mjd(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var2;
        this.b = k18Var3;
        this.c = k18Var4;
        this.d = k18Var5;
        this.e = new z41(new uxb(new m11(13, g), this, 11), new uxb(((y84) k18Var.getValue()).b, this, 12), new cj8(3, null, 4), 3);
    }

    public static final x2b a(mjd mjdVar, String str) {
        String str2;
        Locale localeU = ((w4e) ((pb3) mjdVar.a.getValue())).u();
        int iE = ((aub) mjdVar.c.getValue()).e(str);
        String displayCountry = (String) ((Map) mjdVar.f.getValue()).get(str);
        if (displayCountry == null) {
            displayCountry = new Locale("", str).getDisplayCountry(localeU);
        }
        wc5 wc5Var = (wc5) mjdVar.b.getValue();
        if (str.length() != 2) {
            str2 = null;
        } else {
            String upperCase = str.toUpperCase(Locale.ROOT);
            str2 = new String(new int[]{upperCase.charAt(0) - 3675, upperCase.charAt(1) - 3675}, 0, 2);
        }
        return new x2b(str, iE, new r5g(displayCountry), wc5Var.e(kti.d(TypedValue.applyDimension(2, 24, vw4.d().getDisplayMetrics())), str2));
    }
}
