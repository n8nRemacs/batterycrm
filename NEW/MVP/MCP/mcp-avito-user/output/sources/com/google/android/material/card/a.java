package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import androidx.core.content.d;
import com.google.android.material.internal.G;
import com.google.android.material.shape.k;
import com.google.android.material.shape.m;
import com.google.android.material.shape.q;
import com.google.android.material.shape.v;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import j.InterfaceC42167x;
import j.N;
import j.P;
import j.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import m.C43852a;

/* compiled from: MaterialCardView.java */
/* loaded from: classes6.dex */
public class a extends CardView implements Checkable, v {

    @N
    private final c cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private b onCheckedChangeListener;
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DRAGGED_STATE_SET = {com.google.android.material.R.attr.state_dragged};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_CardView;

    /* compiled from: MaterialCardView.java */
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.card.a$a, reason: collision with other inner class name */
    public @interface InterfaceC10636a {
    }

    /* compiled from: MaterialCardView.java */
    public interface b {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialCardViewStyle);
    }

    private void forceRippleRedrawIfNeeded() {
        c cVar = this.cardViewHelper;
        RippleDrawable rippleDrawable = cVar.f356125o;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i12 = bounds.bottom;
            cVar.f356125o.setBounds(bounds.left, bounds.top, bounds.right, i12 - 1);
            cVar.f356125o.setBounds(bounds.left, bounds.top, bounds.right, i12);
        }
    }

    @N
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.cardViewHelper.f356113c.getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    @N
    public ColorStateList getCardBackgroundColor() {
        return this.cardViewHelper.f356113c.f357034b.f357059c;
    }

    @N
    public ColorStateList getCardForegroundColor() {
        return this.cardViewHelper.f356114d.f357034b.f357059c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @P
    public Drawable getCheckedIcon() {
        return this.cardViewHelper.f356120j;
    }

    public int getCheckedIconGravity() {
        return this.cardViewHelper.f356117g;
    }

    @r
    public int getCheckedIconMargin() {
        return this.cardViewHelper.f356115e;
    }

    @r
    public int getCheckedIconSize() {
        return this.cardViewHelper.f356116f;
    }

    @P
    public ColorStateList getCheckedIconTint() {
        return this.cardViewHelper.f356122l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.cardViewHelper.f356112b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.cardViewHelper.f356112b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.cardViewHelper.f356112b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.cardViewHelper.f356112b.top;
    }

    @InterfaceC42167x
    public float getProgress() {
        return this.cardViewHelper.f356113c.f357034b.f357065i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.cardViewHelper.f356113c.h();
    }

    public ColorStateList getRippleColor() {
        return this.cardViewHelper.f356121k;
    }

    @Override // com.google.android.material.shape.v
    @N
    public q getShapeAppearanceModel() {
        return this.cardViewHelper.f356123m;
    }

    @InterfaceC42156l
    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.cardViewHelper.f356124n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @P
    public ColorStateList getStrokeColorStateList() {
        return this.cardViewHelper.f356124n;
    }

    @r
    public int getStrokeWidth() {
        return this.cardViewHelper.f356118h;
    }

    public boolean isCheckable() {
        c cVar = this.cardViewHelper;
        return cVar != null && cVar.f356129s;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isDragged() {
        return this.dragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.c(this, this.cardViewHelper.f356113c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i12) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + 3);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        if (isDragged()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, DRAGGED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@N AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        this.cardViewHelper.e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAncestorContentPadding(int i12, int i13, int i14, int i15) {
        super.setContentPadding(i12, i13, i14, i15);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.isParentCardViewDoneInitializing) {
            c cVar = this.cardViewHelper;
            if (!cVar.f356128r) {
                cVar.f356128r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@InterfaceC42156l int i12) {
        c cVar = this.cardViewHelper;
        cVar.f356113c.n(ColorStateList.valueOf(i12));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f12) {
        super.setCardElevation(f12);
        c cVar = this.cardViewHelper;
        cVar.f356113c.m(cVar.f356111a.getCardElevation());
    }

    public void setCardForegroundColor(@P ColorStateList colorStateList) {
        k kVar = this.cardViewHelper.f356114d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        kVar.n(colorStateList);
    }

    public void setCheckable(boolean z12) {
        this.cardViewHelper.f356129s = z12;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z12) {
        if (this.checked != z12) {
            toggle();
        }
    }

    public void setCheckedIcon(@P Drawable drawable) {
        this.cardViewHelper.g(drawable);
    }

    public void setCheckedIconGravity(int i12) {
        c cVar = this.cardViewHelper;
        if (cVar.f356117g != i12) {
            cVar.f356117g = i12;
            a aVar = cVar.f356111a;
            cVar.e(aVar.getMeasuredWidth(), aVar.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(@r int i12) {
        this.cardViewHelper.f356115e = i12;
    }

    public void setCheckedIconMarginResource(@InterfaceC42161q int i12) {
        if (i12 != -1) {
            this.cardViewHelper.f356115e = getResources().getDimensionPixelSize(i12);
        }
    }

    public void setCheckedIconResource(@InterfaceC42165v int i12) {
        this.cardViewHelper.g(C43852a.a(getContext(), i12));
    }

    public void setCheckedIconSize(@r int i12) {
        this.cardViewHelper.f356116f = i12;
    }

    public void setCheckedIconSizeResource(@InterfaceC42161q int i12) {
        if (i12 != 0) {
            this.cardViewHelper.f356116f = getResources().getDimensionPixelSize(i12);
        }
    }

    public void setCheckedIconTint(@P ColorStateList colorStateList) {
        c cVar = this.cardViewHelper;
        cVar.f356122l = colorStateList;
        Drawable drawable = cVar.f356120j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z12) {
        super.setClickable(z12);
        c cVar = this.cardViewHelper;
        if (cVar != null) {
            Drawable drawable = cVar.f356119i;
            a aVar = cVar.f356111a;
            Drawable drawableC = aVar.isClickable() ? cVar.c() : cVar.f356114d;
            cVar.f356119i = drawableC;
            if (drawable != drawableC) {
                if (aVar.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) aVar.getForeground()).setDrawable(drawableC);
                } else {
                    aVar.setForeground(cVar.d(drawableC));
                }
            }
        }
    }

    public void setDragged(boolean z12) {
        if (this.dragged != z12) {
            this.dragged = z12;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f12) {
        super.setMaxCardElevation(f12);
        this.cardViewHelper.k();
    }

    public void setOnCheckedChangeListener(@P b bVar) {
        this.onCheckedChangeListener = bVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z12) {
        super.setPreventCornerOverlap(z12);
        this.cardViewHelper.k();
        this.cardViewHelper.j();
    }

    public void setProgress(@InterfaceC42167x float f12) {
        c cVar = this.cardViewHelper;
        cVar.f356113c.o(f12);
        k kVar = cVar.f356114d;
        if (kVar != null) {
            kVar.o(f12);
        }
        k kVar2 = cVar.f356127q;
        if (kVar2 != null) {
            kVar2.o(f12);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f12) {
        super.setRadius(f12);
        c cVar = this.cardViewHelper;
        q.b bVarF = cVar.f356123m.f();
        bVarF.c(f12);
        cVar.h(bVarF.a());
        cVar.f356119i.invalidateSelf();
        if (cVar.i() || (cVar.f356111a.getPreventCornerOverlap() && !cVar.f356113c.k())) {
            cVar.j();
        }
        if (cVar.i()) {
            cVar.k();
        }
    }

    public void setRippleColor(@P ColorStateList colorStateList) {
        c cVar = this.cardViewHelper;
        cVar.f356121k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f356125o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(@InterfaceC42158n int i12) {
        c cVar = this.cardViewHelper;
        ColorStateList colorStateList = d.getColorStateList(getContext(), i12);
        cVar.f356121k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f356125o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // com.google.android.material.shape.v
    public void setShapeAppearanceModel(@N q qVar) {
        setClipToOutline(qVar.e(getBoundsAsRectF()));
        this.cardViewHelper.h(qVar);
    }

    public void setStrokeColor(@InterfaceC42156l int i12) {
        setStrokeColor(ColorStateList.valueOf(i12));
    }

    public void setStrokeWidth(@r int i12) {
        c cVar = this.cardViewHelper;
        if (i12 != cVar.f356118h) {
            cVar.f356118h = i12;
            k kVar = cVar.f356114d;
            ColorStateList colorStateList = cVar.f356124n;
            kVar.v(i12);
            kVar.u(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z12) {
        super.setUseCompatPadding(z12);
        this.cardViewHelper.k();
        this.cardViewHelper.j();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.checked = !this.checked;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            this.cardViewHelper.f(this.checked, true);
            b bVar = this.onCheckedChangeListener;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i12) {
        int i13 = DEF_STYLE_RES;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.checked = false;
        this.dragged = false;
        this.isParentCardViewDoneInitializing = true;
        TypedArray typedArrayD = G.d(getContext(), attributeSet, com.google.android.material.R.styleable.MaterialCardView, i12, i13, new int[0]);
        c cVar = new c(this, attributeSet, i12, i13);
        this.cardViewHelper = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        k kVar = cVar.f356113c;
        kVar.n(cardBackgroundColor);
        cVar.f356112b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.j();
        a aVar = cVar.f356111a;
        ColorStateList colorStateListB = com.google.android.material.resources.c.b(typedArrayD, aVar.getContext(), com.google.android.material.R.styleable.MaterialCardView_strokeColor);
        cVar.f356124n = colorStateListB;
        if (colorStateListB == null) {
            cVar.f356124n = ColorStateList.valueOf(-1);
        }
        cVar.f356118h = typedArrayD.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z12 = typedArrayD.getBoolean(com.google.android.material.R.styleable.MaterialCardView_android_checkable, false);
        cVar.f356129s = z12;
        aVar.setLongClickable(z12);
        cVar.f356122l = com.google.android.material.resources.c.b(typedArrayD, aVar.getContext(), com.google.android.material.R.styleable.MaterialCardView_checkedIconTint);
        cVar.g(com.google.android.material.resources.c.d(typedArrayD, aVar.getContext(), com.google.android.material.R.styleable.MaterialCardView_checkedIcon));
        cVar.f356116f = typedArrayD.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_checkedIconSize, 0);
        cVar.f356115e = typedArrayD.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_checkedIconMargin, 0);
        cVar.f356117g = typedArrayD.getInteger(com.google.android.material.R.styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListB2 = com.google.android.material.resources.c.b(typedArrayD, aVar.getContext(), com.google.android.material.R.styleable.MaterialCardView_rippleColor);
        cVar.f356121k = colorStateListB2;
        if (colorStateListB2 == null) {
            cVar.f356121k = ColorStateList.valueOf(com.google.android.material.color.k.d(aVar, com.google.android.material.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListB3 = com.google.android.material.resources.c.b(typedArrayD, aVar.getContext(), com.google.android.material.R.styleable.MaterialCardView_cardForegroundColor);
        k kVar2 = cVar.f356114d;
        kVar2.n(colorStateListB3 == null ? ColorStateList.valueOf(0) : colorStateListB3);
        RippleDrawable rippleDrawable = cVar.f356125o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f356121k);
        }
        kVar.m(aVar.getCardElevation());
        float f12 = cVar.f356118h;
        ColorStateList colorStateList = cVar.f356124n;
        kVar2.v(f12);
        kVar2.u(colorStateList);
        aVar.setBackgroundInternal(cVar.d(kVar));
        Drawable drawableC = aVar.isClickable() ? cVar.c() : kVar2;
        cVar.f356119i = drawableC;
        aVar.setForeground(cVar.d(drawableC));
        typedArrayD.recycle();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.cardViewHelper;
        if (cVar.f356124n != colorStateList) {
            cVar.f356124n = colorStateList;
            k kVar = cVar.f356114d;
            kVar.v(cVar.f356118h);
            kVar.u(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@P ColorStateList colorStateList) {
        this.cardViewHelper.f356113c.n(colorStateList);
    }
}
