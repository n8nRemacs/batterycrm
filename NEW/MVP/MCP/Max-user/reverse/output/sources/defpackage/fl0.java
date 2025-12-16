package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class fl0 extends FrameLayout {
    public static final gah v0 = new gah(1);
    public final xse a;
    public int b;
    public final float c;
    public final float d;
    public final int o;
    public final int s0;
    public ColorStateList t0;
    public PorterDuff.Mode u0;

    /* JADX WARN: Multi-variable type inference failed */
    public fl0(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(er8.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, z5d.SnackbarLayout);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.SnackbarLayout_elevation)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.SnackbarLayout_elevation, 0);
            WeakHashMap weakHashMap = hfh.a;
            veh.s(this, dimensionPixelSize);
        }
        this.b = typedArrayObtainStyledAttributes.getInt(z5d.SnackbarLayout_animationMode, 0);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(z5d.SnackbarLayout_shapeAppearanceOverlay)) {
            this.a = xse.b(context2, attributeSet, 0, 0).g();
        }
        this.c = typedArrayObtainStyledAttributes.getFloat(z5d.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(gti.c(context2, typedArrayObtainStyledAttributes, z5d.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(yqi.f(typedArrayObtainStyledAttributes.getInt(z5d.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.d = typedArrayObtainStyledAttributes.getFloat(z5d.SnackbarLayout_actionTextColorAlpha, 1.0f);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.SnackbarLayout_android_maxWidth, -1);
        this.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(v0);
        setFocusable(true);
        if (getBackground() == null) {
            int iJ = eti.j(eti.f(this, dvc.colorSurface), getBackgroundOverlayColorAlpha(), eti.f(this, dvc.colorOnSurface));
            xse xseVar = this.a;
            if (xseVar != null) {
                int i = gl0.a;
                wq8 wq8Var = new wq8(xseVar);
                wq8Var.k(ColorStateList.valueOf(iJ));
                gradientDrawable = wq8Var;
            } else {
                Resources resources = getResources();
                int i2 = gl0.a;
                float dimension = resources.getDimension(dwc.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iJ);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.t0;
            if (colorStateList != null) {
                t35.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = hfh.a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(gl0 gl0Var) {
    }

    public float getActionTextColorAlpha() {
        return this.d;
    }

    public int getAnimationMode() {
        return this.b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.c;
    }

    public int getMaxInlineActionWidth() {
        return this.s0;
    }

    public int getMaxWidth() {
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = hfh.a;
        teh.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.o;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.b = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.t0 != null) {
            drawable = drawable.mutate();
            t35.h(drawable, this.t0);
            t35.i(drawable, this.u0);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.t0 = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            t35.h(drawableMutate, colorStateList);
            t35.i(drawableMutate, this.u0);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.u0 = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            t35.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : v0);
        super.setOnClickListener(onClickListener);
    }
}
