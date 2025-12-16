package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import j.N;
import j.X;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21.java */
@X
/* loaded from: classes.dex */
class l extends k {

    /* renamed from: i, reason: collision with root package name */
    public static Method f44768i;

    @Override // android.graphics.drawable.Drawable
    @N
    public final Rect getDirtyBounds() {
        return this.f44767g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(@N Outline outline) {
        this.f44767g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f44767g;
        if (drawable != null && (method = f44768i) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f12, float f13) {
        this.f44767g.setHotspot(f12, f13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i12, int i13, int i14, int i15) {
        this.f44767g.setHotspotBounds(i12, i13, i14, i15);
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable
    public final boolean setState(@N int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable
    public final void setTint(int i12) {
        this.f44767g.setTint(i12);
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f44767g.setTintList(colorStateList);
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable
    public final void setTintMode(@N PorterDuff.Mode mode) {
        this.f44767g.setTintMode(mode);
    }
}
