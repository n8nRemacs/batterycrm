package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class tkh extends WeakReference implements py4 {
    @Override // defpackage.py4
    public final void dispose() {
        py4 py4Var = (py4) get();
        if (py4Var != null) {
            py4Var.dispose();
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        py4 py4Var = (py4) get();
        return py4Var == null || py4Var.e();
    }
}
