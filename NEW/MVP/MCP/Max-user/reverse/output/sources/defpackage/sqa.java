package defpackage;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class sqa implements zy7 {
    public final Object a = ipi.b(2, new yq9(this));

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        b bVarA = bVar.a(d());
        d();
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ree reeVarD = d();
        yl3 yl3VarR = lh4Var.r(reeVarD);
        int iE = yl3VarR.e(d());
        if (iE != -1) {
            throw new SerializationException(ho7.f(iE, "Unexpected index "));
        }
        yl3VarR.m(reeVarD);
        return qqg.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.zy7
    public final ree d() {
        return (ree) this.a.getValue();
    }
}
