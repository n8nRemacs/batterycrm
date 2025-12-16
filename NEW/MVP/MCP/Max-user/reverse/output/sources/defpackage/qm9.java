package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class qm9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ qm9(Drawable drawable, int i) {
        this.a = i;
        this.b = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rm9.setStartDrawable$lambda$5(this.b);
                break;
            default:
                ((AnimationDrawable) this.b).start();
                break;
        }
    }
}
