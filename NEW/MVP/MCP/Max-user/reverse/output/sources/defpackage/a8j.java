package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a8j {
    public static final bei b = bei.a(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public a8j(Context context, sve sveVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        ri3.a(context);
        synchronized (r8j.class) {
            if (r8j.b == null) {
                r8j.b = new r8j(0);
            }
        }
        this.a = "common";
        h08 h08VarJ = h08.J();
        bm4 bm4Var = new bm4(20, this);
        h08VarJ.getClass();
        h08.P(bm4Var);
        h08 h08VarJ2 = h08.J();
        Objects.requireNonNull(sveVar);
        y0j y0jVar = new y0j(sveVar, 1);
        h08VarJ2.getClass();
        h08.P(y0jVar);
        bei beiVar = b;
        if (beiVar.containsKey("common")) {
            d85.d(context, (String) beiVar.get("common"), false);
        }
    }
}
