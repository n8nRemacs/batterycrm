package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class ql4 implements i55 {
    public final d55 a;
    public z45 b;
    public boolean c;
    public final /* synthetic */ sl4 d;

    public ql4(sl4 sl4Var, d55 d55Var) {
        this.d = sl4Var;
        this.a = d55Var;
    }

    @Override // defpackage.i55
    public final void release() {
        Handler handler = this.d.u;
        handler.getClass();
        zxg.a0(handler, new qj4(1, this));
    }
}
