package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class de3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe3 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ long o;

    public /* synthetic */ de3(fe3 fe3Var, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = fe3Var;
        this.c = drawable;
        this.d = runnable;
        this.o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.view.View*/.scheduleDrawable(this.c, this.d, this.o);
                break;
            default:
                super/*android.view.View*/.scheduleDrawable(this.c, this.d, this.o);
                break;
        }
    }
}
