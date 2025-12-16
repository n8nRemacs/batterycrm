package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public final class kz9 implements xwg {
    public final x8a a;

    public kz9() {
        x8a x8aVarB = x8a.b();
        x8aVarB.n(xwg.j0, new f02());
        x8aVarB.n(re7.x, 34);
        x8aVarB.n(a2g.f0, lz9.class);
        x8aVarB.n(a2g.e0, lz9.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = x8aVarB;
    }

    @Override // defpackage.ebd
    public final ao3 getConfig() {
        return this.a;
    }

    @Override // defpackage.xwg
    public final zwg w() {
        return zwg.X;
    }
}
