package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.g6d;
import defpackage.j5d;
import defpackage.ktd;
import defpackage.lvc;
import defpackage.r8j;
import defpackage.xo8;
import defpackage.xuc;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] s0 = {R.attr.colorBackground};
    public static final r8j t0 = new r8j(15);
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final xo8 o;

    /* JADX WARN: Illegal instructions before constructor call */
    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        int i = xuc.cardViewStyle;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        xo8 xo8Var = new xo8(this);
        this.o = xo8Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g6d.CardView, i, j5d.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(g6d.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(g6d.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(s0);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(lvc.cardview_light_background) : getResources().getColor(lvc.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(g6d.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(g6d.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(g6d.CardView_cardMaxElevation, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(g6d.CardView_cardUseCompatPadding, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(g6d.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(g6d.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(g6d.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(g6d.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(g6d.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(g6d.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(g6d.CardView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(g6d.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        ktd ktdVar = new ktd(colorStateListValueOf, dimension);
        xo8Var.b = ktdVar;
        setBackgroundDrawable(ktdVar);
        setClipToOutline(true);
        setElevation(dimension2);
        t0.o(xo8Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((ktd) ((Drawable) this.o.b)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.o.c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((ktd) ((Drawable) this.o.b)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((ktd) ((Drawable) this.o.b)).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ktd ktdVar = (ktd) ((Drawable) this.o.b);
        if (colorStateListValueOf == null) {
            ktdVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        ktdVar.h = colorStateListValueOf;
        ktdVar.b.setColor(colorStateListValueOf.getColorForState(ktdVar.getState(), ktdVar.h.getDefaultColor()));
        ktdVar.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.o.c).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        t0.o(this.o, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            xo8 xo8Var = this.o;
            t0.o(xo8Var, ((ktd) ((Drawable) xo8Var.b)).e);
        }
    }

    public void setRadius(float f) {
        ktd ktdVar = (ktd) ((Drawable) this.o.b);
        if (f == ktdVar.a) {
            return;
        }
        ktdVar.a = f;
        ktdVar.b(null);
        ktdVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            xo8 xo8Var = this.o;
            t0.o(xo8Var, ((ktd) ((Drawable) xo8Var.b)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ktd ktdVar = (ktd) ((Drawable) this.o.b);
        if (colorStateList == null) {
            ktdVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        ktdVar.h = colorStateList;
        ktdVar.b.setColor(colorStateList.getColorForState(ktdVar.getState(), ktdVar.h.getDefaultColor()));
        ktdVar.invalidateSelf();
    }
}
