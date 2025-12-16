package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C19961m;
import androidx.core.content.d;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.G;
import com.google.android.material.internal.O;
import com.google.android.material.shape.m;
import com.google.android.material.shape.q;
import com.google.android.material.shape.v;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.U;
import j.X;
import j.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C43852a;

/* loaded from: classes6.dex */
public class MaterialButton extends C19961m implements Checkable, v {
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_Button;

    @P
    private String accessibilityClassName;
    private boolean broadcasting;
    private boolean checked;

    @P
    private Drawable icon;
    private int iconGravity;

    @U
    private int iconLeft;

    @U
    private int iconPadding;

    @U
    private int iconSize;

    @P
    private ColorStateList iconTint;

    @P
    private PorterDuff.Mode iconTintMode;

    @U
    private int iconTop;

    @N
    private final com.google.android.material.button.a materialButtonHelper;

    @N
    private final LinkedHashSet<b> onCheckedChangeListeners;

    @P
    private c onPressedChangeListenerInternal;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public boolean f356068d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            public final SavedState createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            @N
            public final Object createFromParcel(@N Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f356068d = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f356068d ? 1 : 0);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public MaterialButton(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonStyle);
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
        for (int i12 = 0; i12 < lineCount; i12++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i12));
        }
        return (int) Math.ceil(fMax);
    }

    private boolean isIconEnd() {
        int i12 = this.iconGravity;
        return i12 == 3 || i12 == 4;
    }

    private boolean isIconStart() {
        int i12 = this.iconGravity;
        return i12 == 1 || i12 == 2;
    }

    private boolean isIconTop() {
        int i12 = this.iconGravity;
        return i12 == 16 || i12 == 32;
    }

    private boolean isLayoutRTL() {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        return getLayoutDirection() == 1;
    }

    private boolean isUsingOriginalBackground() {
        com.google.android.material.button.a aVar = this.materialButtonHelper;
        return (aVar == null || aVar.f356102o) ? false : true;
    }

    private void resetIconDrawable() {
        if (isIconStart()) {
            setCompoundDrawablesRelative(this.icon, null, null, null);
        } else if (isIconEnd()) {
            setCompoundDrawablesRelative(null, null, this.icon, null);
        } else if (isIconTop()) {
            setCompoundDrawablesRelative(null, this.icon, null, null);
        }
    }

    private void updateIcon(boolean z12) {
        Drawable drawable = this.icon;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.icon = drawableMutate;
            drawableMutate.setTintList(this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                this.icon.setTintMode(mode);
            }
            int intrinsicWidth = this.iconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.icon.getIntrinsicWidth();
            }
            int intrinsicHeight = this.iconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i12 = this.iconLeft;
            int i13 = this.iconTop;
            drawable2.setBounds(i12, i13, intrinsicWidth + i12, intrinsicHeight + i13);
            this.icon.setVisible(true, z12);
        }
        if (z12) {
            resetIconDrawable();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!isIconStart() || drawable3 == this.icon) && ((!isIconEnd() || drawable5 == this.icon) && (!isIconTop() || drawable4 == this.icon))) {
            return;
        }
        resetIconDrawable();
    }

    private void updateIconPosition(int i12, int i13) {
        if (this.icon == null || getLayout() == null) {
            return;
        }
        if (!isIconStart() && !isIconEnd()) {
            if (isIconTop()) {
                this.iconLeft = 0;
                if (this.iconGravity == 16) {
                    this.iconTop = 0;
                    updateIcon(false);
                    return;
                }
                int intrinsicHeight = this.iconSize;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.icon.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i13 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.iconPadding) - getPaddingBottom()) / 2);
                if (this.iconTop != iMax) {
                    this.iconTop = iMax;
                    updateIcon(false);
                    return;
                }
                return;
            }
            return;
        }
        this.iconTop = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i14 = this.iconGravity;
        if (i14 == 1 || i14 == 3 || ((i14 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i14 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.iconLeft = 0;
            updateIcon(false);
            return;
        }
        int intrinsicWidth = this.iconSize;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.icon.getIntrinsicWidth();
        }
        int textLayoutWidth = i12 - getTextLayoutWidth();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.iconPadding) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if (isLayoutRTL() != (this.iconGravity == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.iconLeft != paddingEnd) {
            this.iconLeft = paddingEnd;
            updateIcon(false);
        }
    }

    @N
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.accessibilityClassName)) {
            return (isCheckable() ? CompoundButton.class : Button.class).getName();
        }
        return this.accessibilityClassName;
    }

    @Override // android.view.View
    @P
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @P
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @U
    public int getCornerRadius() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.f356094g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    @U
    public int getIconPadding() {
        return this.iconPadding;
    }

    @U
    public int getIconSize() {
        return this.iconSize;
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    @r
    public int getInsetBottom() {
        return this.materialButtonHelper.f356093f;
    }

    @r
    public int getInsetTop() {
        return this.materialButtonHelper.f356092e;
    }

    @P
    public ColorStateList getRippleColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.f356099l;
        }
        return null;
    }

    @Override // com.google.android.material.shape.v
    @N
    public q getShapeAppearanceModel() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.f356089b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.f356098k;
        }
        return null;
    }

    @U
    public int getStrokeWidth() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.f356095h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C19961m
    @RestrictTo
    @P
    public ColorStateList getSupportBackgroundTintList() {
        return isUsingOriginalBackground() ? this.materialButtonHelper.f356097j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C19961m
    @RestrictTo
    @P
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return isUsingOriginalBackground() ? this.materialButtonHelper.f356096i : super.getSupportBackgroundTintMode();
    }

    public boolean isCheckable() {
        com.google.android.material.button.a aVar = this.materialButtonHelper;
        return aVar != null && aVar.f356104q;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isUsingOriginalBackground()) {
            m.c(this, this.materialButtonHelper.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i12) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C19961m, android.view.View
    public void onInitializeAccessibilityEvent(@N AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C19961m, android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C19961m, android.widget.TextView, android.view.View
    public void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@P Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        setChecked(savedState.f356068d);
    }

    @Override // android.widget.TextView, android.view.View
    @N
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f356068d = this.checked;
        return savedState;
    }

    @Override // androidx.appcompat.widget.C19961m, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
        super.onTextChanged(charSequence, i12, i13, i14);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.materialButtonHelper.f356105r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.icon != null) {
            if (this.icon.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(@P String str) {
        this.accessibilityClassName = str;
    }

    @Override // android.view.View
    public void setBackground(@N Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@InterfaceC42156l int i12) {
        if (!isUsingOriginalBackground()) {
            super.setBackgroundColor(i12);
            return;
        }
        com.google.android.material.button.a aVar = this.materialButtonHelper;
        if (aVar.b(false) != null) {
            aVar.b(false).setTint(i12);
        }
    }

    @Override // androidx.appcompat.widget.C19961m, android.view.View
    public void setBackgroundDrawable(@N Drawable drawable) {
        if (!isUsingOriginalBackground()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        com.google.android.material.button.a aVar = this.materialButtonHelper;
        aVar.f356102o = true;
        ColorStateList colorStateList = aVar.f356097j;
        MaterialButton materialButton = aVar.f356088a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(aVar.f356096i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C19961m, android.view.View
    public void setBackgroundResource(@InterfaceC42165v int i12) {
        setBackgroundDrawable(i12 != 0 ? C43852a.a(getContext(), i12) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@P ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@P PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z12) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.f356104q = z12;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z12) {
        if (isCheckable() && isEnabled() && this.checked != z12) {
            this.checked = z12;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z13 = this.checked;
                if (!materialButtonToggleGroup.f356075g) {
                    materialButtonToggleGroup.b(getId(), z13);
                }
            }
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            Iterator<b> it = this.onCheckedChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.broadcasting = false;
        }
    }

    public void setCornerRadius(@U int i12) {
        if (isUsingOriginalBackground()) {
            com.google.android.material.button.a aVar = this.materialButtonHelper;
            if (aVar.f356103p && aVar.f356094g == i12) {
                return;
            }
            aVar.f356094g = i12;
            aVar.f356103p = true;
            q.b bVarF = aVar.f356089b.f();
            bVarF.c(i12);
            aVar.c(bVarF.a());
        }
    }

    public void setCornerRadiusResource(@InterfaceC42161q int i12) {
        if (isUsingOriginalBackground()) {
            setCornerRadius(getResources().getDimensionPixelSize(i12));
        }
    }

    @Override // android.view.View
    @X
    public void setElevation(float f12) {
        super.setElevation(f12);
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.b(false).m(f12);
        }
    }

    public void setIcon(@P Drawable drawable) {
        if (this.icon != drawable) {
            this.icon = drawable;
            updateIcon(true);
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i12) {
        if (this.iconGravity != i12) {
            this.iconGravity = i12;
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@U int i12) {
        if (this.iconPadding != i12) {
            this.iconPadding = i12;
            setCompoundDrawablePadding(i12);
        }
    }

    public void setIconResource(@InterfaceC42165v int i12) {
        setIcon(i12 != 0 ? C43852a.a(getContext(), i12) : null);
    }

    public void setIconSize(@U int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.iconSize != i12) {
            this.iconSize = i12;
            updateIcon(true);
        }
    }

    public void setIconTint(@P ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            updateIcon(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            updateIcon(false);
        }
    }

    public void setIconTintResource(@InterfaceC42158n int i12) {
        setIconTint(d.getColorStateList(getContext(), i12));
    }

    public void setInsetBottom(@r int i12) {
        com.google.android.material.button.a aVar = this.materialButtonHelper;
        aVar.d(aVar.f356092e, i12);
    }

    public void setInsetTop(@r int i12) {
        com.google.android.material.button.a aVar = this.materialButtonHelper;
        aVar.d(i12, aVar.f356093f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@P c cVar) {
        this.onPressedChangeListenerInternal = cVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z12) {
        c cVar = this.onPressedChangeListenerInternal;
        if (cVar != null) {
            cVar.a();
        }
        super.setPressed(z12);
    }

    public void setRippleColor(@P ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            com.google.android.material.button.a aVar = this.materialButtonHelper;
            if (aVar.f356099l != colorStateList) {
                aVar.f356099l = colorStateList;
                MaterialButton materialButton = aVar.f356088a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(com.google.android.material.ripple.b.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@InterfaceC42158n int i12) {
        if (isUsingOriginalBackground()) {
            setRippleColor(d.getColorStateList(getContext(), i12));
        }
    }

    @Override // com.google.android.material.shape.v
    public void setShapeAppearanceModel(@N q qVar) {
        if (!isUsingOriginalBackground()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.materialButtonHelper.c(qVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z12) {
        if (isUsingOriginalBackground()) {
            com.google.android.material.button.a aVar = this.materialButtonHelper;
            aVar.f356101n = z12;
            aVar.f();
        }
    }

    public void setStrokeColor(@P ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            com.google.android.material.button.a aVar = this.materialButtonHelper;
            if (aVar.f356098k != colorStateList) {
                aVar.f356098k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(@InterfaceC42158n int i12) {
        if (isUsingOriginalBackground()) {
            setStrokeColor(d.getColorStateList(getContext(), i12));
        }
    }

    public void setStrokeWidth(@U int i12) {
        if (isUsingOriginalBackground()) {
            com.google.android.material.button.a aVar = this.materialButtonHelper;
            if (aVar.f356095h != i12) {
                aVar.f356095h = i12;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(@InterfaceC42161q int i12) {
        if (isUsingOriginalBackground()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i12));
        }
    }

    @Override // androidx.appcompat.widget.C19961m
    @RestrictTo
    public void setSupportBackgroundTintList(@P ColorStateList colorStateList) {
        if (!isUsingOriginalBackground()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        com.google.android.material.button.a aVar = this.materialButtonHelper;
        if (aVar.f356097j != colorStateList) {
            aVar.f356097j = colorStateList;
            if (aVar.b(false) != null) {
                aVar.b(false).setTintList(aVar.f356097j);
            }
        }
    }

    @Override // androidx.appcompat.widget.C19961m
    @RestrictTo
    public void setSupportBackgroundTintMode(@P PorterDuff.Mode mode) {
        if (!isUsingOriginalBackground()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        com.google.android.material.button.a aVar = this.materialButtonHelper;
        if (aVar.f356096i != mode) {
            aVar.f356096i = mode;
            if (aVar.b(false) == null || aVar.f356096i == null) {
                return;
            }
            aVar.b(false).setTintMode(aVar.f356096i);
        }
    }

    @Override // android.view.View
    @X
    public void setTextAlignment(int i12) {
        super.setTextAlignment(i12);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z12) {
        this.materialButtonHelper.f356105r = z12;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@N Context context, @P AttributeSet attributeSet, int i12) {
        int i13 = DEF_STYLE_RES;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.onCheckedChangeListeners = new LinkedHashSet<>();
        this.checked = false;
        this.broadcasting = false;
        Context context2 = getContext();
        TypedArray typedArrayD = G.d(context2, attributeSet, com.google.android.material.R.styleable.MaterialButton, i12, i13, new int[0]);
        this.iconPadding = typedArrayD.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconPadding, 0);
        int i14 = typedArrayD.getInt(com.google.android.material.R.styleable.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.iconTintMode = O.g(i14, mode);
        this.iconTint = com.google.android.material.resources.c.b(typedArrayD, getContext(), com.google.android.material.R.styleable.MaterialButton_iconTint);
        this.icon = com.google.android.material.resources.c.d(typedArrayD, getContext(), com.google.android.material.R.styleable.MaterialButton_icon);
        this.iconGravity = typedArrayD.getInteger(com.google.android.material.R.styleable.MaterialButton_iconGravity, 1);
        this.iconSize = typedArrayD.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconSize, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, q.c(context2, attributeSet, i12, i13).a());
        this.materialButtonHelper = aVar;
        aVar.f356090c = typedArrayD.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetLeft, 0);
        aVar.f356091d = typedArrayD.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetRight, 0);
        aVar.f356092e = typedArrayD.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetTop, 0);
        aVar.f356093f = typedArrayD.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetBottom, 0);
        if (typedArrayD.hasValue(com.google.android.material.R.styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_cornerRadius, -1);
            aVar.f356094g = dimensionPixelSize;
            q.b bVarF = aVar.f356089b.f();
            bVarF.c(dimensionPixelSize);
            aVar.c(bVarF.a());
            aVar.f356103p = true;
        }
        aVar.f356095h = typedArrayD.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_strokeWidth, 0);
        aVar.f356096i = O.g(typedArrayD.getInt(com.google.android.material.R.styleable.MaterialButton_backgroundTintMode, -1), mode);
        aVar.f356097j = com.google.android.material.resources.c.b(typedArrayD, getContext(), com.google.android.material.R.styleable.MaterialButton_backgroundTint);
        aVar.f356098k = com.google.android.material.resources.c.b(typedArrayD, getContext(), com.google.android.material.R.styleable.MaterialButton_strokeColor);
        aVar.f356099l = com.google.android.material.resources.c.b(typedArrayD, getContext(), com.google.android.material.R.styleable.MaterialButton_rippleColor);
        aVar.f356104q = typedArrayD.getBoolean(com.google.android.material.R.styleable.MaterialButton_android_checkable, false);
        aVar.f356107t = typedArrayD.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_elevation, 0);
        aVar.f356105r = typedArrayD.getBoolean(com.google.android.material.R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(com.google.android.material.R.styleable.MaterialButton_android_background)) {
            aVar.f356102o = true;
            setSupportBackgroundTintList(aVar.f356097j);
            setSupportBackgroundTintMode(aVar.f356096i);
        } else {
            aVar.e();
        }
        setPaddingRelative(paddingStart + aVar.f356090c, paddingTop + aVar.f356092e, paddingEnd + aVar.f356091d, paddingBottom + aVar.f356093f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.iconPadding);
        updateIcon(this.icon != null);
    }
}
