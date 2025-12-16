package uY0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.C22767g;
import com.google.android.material.R;
import j.InterfaceC42165v;
import j.N;
import j.P;
import m.C43852a;
import rY0.C47618a;

/* compiled from: MaterialSwitch.java */
/* renamed from: uY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49003a extends SwitchCompat {

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f440084j0 = {R.attr.state_with_icon};

    /* renamed from: U, reason: collision with root package name */
    @P
    public Drawable f440085U;

    /* renamed from: V, reason: collision with root package name */
    @P
    public Drawable f440086V;

    /* renamed from: W, reason: collision with root package name */
    @P
    public Drawable f440087W;

    /* renamed from: a0, reason: collision with root package name */
    @P
    public Drawable f440088a0;

    /* renamed from: b0, reason: collision with root package name */
    @P
    public ColorStateList f440089b0;

    /* renamed from: c0, reason: collision with root package name */
    @P
    public ColorStateList f440090c0;

    /* renamed from: d0, reason: collision with root package name */
    @N
    public PorterDuff.Mode f440091d0;

    /* renamed from: e0, reason: collision with root package name */
    @P
    public ColorStateList f440092e0;

    /* renamed from: f0, reason: collision with root package name */
    @P
    public ColorStateList f440093f0;

    /* renamed from: g0, reason: collision with root package name */
    @N
    public PorterDuff.Mode f440094g0;

    /* renamed from: h0, reason: collision with root package name */
    public int[] f440095h0;

    /* renamed from: i0, reason: collision with root package name */
    public int[] f440096i0;

    public static void i(@P Drawable drawable, @P ColorStateList colorStateList, @N int[] iArr, @N int[] iArr2, float f12) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(C22767g.c(f12, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
    }

    public final void e() {
        this.f440085U = C47618a.b(this.f440085U, this.f440089b0, getThumbTintMode());
        this.f440086V = C47618a.b(this.f440086V, this.f440090c0, this.f440091d0);
        j();
        super.setThumbDrawable(C47618a.a(this.f440085U, this.f440086V));
        refreshDrawableState();
    }

    public final void g() {
        this.f440087W = C47618a.b(this.f440087W, this.f440092e0, getTrackTintMode());
        this.f440088a0 = C47618a.b(this.f440088a0, this.f440093f0, this.f440094g0);
        j();
        Drawable layerDrawable = this.f440087W;
        if (layerDrawable != null && this.f440088a0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f440087W, this.f440088a0});
        } else if (layerDrawable == null) {
            layerDrawable = this.f440088a0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @P
    public Drawable getThumbDrawable() {
        return this.f440085U;
    }

    @P
    public Drawable getThumbIconDrawable() {
        return this.f440086V;
    }

    @P
    public ColorStateList getThumbIconTintList() {
        return this.f440090c0;
    }

    @N
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f440091d0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @P
    public ColorStateList getThumbTintList() {
        return this.f440089b0;
    }

    @P
    public Drawable getTrackDecorationDrawable() {
        return this.f440088a0;
    }

    @P
    public ColorStateList getTrackDecorationTintList() {
        return this.f440093f0;
    }

    @N
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f440094g0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @P
    public Drawable getTrackDrawable() {
        return this.f440087W;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @P
    public ColorStateList getTrackTintList() {
        return this.f440092e0;
    }

    @Override // android.view.View
    public final void invalidate() {
        j();
        super.invalidate();
    }

    public final void j() {
        if (this.f440089b0 == null && this.f440090c0 == null && this.f440092e0 == null && this.f440093f0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f440089b0;
        if (colorStateList != null) {
            i(this.f440085U, colorStateList, this.f440095h0, this.f440096i0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f440090c0;
        if (colorStateList2 != null) {
            i(this.f440086V, colorStateList2, this.f440095h0, this.f440096i0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f440092e0;
        if (colorStateList3 != null) {
            i(this.f440087W, colorStateList3, this.f440095h0, this.f440096i0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f440093f0;
        if (colorStateList4 != null) {
            i(this.f440088a0, colorStateList4, this.f440095h0, this.f440096i0, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i12) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + 1);
        if (this.f440086V != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f440084j0);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i13 = 0;
        for (int i14 : iArrOnCreateDrawableState) {
            if (i14 != 16842912) {
                iArr[i13] = i14;
                i13++;
            }
        }
        this.f440095h0 = iArr;
        this.f440096i0 = C47618a.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@P Drawable drawable) {
        this.f440085U = drawable;
        e();
    }

    public void setThumbIconDrawable(@P Drawable drawable) {
        this.f440086V = drawable;
        e();
    }

    public void setThumbIconResource(@InterfaceC42165v int i12) {
        setThumbIconDrawable(C43852a.a(getContext(), i12));
    }

    public void setThumbIconTintList(@P ColorStateList colorStateList) {
        this.f440090c0 = colorStateList;
        e();
    }

    public void setThumbIconTintMode(@N PorterDuff.Mode mode) {
        this.f440091d0 = mode;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@P ColorStateList colorStateList) {
        this.f440089b0 = colorStateList;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@P PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        e();
    }

    public void setTrackDecorationDrawable(@P Drawable drawable) {
        this.f440088a0 = drawable;
        g();
    }

    public void setTrackDecorationResource(@InterfaceC42165v int i12) {
        setTrackDecorationDrawable(C43852a.a(getContext(), i12));
    }

    public void setTrackDecorationTintList(@P ColorStateList colorStateList) {
        this.f440093f0 = colorStateList;
        g();
    }

    public void setTrackDecorationTintMode(@N PorterDuff.Mode mode) {
        this.f440094g0 = mode;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@P Drawable drawable) {
        this.f440087W = drawable;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@P ColorStateList colorStateList) {
        this.f440092e0 = colorStateList;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@P PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        g();
    }
}
