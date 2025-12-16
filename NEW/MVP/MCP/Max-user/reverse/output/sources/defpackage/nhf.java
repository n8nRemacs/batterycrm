package defpackage;

import java.util.concurrent.CancellationException;
import one.me.stickerssearch.StickersSearchScreen;

/* loaded from: classes2.dex */
public final class nhf implements cbb {
    public final /* synthetic */ StickersSearchScreen a;

    public nhf(StickersSearchScreen stickersSearchScreen) {
        this.a = stickersSearchScreen;
    }

    @Override // defpackage.cbb
    public final void J(CharSequence charSequence) {
        yy7[] yy7VarArr = StickersSearchScreen.t0;
        whf whfVarZ0 = this.a.z0();
        if (fni.a(charSequence, ((rhf) whfVarZ0.u0.get()).a)) {
            return;
        }
        x9f x9fVar = whfVarZ0.w0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        tcf tcfVar = whfVarZ0.X;
        tcfVar.m(null, new f7e(1, ((f7e) tcfVar.getValue()).b));
        whfVarZ0.s0.setValue(charSequence != null ? charSequence.toString() : null);
    }

    @Override // defpackage.cbb
    public final void o() {
        this.a.getRouter().C();
    }
}
