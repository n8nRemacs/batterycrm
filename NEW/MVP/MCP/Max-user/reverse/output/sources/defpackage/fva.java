package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class fva implements OnBackAnimationCallback {
    public final /* synthetic */ em6 a;
    public final /* synthetic */ em6 b;
    public final /* synthetic */ cm6 c;
    public final /* synthetic */ cm6 d;

    public fva(em6 em6Var, em6 em6Var2, cm6 cm6Var, cm6 cm6Var2) {
        this.a = em6Var;
        this.b = em6Var2;
        this.c = cm6Var;
        this.d = cm6Var2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        this.b.invoke(new te0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.a.invoke(new te0(backEvent));
    }
}
