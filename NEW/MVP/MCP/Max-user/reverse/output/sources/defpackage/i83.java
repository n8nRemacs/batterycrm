package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i83 extends wq8 implements Drawable.Callback, z3g {
    public static final int[] Q1 = {R.attr.state_enabled};
    public static final ShapeDrawable R1 = new ShapeDrawable(new OvalShape());
    public int A1;
    public int B1;
    public boolean C1;
    public int D1;
    public int E1;
    public ColorFilter F1;
    public PorterDuffColorFilter G1;
    public ColorStateList H1;
    public ColorStateList I0;
    public PorterDuff.Mode I1;
    public ColorStateList J0;
    public int[] J1;
    public float K0;
    public ColorStateList K1;
    public float L0;
    public WeakReference L1;
    public ColorStateList M0;
    public TextUtils.TruncateAt M1;
    public float N0;
    public boolean N1;
    public ColorStateList O0;
    public int O1;
    public CharSequence P0;
    public boolean P1;
    public boolean Q0;
    public Drawable R0;
    public ColorStateList S0;
    public float T0;
    public boolean U0;
    public boolean V0;
    public Drawable W0;
    public RippleDrawable X0;
    public ColorStateList Y0;
    public float Z0;
    public SpannableStringBuilder a1;
    public boolean b1;
    public boolean c1;
    public Drawable d1;
    public ColorStateList e1;
    public s2a f1;
    public s2a g1;
    public float h1;
    public float i1;
    public float j1;
    public float k1;
    public float l1;
    public float m1;
    public float n1;
    public float o1;
    public final Context p1;
    public final Paint q1;
    public final Paint.FontMetrics r1;
    public final RectF s1;
    public final PointF t1;
    public final Path u1;
    public final a4g v1;
    public int w1;
    public int x1;
    public int y1;
    public int z1;

    public i83(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, Chip.K0);
        this.L0 = -1.0f;
        this.q1 = new Paint(1);
        this.r1 = new Paint.FontMetrics();
        this.s1 = new RectF();
        this.t1 = new PointF();
        this.u1 = new Path();
        this.E1 = 255;
        this.I1 = PorterDuff.Mode.SRC_IN;
        this.L1 = new WeakReference(null);
        i(context);
        this.p1 = context;
        a4g a4gVar = new a4g(this);
        this.v1 = a4gVar;
        this.P0 = "";
        a4gVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = Q1;
        setState(iArr);
        if (!Arrays.equals(this.J1, iArr)) {
            this.J1 = iArr;
            if (V()) {
                y(getState(), iArr);
            }
        }
        this.N1 = true;
        int[] iArr2 = sqd.a;
        R1.setTint(-1);
    }

    public static void W(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean v(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean w(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(Drawable drawable) {
        if (this.d1 != drawable) {
            float fS = s();
            this.d1 = drawable;
            float fS2 = s();
            W(this.d1);
            q(this.d1);
            invalidateSelf();
            if (fS != fS2) {
                x();
            }
        }
    }

    public final void B(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.e1 != colorStateList) {
            this.e1 = colorStateList;
            if (this.c1 && (drawable = this.d1) != null && this.b1) {
                t35.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void C(boolean z) {
        if (this.c1 != z) {
            boolean zT = T();
            this.c1 = z;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    q(this.d1);
                } else {
                    W(this.d1);
                }
                invalidateSelf();
                x();
            }
        }
    }

    public final void D(float f) {
        if (this.L0 != f) {
            this.L0 = f;
            s5i s5iVarE = this.a.a.e();
            s5iVarE.e = new g0(f);
            s5iVarE.f = new g0(f);
            s5iVarE.g = new g0(f);
            s5iVarE.h = new g0(f);
            setShapeAppearanceModel(s5iVarE.g());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.R0;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof h6i;
            drawable2 = drawable3;
            if (z) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fS = s();
            this.R0 = drawable != null ? drawable.mutate() : null;
            float fS2 = s();
            W(drawable2);
            if (U()) {
                q(this.R0);
            }
            invalidateSelf();
            if (fS != fS2) {
                x();
            }
        }
    }

    public final void F(float f) {
        if (this.T0 != f) {
            float fS = s();
            this.T0 = f;
            float fS2 = s();
            invalidateSelf();
            if (fS != fS2) {
                x();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        this.U0 = true;
        if (this.S0 != colorStateList) {
            this.S0 = colorStateList;
            if (U()) {
                t35.h(this.R0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void H(boolean z) {
        if (this.Q0 != z) {
            boolean zU = U();
            this.Q0 = z;
            boolean zU2 = U();
            if (zU != zU2) {
                if (zU2) {
                    q(this.R0);
                } else {
                    W(this.R0);
                }
                invalidateSelf();
                x();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            if (this.P1) {
                m(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(float f) {
        if (this.N0 != f) {
            this.N0 = f;
            this.q1.setStrokeWidth(f);
            if (this.P1) {
                this.a.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.W0;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof h6i;
            drawable2 = drawable3;
            if (z) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fT = t();
            this.W0 = drawable != null ? drawable.mutate() : null;
            int[] iArr = sqd.a;
            this.X0 = new RippleDrawable(sqd.b(this.O0), this.W0, R1);
            float fT2 = t();
            W(drawable2);
            if (V()) {
                q(this.W0);
            }
            invalidateSelf();
            if (fT != fT2) {
                x();
            }
        }
    }

    public final void L(float f) {
        if (this.n1 != f) {
            this.n1 = f;
            invalidateSelf();
            if (V()) {
                x();
            }
        }
    }

    public final void M(float f) {
        if (this.Z0 != f) {
            this.Z0 = f;
            invalidateSelf();
            if (V()) {
                x();
            }
        }
    }

    public final void N(float f) {
        if (this.m1 != f) {
            this.m1 = f;
            invalidateSelf();
            if (V()) {
                x();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.Y0 != colorStateList) {
            this.Y0 = colorStateList;
            if (V()) {
                t35.h(this.W0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(boolean z) {
        if (this.V0 != z) {
            boolean zV = V();
            this.V0 = z;
            boolean zV2 = V();
            if (zV != zV2) {
                if (zV2) {
                    q(this.W0);
                } else {
                    W(this.W0);
                }
                invalidateSelf();
                x();
            }
        }
    }

    public final void Q(float f) {
        if (this.j1 != f) {
            float fS = s();
            this.j1 = f;
            float fS2 = s();
            invalidateSelf();
            if (fS != fS2) {
                x();
            }
        }
    }

    public final void R(float f) {
        if (this.i1 != f) {
            float fS = s();
            this.i1 = f;
            float fS2 = s();
            invalidateSelf();
            if (fS != fS2) {
                x();
            }
        }
    }

    public final void S(ColorStateList colorStateList) {
        if (this.O0 != colorStateList) {
            this.O0 = colorStateList;
            this.K1 = null;
            onStateChange(getState());
        }
    }

    public final boolean T() {
        return this.c1 && this.d1 != null && this.C1;
    }

    public final boolean U() {
        return this.Q0 && this.R0 != null;
    }

    public final boolean V() {
        return this.V0 && this.W0 != null;
    }

    @Override // defpackage.wq8, defpackage.z3g
    public final void a() {
        x();
        invalidateSelf();
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.E1) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.P1;
        Paint paint = this.q1;
        RectF rectF = this.s1;
        if (!z) {
            paint.setColor(this.w1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, u(), u(), paint);
        }
        if (!this.P1) {
            paint.setColor(this.x1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.F1;
            if (colorFilter == null) {
                colorFilter = this.G1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, u(), u(), paint);
        }
        if (this.P1) {
            super.draw(canvas);
        }
        if (this.N0 > 0.0f && !this.P1) {
            paint.setColor(this.z1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.P1) {
                ColorFilter colorFilter2 = this.F1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.G1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.N0 / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.L0 - (this.N0 / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.A1);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.P1) {
            RectF rectF2 = new RectF(bounds);
            vq8 vq8Var = this.a;
            xse xseVar = vq8Var.a;
            float f4 = vq8Var.i;
            mc5 mc5Var = this.A0;
            y87 y87Var = this.B0;
            Path path = this.u1;
            y87Var.c(xseVar, f4, rectF2, mc5Var, path);
            e(canvas2, paint, path, this.a.a, g());
        } else {
            canvas2.drawRoundRect(rectF, u(), u(), paint);
        }
        if (U()) {
            r(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.R0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.R0.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (T()) {
            r(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.d1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.d1.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.N1 && this.P0 != null) {
            PointF pointF = this.t1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.P0;
            a4g a4gVar = this.v1;
            if (charSequence != null) {
                float fS = s() + this.h1 + this.k1;
                if (u35.a(this) == 0) {
                    pointF.x = bounds.left + fS;
                } else {
                    pointF.x = bounds.right - fS;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = a4gVar.a;
                Paint.FontMetrics fontMetrics = this.r1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.P0 != null) {
                float fS2 = s() + this.h1 + this.k1;
                float fT = t() + this.o1 + this.l1;
                if (u35.a(this) == 0) {
                    rectF.left = bounds.left + fS2;
                    rectF.right = bounds.right - fT;
                } else {
                    rectF.left = bounds.left + fT;
                    rectF.right = bounds.right - fS2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            s3g s3gVar = a4gVar.g;
            TextPaint textPaint2 = a4gVar.a;
            if (s3gVar != null) {
                textPaint2.drawableState = getState();
                a4gVar.g.e(this.p1, textPaint2, a4gVar.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(a4gVar.a(this.P0.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.P0;
            if (z2 && this.M1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.M1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (V()) {
            rectF.setEmpty();
            if (V()) {
                float f9 = this.o1 + this.n1;
                if (u35.a(this) == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.Z0;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.Z0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.Z0;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.W0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = sqd.a;
            this.X0.setBounds(this.W0.getBounds());
            this.X0.jumpToCurrentState();
            this.X0.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.E1 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.E1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.F1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.K0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(t() + this.v1.a(this.P0.toString()) + s() + this.h1 + this.k1 + this.l1 + this.o1), this.O1);
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.P1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.K0, this.L0);
        } else {
            outline.setRoundRect(bounds, this.L0);
            outline2 = outline;
        }
        outline2.setAlpha(this.E1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (v(this.I0) || v(this.J0) || v(this.M0)) {
            return true;
        }
        s3g s3gVar = this.v1.g;
        if (s3gVar == null || (colorStateList = s3gVar.j) == null || !colorStateList.isStateful()) {
            return (this.c1 && this.d1 != null && this.b1) || w(this.R0) || w(this.d1) || v(this.H1);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (U()) {
            zOnLayoutDirectionChanged |= u35.b(this.R0, i);
        }
        if (T()) {
            zOnLayoutDirectionChanged |= u35.b(this.d1, i);
        }
        if (V()) {
            zOnLayoutDirectionChanged |= u35.b(this.W0, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (U()) {
            zOnLevelChange |= this.R0.setLevel(i);
        }
        if (T()) {
            zOnLevelChange |= this.d1.setLevel(i);
        }
        if (V()) {
            zOnLevelChange |= this.W0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable, defpackage.z3g
    public final boolean onStateChange(int[] iArr) {
        if (this.P1) {
            super.onStateChange(iArr);
        }
        return y(iArr, this.J1);
    }

    public final void q(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        u35.b(drawable, u35.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.W0) {
            if (drawable.isStateful()) {
                drawable.setState(this.J1);
            }
            t35.h(drawable, this.Y0);
            return;
        }
        Drawable drawable2 = this.R0;
        if (drawable == drawable2 && this.U0) {
            t35.h(drawable2, this.S0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void r(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (U() || T()) {
            float f = this.h1 + this.i1;
            Drawable drawable = this.C1 ? this.d1 : this.R0;
            float intrinsicWidth = this.T0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (u35.a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.C1 ? this.d1 : this.R0;
            float fCeil = this.T0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(yqi.b(this.p1, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float s() {
        if (!U() && !T()) {
            return 0.0f;
        }
        float f = this.i1;
        Drawable drawable = this.C1 ? this.d1 : this.R0;
        float intrinsicWidth = this.T0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.j1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.E1 != i) {
            this.E1 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.F1 != colorFilter) {
            this.F1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.H1 != colorStateList) {
            this.H1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.wq8, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.I1 != mode) {
            this.I1 = mode;
            ColorStateList colorStateList = this.H1;
            this.G1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (U()) {
            visible |= this.R0.setVisible(z, z2);
        }
        if (T()) {
            visible |= this.d1.setVisible(z, z2);
        }
        if (V()) {
            visible |= this.W0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        if (V()) {
            return this.m1 + this.Z0 + this.n1;
        }
        return 0.0f;
    }

    public final float u() {
        return this.P1 ? this.a.a.e.a(g()) : this.L0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x() {
        h83 h83Var = (h83) this.L1.get();
        if (h83Var != null) {
            Chip chip = (Chip) h83Var;
            chip.d(chip.D0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean y(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.I0;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.w1) : 0);
        boolean state = true;
        if (this.w1 != iC) {
            this.w1 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.J0;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.x1) : 0);
        if (this.x1 != iC2) {
            this.x1 = iC2;
            zOnStateChange = true;
        }
        int iG = rf3.g(iC2, iC);
        if ((this.y1 != iG) | (this.a.c == null)) {
            this.y1 = iG;
            k(ColorStateList.valueOf(iG));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.M0;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.z1) : 0;
        if (this.z1 != colorForState) {
            this.z1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.K1 == null || !sqd.c(iArr)) ? 0 : this.K1.getColorForState(iArr, this.A1);
        if (this.A1 != colorForState2) {
            this.A1 = colorForState2;
        }
        s3g s3gVar = this.v1.g;
        int colorForState3 = (s3gVar == null || (colorStateList = s3gVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.B1);
        if (this.B1 != colorForState3) {
            this.B1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.b1) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.C1 == z || this.d1 == null) {
            z2 = false;
        } else {
            float fS = s();
            this.C1 = z;
            if (fS != s()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.H1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.D1) : 0;
        if (this.D1 != colorForState4) {
            this.D1 = colorForState4;
            ColorStateList colorStateList6 = this.H1;
            PorterDuff.Mode mode = this.I1;
            this.G1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (w(this.R0)) {
            state |= this.R0.setState(iArr);
        }
        if (w(this.d1)) {
            state |= this.d1.setState(iArr);
        }
        if (w(this.W0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.W0.setState(iArr3);
        }
        int[] iArr4 = sqd.a;
        if (w(this.X0)) {
            state |= this.X0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            x();
        }
        return state;
    }

    public final void z(boolean z) {
        if (this.b1 != z) {
            this.b1 = z;
            float fS = s();
            if (!z && this.C1) {
                this.C1 = false;
            }
            float fS2 = s();
            invalidateSelf();
            if (fS != fS2) {
                x();
            }
        }
    }
}
