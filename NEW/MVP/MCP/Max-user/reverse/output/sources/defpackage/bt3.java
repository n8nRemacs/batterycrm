package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bt3 implements wqa {
    public static final bt3 b = new bt3(null);
    public final ag7 a;

    public bt3(Object obj) {
        this.a = wsf.f(obj);
    }

    @Override // defpackage.wqa
    public final void f(Executor executor, uqa uqaVar) {
        this.a.d(new my1(this, 15, uqaVar), executor);
    }

    @Override // defpackage.wqa
    public final ha8 p() {
        return this.a;
    }

    @Override // defpackage.wqa
    public final void r(uqa uqaVar) {
    }
}
