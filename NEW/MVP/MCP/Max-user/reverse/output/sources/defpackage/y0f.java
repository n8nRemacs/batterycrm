package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class y0f extends l98 {
    public y0f(Executor executor) {
        super(new xt4(executor, 4, new yf4(9)));
        super.A(true);
    }

    public final t98 G(int i) {
        if (i < 0 || i >= this.d.f.size()) {
            return null;
        }
        return (t98) C(i);
    }

    @Override // defpackage.phd
    /* renamed from: H */
    public void r(d2f d2fVar, int i) {
        d2fVar.z((t98) C(i));
    }

    @Override // defpackage.phd
    /* renamed from: I */
    public void y(d2f d2fVar) {
        d2fVar.E();
    }

    @Override // defpackage.phd
    public long k(int i) {
        return ((t98) C(i)).getItemId();
    }

    @Override // defpackage.phd
    public int l(int i) {
        return ((t98) C(i)).getK0();
    }

    @Override // defpackage.phd
    public final void w(mid midVar) {
        ((d2f) midVar).C();
    }

    @Override // defpackage.phd
    public final void x(mid midVar) {
        ((d2f) midVar).D();
    }
}
