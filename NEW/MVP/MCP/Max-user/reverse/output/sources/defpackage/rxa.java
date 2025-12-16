package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class rxa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uxa b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ long o;

    public /* synthetic */ rxa(uxa uxaVar, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = uxaVar;
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
