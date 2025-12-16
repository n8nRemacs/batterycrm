package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.ctd;
import defpackage.d7g;
import defpackage.dvc;
import defpackage.er8;
import defpackage.eri;
import defpackage.g0;
import defpackage.gq8;
import defpackage.gti;
import defpackage.hfh;
import defpackage.hq8;
import defpackage.iq8;
import defpackage.ite;
import defpackage.iti;
import defpackage.m5d;
import defpackage.r5j;
import defpackage.s5i;
import defpackage.sqd;
import defpackage.t35;
import defpackage.xse;
import defpackage.yqi;
import defpackage.z5d;
import defpackage.z7;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, ite {
    public static final int[] E0 = {R.attr.state_checkable};
    public static final int[] F0 = {R.attr.state_checked};
    public static final int G0 = m5d.Widget_MaterialComponents_Button;
    public int A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public final iq8 d;
    public final LinkedHashSet o;
    public gq8 s0;
    public PorterDuff.Mode t0;
    public ColorStateList u0;
    public Drawable v0;
    public String w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet) {
        int i = dvc.materialButtonStyle;
        int i2 = G0;
        super(er8.a(context, attributeSet, i, i2), attributeSet, i);
        this.o = new LinkedHashSet();
        this.B0 = false;
        this.C0 = false;
        Context context2 = getContext();
        TypedArray typedArrayD = d7g.d(context2, attributeSet, z5d.MaterialButton, i, i2, new int[0]);
        this.A0 = typedArrayD.getDimensionPixelSize(z5d.MaterialButton_iconPadding, 0);
        int i3 = typedArrayD.getInt(z5d.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.t0 = yqi.f(i3, mode);
        this.u0 = gti.c(getContext(), typedArrayD, z5d.MaterialButton_iconTint);
        this.v0 = gti.e(getContext(), typedArrayD, z5d.MaterialButton_icon);
        this.D0 = typedArrayD.getInteger(z5d.MaterialButton_iconGravity, 1);
        this.x0 = typedArrayD.getDimensionPixelSize(z5d.MaterialButton_iconSize, 0);
        iq8 iq8Var = new iq8(this, xse.b(context2, attributeSet, i, i2).g());
        this.d = iq8Var;
        iq8Var.c = typedArrayD.getDimensionPixelOffset(z5d.MaterialButton_android_insetLeft, 0);
        iq8Var.d = typedArrayD.getDimensionPixelOffset(z5d.MaterialButton_android_insetRight, 0);
        iq8Var.e = typedArrayD.getDimensionPixelOffset(z5d.MaterialButton_android_insetTop, 0);
        iq8Var.f = typedArrayD.getDimensionPixelOffset(z5d.MaterialButton_android_insetBottom, 0);
        if (typedArrayD.hasValue(z5d.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(z5d.MaterialButton_cornerRadius, -1);
            iq8Var.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            s5i s5iVarE = iq8Var.b.e();
            s5iVarE.e = new g0(f);
            s5iVarE.f = new g0(f);
            s5iVarE.g = new g0(f);
            s5iVarE.h = new g0(f);
            iq8Var.c(s5iVarE.g());
            iq8Var.p = true;
        }
        iq8Var.h = typedArrayD.getDimensionPixelSize(z5d.MaterialButton_strokeWidth, 0);
        iq8Var.i = yqi.f(typedArrayD.getInt(z5d.MaterialButton_backgroundTintMode, -1), mode);
        iq8Var.j = gti.c(getContext(), typedArrayD, z5d.MaterialButton_backgroundTint);
        iq8Var.k = gti.c(getContext(), typedArrayD, z5d.MaterialButton_strokeColor);
        iq8Var.l = gti.c(getContext(), typedArrayD, z5d.MaterialButton_rippleColor);
        iq8Var.q = typedArrayD.getBoolean(z5d.MaterialButton_android_checkable, false);
        iq8Var.t = typedArrayD.getDimensionPixelSize(z5d.MaterialButton_elevation, 0);
        iq8Var.r = typedArrayD.getBoolean(z5d.MaterialButton_toggleCheckedStateOnClick, true);
        WeakHashMap weakHashMap = hfh.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(z5d.MaterialButton_android_background)) {
            iq8Var.o = true;
            setSupportBackgroundTintList(iq8Var.j);
            setSupportBackgroundTintMode(iq8Var.i);
        } else {
            iq8Var.e();
        }
        setPaddingRelative(paddingStart + iq8Var.c, paddingTop + iq8Var.e, paddingEnd + iq8Var.d, paddingBottom + iq8Var.f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.A0);
        d(this.v0 != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean b() {
        iq8 iq8Var = this.d;
        return (iq8Var == null || iq8Var.o) ? false : true;
    }

    public final void c() {
        int i = this.D0;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.v0, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.v0, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.v0, null, null);
        }
    }

    public final void d(boolean z) {
        Drawable drawable = this.v0;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.v0 = drawableMutate;
            t35.h(drawableMutate, this.u0);
            PorterDuff.Mode mode = this.t0;
            if (mode != null) {
                t35.i(this.v0, mode);
            }
            int intrinsicWidth = this.x0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.v0.getIntrinsicWidth();
            }
            int intrinsicHeight = this.x0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.v0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.v0;
            int i = this.y0;
            int i2 = this.z0;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.v0.setVisible(true, z);
        }
        if (z) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.D0;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.v0) || (((i3 == 3 || i3 == 4) && drawable5 != this.v0) || ((i3 == 16 || i3 == 32) && drawable4 != this.v0))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.v0 == null || getLayout() == null) {
            return;
        }
        int i3 = this.D0;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.y0 = 0;
                if (i3 == 16) {
                    this.z0 = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.x0;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.v0.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.A0) - getPaddingBottom()) / 2);
                if (this.z0 != iMax) {
                    this.z0 = iMax;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.z0 = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.D0;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.y0 = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.x0;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.v0.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = hfh.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.A0) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.D0 == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.y0 != paddingEnd) {
            this.y0 = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.w0)) {
            return this.w0;
        }
        iq8 iq8Var = this.d;
        return ((iq8Var == null || !iq8Var.q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.d.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.v0;
    }

    public int getIconGravity() {
        return this.D0;
    }

    public int getIconPadding() {
        return this.A0;
    }

    public int getIconSize() {
        return this.x0;
    }

    public ColorStateList getIconTint() {
        return this.u0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.t0;
    }

    public int getInsetBottom() {
        return this.d.f;
    }

    public int getInsetTop() {
        return this.d.e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.d.l;
        }
        return null;
    }

    public xse getShapeAppearanceModel() {
        if (b()) {
            return this.d.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.d.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.B0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            iti.c(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        iq8 iq8Var = this.d;
        if (iq8Var != null && iq8Var.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E0);
        }
        if (this.B0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.B0);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        iq8 iq8Var = this.d;
        accessibilityNodeInfo.setCheckable(iq8Var != null && iq8Var.q);
        accessibilityNodeInfo.setChecked(this.B0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof hq8)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hq8 hq8Var = (hq8) parcelable;
        super.onRestoreInstanceState(hq8Var.a);
        setChecked(hq8Var.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        hq8 hq8Var = new hq8(super.onSaveInstanceState());
        hq8Var.c = this.B0;
        return hq8Var;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.v0 != null) {
            if (this.v0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.w0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!b()) {
            super.setBackgroundColor(i);
            return;
        }
        iq8 iq8Var = this.d;
        if (iq8Var.b(false) != null) {
            iq8Var.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        iq8 iq8Var = this.d;
        iq8Var.o = true;
        MaterialButton materialButton = iq8Var.a;
        materialButton.setSupportBackgroundTintList(iq8Var.j);
        materialButton.setSupportBackgroundTintMode(iq8Var.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? eri.a(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (b()) {
            this.d.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        iq8 iq8Var = this.d;
        if (iq8Var == null || !iq8Var.q || !isEnabled() || this.B0 == z) {
            return;
        }
        this.B0 = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.B0;
            if (!materialButtonToggleGroup.s0) {
                materialButtonToggleGroup.b(getId(), z2);
            }
        }
        if (this.C0) {
            return;
        }
        this.C0 = true;
        Iterator it = this.o.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
        this.C0 = false;
    }

    public void setCornerRadius(int i) {
        if (b()) {
            iq8 iq8Var = this.d;
            if (iq8Var.p && iq8Var.g == i) {
                return;
            }
            iq8Var.g = i;
            iq8Var.p = true;
            float f = i;
            s5i s5iVarE = iq8Var.b.e();
            s5iVarE.e = new g0(f);
            s5iVarE.f = new g0(f);
            s5iVarE.g = new g0(f);
            s5iVarE.h = new g0(f);
            iq8Var.c(s5iVarE.g());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (b()) {
            this.d.b(false).j(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.v0 != drawable) {
            this.v0 = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.D0 != i) {
            this.D0 = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.A0 != i) {
            this.A0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? eri.a(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.x0 != i) {
            this.x0 = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.u0 != colorStateList) {
            this.u0 = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.t0 != mode) {
            this.t0 = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(z7.c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        iq8 iq8Var = this.d;
        iq8Var.d(iq8Var.e, i);
    }

    public void setInsetTop(int i) {
        iq8 iq8Var = this.d;
        iq8Var.d(i, iq8Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(gq8 gq8Var) {
        this.s0 = gq8Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        gq8 gq8Var = this.s0;
        if (gq8Var != null) {
            ((MaterialButtonToggleGroup) ((r5j) gq8Var).b).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            iq8 iq8Var = this.d;
            MaterialButton materialButton = iq8Var.a;
            if (iq8Var.l != colorStateList) {
                iq8Var.l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(sqd.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(z7.c(getContext(), i));
        }
    }

    @Override // defpackage.ite
    public void setShapeAppearanceModel(xse xseVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(xseVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (b()) {
            iq8 iq8Var = this.d;
            iq8Var.n = z;
            iq8Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            iq8 iq8Var = this.d;
            if (iq8Var.k != colorStateList) {
                iq8Var.k = colorStateList;
                iq8Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(z7.c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            iq8 iq8Var = this.d;
            if (iq8Var.h != i) {
                iq8Var.h = i;
                iq8Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        iq8 iq8Var = this.d;
        if (iq8Var.j != colorStateList) {
            iq8Var.j = colorStateList;
            if (iq8Var.b(false) != null) {
                t35.h(iq8Var.b(false), iq8Var.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        iq8 iq8Var = this.d;
        if (iq8Var.i != mode) {
            iq8Var.i = mode;
            if (iq8Var.b(false) == null || iq8Var.i == null) {
                return;
            }
            t35.i(iq8Var.b(false), iq8Var.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.B0);
    }
}
