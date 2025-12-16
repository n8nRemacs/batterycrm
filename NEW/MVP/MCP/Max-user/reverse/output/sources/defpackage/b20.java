package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class b20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ b20(c20 c20Var, int i) {
        this.a = i;
        this.b = c20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ValueAnimator valueAnimator = this.b.o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    break;
                }
                break;
            default:
                ValueAnimator valueAnimator2 = this.b.o;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                    break;
                }
                break;
        }
    }
}
