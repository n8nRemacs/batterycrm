package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class to extends xo8 {
    public Drawable X;
    public ColorStateList Y;
    public PorterDuff.Mode Z;
    public final so o;
    public boolean s0;
    public boolean t0;

    public to(so soVar) {
        super(1, soVar);
        this.Y = null;
        this.Z = null;
        this.s0 = false;
        this.t0 = false;
        this.o = soVar;
    }

    @Override // defpackage.xo8
    public final void F(AttributeSet attributeSet, int i) {
        super.F(attributeSet, i);
        so soVar = this.o;
        jdc jdcVarX = jdc.x(soVar.getContext(), attributeSet, o6d.AppCompatSeekBar, i);
        TypedArray typedArray = (TypedArray) jdcVarX.c;
        hfh.m(soVar, soVar.getContext(), o6d.AppCompatSeekBar, attributeSet, (TypedArray) jdcVarX.c, i, 0);
        Drawable drawableU = jdcVarX.u(o6d.AppCompatSeekBar_android_thumb);
        if (drawableU != null) {
            soVar.setThumb(drawableU);
        }
        Drawable drawableT = jdcVarX.t(o6d.AppCompatSeekBar_tickMark);
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.X = drawableT;
        if (drawableT != null) {
            drawableT.setCallback(soVar);
            u35.b(drawableT, soVar.getLayoutDirection());
            if (drawableT.isStateful()) {
                drawableT.setState(soVar.getDrawableState());
            }
            P();
        }
        soVar.invalidate();
        if (typedArray.hasValue(o6d.AppCompatSeekBar_tickMarkTintMode)) {
            this.Z = d45.c(typedArray.getInt(o6d.AppCompatSeekBar_tickMarkTintMode, -1), this.Z);
            this.t0 = true;
        }
        if (typedArray.hasValue(o6d.AppCompatSeekBar_tickMarkTint)) {
            this.Y = jdcVarX.s(o6d.AppCompatSeekBar_tickMarkTint);
            this.s0 = true;
        }
        jdcVarX.B();
        P();
    }

    public final void P() {
        Drawable drawable = this.X;
        if (drawable != null) {
            if (this.s0 || this.t0) {
                Drawable drawableMutate = drawable.mutate();
                this.X = drawableMutate;
                if (this.s0) {
                    t35.h(drawableMutate, this.Y);
                }
                if (this.t0) {
                    t35.i(this.X, this.Z);
                }
                if (this.X.isStateful()) {
                    this.X.setState(this.o.getDrawableState());
                }
            }
        }
    }

    public final void Q(Canvas canvas) {
        if (this.X != null) {
            int max = this.o.getMax();
            if (max > 1) {
                int intrinsicWidth = this.X.getIntrinsicWidth();
                int intrinsicHeight = this.X.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.X.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.X.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
