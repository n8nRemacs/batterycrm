package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class zc8 implements v35 {
    @Override // defpackage.v35
    public final Drawable a(sc3 sc3Var) {
        ok4 ok4Var = sc3Var instanceof ok4 ? (ok4) sc3Var : null;
        if (ok4Var != null) {
            return ok4Var.F();
        }
        return null;
    }

    @Override // defpackage.v35
    public final boolean b(sc3 sc3Var) {
        return sc3Var instanceof ok4;
    }
}
