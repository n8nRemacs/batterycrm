package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class j00 extends zd8 {
    public mc5 X;

    @Override // defpackage.zd8
    public final void a() {
        super.a();
        mc5 mc5Var = this.X;
        if (mc5Var != null) {
            bwd.b((v08) mc5Var.b);
        }
        this.X = null;
    }

    @Override // defpackage.zd8
    public final void c() {
        Uri uri;
        dce dceVar = this.b;
        pd8 pd8Var = this.o;
        zub zubVarE = dceVar.e(pd8Var);
        if (zubVarE == null) {
            uri = Uri.parse(pd8Var.d);
        } else {
            uri = zubVarE.b;
            if (uri == null && (uri = zubVarE.a) == null) {
                uri = Uri.parse(pd8Var.d);
            }
        }
        this.a.n(pd8Var, uri, 0, zubVarE != null ? zubVarE.o : null);
    }
}
