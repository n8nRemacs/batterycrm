package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class eg5 extends le {
    public final /* synthetic */ int b;
    public final /* synthetic */ Drawable.Callback c;

    public /* synthetic */ eg5(Drawable.Callback callback, int i) {
        this.b = i;
        this.c = callback;
    }

    @Override // defpackage.le
    public final void a(Drawable drawable) {
        switch (this.b) {
            case 0:
                ((fg5) this.c).a();
                break;
            default:
                ColorStateList colorStateList = ((rq8) this.c).B0;
                if (colorStateList != null) {
                    t35.h(drawable, colorStateList);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.le
    public final void b(Drawable drawable) {
        switch (this.b) {
            case 0:
                ((fg5) this.c).b();
                break;
            default:
                rq8 rq8Var = (rq8) this.c;
                ColorStateList colorStateList = rq8Var.B0;
                if (colorStateList != null) {
                    t35.g(drawable, colorStateList.getColorForState(rq8Var.F0, colorStateList.getDefaultColor()));
                    break;
                }
                break;
        }
    }
}
