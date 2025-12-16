package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class mee {
    public static final void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static fee b(sm6 sm6Var) {
        fee feeVar = new fee();
        feeVar.d = hni.d(sm6Var, feeVar, feeVar);
        return feeVar;
    }

    public static final int c(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Drawable drawable, Drawable.Callback callback, ygg yggVar) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        xgg xggVar = drawable instanceof xgg ? (xgg) drawable : null;
        if (xggVar != null) {
            xggVar.l(yggVar);
        }
    }
}
