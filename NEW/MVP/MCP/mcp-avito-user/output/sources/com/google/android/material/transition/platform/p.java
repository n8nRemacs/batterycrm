package com.google.android.material.transition.platform;

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
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.internal.O;
import com.google.android.material.shape.q;
import j.InterfaceC42156l;
import j.InterfaceC42167x;
import j.N;
import j.P;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.WeakHashMap;
import lY0.C43707b;
import mY0.C44030a;
import wY0.C49576a;

/* compiled from: MaterialContainerTransform.java */
@X
/* loaded from: classes6.dex */
public final class p extends Transition {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f357888k = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: l, reason: collision with root package name */
    public static final f f357889l = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);

    /* renamed from: m, reason: collision with root package name */
    public static final f f357890m = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), null);

    /* renamed from: n, reason: collision with root package name */
    public static final f f357891n = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);

    /* renamed from: o, reason: collision with root package name */
    public static final f f357892o = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f357893b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f357894c = false;

    /* renamed from: d, reason: collision with root package name */
    @j.D
    public final int f357895d = R.id.content;

    /* renamed from: e, reason: collision with root package name */
    @j.D
    public final int f357896e = -1;

    /* renamed from: f, reason: collision with root package name */
    @j.D
    public final int f357897f = -1;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC42156l
    public final int f357898g = 1375731712;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f357899h;

    /* renamed from: i, reason: collision with root package name */
    public final float f357900i;

    /* renamed from: j, reason: collision with root package name */
    public final float f357901j;

    /* compiled from: MaterialContainerTransform.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f357902a;

        public a(h hVar) {
            this.f357902a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            h hVar = this.f357902a;
            if (hVar.f357925L != animatedFraction) {
                hVar.d(animatedFraction);
            }
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    public class b extends E {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f357903a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f357904b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f357905c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f357906d;

        public b(View view, h hVar, View view2, View view3) {
            this.f357903a = view;
            this.f357904b = hVar;
            this.f357905c = view2;
            this.f357906d = view3;
        }

        @Override // com.google.android.material.transition.platform.E, android.transition.Transition.TransitionListener
        public final void onTransitionEnd(@N Transition transition) {
            p pVar = p.this;
            pVar.removeListener(this);
            if (pVar.f357893b) {
                return;
            }
            this.f357905c.setAlpha(1.0f);
            this.f357906d.setAlpha(1.0f);
            O.d(this.f357903a).b(this.f357904b);
        }

        @Override // com.google.android.material.transition.platform.E, android.transition.Transition.TransitionListener
        public final void onTransitionStart(@N Transition transition) {
            O.d(this.f357903a).a(this.f357904b);
            this.f357905c.setAlpha(0.0f);
            this.f357906d.setAlpha(0.0f);
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
        public final float f357908a;

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC42167x
        public final float f357909b;

        public e(@InterfaceC42167x float f12, @InterfaceC42167x float f13) {
            this.f357908a = f12;
            this.f357909b = f13;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final e f357910a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final e f357911b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final e f357912c;

        /* renamed from: d, reason: collision with root package name */
        @N
        public final e f357913d;

        public f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this.f357910a = eVar;
            this.f357911b = eVar2;
            this.f357912c = eVar3;
            this.f357913d = eVar4;
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
        public final f f357914A;

        /* renamed from: B, reason: collision with root package name */
        public final InterfaceC37085a f357915B;

        /* renamed from: C, reason: collision with root package name */
        public final j f357916C;

        /* renamed from: D, reason: collision with root package name */
        public final boolean f357917D;

        /* renamed from: E, reason: collision with root package name */
        public final Paint f357918E;

        /* renamed from: F, reason: collision with root package name */
        public final Path f357919F;

        /* renamed from: G, reason: collision with root package name */
        public C37087c f357920G;

        /* renamed from: H, reason: collision with root package name */
        public l f357921H;

        /* renamed from: I, reason: collision with root package name */
        public RectF f357922I;

        /* renamed from: J, reason: collision with root package name */
        public float f357923J;

        /* renamed from: K, reason: collision with root package name */
        public float f357924K;

        /* renamed from: L, reason: collision with root package name */
        public float f357925L;

        /* renamed from: a, reason: collision with root package name */
        public final View f357926a;

        /* renamed from: b, reason: collision with root package name */
        public final RectF f357927b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.material.shape.q f357928c;

        /* renamed from: d, reason: collision with root package name */
        public final float f357929d;

        /* renamed from: e, reason: collision with root package name */
        public final View f357930e;

        /* renamed from: f, reason: collision with root package name */
        public final RectF f357931f;

        /* renamed from: g, reason: collision with root package name */
        public final com.google.android.material.shape.q f357932g;

        /* renamed from: h, reason: collision with root package name */
        public final float f357933h;

        /* renamed from: i, reason: collision with root package name */
        public final Paint f357934i;

        /* renamed from: j, reason: collision with root package name */
        public final Paint f357935j;

        /* renamed from: k, reason: collision with root package name */
        public final Paint f357936k;

        /* renamed from: l, reason: collision with root package name */
        public final Paint f357937l;

        /* renamed from: m, reason: collision with root package name */
        public final Paint f357938m;

        /* renamed from: n, reason: collision with root package name */
        public final n f357939n;

        /* renamed from: o, reason: collision with root package name */
        public final PathMeasure f357940o;

        /* renamed from: p, reason: collision with root package name */
        public final float f357941p;

        /* renamed from: q, reason: collision with root package name */
        public final float[] f357942q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f357943r;

        /* renamed from: s, reason: collision with root package name */
        public final float f357944s;

        /* renamed from: t, reason: collision with root package name */
        public final float f357945t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f357946u;

        /* renamed from: v, reason: collision with root package name */
        public final com.google.android.material.shape.k f357947v;

        /* renamed from: w, reason: collision with root package name */
        public final RectF f357948w;

        /* renamed from: x, reason: collision with root package name */
        public final RectF f357949x;

        /* renamed from: y, reason: collision with root package name */
        public final RectF f357950y;

        /* renamed from: z, reason: collision with root package name */
        public final RectF f357951z;

        /* compiled from: MaterialContainerTransform.java */
        public class a implements C44030a.InterfaceC11833a {
            public a() {
            }

            @Override // mY0.C44030a.InterfaceC11833a
            public final void a(Canvas canvas) {
                h.this.f357926a.draw(canvas);
            }
        }

        /* compiled from: MaterialContainerTransform.java */
        public class b implements C44030a.InterfaceC11833a {
            public b() {
            }

            @Override // mY0.C44030a.InterfaceC11833a
            public final void a(Canvas canvas) {
                h.this.f357930e.draw(canvas);
            }
        }

        public h(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.q qVar, float f12, View view2, RectF rectF2, com.google.android.material.shape.q qVar2, float f13, int i12, int i13, int i14, int i15, boolean z12, boolean z13, InterfaceC37085a interfaceC37085a, j jVar, f fVar, boolean z14, a aVar) {
            Paint paint = new Paint();
            this.f357934i = paint;
            Paint paint2 = new Paint();
            this.f357935j = paint2;
            Paint paint3 = new Paint();
            this.f357936k = paint3;
            this.f357937l = new Paint();
            Paint paint4 = new Paint();
            this.f357938m = paint4;
            this.f357939n = new n();
            this.f357942q = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            this.f357947v = kVar;
            Paint paint5 = new Paint();
            this.f357918E = paint5;
            this.f357919F = new Path();
            this.f357926a = view;
            this.f357927b = rectF;
            this.f357928c = qVar;
            this.f357929d = f12;
            this.f357930e = view2;
            this.f357931f = rectF2;
            this.f357932g = qVar2;
            this.f357933h = f13;
            this.f357943r = z12;
            this.f357946u = z13;
            this.f357915B = interfaceC37085a;
            this.f357916C = jVar;
            this.f357914A = fVar;
            this.f357917D = z14;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f357944s = r11.widthPixels;
            this.f357945t = r11.heightPixels;
            paint.setColor(i12);
            paint2.setColor(i13);
            paint3.setColor(i14);
            kVar.n(ColorStateList.valueOf(0));
            kVar.s();
            kVar.f357055w = false;
            kVar.q(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f357948w = rectF3;
            this.f357949x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f357950y = rectF4;
            this.f357951z = new RectF(rectF4);
            PointF pointF = new PointF(rectF.centerX(), rectF.top);
            PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
            this.f357940o = pathMeasure;
            this.f357941p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = H.f357855a;
            paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i15, i15, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            d(0.0f);
        }

        public final void a(Canvas canvas) {
            c(canvas, this.f357936k);
            Rect bounds = getBounds();
            RectF rectF = this.f357950y;
            H.f(canvas, bounds, rectF.left, rectF.top, this.f357921H.f357878b, this.f357920G.f357859b, new b());
        }

        public final void b(Canvas canvas) {
            c(canvas, this.f357935j);
            Rect bounds = getBounds();
            RectF rectF = this.f357948w;
            H.f(canvas, bounds, rectF.left, rectF.top, this.f357921H.f357877a, this.f357920G.f357858a, new a());
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
            this.f357925L = f12;
            this.f357938m.setAlpha((int) (this.f357943r ? H.c(0.0f, 255.0f, f12) : H.c(255.0f, 0.0f, f12)));
            float f15 = this.f357941p;
            PathMeasure pathMeasure = this.f357940o;
            float[] fArr = this.f357942q;
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
            f fVar = this.f357914A;
            float f22 = fVar.f357911b.f357908a;
            float f23 = fVar.f357911b.f357909b;
            RectF rectF = this.f357927b;
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            RectF rectF2 = this.f357931f;
            l lVarA = this.f357916C.a(f12, f22, f23, fWidth, fHeight, rectF2.width(), rectF2.height());
            this.f357921H = lVarA;
            float f24 = lVarA.f357879c / 2.0f;
            float f25 = lVarA.f357880d + f19;
            RectF rectF3 = this.f357948w;
            rectF3.set(f18 - f24, f19, f24 + f18, f25);
            l lVar = this.f357921H;
            float f26 = lVar.f357881e / 2.0f;
            float f27 = lVar.f357882f + f19;
            RectF rectF4 = this.f357950y;
            rectF4.set(f18 - f26, f19, f26 + f18, f27);
            RectF rectF5 = this.f357949x;
            rectF5.set(rectF3);
            RectF rectF6 = this.f357951z;
            rectF6.set(rectF4);
            e eVar = fVar.f357912c;
            float f28 = eVar.f357908a;
            float f29 = eVar.f357909b;
            l lVar2 = this.f357921H;
            j jVar = this.f357916C;
            boolean zB2 = jVar.b(lVar2);
            RectF rectF7 = zB2 ? rectF5 : rectF6;
            float fD2 = H.d(0.0f, 1.0f, f28, f29, f12, false);
            if (!zB2) {
                fD2 = 1.0f - fD2;
            }
            jVar.c(rectF7, fD2, this.f357921H);
            this.f357922I = new RectF(Math.min(rectF5.left, rectF6.left), Math.min(rectF5.top, rectF6.top), Math.max(rectF5.right, rectF6.right), Math.max(rectF5.bottom, rectF6.bottom));
            n nVar = this.f357939n;
            nVar.getClass();
            e eVar2 = fVar.f357913d;
            float f32 = eVar2.f357908a;
            com.google.android.material.shape.q qVar = this.f357928c;
            if (f12 < f32) {
                qVarA = qVar;
            } else {
                float f33 = eVar2.f357909b;
                com.google.android.material.shape.q qVar2 = this.f357932g;
                if (f12 > f33) {
                    qVarA = qVar2;
                } else {
                    G g12 = new G(rectF3, rectF6, f32, f33, f12);
                    float fA2 = qVar.f357085e.a(rectF3);
                    com.google.android.material.shape.e eVar3 = qVar.f357088h;
                    com.google.android.material.shape.e eVar4 = qVar.f357087g;
                    com.google.android.material.shape.e eVar5 = qVar.f357086f;
                    q.b bVarF = ((fA2 == 0.0f && eVar5.a(rectF3) == 0.0f && eVar4.a(rectF3) == 0.0f && eVar3.a(rectF3) == 0.0f) ? qVar2 : qVar).f();
                    bVarF.f357097e = g12.a(qVar.f357085e, qVar2.f357085e);
                    bVarF.f357098f = g12.a(eVar5, qVar2.f357086f);
                    bVarF.f357100h = g12.a(eVar3, qVar2.f357088h);
                    bVarF.f357099g = g12.a(eVar4, qVar2.f357087g);
                    qVarA = bVarF.a();
                }
            }
            nVar.f357887e = qVarA;
            Path path = nVar.f357884b;
            nVar.f357886d.a(qVarA, 1.0f, rectF5, null, path);
            com.google.android.material.shape.q qVar3 = nVar.f357887e;
            Path path2 = nVar.f357885c;
            nVar.f357886d.a(qVar3, 1.0f, rectF6, null, path2);
            nVar.f357883a.op(path, path2, Path.Op.UNION);
            this.f357923J = H.c(this.f357929d, this.f357933h, f12);
            float fCenterX = ((this.f357922I.centerX() / (this.f357944s / 2.0f)) - 1.0f) * 0.3f;
            float fCenterY = (this.f357922I.centerY() / this.f357945t) * 1.5f;
            float f34 = this.f357923J;
            float f35 = (int) (fCenterY * f34);
            this.f357924K = f35;
            this.f357937l.setShadowLayer(f34, (int) (fCenterX * f34), f35, 754974720);
            e eVar6 = fVar.f357910a;
            this.f357920G = this.f357915B.a(f12, eVar6.f357908a, eVar6.f357909b);
            Paint paint = this.f357935j;
            if (paint.getColor() != 0) {
                paint.setAlpha(this.f357920G.f357858a);
            }
            Paint paint2 = this.f357936k;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(this.f357920G.f357859b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(@N Canvas canvas) {
            Paint paint = this.f357938m;
            if (paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
            boolean z12 = this.f357917D;
            int iSave = z12 ? canvas.save() : -1;
            boolean z13 = this.f357946u;
            n nVar = this.f357939n;
            if (z13 && this.f357923J > 0.0f) {
                canvas.save();
                canvas.clipPath(nVar.f357883a, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT > 28) {
                    com.google.android.material.shape.q qVar = nVar.f357887e;
                    boolean zE2 = qVar.e(this.f357922I);
                    Paint paint2 = this.f357937l;
                    if (zE2) {
                        float fA2 = qVar.f357085e.a(this.f357922I);
                        canvas.drawRoundRect(this.f357922I, fA2, fA2, paint2);
                    } else {
                        canvas.drawPath(nVar.f357883a, paint2);
                    }
                } else {
                    com.google.android.material.shape.k kVar = this.f357947v;
                    RectF rectF = this.f357922I;
                    kVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    kVar.m(this.f357923J);
                    kVar.t((int) this.f357924K);
                    kVar.setShapeAppearanceModel(nVar.f357887e);
                    kVar.draw(canvas);
                }
                canvas.restore();
            }
            canvas.clipPath(nVar.f357883a);
            c(canvas, this.f357934i);
            if (this.f357920G.f357860c) {
                b(canvas);
                a(canvas);
            } else {
                a(canvas);
                b(canvas);
            }
            if (z12) {
                canvas.restoreToCount(iSave);
                RectF rectF2 = this.f357948w;
                Path path = this.f357919F;
                PointF pointF = new PointF(rectF2.centerX(), rectF2.top);
                float f12 = this.f357925L;
                Paint paint3 = this.f357918E;
                if (f12 == 0.0f) {
                    path.reset();
                    path.moveTo(pointF.x, pointF.y);
                } else {
                    path.lineTo(pointF.x, pointF.y);
                    paint3.setColor(-65281);
                    canvas.drawPath(path, paint3);
                }
                RectF rectF3 = this.f357949x;
                paint3.setColor(-256);
                canvas.drawRect(rectF3, paint3);
                paint3.setColor(-16711936);
                canvas.drawRect(rectF2, paint3);
                RectF rectF4 = this.f357951z;
                paint3.setColor(-16711681);
                canvas.drawRect(rectF4, paint3);
                RectF rectF5 = this.f357950y;
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
        this.f357899h = Build.VERSION.SDK_INT >= 28;
        this.f357900i = -1.0f;
        this.f357901j = -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@N TransitionValues transitionValues, @j.D int i12) throws Resources.NotFoundException {
        final RectF rectFB;
        com.google.android.material.shape.q qVarA;
        if (i12 != -1) {
            View view = transitionValues.view;
            RectF rectF = H.f357855a;
            View viewFindViewById = view.findViewById(i12);
            if (viewFindViewById == null) {
                viewFindViewById = H.a(view, i12);
            }
            transitionValues.view = viewFindViewById;
        } else if (transitionValues.view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) transitionValues.view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
            transitionValues.view.setTag(com.google.android.material.R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = view2;
        }
        View view3 = transitionValues.view;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (!view3.isLaidOut() && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        if (view3.getParent() == null) {
            RectF rectF2 = H.f357855a;
            rectFB = new RectF(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
        } else {
            rectFB = H.b(view3);
        }
        transitionValues.values.put("materialContainerTransition:bounds", rectFB);
        Map map = transitionValues.values;
        if (view3.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof com.google.android.material.shape.q) {
            qVarA = (com.google.android.material.shape.q) view3.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
        } else {
            Context context = view3.getContext();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            qVarA = resourceId != -1 ? com.google.android.material.shape.q.a(context, resourceId, 0).a() : view3 instanceof com.google.android.material.shape.v ? ((com.google.android.material.shape.v) view3).getShapeAppearanceModel() : new q.b().a();
        }
        map.put("materialContainerTransition:shapeAppearance", qVarA.g(new q.c() { // from class: com.google.android.material.transition.platform.F
            @Override // com.google.android.material.shape.q.c
            public final com.google.android.material.shape.e a(com.google.android.material.shape.e eVar) {
                RectF rectF3 = H.f357855a;
                RectF rectF4 = rectFB;
                return eVar instanceof com.google.android.material.shape.o ? (com.google.android.material.shape.o) eVar : new com.google.android.material.shape.o(eVar.a(rectF4) / Math.min(rectF4.width(), rectF4.height()));
            }
        }));
    }

    @Override // android.transition.Transition
    public final void captureEndValues(@N TransitionValues transitionValues) throws Resources.NotFoundException {
        a(transitionValues, this.f357897f);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(@N TransitionValues transitionValues) throws Resources.NotFoundException {
        a(transitionValues, this.f357896e);
    }

    @Override // android.transition.Transition
    @P
    public final Animator createAnimator(@N ViewGroup viewGroup, @P TransitionValues transitionValues, @P TransitionValues transitionValues2) throws Resources.NotFoundException {
        View viewA;
        View view;
        RectF rectF;
        View view2;
        f fVar;
        int i12;
        int iC2;
        PathMotion patternPathMotion = null;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF2 = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            com.google.android.material.shape.q qVar = (com.google.android.material.shape.q) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF2 != null && qVar != null) {
                RectF rectF3 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                com.google.android.material.shape.q qVar2 = (com.google.android.material.shape.q) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF3 != null && qVar2 != null) {
                    View view3 = transitionValues.view;
                    View view4 = transitionValues2.view;
                    View view5 = view4.getParent() != null ? view4 : view3;
                    int id2 = view5.getId();
                    int i13 = this.f357895d;
                    if (i13 == id2) {
                        viewA = (View) view5.getParent();
                        view = view5;
                    } else {
                        viewA = H.a(view5, i13);
                        view = null;
                    }
                    RectF rectFB = H.b(viewA);
                    float f12 = -rectFB.left;
                    float f13 = -rectFB.top;
                    if (view != null) {
                        rectF = H.b(view);
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
                    if (i14 != 0 && getInterpolator() == null) {
                        setInterpolator(C49576a.d(context, i14, bVar));
                    }
                    int i15 = z12 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4;
                    if (i15 != 0 && getDuration() == -1 && (iC2 = C49576a.c(context, i15, -1)) != -1) {
                        setDuration(iC2);
                    }
                    if (!this.f357894c && (i12 = com.google.android.material.R.attr.motionPath) != 0) {
                        TypedValue typedValue = new TypedValue();
                        if (context.getTheme().resolveAttribute(i12, typedValue, true)) {
                            int i16 = typedValue.type;
                            if (i16 == 16) {
                                int i17 = typedValue.data;
                                if (i17 != 0) {
                                    if (i17 != 1) {
                                        throw new IllegalArgumentException(AK.c.g(i17, "Invalid motion path type: "));
                                    }
                                    patternPathMotion = new o();
                                }
                            } else {
                                if (i16 != 3) {
                                    throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
                                }
                                patternPathMotion = new PatternPathMotion(androidx.core.graphics.p.d(String.valueOf(typedValue.string)));
                            }
                        }
                        if (patternPathMotion != null) {
                            setPathMotion(patternPathMotion);
                        }
                    }
                    PathMotion pathMotion = getPathMotion();
                    float fL2 = this.f357900i;
                    if (fL2 == -1.0f) {
                        fL2 = C22823h0.l(view3);
                    }
                    float f14 = fL2;
                    float fL3 = this.f357901j;
                    if (fL3 == -1.0f) {
                        fL3 = C22823h0.l(view4);
                    }
                    float f15 = fL3;
                    InterfaceC37085a interfaceC37085a = z12 ? C37086b.f357856a : C37086b.f357857b;
                    j jVar = k.f357875a;
                    j jVar2 = k.f357876b;
                    float fWidth = rectF2.width();
                    float fHeight = rectF2.height();
                    float fWidth2 = rectF3.width();
                    float fHeight2 = rectF3.height();
                    j jVar3 = (!z12 ? (fWidth2 * fHeight) / fWidth >= fHeight2 : (fHeight2 * fWidth) / fWidth2 >= fHeight) ? jVar2 : jVar;
                    PathMotion pathMotion2 = getPathMotion();
                    if ((pathMotion2 instanceof ArcMotion) || (pathMotion2 instanceof o)) {
                        view2 = viewA;
                        f fVar2 = f357891n;
                        f fVar3 = f357892o;
                        if (!z12) {
                            fVar2 = fVar3;
                        }
                        fVar = new f(fVar2.f357910a, fVar2.f357911b, fVar2.f357912c, fVar2.f357913d, null);
                    } else {
                        f fVar4 = f357889l;
                        f fVar5 = f357890m;
                        if (!z12) {
                            fVar4 = fVar5;
                        }
                        view2 = viewA;
                        fVar = new f(fVar4.f357910a, fVar4.f357911b, fVar4.f357912c, fVar4.f357913d, null);
                    }
                    h hVar = new h(pathMotion, view3, rectF2, qVar, f14, view4, rectF3, qVar2, f15, 0, 0, 0, this.f357898g, z12, this.f357899h, interfaceC37085a, jVar3, fVar, false, null);
                    hVar.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new a(hVar));
                    addListener(new b(view2, hVar, view3, view4));
                    return valueAnimatorOfFloat;
                }
            }
        }
        return null;
    }

    @Override // android.transition.Transition
    @P
    public final String[] getTransitionProperties() {
        return f357888k;
    }

    @Override // android.transition.Transition
    public final void setPathMotion(@P PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f357894c = true;
    }
}
