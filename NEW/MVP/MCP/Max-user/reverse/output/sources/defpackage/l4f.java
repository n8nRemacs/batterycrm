package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.SeekBar;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l4f extends al0 {
    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.g1;
    }

    public int getFocusedThumbIndex() {
        return this.h1;
    }

    public int getHaloRadius() {
        return this.T0;
    }

    public ColorStateList getHaloTintList() {
        return this.q1;
    }

    public int getLabelBehavior() {
        return this.O0;
    }

    public float getStepSize() {
        return this.i1;
    }

    public float getThumbElevation() {
        return this.y1.a.m;
    }

    public int getThumbHeight() {
        return this.S0;
    }

    @Override // defpackage.al0
    public int getThumbRadius() {
        return this.R0 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.y1.a.d;
    }

    public float getThumbStrokeWidth() {
        return this.y1.a.j;
    }

    public ColorStateList getThumbTintList() {
        return this.y1.a.c;
    }

    public int getThumbTrackGapSize() {
        return this.U0;
    }

    public int getThumbWidth() {
        return this.R0;
    }

    public int getTickActiveRadius() {
        return this.l1;
    }

    public ColorStateList getTickActiveTintList() {
        return this.r1;
    }

    public int getTickInactiveRadius() {
        return this.m1;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.s1;
    }

    public ColorStateList getTickTintList() {
        if (this.s1.equals(this.r1)) {
            return this.r1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.t1;
    }

    public int getTrackHeight() {
        return this.P0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.u1;
    }

    public int getTrackInsideCornerSize() {
        return this.Y0;
    }

    public int getTrackSidePadding() {
        return this.Q0;
    }

    public int getTrackStopIndicatorSize() {
        return this.X0;
    }

    public ColorStateList getTrackTintList() {
        if (this.u1.equals(this.t1)) {
            return this.t1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.n1;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.d1;
    }

    public float getValueTo() {
        return this.e1;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    @Override // defpackage.al0, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f1.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.h1 = i;
        this.u0.w(i);
        postInvalidate();
    }

    @Override // defpackage.al0
    public void setHaloRadius(int i) {
        if (i == this.T0) {
            return;
        }
        this.T0 = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.T0);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.al0
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.q1)) {
            return;
        }
        this.q1 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iH = h(colorStateList);
        Paint paint = this.d;
        paint.setColor(iH);
        paint.setAlpha(63);
        invalidate();
    }

    @Override // defpackage.al0
    public void setLabelBehavior(int i) {
        if (this.O0 != i) {
            this.O0 = i;
            requestLayout();
        }
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(s08 s08Var) {
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.i1 != f) {
                this.i1 = f;
                this.p1 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.d1 + ")-valueTo(" + this.e1 + ") range");
    }

    @Override // defpackage.al0
    public void setThumbElevation(float f) {
        this.y1.j(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // defpackage.al0
    public void setThumbHeight(int i) {
        if (i == this.S0) {
            return;
        }
        this.S0 = i;
        this.y1.setBounds(0, 0, this.R0, i);
        Drawable drawable = this.z1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.A1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        y();
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.al0
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.y1.m(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(z7.c(getContext(), i));
        }
    }

    @Override // defpackage.al0
    public void setThumbStrokeWidth(float f) {
        wq8 wq8Var = this.y1;
        wq8Var.a.j = f;
        wq8Var.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        wq8 wq8Var = this.y1;
        if (colorStateList.equals(wq8Var.a.c)) {
            return;
        }
        wq8Var.k(colorStateList);
        invalidate();
    }

    @Override // defpackage.al0
    public void setThumbTrackGapSize(int i) {
        if (this.U0 == i) {
            return;
        }
        this.U0 = i;
        invalidate();
    }

    @Override // defpackage.al0
    public void setThumbWidth(int i) {
        if (i == this.R0) {
            return;
        }
        this.R0 = i;
        q85 q85Var = new q85(0);
        q85 q85Var2 = new q85(0);
        q85 q85Var3 = new q85(0);
        q85 q85Var4 = new q85(0);
        float f = this.R0 / 2.0f;
        l6j l6jVarB = iti.b(0);
        s5i.h(l6jVarB);
        s5i.h(l6jVarB);
        s5i.h(l6jVarB);
        s5i.h(l6jVarB);
        g0 g0Var = new g0(f);
        g0 g0Var2 = new g0(f);
        g0 g0Var3 = new g0(f);
        g0 g0Var4 = new g0(f);
        xse xseVar = new xse();
        xseVar.a = l6jVarB;
        xseVar.b = l6jVarB;
        xseVar.c = l6jVarB;
        xseVar.d = l6jVarB;
        xseVar.e = g0Var;
        xseVar.f = g0Var2;
        xseVar.g = g0Var3;
        xseVar.h = g0Var4;
        xseVar.i = q85Var;
        xseVar.j = q85Var2;
        xseVar.k = q85Var3;
        xseVar.l = q85Var4;
        wq8 wq8Var = this.y1;
        wq8Var.setShapeAppearanceModel(xseVar);
        wq8Var.setBounds(0, 0, this.R0, this.S0);
        Drawable drawable = this.z1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.A1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        y();
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.al0
    public void setTickActiveRadius(int i) {
        if (this.l1 != i) {
            this.l1 = i;
            this.s0.setStrokeWidth(i * 2);
            y();
        }
    }

    @Override // defpackage.al0
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.r1)) {
            return;
        }
        this.r1 = colorStateList;
        this.s0.setColor(h(colorStateList));
        invalidate();
    }

    @Override // defpackage.al0
    public void setTickInactiveRadius(int i) {
        if (this.m1 != i) {
            this.m1 = i;
            this.o.setStrokeWidth(i * 2);
            y();
        }
    }

    @Override // defpackage.al0
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.s1)) {
            return;
        }
        this.s1 = colorStateList;
        this.o.setColor(h(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.k1 != z) {
            this.k1 = z;
            postInvalidate();
        }
    }

    @Override // defpackage.al0
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.t1)) {
            return;
        }
        this.t1 = colorStateList;
        this.b.setColor(h(colorStateList));
        this.t0.setColor(h(this.t1));
        invalidate();
    }

    @Override // defpackage.al0
    public void setTrackHeight(int i) {
        if (this.P0 != i) {
            this.P0 = i;
            this.a.setStrokeWidth(i);
            this.b.setStrokeWidth(this.P0);
            y();
        }
    }

    @Override // defpackage.al0
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.u1)) {
            return;
        }
        this.u1 = colorStateList;
        this.a.setColor(h(colorStateList));
        invalidate();
    }

    @Override // defpackage.al0
    public void setTrackInsideCornerSize(int i) {
        if (this.Y0 == i) {
            return;
        }
        this.Y0 = i;
        invalidate();
    }

    @Override // defpackage.al0
    public void setTrackStopIndicatorSize(int i) {
        if (this.X0 == i) {
            return;
        }
        this.X0 = i;
        this.t0.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.d1 = f;
        this.p1 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.e1 = f;
        this.p1 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.z1 = drawableNewDrawable;
        this.A1.clear();
        postInvalidate();
    }
}
