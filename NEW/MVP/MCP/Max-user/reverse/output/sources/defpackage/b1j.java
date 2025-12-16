package defpackage;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b1j {
    public static aaj j;
    public static final nji k;
    public final String a;
    public final String b;
    public final v0j c;
    public final sve d;
    public final ybj e;
    public final ybj f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new nji(1, objArr);
    }

    public b1j(Context context, sve sveVar, v0j v0jVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = ri3.a(context);
        this.d = sveVar;
        this.c = v0jVar;
        u1j.v();
        this.g = "vision-common";
        h08 h08VarJ = h08.J();
        bm4 bm4Var = new bm4(19, this);
        h08VarJ.getClass();
        this.e = h08.P(bm4Var);
        h08 h08VarJ2 = h08.J();
        sveVar.getClass();
        y0j y0jVar = new y0j(sveVar, 0);
        h08VarJ2.getClass();
        this.f = h08.P(y0jVar);
        nji njiVar = k;
        this.h = njiVar.containsKey("vision-common") ? d85.d(context, (String) njiVar.get("vision-common"), false) : -1;
    }
}
