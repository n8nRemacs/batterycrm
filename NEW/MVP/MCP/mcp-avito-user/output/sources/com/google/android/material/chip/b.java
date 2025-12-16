package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
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
import androidx.core.graphics.C22767g;
import androidx.core.graphics.drawable.i;
import androidx.core.graphics.drawable.j;
import com.google.android.material.internal.D;
import com.google.android.material.internal.O;
import com.google.android.material.shape.k;
import com.google.android.material.shape.q;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.N;
import j.P;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: ChipDrawable.java */
/* loaded from: classes6.dex */
public class b extends k implements i, Drawable.Callback, D.b {

    /* renamed from: G0, reason: collision with root package name */
    public static final int[] f356242G0 = {R.attr.state_enabled};

    /* renamed from: H0, reason: collision with root package name */
    public static final ShapeDrawable f356243H0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f356244A;

    /* renamed from: A0, reason: collision with root package name */
    @P
    public ColorStateList f356245A0;

    /* renamed from: B, reason: collision with root package name */
    public float f356246B;

    /* renamed from: B0, reason: collision with root package name */
    @N
    public WeakReference<a> f356247B0;

    /* renamed from: C, reason: collision with root package name */
    @P
    public ColorStateList f356248C;

    /* renamed from: C0, reason: collision with root package name */
    public TextUtils.TruncateAt f356249C0;

    /* renamed from: D, reason: collision with root package name */
    public float f356250D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f356251D0;

    /* renamed from: E, reason: collision with root package name */
    @P
    public ColorStateList f356252E;

    /* renamed from: E0, reason: collision with root package name */
    public int f356253E0;

    /* renamed from: F, reason: collision with root package name */
    @P
    public CharSequence f356254F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f356255F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f356256G;

    /* renamed from: H, reason: collision with root package name */
    @P
    public Drawable f356257H;

    /* renamed from: I, reason: collision with root package name */
    @P
    public ColorStateList f356258I;

    /* renamed from: J, reason: collision with root package name */
    public float f356259J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f356260K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f356261L;

    /* renamed from: M, reason: collision with root package name */
    @P
    public Drawable f356262M;

    /* renamed from: N, reason: collision with root package name */
    @P
    public RippleDrawable f356263N;

    /* renamed from: O, reason: collision with root package name */
    @P
    public ColorStateList f356264O;

    /* renamed from: P, reason: collision with root package name */
    public float f356265P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    public SpannableStringBuilder f356266Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f356267R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f356268S;

    /* renamed from: T, reason: collision with root package name */
    @P
    public Drawable f356269T;

    /* renamed from: U, reason: collision with root package name */
    @P
    public ColorStateList f356270U;

    /* renamed from: V, reason: collision with root package name */
    @P
    public lY0.i f356271V;

    /* renamed from: W, reason: collision with root package name */
    @P
    public lY0.i f356272W;

    /* renamed from: X, reason: collision with root package name */
    public float f356273X;

    /* renamed from: Y, reason: collision with root package name */
    public float f356274Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f356275Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f356276a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f356277b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f356278c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f356279d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f356280e0;

    /* renamed from: f0, reason: collision with root package name */
    @N
    public final Context f356281f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint f356282g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Paint.FontMetrics f356283h0;

    /* renamed from: i0, reason: collision with root package name */
    public final RectF f356284i0;

    /* renamed from: j0, reason: collision with root package name */
    public final PointF f356285j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Path f356286k0;

    /* renamed from: l0, reason: collision with root package name */
    @N
    public final D f356287l0;

    /* renamed from: m0, reason: collision with root package name */
    @InterfaceC42156l
    public int f356288m0;

    /* renamed from: n0, reason: collision with root package name */
    @InterfaceC42156l
    public int f356289n0;

    /* renamed from: o0, reason: collision with root package name */
    @InterfaceC42156l
    public int f356290o0;

    /* renamed from: p0, reason: collision with root package name */
    @InterfaceC42156l
    public int f356291p0;

    /* renamed from: q0, reason: collision with root package name */
    @InterfaceC42156l
    public int f356292q0;

    /* renamed from: r0, reason: collision with root package name */
    @InterfaceC42156l
    public int f356293r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f356294s0;

    /* renamed from: t0, reason: collision with root package name */
    @InterfaceC42156l
    public int f356295t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f356296u0;

    /* renamed from: v0, reason: collision with root package name */
    @P
    public ColorFilter f356297v0;

    /* renamed from: w0, reason: collision with root package name */
    @P
    public PorterDuffColorFilter f356298w0;

    /* renamed from: x0, reason: collision with root package name */
    @P
    public ColorStateList f356299x0;

    /* renamed from: y, reason: collision with root package name */
    @P
    public ColorStateList f356300y;

    /* renamed from: y0, reason: collision with root package name */
    @P
    public PorterDuff.Mode f356301y0;

    /* renamed from: z, reason: collision with root package name */
    @P
    public ColorStateList f356302z;

    /* renamed from: z0, reason: collision with root package name */
    public int[] f356303z0;

    /* compiled from: ChipDrawable.java */
    public interface a {
        void a();
    }

    public b(@N Context context, AttributeSet attributeSet, @InterfaceC42150f int i12) {
        super(context, attributeSet, i12, Chip.f356218y);
        this.f356246B = -1.0f;
        this.f356282g0 = new Paint(1);
        this.f356283h0 = new Paint.FontMetrics();
        this.f356284i0 = new RectF();
        this.f356285j0 = new PointF();
        this.f356286k0 = new Path();
        this.f356296u0 = 255;
        this.f356301y0 = PorterDuff.Mode.SRC_IN;
        this.f356247B0 = new WeakReference<>(null);
        j(context);
        this.f356281f0 = context;
        D d12 = new D(this);
        this.f356287l0 = d12;
        this.f356254F = "";
        d12.f356721a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f356242G0;
        setState(iArr);
        if (!Arrays.equals(this.f356303z0, iArr)) {
            this.f356303z0 = iArr;
            if (e0()) {
                H(getState(), iArr);
            }
        }
        this.f356251D0 = true;
        f356243H0.setTint(-1);
    }

    public static boolean E(@P ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean F(@P Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void f0(@P Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void A(@N Rect rect, @N RectF rectF) {
        rectF.setEmpty();
        if (d0() || c0()) {
            float f12 = this.f356273X + this.f356274Y;
            Drawable drawable = this.f356294s0 ? this.f356269T : this.f356257H;
            float intrinsicWidth = this.f356259J;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f13 = rect.left + f12;
                rectF.left = f13;
                rectF.right = f13 + intrinsicWidth;
            } else {
                float f14 = rect.right - f12;
                rectF.right = f14;
                rectF.left = f14 - intrinsicWidth;
            }
            Drawable drawable2 = this.f356294s0 ? this.f356269T : this.f356257H;
            float fCeil = this.f356259J;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(O.b(24, this.f356281f0));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float B() {
        if (!d0() && !c0()) {
            return 0.0f;
        }
        float f12 = this.f356274Y;
        Drawable drawable = this.f356294s0 ? this.f356269T : this.f356257H;
        float intrinsicWidth = this.f356259J;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f12 + this.f356275Z;
    }

    public final float C() {
        if (e0()) {
            return this.f356278c0 + this.f356265P + this.f356279d0;
        }
        return 0.0f;
    }

    public final float D() {
        return this.f356255F0 ? h() : this.f356246B;
    }

    public final void G() {
        a aVar = this.f356247B0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean H(@N int[] iArr, @N int[] iArr2) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f356300y;
        int iC2 = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f356288m0) : 0);
        boolean state = true;
        if (this.f356288m0 != iC2) {
            this.f356288m0 = iC2;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f356302z;
        int iC3 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f356289n0) : 0);
        if (this.f356289n0 != iC3) {
            this.f356289n0 = iC3;
            zOnStateChange = true;
        }
        int iG2 = C22767g.g(iC3, iC2);
        if ((this.f356290o0 != iG2) | (this.f357034b.f357059c == null)) {
            this.f356290o0 = iG2;
            n(ColorStateList.valueOf(iG2));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f356248C;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f356291p0) : 0;
        if (this.f356291p0 != colorForState) {
            this.f356291p0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f356245A0 == null || !com.google.android.material.ripple.b.d(iArr)) ? 0 : this.f356245A0.getColorForState(iArr, this.f356292q0);
        if (this.f356292q0 != colorForState2) {
            this.f356292q0 = colorForState2;
        }
        com.google.android.material.resources.d dVar = this.f356287l0.f356726f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f356996j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f356293r0);
        if (this.f356293r0 != colorForState3) {
            this.f356293r0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z12 = false;
        } else {
            int length = state2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (state2[i12] != 16842912) {
                    i12++;
                } else if (this.f356267R) {
                    z12 = true;
                }
            }
            z12 = false;
        }
        if (this.f356294s0 == z12 || this.f356269T == null) {
            z13 = false;
        } else {
            float fB2 = B();
            this.f356294s0 = z12;
            if (fB2 != B()) {
                zOnStateChange = true;
                z13 = true;
            } else {
                z13 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f356299x0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f356295t0) : 0;
        if (this.f356295t0 != colorForState4) {
            this.f356295t0 = colorForState4;
            ColorStateList colorStateList6 = this.f356299x0;
            PorterDuff.Mode mode = this.f356301y0;
            this.f356298w0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (F(this.f356257H)) {
            state |= this.f356257H.setState(iArr);
        }
        if (F(this.f356269T)) {
            state |= this.f356269T.setState(iArr);
        }
        if (F(this.f356262M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f356262M.setState(iArr3);
        }
        if (F(this.f356263N)) {
            state |= this.f356263N.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z13) {
            G();
        }
        return state;
    }

    public final void I(boolean z12) {
        if (this.f356267R != z12) {
            this.f356267R = z12;
            float fB2 = B();
            if (!z12 && this.f356294s0) {
                this.f356294s0 = false;
            }
            float fB3 = B();
            invalidateSelf();
            if (fB2 != fB3) {
                G();
            }
        }
    }

    public final void J(@P Drawable drawable) {
        if (this.f356269T != drawable) {
            float fB2 = B();
            this.f356269T = drawable;
            float fB3 = B();
            f0(this.f356269T);
            z(this.f356269T);
            invalidateSelf();
            if (fB2 != fB3) {
                G();
            }
        }
    }

    public final void K(@P ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f356270U != colorStateList) {
            this.f356270U = colorStateList;
            if (this.f356268S && (drawable = this.f356269T) != null && this.f356267R) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z12) {
        if (this.f356268S != z12) {
            boolean zC02 = c0();
            this.f356268S = z12;
            boolean zC03 = c0();
            if (zC02 != zC03) {
                if (zC03) {
                    z(this.f356269T);
                } else {
                    f0(this.f356269T);
                }
                invalidateSelf();
                G();
            }
        }
    }

    @Deprecated
    public final void M(float f12) {
        if (this.f356246B != f12) {
            this.f356246B = f12;
            q.b bVarF = this.f357034b.f357057a.f();
            bVarF.c(f12);
            setShapeAppearanceModel(bVarF.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(@P Drawable drawable) {
        Drawable drawableB;
        Drawable drawable2 = this.f356257H;
        if (drawable2 != 0) {
            boolean z12 = drawable2 instanceof j;
            drawableB = drawable2;
            if (z12) {
                drawableB = ((j) drawable2).b();
            }
        } else {
            drawableB = null;
        }
        if (drawableB != drawable) {
            float fB2 = B();
            this.f356257H = drawable != null ? drawable.mutate() : null;
            float fB3 = B();
            f0(drawableB);
            if (d0()) {
                z(this.f356257H);
            }
            invalidateSelf();
            if (fB2 != fB3) {
                G();
            }
        }
    }

    public final void O(float f12) {
        if (this.f356259J != f12) {
            float fB2 = B();
            this.f356259J = f12;
            float fB3 = B();
            invalidateSelf();
            if (fB2 != fB3) {
                G();
            }
        }
    }

    public final void P(@P ColorStateList colorStateList) {
        this.f356260K = true;
        if (this.f356258I != colorStateList) {
            this.f356258I = colorStateList;
            if (d0()) {
                this.f356257H.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z12) {
        if (this.f356256G != z12) {
            boolean zD02 = d0();
            this.f356256G = z12;
            boolean zD03 = d0();
            if (zD02 != zD03) {
                if (zD03) {
                    z(this.f356257H);
                } else {
                    f0(this.f356257H);
                }
                invalidateSelf();
                G();
            }
        }
    }

    public final void R(@P ColorStateList colorStateList) {
        if (this.f356248C != colorStateList) {
            this.f356248C = colorStateList;
            if (this.f356255F0) {
                u(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void S(float f12) {
        if (this.f356250D != f12) {
            this.f356250D = f12;
            this.f356282g0.setStrokeWidth(f12);
            if (this.f356255F0) {
                v(f12);
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(@P Drawable drawable) {
        Drawable drawableB;
        Drawable drawable2 = this.f356262M;
        if (drawable2 != 0) {
            boolean z12 = drawable2 instanceof j;
            drawableB = drawable2;
            if (z12) {
                drawableB = ((j) drawable2).b();
            }
        } else {
            drawableB = null;
        }
        if (drawableB != drawable) {
            float fC2 = C();
            this.f356262M = drawable != null ? drawable.mutate() : null;
            this.f356263N = new RippleDrawable(com.google.android.material.ripple.b.c(this.f356252E), this.f356262M, f356243H0);
            float fC3 = C();
            f0(drawableB);
            if (e0()) {
                z(this.f356262M);
            }
            invalidateSelf();
            if (fC2 != fC3) {
                G();
            }
        }
    }

    public final void U(float f12) {
        if (this.f356279d0 != f12) {
            this.f356279d0 = f12;
            invalidateSelf();
            if (e0()) {
                G();
            }
        }
    }

    public final void V(float f12) {
        if (this.f356265P != f12) {
            this.f356265P = f12;
            invalidateSelf();
            if (e0()) {
                G();
            }
        }
    }

    public final void W(float f12) {
        if (this.f356278c0 != f12) {
            this.f356278c0 = f12;
            invalidateSelf();
            if (e0()) {
                G();
            }
        }
    }

    public final void X(@P ColorStateList colorStateList) {
        if (this.f356264O != colorStateList) {
            this.f356264O = colorStateList;
            if (e0()) {
                this.f356262M.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(boolean z12) {
        if (this.f356261L != z12) {
            boolean zE02 = e0();
            this.f356261L = z12;
            boolean zE03 = e0();
            if (zE02 != zE03) {
                if (zE03) {
                    z(this.f356262M);
                } else {
                    f0(this.f356262M);
                }
                invalidateSelf();
                G();
            }
        }
    }

    public final void Z(float f12) {
        if (this.f356275Z != f12) {
            float fB2 = B();
            this.f356275Z = f12;
            float fB3 = B();
            invalidateSelf();
            if (fB2 != fB3) {
                G();
            }
        }
    }

    @Override // com.google.android.material.shape.k, com.google.android.material.internal.D.b
    public final void a() {
        G();
        invalidateSelf();
    }

    public final void a0(float f12) {
        if (this.f356274Y != f12) {
            float fB2 = B();
            this.f356274Y = f12;
            float fB3 = B();
            invalidateSelf();
            if (fB2 != fB3) {
                G();
            }
        }
    }

    public final void b0(@P ColorStateList colorStateList) {
        if (this.f356252E != colorStateList) {
            this.f356252E = colorStateList;
            this.f356245A0 = null;
            onStateChange(getState());
        }
    }

    public final boolean c0() {
        return this.f356268S && this.f356269T != null && this.f356294s0;
    }

    public final boolean d0() {
        return this.f356256G && this.f356257H != null;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        int i12;
        RectF rectF;
        int i13;
        int i14;
        int i15;
        RectF rectF2;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i12 = this.f356296u0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i12 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i12) : 0;
        boolean z12 = this.f356255F0;
        Paint paint = this.f356282g0;
        RectF rectF3 = this.f356284i0;
        if (!z12) {
            paint.setColor(this.f356288m0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, D(), D(), paint);
        }
        if (!this.f356255F0) {
            paint.setColor(this.f356289n0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f356297v0;
            if (colorFilter == null) {
                colorFilter = this.f356298w0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, D(), D(), paint);
        }
        if (this.f356255F0) {
            super.draw(canvas);
        }
        if (this.f356250D > 0.0f && !this.f356255F0) {
            paint.setColor(this.f356291p0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f356255F0) {
                ColorFilter colorFilter2 = this.f356297v0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f356298w0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f12 = bounds.left;
            float f13 = this.f356250D / 2.0f;
            rectF3.set(f12 + f13, bounds.top + f13, bounds.right - f13, bounds.bottom - f13);
            float f14 = this.f356246B - (this.f356250D / 2.0f);
            canvas.drawRoundRect(rectF3, f14, f14, paint);
        }
        paint.setColor(this.f356292q0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f356255F0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f356286k0;
            k.c cVar = this.f357034b;
            this.f357051s.a(cVar.f357057a, cVar.f357065i, rectF4, this.f357050r, path);
            e(canvas, paint, path, this.f357034b.f357057a, g());
        } else {
            canvas.drawRoundRect(rectF3, D(), D(), paint);
        }
        if (d0()) {
            A(bounds, rectF3);
            float f15 = rectF3.left;
            float f16 = rectF3.top;
            canvas.translate(f15, f16);
            this.f356257H.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f356257H.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (c0()) {
            A(bounds, rectF3);
            float f17 = rectF3.left;
            float f18 = rectF3.top;
            canvas.translate(f17, f18);
            this.f356269T.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f356269T.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (!this.f356251D0 || this.f356254F == null) {
            rectF = rectF3;
            i13 = iSaveLayerAlpha;
            i14 = 0;
            i15 = 255;
        } else {
            PointF pointF = this.f356285j0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f356254F;
            D d12 = this.f356287l0;
            if (charSequence != null) {
                float fB2 = B() + this.f356273X + this.f356276a0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fB2;
                } else {
                    pointF.x = bounds.right - fB2;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = d12.f356721a;
                Paint.FontMetrics fontMetrics = this.f356283h0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f356254F != null) {
                float fB3 = B() + this.f356273X + this.f356276a0;
                float fC2 = C() + this.f356280e0 + this.f356277b0;
                if (getLayoutDirection() == 0) {
                    rectF3.left = bounds.left + fB3;
                    rectF3.right = bounds.right - fC2;
                } else {
                    rectF3.left = bounds.left + fC2;
                    rectF3.right = bounds.right - fB3;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            com.google.android.material.resources.d dVar = d12.f356726f;
            TextPaint textPaint2 = d12.f356721a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                d12.f356726f.e(this.f356281f0, textPaint2, d12.f356722b);
            }
            textPaint2.setTextAlign(align);
            boolean z13 = Math.round(d12.a(this.f356254F.toString())) > Math.round(rectF3.width());
            if (z13) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f356254F;
            if (z13 && this.f356249C0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f356249C0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f19 = pointF.x;
            float f22 = pointF.y;
            rectF = rectF3;
            i13 = iSaveLayerAlpha;
            i14 = 0;
            i15 = 255;
            canvas.drawText(charSequence2, 0, length, f19, f22, textPaint2);
            if (z13) {
                canvas.restoreToCount(iSave);
            }
        }
        if (e0()) {
            rectF.setEmpty();
            if (e0()) {
                float f23 = this.f356280e0 + this.f356279d0;
                if (getLayoutDirection() == 0) {
                    float f24 = bounds.right - f23;
                    rectF2 = rectF;
                    rectF2.right = f24;
                    rectF2.left = f24 - this.f356265P;
                } else {
                    rectF2 = rectF;
                    float f25 = bounds.left + f23;
                    rectF2.left = f25;
                    rectF2.right = f25 + this.f356265P;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f26 = this.f356265P;
                float f27 = fExactCenterY - (f26 / 2.0f);
                rectF2.top = f27;
                rectF2.bottom = f27 + f26;
            } else {
                rectF2 = rectF;
            }
            float f28 = rectF2.left;
            float f29 = rectF2.top;
            canvas.translate(f28, f29);
            this.f356262M.setBounds(i14, i14, (int) rectF2.width(), (int) rectF2.height());
            this.f356263N.setBounds(this.f356262M.getBounds());
            this.f356263N.jumpToCurrentState();
            this.f356263N.draw(canvas);
            canvas.translate(-f28, -f29);
        }
        if (this.f356296u0 < i15) {
            canvas.restoreToCount(i13);
        }
    }

    public final boolean e0() {
        return this.f356261L && this.f356262M != null;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f356296u0;
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public final ColorFilter getColorFilter() {
        return this.f356297v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f356244A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(C() + this.f356287l0.a(this.f356254F.toString()) + B() + this.f356273X + this.f356276a0 + this.f356277b0 + this.f356280e0), this.f356253E0);
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@N Outline outline) {
        if (this.f356255F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f356244A, this.f356246B);
        } else {
            outline.setRoundRect(bounds, this.f356246B);
        }
        outline.setAlpha(this.f356296u0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@N Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        com.google.android.material.resources.d dVar;
        ColorStateList colorStateList;
        return E(this.f356300y) || E(this.f356302z) || E(this.f356248C) || !((dVar = this.f356287l0.f356726f) == null || (colorStateList = dVar.f356996j) == null || !colorStateList.isStateful()) || ((this.f356268S && this.f356269T != null && this.f356267R) || F(this.f356257H) || F(this.f356269T) || E(this.f356299x0));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i12) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i12);
        if (d0()) {
            zOnLayoutDirectionChanged |= this.f356257H.setLayoutDirection(i12);
        }
        if (c0()) {
            zOnLayoutDirectionChanged |= this.f356269T.setLayoutDirection(i12);
        }
        if (e0()) {
            zOnLayoutDirectionChanged |= this.f356262M.setLayoutDirection(i12);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i12) {
        boolean zOnLevelChange = super.onLevelChange(i12);
        if (d0()) {
            zOnLevelChange |= this.f356257H.setLevel(i12);
        }
        if (c0()) {
            zOnLevelChange |= this.f356269T.setLevel(i12);
        }
        if (e0()) {
            zOnLevelChange |= this.f356262M.setLevel(i12);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable, com.google.android.material.internal.D.b
    public final boolean onStateChange(@N int[] iArr) {
        if (this.f356255F0) {
            super.onStateChange(iArr);
        }
        return H(iArr, this.f356303z0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@N Drawable drawable, @N Runnable runnable, long j12) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j12);
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        if (this.f356296u0 != i12) {
            this.f356296u0 = i12;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public final void setColorFilter(@P ColorFilter colorFilter) {
        if (this.f356297v0 != colorFilter) {
            this.f356297v0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public final void setTintList(@P ColorStateList colorStateList) {
        if (this.f356299x0 != colorStateList) {
            this.f356299x0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public final void setTintMode(@N PorterDuff.Mode mode) {
        if (this.f356301y0 != mode) {
            this.f356301y0 = mode;
            ColorStateList colorStateList = this.f356299x0;
            this.f356298w0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        boolean visible = super.setVisible(z12, z13);
        if (d0()) {
            visible |= this.f356257H.setVisible(z12, z13);
        }
        if (c0()) {
            visible |= this.f356269T.setVisible(z12, z13);
        }
        if (e0()) {
            visible |= this.f356262M.setVisible(z12, z13);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@N Drawable drawable, @N Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void z(@P Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f356262M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f356303z0);
            }
            drawable.setTintList(this.f356264O);
            return;
        }
        Drawable drawable2 = this.f356257H;
        if (drawable == drawable2 && this.f356260K) {
            drawable2.setTintList(this.f356258I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }
}
