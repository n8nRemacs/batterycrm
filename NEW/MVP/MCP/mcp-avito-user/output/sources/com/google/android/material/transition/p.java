package com.google.android.material.transition;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.transition.C23491b;
import androidx.transition.L;
import androidx.transition.V;
import com.google.android.material.internal.O;
import com.google.android.material.shape.q;
import j.InterfaceC42156l;
import j.InterfaceC42167x;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.WeakHashMap;
import lY0.C43707b;
import mY0.C44030a;
import wY0.C49576a;

/* compiled from: MaterialContainerTransform.java */
/* loaded from: classes6.dex */
public final class p extends L {

    /* renamed from: J, reason: collision with root package name */
    public static final String[] f357782J = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: K, reason: collision with root package name */
    public static final f f357783K = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);

    /* renamed from: L, reason: collision with root package name */
    public static final f f357784L = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), null);

    /* renamed from: M, reason: collision with root package name */
    public static final f f357785M = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* renamed from: N, reason: collision with root package name */
    public static final f f357786N = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), null);

    /* renamed from: B, reason: collision with root package name */
    public boolean f357787B = false;

    /* renamed from: C, reason: collision with root package name */
    @j.D
    public final int f357788C = R.id.content;

    /* renamed from: D, reason: collision with root package name */
    @j.D
    public final int f357789D = -1;

    /* renamed from: E, reason: collision with root package name */
    @j.D
    public final int f357790E = -1;

    /* renamed from: F, reason: collision with root package name */
    @InterfaceC42156l
    public final int f357791F = 1375731712;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f357792G;

    /* renamed from: H, reason: collision with root package name */
    public final float f357793H;

    /* renamed from: I, reason: collision with root package name */
    public final float f357794I;

    /* compiled from: MaterialContainerTransform.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f357795a;

        public a(h hVar) {
            this.f357795a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            h hVar = this.f357795a;
            if (hVar.f357818L != animatedFraction) {
                hVar.d(animatedFraction);
            }
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    public class b extends A {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f357796a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f357797b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f357798c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f357799d;

        public b(View view, h hVar, View view2, View view3) {
            this.f357796a = view;
            this.f357797b = hVar;
            this.f357798c = view2;
            this.f357799d = view3;
        }

        @Override // com.google.android.material.transition.A, androidx.transition.L.f
        public final void d(@N L l12) {
            O.d(this.f357796a).a(this.f357797b);
            this.f357798c.setAlpha(0.0f);
            this.f357799d.setAlpha(0.0f);
        }

        @Override // com.google.android.material.transition.A, androidx.transition.L.f
        public final void e(@N L l12) {
            p.this.A(this);
            this.f357798c.setAlpha(1.0f);
            this.f357799d.setAlpha(1.0f);
            O.d(this.f357796a).b(this.f357797b);
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface c {
    }

    /* compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface d {
    }

    /* compiled from: MaterialContainerTransform.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @InterfaceC42167x
        public final float f357801a;

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC42167x
        public final float f357802b;

        public e(@InterfaceC42167x float f12, @InterfaceC42167x float f13) {
            this.f357801a = f12;
            this.f357802b = f13;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final e f357803a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final e f357804b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final e f357805c;

        /* renamed from: d, reason: collision with root package name */
        @N
        public final e f357806d;

        public f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this.f357803a = eVar;
            this.f357804b = eVar2;
            this.f357805c = eVar3;
            this.f357806d = eVar4;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface g {
    }

    /* compiled from: MaterialContainerTransform.java */
    public static final class h extends Drawable {

        /* renamed from: A, reason: collision with root package name */
        public final f f357807A;

        /* renamed from: B, reason: collision with root package name */
        public final InterfaceC37080a f357808B;

        /* renamed from: C, reason: collision with root package name */
        public final j f357809C;

        /* renamed from: D, reason: collision with root package name */
        public final boolean f357810D;

        /* renamed from: E, reason: collision with root package name */
        public final Paint f357811E;

        /* renamed from: F, reason: collision with root package name */
        public final Path f357812F;

        /* renamed from: G, reason: collision with root package name */
        public C37082c f357813G;

        /* renamed from: H, reason: collision with root package name */
        public l f357814H;

        /* renamed from: I, reason: collision with root package name */
        public RectF f357815I;

        /* renamed from: J, reason: collision with root package name */
        public float f357816J;

        /* renamed from: K, reason: collision with root package name */
        public float f357817K;

        /* renamed from: L, reason: collision with root package name */
        public float f357818L;

        /* renamed from: a, reason: collision with root package name */
        public final View f357819a;

        /* renamed from: b, reason: collision with root package name */
        public final RectF f357820b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.material.shape.q f357821c;

        /* renamed from: d, reason: collision with root package name */
        public final float f357822d;

        /* renamed from: e, reason: collision with root package name */
        public final View f357823e;

        /* renamed from: f, reason: collision with root package name */
        public final RectF f357824f;

        /* renamed from: g, reason: collision with root package name */
        public final com.google.android.material.shape.q f357825g;

        /* renamed from: h, reason: collision with root package name */
        public final float f357826h;

        /* renamed from: i, reason: collision with root package name */
        public final Paint f357827i;

        /* renamed from: j, reason: collision with root package name */
        public final Paint f357828j;

        /* renamed from: k, reason: collision with root package name */
        public final Paint f357829k;

        /* renamed from: l, reason: collision with root package name */
        public final Paint f357830l;

        /* renamed from: m, reason: collision with root package name */
        public final Paint f357831m;

        /* renamed from: n, reason: collision with root package name */
        public final n f357832n;

        /* renamed from: o, reason: collision with root package name */
        public final PathMeasure f357833o;

        /* renamed from: p, reason: collision with root package name */
        public final float f357834p;

        /* renamed from: q, reason: collision with root package name */
        public final float[] f357835q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f357836r;

        /* renamed from: s, reason: collision with root package name */
        public final float f357837s;

        /* renamed from: t, reason: collision with root package name */
        public final float f357838t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f357839u;

        /* renamed from: v, reason: collision with root package name */
        public final com.google.android.material.shape.k f357840v;

        /* renamed from: w, reason: collision with root package name */
        public final RectF f357841w;

        /* renamed from: x, reason: collision with root package name */
        public final RectF f357842x;

        /* renamed from: y, reason: collision with root package name */
        public final RectF f357843y;

        /* renamed from: z, reason: collision with root package name */
        public final RectF f357844z;

        /* compiled from: MaterialContainerTransform.java */
        public class a implements C44030a.InterfaceC11833a {
            public a() {
            }

            @Override // mY0.C44030a.InterfaceC11833a
            public final void a(Canvas canvas) {
                h.this.f357819a.draw(canvas);
            }
        }

        /* compiled from: MaterialContainerTransform.java */
        public class b implements C44030a.InterfaceC11833a {
            public b() {
            }

            @Override // mY0.C44030a.InterfaceC11833a
            public final void a(Canvas canvas) {
                h.this.f357823e.draw(canvas);
            }
        }

        public h(androidx.transition.B b12, View view, RectF rectF, com.google.android.material.shape.q qVar, float f12, View view2, RectF rectF2, com.google.android.material.shape.q qVar2, float f13, int i12, int i13, int i14, int i15, boolean z12, boolean z13, InterfaceC37080a interfaceC37080a, j jVar, f fVar, boolean z14, a aVar) {
            Paint paint = new Paint();
            this.f357827i = paint;
            Paint paint2 = new Paint();
            this.f357828j = paint2;
            Paint paint3 = new Paint();
            this.f357829k = paint3;
            this.f357830l = new Paint();
            Paint paint4 = new Paint();
            this.f357831m = paint4;
            this.f357832n = new n();
            this.f357835q = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            this.f357840v = kVar;
            Paint paint5 = new Paint();
            this.f357811E = paint5;
            this.f357812F = new Path();
            this.f357819a = view;
            this.f357820b = rectF;
            this.f357821c = qVar;
            this.f357822d = f12;
            this.f357823e = view2;
            this.f357824f = rectF2;
            this.f357825g = qVar2;
            this.f357826h = f13;
            this.f357836r = z12;
            this.f357839u = z13;
            this.f357808B = interfaceC37080a;
            this.f357809C = jVar;
            this.f357807A = fVar;
            this.f357810D = z14;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f357837s = r11.widthPixels;
            this.f357838t = r11.heightPixels;
            paint.setColor(i12);
            paint2.setColor(i13);
            paint3.setColor(i14);
            kVar.n(ColorStateList.valueOf(0));
            kVar.s();
            kVar.f357055w = false;
            kVar.q(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f357841w = rectF3;
            this.f357842x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f357843y = rectF4;
            this.f357844z = new RectF(rectF4);
            PointF pointF = new PointF(rectF.centerX(), rectF.top);
            PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
            PathMeasure pathMeasure = new PathMeasure(b12.a(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
            this.f357833o = pathMeasure;
            this.f357834p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = D.f357749a;
            paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i15, i15, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            d(0.0f);
        }

        public final void a(Canvas canvas) {
            c(canvas, this.f357829k);
            Rect bounds = getBounds();
            RectF rectF = this.f357843y;
            D.f(canvas, bounds, rectF.left, rectF.top, this.f357814H.f357772b, this.f357813G.f357753b, new b());
        }

        public final void b(Canvas canvas) {
            c(canvas, this.f357828j);
            Rect bounds = getBounds();
            RectF rectF = this.f357841w;
            D.f(canvas, bounds, rectF.left, rectF.top, this.f357814H.f357771a, this.f357813G.f357752a, new a());
        }

        public final void c(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        public final void d(float f12) {
            float f13;
            float f14;
            com.google.android.material.shape.q qVarA;
            this.f357818L = f12;
            this.f357831m.setAlpha((int) (this.f357836r ? D.c(0.0f, 255.0f, f12) : D.c(255.0f, 0.0f, f12)));
            float f15 = this.f357834p;
            PathMeasure pathMeasure = this.f357833o;
            float[] fArr = this.f357835q;
            pathMeasure.getPosTan(f15 * f12, fArr, null);
            float fC2 = fArr[0];
            float fC3 = fArr[1];
            if (f12 > 1.0f || f12 < 0.0f) {
                if (f12 > 1.0f) {
                    f14 = (f12 - 1.0f) / 0.00999999f;
                    f13 = 0.99f;
                } else {
                    f13 = 0.01f;
                    f14 = (f12 / 0.01f) * (-1.0f);
                }
                pathMeasure.getPosTan(f15 * f13, fArr, null);
                float f16 = fArr[0];
                float f17 = fArr[1];
                fC2 = androidx.appcompat.app.r.c(fC2, f16, f14, fC2);
                fC3 = androidx.appcompat.app.r.c(fC3, f17, f14, fC3);
            }
            float f18 = fC2;
            float f19 = fC3;
            f fVar = this.f357807A;
            float f22 = fVar.f357804b.f357801a;
            float f23 = fVar.f357804b.f357802b;
            RectF rectF = this.f357820b;
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            RectF rectF2 = this.f357824f;
            l lVarA = this.f357809C.a(f12, f22, f23, fWidth, fHeight, rectF2.width(), rectF2.height());
            this.f357814H = lVarA;
            float f24 = lVarA.f357773c / 2.0f;
            float f25 = lVarA.f357774d + f19;
            RectF rectF3 = this.f357841w;
            rectF3.set(f18 - f24, f19, f24 + f18, f25);
            l lVar = this.f357814H;
            float f26 = lVar.f357775e / 2.0f;
            float f27 = lVar.f357776f + f19;
            RectF rectF4 = this.f357843y;
            rectF4.set(f18 - f26, f19, f26 + f18, f27);
            RectF rectF5 = this.f357842x;
            rectF5.set(rectF3);
            RectF rectF6 = this.f357844z;
            rectF6.set(rectF4);
            e eVar = fVar.f357805c;
            float f28 = eVar.f357801a;
            float f29 = eVar.f357802b;
            l lVar2 = this.f357814H;
            j jVar = this.f357809C;
            boolean zB2 = jVar.b(lVar2);
            RectF rectF7 = zB2 ? rectF5 : rectF6;
            float fD2 = D.d(0.0f, 1.0f, f28, f29, f12, false);
            if (!zB2) {
                fD2 = 1.0f - fD2;
            }
            jVar.c(rectF7, fD2, this.f357814H);
            this.f357815I = new RectF(Math.min(rectF5.left, rectF6.left), Math.min(rectF5.top, rectF6.top), Math.max(rectF5.right, rectF6.right), Math.max(rectF5.bottom, rectF6.bottom));
            n nVar = this.f357832n;
            nVar.getClass();
            e eVar2 = fVar.f357806d;
            float f32 = eVar2.f357801a;
            com.google.android.material.shape.q qVar = this.f357821c;
            if (f12 < f32) {
                qVarA = qVar;
            } else {
                float f33 = eVar2.f357802b;
                com.google.android.material.shape.q qVar2 = this.f357825g;
                if (f12 > f33) {
                    qVarA = qVar2;
                } else {
                    C c12 = new C(rectF3, rectF6, f32, f33, f12);
                    float fA2 = qVar.f357085e.a(rectF3);
                    com.google.android.material.shape.e eVar3 = qVar.f357088h;
                    com.google.android.material.shape.e eVar4 = qVar.f357087g;
                    com.google.android.material.shape.e eVar5 = qVar.f357086f;
                    q.b bVarF = ((fA2 == 0.0f && eVar5.a(rectF3) == 0.0f && eVar4.a(rectF3) == 0.0f && eVar3.a(rectF3) == 0.0f) ? qVar2 : qVar).f();
                    bVarF.f357097e = c12.a(qVar.f357085e, qVar2.f357085e);
                    bVarF.f357098f = c12.a(eVar5, qVar2.f357086f);
                    bVarF.f357100h = c12.a(eVar3, qVar2.f357088h);
                    bVarF.f357099g = c12.a(eVar4, qVar2.f357087g);
                    qVarA = bVarF.a();
                }
            }
            nVar.f357781e = qVarA;
            Path path = nVar.f357778b;
            nVar.f357780d.a(qVarA, 1.0f, rectF5, null, path);
            com.google.android.material.shape.q qVar3 = nVar.f357781e;
            Path path2 = nVar.f357779c;
            nVar.f357780d.a(qVar3, 1.0f, rectF6, null, path2);
            nVar.f357777a.op(path, path2, Path.Op.UNION);
            this.f357816J = D.c(this.f357822d, this.f357826h, f12);
            float fCenterX = ((this.f357815I.centerX() / (this.f357837s / 2.0f)) - 1.0f) * 0.3f;
            float fCenterY = (this.f357815I.centerY() / this.f357838t) * 1.5f;
            float f34 = this.f357816J;
            float f35 = (int) (fCenterY * f34);
            this.f357817K = f35;
            this.f357830l.setShadowLayer(f34, (int) (fCenterX * f34), f35, 754974720);
            e eVar6 = fVar.f357803a;
            this.f357813G = this.f357808B.a(f12, eVar6.f357801a, eVar6.f357802b);
            Paint paint = this.f357828j;
            if (paint.getColor() != 0) {
                paint.setAlpha(this.f357813G.f357752a);
            }
            Paint paint2 = this.f357829k;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(this.f357813G.f357753b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(@N Canvas canvas) {
            Paint paint = this.f357831m;
            if (paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
            boolean z12 = this.f357810D;
            int iSave = z12 ? canvas.save() : -1;
            boolean z13 = this.f357839u;
            n nVar = this.f357832n;
            if (z13 && this.f357816J > 0.0f) {
                canvas.save();
                canvas.clipPath(nVar.f357777a, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT > 28) {
                    com.google.android.material.shape.q qVar = nVar.f357781e;
                    boolean zE2 = qVar.e(this.f357815I);
                    Paint paint2 = this.f357830l;
                    if (zE2) {
                        float fA2 = qVar.f357085e.a(this.f357815I);
                        canvas.drawRoundRect(this.f357815I, fA2, fA2, paint2);
                    } else {
                        canvas.drawPath(nVar.f357777a, paint2);
                    }
                } else {
                    com.google.android.material.shape.k kVar = this.f357840v;
                    RectF rectF = this.f357815I;
                    kVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    kVar.m(this.f357816J);
                    kVar.t((int) this.f357817K);
                    kVar.setShapeAppearanceModel(nVar.f357781e);
                    kVar.draw(canvas);
                }
                canvas.restore();
            }
            canvas.clipPath(nVar.f357777a);
            c(canvas, this.f357827i);
            if (this.f357813G.f357754c) {
                b(canvas);
                a(canvas);
            } else {
                a(canvas);
                b(canvas);
            }
            if (z12) {
                canvas.restoreToCount(iSave);
                RectF rectF2 = this.f357841w;
                Path path = this.f357812F;
                PointF pointF = new PointF(rectF2.centerX(), rectF2.top);
                float f12 = this.f357818L;
                Paint paint3 = this.f357811E;
                if (f12 == 0.0f) {
                    path.reset();
                    path.moveTo(pointF.x, pointF.y);
                } else {
                    path.lineTo(pointF.x, pointF.y);
                    paint3.setColor(-65281);
                    canvas.drawPath(path, paint3);
                }
                RectF rectF3 = this.f357842x;
                paint3.setColor(-256);
                canvas.drawRect(rectF3, paint3);
                paint3.setColor(-16711936);
                canvas.drawRect(rectF2, paint3);
                RectF rectF4 = this.f357844z;
                paint3.setColor(-16711681);
                canvas.drawRect(rectF4, paint3);
                RectF rectF5 = this.f357843y;
                paint3.setColor(-16776961);
                canvas.drawRect(rectF5, paint3);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i12) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(@P ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    public p() {
        this.f357792G = Build.VERSION.SDK_INT >= 28;
        this.f357793H = -1.0f;
        this.f357794I = -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(@N V v12, @j.D int i12) throws Resources.NotFoundException {
        final RectF rectFB;
        com.google.android.material.shape.q qVarA;
        if (i12 != -1) {
            View view = v12.f54717b;
            RectF rectF = D.f357749a;
            View viewFindViewById = view.findViewById(i12);
            if (viewFindViewById == null) {
                viewFindViewById = D.a(view, i12);
            }
            v12.f54717b = viewFindViewById;
        } else if (v12.f54717b.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) v12.f54717b.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
            v12.f54717b.setTag(com.google.android.material.R.id.mtrl_motion_snapshot_view, null);
            v12.f54717b = view2;
        }
        View view3 = v12.f54717b;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (!view3.isLaidOut() && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        if (view3.getParent() == null) {
            RectF rectF2 = D.f357749a;
            rectFB = new RectF(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
        } else {
            rectFB = D.b(view3);
        }
        HashMap map = v12.f54716a;
        map.put("materialContainerTransition:bounds", rectFB);
        if (view3.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof com.google.android.material.shape.q) {
            qVarA = (com.google.android.material.shape.q) view3.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
        } else {
            Context context = view3.getContext();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            qVarA = resourceId != -1 ? com.google.android.material.shape.q.a(context, resourceId, 0).a() : view3 instanceof com.google.android.material.shape.v ? ((com.google.android.material.shape.v) view3).getShapeAppearanceModel() : new q.b().a();
        }
        map.put("materialContainerTransition:shapeAppearance", qVarA.g(new q.c() { // from class: com.google.android.material.transition.B
            @Override // com.google.android.material.shape.q.c
            public final com.google.android.material.shape.e a(com.google.android.material.shape.e eVar) {
                RectF rectF3 = D.f357749a;
                RectF rectF4 = rectFB;
                return eVar instanceof com.google.android.material.shape.o ? (com.google.android.material.shape.o) eVar : new com.google.android.material.shape.o(eVar.a(rectF4) / Math.min(rectF4.width(), rectF4.height()));
            }
        }));
    }

    @Override // androidx.transition.L
    public final void H(@P androidx.transition.B b12) {
        super.H(b12);
        this.f357787B = true;
    }

    @Override // androidx.transition.L
    public final void f(@N V v12) throws Resources.NotFoundException {
        M(v12, this.f357790E);
    }

    @Override // androidx.transition.L
    public final void j(@N V v12) throws Resources.NotFoundException {
        M(v12, this.f357789D);
    }

    @Override // androidx.transition.L
    @P
    public final Animator n(@N ViewGroup viewGroup, @P V v12, @P V v13) throws Resources.NotFoundException {
        View viewA;
        View view;
        RectF rectF;
        View view2;
        f fVar;
        int i12;
        int iC2;
        androidx.transition.B d12 = null;
        if (v12 != null && v13 != null) {
            HashMap map = v12.f54716a;
            RectF rectF2 = (RectF) map.get("materialContainerTransition:bounds");
            com.google.android.material.shape.q qVar = (com.google.android.material.shape.q) map.get("materialContainerTransition:shapeAppearance");
            if (rectF2 != null && qVar != null) {
                HashMap map2 = v13.f54716a;
                RectF rectF3 = (RectF) map2.get("materialContainerTransition:bounds");
                com.google.android.material.shape.q qVar2 = (com.google.android.material.shape.q) map2.get("materialContainerTransition:shapeAppearance");
                if (rectF3 != null && qVar2 != null) {
                    View view3 = v12.f54717b;
                    View view4 = v13.f54717b;
                    View view5 = view4.getParent() != null ? view4 : view3;
                    int id2 = view5.getId();
                    int i13 = this.f357788C;
                    if (i13 == id2) {
                        viewA = (View) view5.getParent();
                        view = view5;
                    } else {
                        viewA = D.a(view5, i13);
                        view = null;
                    }
                    RectF rectFB = D.b(viewA);
                    float f12 = -rectFB.left;
                    float f13 = -rectFB.top;
                    if (view != null) {
                        rectF = D.b(view);
                        rectF.offset(f12, f13);
                    } else {
                        rectF = new RectF(0.0f, 0.0f, viewA.getWidth(), viewA.getHeight());
                    }
                    rectF2.offset(f12, f13);
                    rectF3.offset(f12, f13);
                    boolean z12 = rectF3.height() * rectF3.width() > rectF2.height() * rectF2.width();
                    Context context = view5.getContext();
                    int i14 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator;
                    androidx.interpolator.view.animation.b bVar = C43707b.f413880b;
                    if (i14 != 0 && this.f54668e == null) {
                        G(C49576a.d(context, i14, bVar));
                    }
                    int i15 = z12 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4;
                    if (i15 != 0 && this.f54667d == -1 && (iC2 = C49576a.c(context, i15, -1)) != -1) {
                        E(iC2);
                    }
                    if (!this.f357787B && (i12 = com.google.android.material.R.attr.motionPath) != 0) {
                        TypedValue typedValue = new TypedValue();
                        if (context.getTheme().resolveAttribute(i12, typedValue, true)) {
                            int i16 = typedValue.type;
                            if (i16 == 16) {
                                int i17 = typedValue.data;
                                if (i17 != 0) {
                                    if (i17 != 1) {
                                        throw new IllegalArgumentException(AK.c.g(i17, "Invalid motion path type: "));
                                    }
                                    d12 = new o();
                                }
                            } else {
                                if (i16 != 3) {
                                    throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
                                }
                                d12 = new androidx.transition.D(androidx.core.graphics.p.d(String.valueOf(typedValue.string)));
                            }
                        }
                        if (d12 != null) {
                            H(d12);
                        }
                    }
                    androidx.transition.B b12 = this.f54687x;
                    float fL2 = this.f357793H;
                    if (fL2 == -1.0f) {
                        fL2 = C22823h0.l(view3);
                    }
                    float f14 = fL2;
                    float fL3 = this.f357794I;
                    if (fL3 == -1.0f) {
                        fL3 = C22823h0.l(view4);
                    }
                    float f15 = fL3;
                    InterfaceC37080a interfaceC37080a = z12 ? C37081b.f357750a : C37081b.f357751b;
                    j jVar = k.f357769a;
                    j jVar2 = k.f357770b;
                    float fWidth = rectF2.width();
                    float fHeight = rectF2.height();
                    float fWidth2 = rectF3.width();
                    float fHeight2 = rectF3.height();
                    j jVar3 = (!z12 ? (fWidth2 * fHeight) / fWidth >= fHeight2 : (fHeight2 * fWidth) / fWidth2 >= fHeight) ? jVar2 : jVar;
                    androidx.transition.B b13 = this.f54687x;
                    if ((b13 instanceof C23491b) || (b13 instanceof o)) {
                        view2 = viewA;
                        f fVar2 = f357785M;
                        f fVar3 = f357786N;
                        if (!z12) {
                            fVar2 = fVar3;
                        }
                        fVar = new f(fVar2.f357803a, fVar2.f357804b, fVar2.f357805c, fVar2.f357806d, null);
                    } else {
                        f fVar4 = f357783K;
                        f fVar5 = f357784L;
                        if (!z12) {
                            fVar4 = fVar5;
                        }
                        view2 = viewA;
                        fVar = new f(fVar4.f357803a, fVar4.f357804b, fVar4.f357805c, fVar4.f357806d, null);
                    }
                    h hVar = new h(b12, view3, rectF2, qVar, f14, view4, rectF3, qVar2, f15, 0, 0, 0, this.f357791F, z12, this.f357792G, interfaceC37080a, jVar3, fVar, false, null);
                    hVar.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new a(hVar));
                    a(new b(view2, hVar, view3, view4));
                    return valueAnimatorOfFloat;
                }
            }
        }
        return null;
    }

    @Override // androidx.transition.L
    @P
    public final String[] v() {
        return f357782J;
    }
}
