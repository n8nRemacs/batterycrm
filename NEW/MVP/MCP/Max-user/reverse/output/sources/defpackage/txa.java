package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class txa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uxa b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ txa(uxa uxaVar, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = uxaVar;
        this.c = drawable;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.view.View*/.unscheduleDrawable(this.c, this.d);
                break;
            default:
                super/*android.view.View*/.unscheduleDrawable(this.c, this.d);
                break;
        }
    }
}
