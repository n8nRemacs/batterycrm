package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;

/* loaded from: classes2.dex */
public final class v6g extends DrawableWrapper implements u6g, Animatable {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6g(Drawable drawable, Context context) {
        super(drawable);
        int i = w9b.S;
        this.a = i;
        if (context != null) {
            setTint(a93.s0.x(context).k().g(i));
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            return animatable.isRunning();
        }
        return false;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        if (!(getDrawable() instanceof u6g)) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.setTint(yebVar.g(this.a));
                return;
            }
            return;
        }
        Object drawable2 = getDrawable();
        u6g u6gVar = drawable2 instanceof u6g ? (u6g) drawable2 : null;
        if (u6gVar != null) {
            u6gVar.onThemeChanged(yebVar);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
