package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class p22 implements j48 {
    public final l48 a;
    public final Handler b;

    public p22() {
        l48 l48Var = new l48(this);
        this.a = l48Var;
        this.b = new Handler(Looper.getMainLooper());
        l48Var.d(k38.ON_CREATE);
    }

    public final void a(Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            runnable.run();
        } else {
            this.b.post(runnable);
        }
    }

    @Override // defpackage.j48
    public final l48 p() {
        return this.a;
    }
}
