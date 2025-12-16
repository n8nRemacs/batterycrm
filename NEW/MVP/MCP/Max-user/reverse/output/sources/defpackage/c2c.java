package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class c2c extends y0 {
    public final df7 m;
    public final vl3 n;

    public c2c(Context context, vl3 vl3Var, df7 df7Var) {
        super(context);
        this.m = df7Var;
        this.n = vl3Var;
    }

    public final void c(Uri uri) {
        if (uri == null) {
            this.b = null;
            return;
        }
        sf7 sf7VarD = sf7.d(uri);
        sf7VarD.e = ysd.d;
        this.b = sf7VarD.a();
    }
}
