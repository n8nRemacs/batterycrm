package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BaseInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.internal.B;
import com.google.android.material.resources.a;
import j.InterfaceC42156l;
import j.InterfaceC42167x;
import java.util.WeakHashMap;
import lY0.C43707b;

/* compiled from: CollapsingTextHelper.java */
@RestrictTo
/* renamed from: com.google.android.material.internal.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37062c {

    /* renamed from: A, reason: collision with root package name */
    public Typeface f356755A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f356756B;

    /* renamed from: C, reason: collision with root package name */
    public Typeface f356757C;

    /* renamed from: D, reason: collision with root package name */
    public com.google.android.material.resources.a f356758D;

    /* renamed from: E, reason: collision with root package name */
    public com.google.android.material.resources.a f356759E;

    /* renamed from: G, reason: collision with root package name */
    @j.P
    public CharSequence f356761G;

    /* renamed from: H, reason: collision with root package name */
    @j.P
    public CharSequence f356762H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f356763I;

    /* renamed from: K, reason: collision with root package name */
    @j.P
    public Bitmap f356765K;

    /* renamed from: L, reason: collision with root package name */
    public float f356766L;

    /* renamed from: M, reason: collision with root package name */
    public float f356767M;

    /* renamed from: N, reason: collision with root package name */
    public float f356768N;

    /* renamed from: O, reason: collision with root package name */
    public float f356769O;

    /* renamed from: P, reason: collision with root package name */
    public float f356770P;

    /* renamed from: Q, reason: collision with root package name */
    public int f356771Q;

    /* renamed from: R, reason: collision with root package name */
    public int[] f356772R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f356773S;

    /* renamed from: T, reason: collision with root package name */
    @j.N
    public final TextPaint f356774T;

    /* renamed from: U, reason: collision with root package name */
    @j.N
    public final TextPaint f356775U;

    /* renamed from: V, reason: collision with root package name */
    public TimeInterpolator f356776V;

    /* renamed from: W, reason: collision with root package name */
    public BaseInterpolator f356777W;

    /* renamed from: X, reason: collision with root package name */
    public float f356778X;

    /* renamed from: Y, reason: collision with root package name */
    public float f356779Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f356780Z;

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f356781a;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f356782a0;

    /* renamed from: b, reason: collision with root package name */
    public float f356783b;

    /* renamed from: b0, reason: collision with root package name */
    public float f356784b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f356785c;

    /* renamed from: c0, reason: collision with root package name */
    public float f356786c0;

    /* renamed from: d, reason: collision with root package name */
    public float f356787d;

    /* renamed from: d0, reason: collision with root package name */
    public float f356788d0;

    /* renamed from: e, reason: collision with root package name */
    public float f356789e;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f356790e0;

    /* renamed from: f, reason: collision with root package name */
    public int f356791f;

    /* renamed from: f0, reason: collision with root package name */
    public float f356792f0;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final Rect f356793g;

    /* renamed from: g0, reason: collision with root package name */
    public float f356794g0;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final Rect f356795h;

    /* renamed from: h0, reason: collision with root package name */
    public float f356796h0;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final RectF f356797i;

    /* renamed from: i0, reason: collision with root package name */
    public StaticLayout f356798i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f356800j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f356802k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f356804l0;

    /* renamed from: m0, reason: collision with root package name */
    public CharSequence f356806m0;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f356807n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f356809o;

    /* renamed from: p, reason: collision with root package name */
    public int f356811p;

    /* renamed from: q, reason: collision with root package name */
    public float f356813q;

    /* renamed from: r, reason: collision with root package name */
    public float f356815r;

    /* renamed from: r0, reason: collision with root package name */
    @j.P
    public CollapsingToolbarLayout.c f356816r0;

    /* renamed from: s, reason: collision with root package name */
    public float f356817s;

    /* renamed from: t, reason: collision with root package name */
    public float f356818t;

    /* renamed from: u, reason: collision with root package name */
    public float f356819u;

    /* renamed from: v, reason: collision with root package name */
    public float f356820v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f356821w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f356822x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f356823y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f356824z;

    /* renamed from: j, reason: collision with root package name */
    public int f356799j = 16;

    /* renamed from: k, reason: collision with root package name */
    public int f356801k = 16;

    /* renamed from: l, reason: collision with root package name */
    public float f356803l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f356805m = 15.0f;

    /* renamed from: F, reason: collision with root package name */
    public TextUtils.TruncateAt f356760F = TextUtils.TruncateAt.END;

    /* renamed from: J, reason: collision with root package name */
    public boolean f356764J = true;

    /* renamed from: n0, reason: collision with root package name */
    public int f356808n0 = 1;

    /* renamed from: o0, reason: collision with root package name */
    public float f356810o0 = 0.0f;

    /* renamed from: p0, reason: collision with root package name */
    public float f356812p0 = 1.0f;

    /* renamed from: q0, reason: collision with root package name */
    public int f356814q0 = 1;

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.c$a */
    public class a implements a.InterfaceC10643a {
        public a() {
        }

        @Override // com.google.android.material.resources.a.InterfaceC10643a
        public final void a(Typeface typeface) {
            C37062c c37062c = C37062c.this;
            if (c37062c.m(typeface)) {
                c37062c.i(false);
            }
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.c$b */
    public class b implements a.InterfaceC10643a {
        public b() {
        }

        @Override // com.google.android.material.resources.a.InterfaceC10643a
        public final void a(Typeface typeface) {
            C37062c c37062c = C37062c.this;
            if (c37062c.o(typeface)) {
                c37062c.i(false);
            }
        }
    }

    public C37062c(ViewGroup viewGroup) {
        this.f356781a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.f356774T = textPaint;
        this.f356775U = new TextPaint(textPaint);
        this.f356795h = new Rect();
        this.f356793g = new Rect();
        this.f356797i = new RectF();
        float f12 = this.f356787d;
        this.f356789e = androidx.appcompat.app.r.c(1.0f, f12, 0.5f, f12);
        h(viewGroup.getContext().getResources().getConfiguration());
    }

    @InterfaceC42156l
    public static int a(@InterfaceC42167x float f12, @InterfaceC42156l int i12, @InterfaceC42156l int i13) {
        float f13 = 1.0f - f12;
        return Color.argb(Math.round((Color.alpha(i13) * f12) + (Color.alpha(i12) * f13)), Math.round((Color.red(i13) * f12) + (Color.red(i12) * f13)), Math.round((Color.green(i13) * f12) + (Color.green(i12) * f13)), Math.round((Color.blue(i13) * f12) + (Color.blue(i12) * f13)));
    }

    public static float g(float f12, float f13, float f14, @j.P TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f14 = timeInterpolator.getInterpolation(f14);
        }
        return C43707b.a(f12, f13, f14);
    }

    public final boolean b(@j.N CharSequence charSequence) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean z12 = this.f356781a.getLayoutDirection() == 1;
        if (this.f356764J) {
            return (z12 ? androidx.core.text.m.f44882d : androidx.core.text.m.f44881c).a(charSequence.length(), charSequence);
        }
        return z12;
    }

    public final void c(float f12, boolean z12) {
        float f13;
        float f14;
        Typeface typeface;
        boolean z13;
        StaticLayout staticLayoutA;
        Layout.Alignment alignment;
        if (this.f356761G == null) {
            return;
        }
        float fWidth = this.f356795h.width();
        float fWidth2 = this.f356793g.width();
        if (Math.abs(f12 - 1.0f) < 1.0E-5f) {
            f13 = this.f356805m;
            f14 = this.f356792f0;
            this.f356766L = 1.0f;
            typeface = this.f356821w;
        } else {
            float f15 = this.f356803l;
            float f16 = this.f356794g0;
            Typeface typeface2 = this.f356824z;
            if (Math.abs(f12 - 0.0f) < 1.0E-5f) {
                this.f356766L = 1.0f;
            } else {
                this.f356766L = g(this.f356803l, this.f356805m, f12, this.f356777W) / this.f356803l;
            }
            float f17 = this.f356805m / this.f356803l;
            fWidth = (!z12 && fWidth2 * f17 > fWidth) ? Math.min(fWidth / f17, fWidth2) : fWidth2;
            f13 = f15;
            f14 = f16;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f356774T;
        if (fWidth > 0.0f) {
            boolean z14 = this.f356767M != f13;
            boolean z15 = this.f356796h0 != f14;
            boolean z16 = this.f356757C != typeface;
            StaticLayout staticLayout = this.f356798i0;
            boolean z17 = z14 || z15 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z16 || this.f356773S;
            this.f356767M = f13;
            this.f356796h0 = f14;
            this.f356757C = typeface;
            this.f356773S = false;
            textPaint.setLinearText(this.f356766L != 1.0f);
            z13 = z17;
        } else {
            z13 = false;
        }
        if (this.f356762H == null || z13) {
            textPaint.setTextSize(this.f356767M);
            textPaint.setTypeface(this.f356757C);
            textPaint.setLetterSpacing(this.f356796h0);
            boolean zB2 = b(this.f356761G);
            this.f356763I = zB2;
            int i12 = this.f356808n0;
            if (i12 <= 1 || (zB2 && !this.f356785c)) {
                i12 = 1;
            }
            try {
                if (i12 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f356799j, zB2 ? 1 : 0) & 7;
                    alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f356763I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f356763I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
                }
                B b12 = new B(this.f356761G, textPaint, (int) fWidth);
                b12.f356712l = this.f356760F;
                b12.f356711k = zB2;
                b12.f356705e = alignment;
                b12.f356710j = false;
                b12.f356706f = i12;
                float f18 = this.f356810o0;
                float f19 = this.f356812p0;
                b12.f356707g = f18;
                b12.f356708h = f19;
                b12.f356709i = this.f356814q0;
                b12.f356713m = this.f356816r0;
                staticLayoutA = b12.a();
            } catch (B.a e12) {
                e12.getCause().getMessage();
                staticLayoutA = null;
            }
            staticLayoutA.getClass();
            this.f356798i0 = staticLayoutA;
            this.f356762H = staticLayoutA.getText();
        }
    }

    public final void d(@j.N Canvas canvas) {
        int iSave = canvas.save();
        if (this.f356762H != null) {
            RectF rectF = this.f356797i;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.f356774T;
            textPaint.setTextSize(this.f356767M);
            float f12 = this.f356819u;
            float f13 = this.f356820v;
            float f14 = this.f356766L;
            if (f14 != 1.0f && !this.f356785c) {
                canvas.scale(f14, f14, f12, f13);
            }
            if (this.f356808n0 <= 1 || ((this.f356763I && !this.f356785c) || (this.f356785c && this.f356783b <= this.f356789e))) {
                canvas.translate(f12, f13);
                this.f356798i0.draw(canvas);
            } else {
                float lineStart = this.f356819u - this.f356798i0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f13);
                if (!this.f356785c) {
                    textPaint.setAlpha((int) (this.f356804l0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.f356768N, this.f356769O, this.f356770P, com.google.android.material.color.k.a(this.f356771Q, textPaint.getAlpha()));
                    }
                    this.f356798i0.draw(canvas);
                }
                if (!this.f356785c) {
                    textPaint.setAlpha((int) (this.f356802k0 * alpha));
                }
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 31) {
                    textPaint.setShadowLayer(this.f356768N, this.f356769O, this.f356770P, com.google.android.material.color.k.a(this.f356771Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.f356798i0.getLineBaseline(0);
                CharSequence charSequence = this.f356806m0;
                float f15 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f15, textPaint);
                if (i12 >= 31) {
                    textPaint.setShadowLayer(this.f356768N, this.f356769O, this.f356770P, this.f356771Q);
                }
                if (!this.f356785c) {
                    String strTrim = this.f356806m0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = androidx.compose.ui.graphics.colorspace.e.h(1, 0, strTrim);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f356798i0.getLineEnd(0), str.length()), 0.0f, f15, (Paint) textPaint);
                }
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final float e() {
        TextPaint textPaint = this.f356775U;
        textPaint.setTextSize(this.f356805m);
        textPaint.setTypeface(this.f356821w);
        textPaint.setLetterSpacing(this.f356792f0);
        return -textPaint.ascent();
    }

    @InterfaceC42156l
    public final int f(@j.P ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f356772R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void h(@j.N Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f356823y;
            if (typeface != null) {
                this.f356822x = com.google.android.material.resources.h.a(configuration, typeface);
            }
            Typeface typeface2 = this.f356756B;
            if (typeface2 != null) {
                this.f356755A = com.google.android.material.resources.h.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f356822x;
            if (typeface3 == null) {
                typeface3 = this.f356823y;
            }
            this.f356821w = typeface3;
            Typeface typeface4 = this.f356755A;
            if (typeface4 == null) {
                typeface4 = this.f356756B;
            }
            this.f356824z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z12) {
        float fMeasureText;
        float f12;
        StaticLayout staticLayout;
        ViewGroup viewGroup = this.f356781a;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z12) {
            return;
        }
        c(1.0f, z12);
        CharSequence charSequence = this.f356762H;
        TextPaint textPaint = this.f356774T;
        if (charSequence != null && (staticLayout = this.f356798i0) != null) {
            this.f356806m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f356760F);
        }
        CharSequence charSequence2 = this.f356806m0;
        if (charSequence2 != null) {
            this.f356800j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f356800j0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f356801k, this.f356763I ? 1 : 0);
        int i12 = absoluteGravity & 112;
        Rect rect = this.f356795h;
        if (i12 == 48) {
            this.f356815r = rect.top;
        } else if (i12 != 80) {
            this.f356815r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f356815r = textPaint.ascent() + rect.bottom;
        }
        int i13 = absoluteGravity & 8388615;
        if (i13 == 1) {
            this.f356818t = rect.centerX() - (this.f356800j0 / 2.0f);
        } else if (i13 != 5) {
            this.f356818t = rect.left;
        } else {
            this.f356818t = rect.right - this.f356800j0;
        }
        c(0.0f, z12);
        float height = this.f356798i0 != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f356798i0;
        if (staticLayout2 == null || this.f356808n0 <= 1) {
            CharSequence charSequence3 = this.f356762H;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f356798i0;
        this.f356811p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f356799j, this.f356763I ? 1 : 0);
        int i14 = absoluteGravity2 & 112;
        Rect rect2 = this.f356793g;
        if (i14 == 48) {
            this.f356813q = rect2.top;
        } else if (i14 != 80) {
            this.f356813q = rect2.centerY() - (height / 2.0f);
        } else {
            this.f356813q = textPaint.descent() + (rect2.bottom - height);
        }
        int i15 = absoluteGravity2 & 8388615;
        if (i15 == 1) {
            this.f356817s = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i15 != 5) {
            this.f356817s = rect2.left;
        } else {
            this.f356817s = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f356765K;
        if (bitmap != null) {
            bitmap.recycle();
            this.f356765K = null;
        }
        q(this.f356783b);
        float f13 = this.f356783b;
        boolean z13 = this.f356785c;
        RectF rectF = this.f356797i;
        if (z13) {
            if (f13 < this.f356789e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = g(rect2.left, rect.left, f13, this.f356776V);
            rectF.top = g(this.f356813q, this.f356815r, f13, this.f356776V);
            rectF.right = g(rect2.right, rect.right, f13, this.f356776V);
            rectF.bottom = g(rect2.bottom, rect.bottom, f13, this.f356776V);
        }
        if (!this.f356785c) {
            this.f356819u = g(this.f356817s, this.f356818t, f13, this.f356776V);
            this.f356820v = g(this.f356813q, this.f356815r, f13, this.f356776V);
            q(f13);
            f12 = f13;
        } else if (f13 < this.f356789e) {
            this.f356819u = this.f356817s;
            this.f356820v = this.f356813q;
            q(0.0f);
            f12 = 0.0f;
        } else {
            this.f356819u = this.f356818t;
            this.f356820v = this.f356815r - Math.max(0, this.f356791f);
            q(1.0f);
            f12 = 1.0f;
        }
        androidx.interpolator.view.animation.b bVar = C43707b.f413880b;
        this.f356802k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f13, bVar);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        viewGroup.postInvalidateOnAnimation();
        this.f356804l0 = g(1.0f, 0.0f, f13, bVar);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f356809o;
        ColorStateList colorStateList2 = this.f356807n;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f12, f(colorStateList2), f(this.f356809o)));
        } else {
            textPaint.setColor(f(colorStateList));
        }
        float f14 = this.f356792f0;
        float f15 = this.f356794g0;
        if (f14 != f15) {
            textPaint.setLetterSpacing(g(f15, f14, f13, bVar));
        } else {
            textPaint.setLetterSpacing(f14);
        }
        this.f356768N = C43707b.a(this.f356784b0, this.f356778X, f13);
        this.f356769O = C43707b.a(this.f356786c0, this.f356779Y, f13);
        this.f356770P = C43707b.a(this.f356788d0, this.f356780Z, f13);
        int iA2 = a(f13, f(this.f356790e0), f(this.f356782a0));
        this.f356771Q = iA2;
        textPaint.setShadowLayer(this.f356768N, this.f356769O, this.f356770P, iA2);
        if (this.f356785c) {
            int alpha = textPaint.getAlpha();
            float f16 = this.f356789e;
            textPaint.setAlpha((int) ((f13 <= f16 ? C43707b.b(1.0f, 0.0f, this.f356787d, f16, f13) : C43707b.b(0.0f, 1.0f, f16, 1.0f, f13)) * alpha));
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final void j(@j.P ColorStateList colorStateList) {
        if (this.f356809o == colorStateList && this.f356807n == colorStateList) {
            return;
        }
        this.f356809o = colorStateList;
        this.f356807n = colorStateList;
        i(false);
    }

    public final void k(int i12) {
        ViewGroup viewGroup = this.f356781a;
        com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(viewGroup.getContext(), i12);
        ColorStateList colorStateList = dVar.f356996j;
        if (colorStateList != null) {
            this.f356809o = colorStateList;
        }
        float f12 = dVar.f356997k;
        if (f12 != 0.0f) {
            this.f356805m = f12;
        }
        ColorStateList colorStateList2 = dVar.f356987a;
        if (colorStateList2 != null) {
            this.f356782a0 = colorStateList2;
        }
        this.f356779Y = dVar.f356991e;
        this.f356780Z = dVar.f356992f;
        this.f356778X = dVar.f356993g;
        this.f356792f0 = dVar.f356995i;
        com.google.android.material.resources.a aVar = this.f356759E;
        if (aVar != null) {
            aVar.f356986c = true;
        }
        a aVar2 = new a();
        dVar.a();
        this.f356759E = new com.google.android.material.resources.a(aVar2, dVar.f357000n);
        dVar.c(viewGroup.getContext(), this.f356759E);
        i(false);
    }

    public final void l(int i12) {
        if (this.f356801k != i12) {
            this.f356801k = i12;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.f356759E;
        if (aVar != null) {
            aVar.f356986c = true;
        }
        if (this.f356823y == typeface) {
            return false;
        }
        this.f356823y = typeface;
        Typeface typefaceA = com.google.android.material.resources.h.a(this.f356781a.getContext().getResources().getConfiguration(), typeface);
        this.f356822x = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f356823y;
        }
        this.f356821w = typefaceA;
        return true;
    }

    public final void n(int i12) {
        ViewGroup viewGroup = this.f356781a;
        com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(viewGroup.getContext(), i12);
        ColorStateList colorStateList = dVar.f356996j;
        if (colorStateList != null) {
            this.f356807n = colorStateList;
        }
        float f12 = dVar.f356997k;
        if (f12 != 0.0f) {
            this.f356803l = f12;
        }
        ColorStateList colorStateList2 = dVar.f356987a;
        if (colorStateList2 != null) {
            this.f356790e0 = colorStateList2;
        }
        this.f356786c0 = dVar.f356991e;
        this.f356788d0 = dVar.f356992f;
        this.f356784b0 = dVar.f356993g;
        this.f356794g0 = dVar.f356995i;
        com.google.android.material.resources.a aVar = this.f356758D;
        if (aVar != null) {
            aVar.f356986c = true;
        }
        b bVar = new b();
        dVar.a();
        this.f356758D = new com.google.android.material.resources.a(bVar, dVar.f357000n);
        dVar.c(viewGroup.getContext(), this.f356758D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.f356758D;
        if (aVar != null) {
            aVar.f356986c = true;
        }
        if (this.f356756B == typeface) {
            return false;
        }
        this.f356756B = typeface;
        Typeface typefaceA = com.google.android.material.resources.h.a(this.f356781a.getContext().getResources().getConfiguration(), typeface);
        this.f356755A = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f356756B;
        }
        this.f356824z = typefaceA;
        return true;
    }

    public final void p(float f12) {
        float f13;
        float fA2 = M0.a.a(f12, 0.0f, 1.0f);
        if (fA2 != this.f356783b) {
            this.f356783b = fA2;
            boolean z12 = this.f356785c;
            RectF rectF = this.f356797i;
            Rect rect = this.f356795h;
            Rect rect2 = this.f356793g;
            if (z12) {
                if (fA2 < this.f356789e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, fA2, this.f356776V);
                rectF.top = g(this.f356813q, this.f356815r, fA2, this.f356776V);
                rectF.right = g(rect2.right, rect.right, fA2, this.f356776V);
                rectF.bottom = g(rect2.bottom, rect.bottom, fA2, this.f356776V);
            }
            if (!this.f356785c) {
                this.f356819u = g(this.f356817s, this.f356818t, fA2, this.f356776V);
                this.f356820v = g(this.f356813q, this.f356815r, fA2, this.f356776V);
                q(fA2);
                f13 = fA2;
            } else if (fA2 < this.f356789e) {
                this.f356819u = this.f356817s;
                this.f356820v = this.f356813q;
                q(0.0f);
                f13 = 0.0f;
            } else {
                this.f356819u = this.f356818t;
                this.f356820v = this.f356815r - Math.max(0, this.f356791f);
                q(1.0f);
                f13 = 1.0f;
            }
            androidx.interpolator.view.animation.b bVar = C43707b.f413880b;
            this.f356802k0 = 1.0f - g(0.0f, 1.0f, 1.0f - fA2, bVar);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            ViewGroup viewGroup = this.f356781a;
            viewGroup.postInvalidateOnAnimation();
            this.f356804l0 = g(1.0f, 0.0f, fA2, bVar);
            viewGroup.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f356809o;
            ColorStateList colorStateList2 = this.f356807n;
            TextPaint textPaint = this.f356774T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f13, f(colorStateList2), f(this.f356809o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            float f14 = this.f356792f0;
            float f15 = this.f356794g0;
            if (f14 != f15) {
                textPaint.setLetterSpacing(g(f15, f14, fA2, bVar));
            } else {
                textPaint.setLetterSpacing(f14);
            }
            this.f356768N = C43707b.a(this.f356784b0, this.f356778X, fA2);
            this.f356769O = C43707b.a(this.f356786c0, this.f356779Y, fA2);
            this.f356770P = C43707b.a(this.f356788d0, this.f356780Z, fA2);
            int iA2 = a(fA2, f(this.f356790e0), f(this.f356782a0));
            this.f356771Q = iA2;
            textPaint.setShadowLayer(this.f356768N, this.f356769O, this.f356770P, iA2);
            if (this.f356785c) {
                int alpha = textPaint.getAlpha();
                float f16 = this.f356789e;
                textPaint.setAlpha((int) ((fA2 <= f16 ? C43707b.b(1.0f, 0.0f, this.f356787d, f16, fA2) : C43707b.b(0.0f, 1.0f, f16, 1.0f, fA2)) * alpha));
            }
            viewGroup.postInvalidateOnAnimation();
        }
    }

    public final void q(float f12) {
        c(f12, false);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        this.f356781a.postInvalidateOnAnimation();
    }
}
