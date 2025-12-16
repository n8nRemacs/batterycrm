package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: VectorDrawableCommon.java */
/* loaded from: classes10.dex */
abstract class h extends Drawable implements androidx.core.graphics.drawable.i {

    /* renamed from: b, reason: collision with root package name */
    public Drawable f54887b;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i12) {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.setLevel(i12) : super.onLevelChange(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i12) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i12);
        } else {
            super.setChangingConfigurations(i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i12, PorterDuff.Mode mode) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setColorFilter(i12, mode);
        } else {
            super.setColorFilter(i12, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z12) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setFilterBitmap(z12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f12, float f13) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setHotspot(f12, f13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i12, int i13, int i14, int i15) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setHotspotBounds(i12, i13, i14, i15);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
