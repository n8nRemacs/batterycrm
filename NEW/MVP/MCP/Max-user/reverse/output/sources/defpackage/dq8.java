package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class dq8 implements OnBackAnimationCallback {
    public final /* synthetic */ bq8 a;
    public final /* synthetic */ eq8 b;

    public dq8(eq8 eq8Var, bq8 bq8Var) {
        this.b = eq8Var;
        this.a = bq8Var;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.b(new te0(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new te0(backEvent));
        }
    }
}
