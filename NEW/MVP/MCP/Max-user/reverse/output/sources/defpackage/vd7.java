package defpackage;

import android.graphics.drawable.Animatable;

/* loaded from: classes2.dex */
public final class vd7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd7 b;
    public final /* synthetic */ Animatable c;
    public final /* synthetic */ pe7 d;

    public /* synthetic */ vd7(zd7 zd7Var, Animatable animatable, pe7 pe7Var, int i) {
        this.a = i;
        this.b = zd7Var;
        this.c = animatable;
        this.d = pe7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Animatable animatable;
        Animatable animatable2;
        switch (this.a) {
            case 0:
                zd7 zd7Var = this.b;
                if (zd7Var.getImageAttach().e && (animatable = this.c) != null) {
                    animatable.start();
                }
                zd7Var.setImageInfo(this.d);
                zd7Var.getOnFinalImageSetCallback().invoke();
                break;
            default:
                zd7 zd7Var2 = this.b;
                if (zd7Var2.getImageAttach().e && (animatable2 = this.c) != null) {
                    animatable2.start();
                }
                zd7Var2.setImageInfo(this.d);
                zd7Var2.getOnFinalImageSetCallback().invoke();
                break;
        }
    }
}
