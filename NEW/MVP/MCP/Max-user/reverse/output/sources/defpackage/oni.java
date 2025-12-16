package defpackage;

import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class oni extends mci {
    public final /* synthetic */ a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oni(a aVar, int i) {
        super(aVar, i, null);
        this.g = aVar;
    }

    @Override // defpackage.mci
    public final void a(es3 es3Var) {
        this.g.s0.y(es3Var);
        System.currentTimeMillis();
    }

    @Override // defpackage.mci
    public final boolean b() {
        this.g.s0.y(es3.o);
        return true;
    }
}
