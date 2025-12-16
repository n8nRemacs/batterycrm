package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class vvd implements i42 {
    public final o0 a;

    public vvd(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // defpackage.i42
    public final void cancel() {
        this.a.cancel((CancellationException) null);
    }
}
