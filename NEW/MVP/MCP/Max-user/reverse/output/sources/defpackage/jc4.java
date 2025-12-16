package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class jc4 extends vq8 {
    public final RectF r;

    public jc4(xse xseVar, RectF rectF) {
        super(xseVar);
        this.r = rectF;
    }

    @Override // defpackage.vq8, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        kc4 kc4Var = new kc4(this);
        kc4Var.I0 = this;
        kc4Var.invalidateSelf();
        return kc4Var;
    }

    public jc4(jc4 jc4Var) {
        super(jc4Var);
        this.r = jc4Var.r;
    }
}
