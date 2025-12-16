package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class ok0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk0 b;

    public /* synthetic */ ok0(qk0 qk0Var, int i) {
        this.a = i;
        this.b = qk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qk0 qk0Var = this.b;
                if (qk0Var.d > 0) {
                    SystemClock.uptimeMillis();
                }
                qk0Var.setVisibility(0);
                break;
            default:
                qk0 qk0Var2 = this.b;
                ((f45) qk0Var2.getCurrentDrawable()).c(false, false, true);
                if ((qk0Var2.getProgressDrawable() == null || !qk0Var2.getProgressDrawable().isVisible()) && (qk0Var2.getIndeterminateDrawable() == null || !qk0Var2.getIndeterminateDrawable().isVisible())) {
                    qk0Var2.setVisibility(4);
                }
                qk0Var2.getClass();
                break;
        }
    }
}
