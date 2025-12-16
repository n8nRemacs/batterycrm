package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import j.InterfaceC42167x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: LottieDrawable.java */
/* loaded from: classes10.dex */
public class B extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: U, reason: collision with root package name */
    public static final List<String> f59013U = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");

    /* renamed from: V, reason: collision with root package name */
    public static final ThreadPoolExecutor f59014V = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new com.airbnb.lottie.utils.f());

    /* renamed from: A, reason: collision with root package name */
    public RenderMode f59015A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f59016B;

    /* renamed from: C, reason: collision with root package name */
    public final Matrix f59017C;

    /* renamed from: D, reason: collision with root package name */
    public Bitmap f59018D;

    /* renamed from: E, reason: collision with root package name */
    public Canvas f59019E;

    /* renamed from: F, reason: collision with root package name */
    public Rect f59020F;

    /* renamed from: G, reason: collision with root package name */
    public RectF f59021G;

    /* renamed from: H, reason: collision with root package name */
    public com.airbnb.lottie.animation.a f59022H;

    /* renamed from: I, reason: collision with root package name */
    public Rect f59023I;

    /* renamed from: J, reason: collision with root package name */
    public Rect f59024J;

    /* renamed from: K, reason: collision with root package name */
    public RectF f59025K;

    /* renamed from: L, reason: collision with root package name */
    public RectF f59026L;

    /* renamed from: M, reason: collision with root package name */
    public Matrix f59027M;

    /* renamed from: N, reason: collision with root package name */
    public final float[] f59028N;

    /* renamed from: O, reason: collision with root package name */
    public Matrix f59029O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f59030P;

    /* renamed from: Q, reason: collision with root package name */
    @j.P
    public AsyncUpdates f59031Q;

    /* renamed from: R, reason: collision with root package name */
    public final Semaphore f59032R;

    /* renamed from: S, reason: collision with root package name */
    public final RunnableC27294n f59033S;

    /* renamed from: T, reason: collision with root package name */
    public float f59034T;

    /* renamed from: b, reason: collision with root package name */
    public C27291k f59035b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.utils.h f59036c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59037d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f59038e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f59039f;

    /* renamed from: g, reason: collision with root package name */
    public b f59040g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<a> f59041h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public com.airbnb.lottie.manager.b f59042i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public String f59043j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public InterfaceC27264c f59044k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public com.airbnb.lottie.manager.a f59045l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public Map<String, Typeface> f59046m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public String f59047n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public C27263b f59048o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    public P f59049p;

    /* renamed from: q, reason: collision with root package name */
    public final C f59050q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f59051r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f59052s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    public com.airbnb.lottie.model.layer.c f59053t;

    /* renamed from: u, reason: collision with root package name */
    public int f59054u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f59055v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f59056w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f59057x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f59058y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f59059z;

    /* compiled from: LottieDrawable.java */
    public interface a {
        void run();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LottieDrawable.java */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f59060b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f59061c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f59062d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f59063e;

        static {
            b bVar = new b("NONE", 0);
            f59060b = bVar;
            b bVar2 = new b("PLAY", 1);
            f59061c = bVar2;
            b bVar3 = new b("RESUME", 2);
            f59062d = bVar3;
            f59063e = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f59063e.clone();
        }
    }

    /* compiled from: LottieDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public B() {
        com.airbnb.lottie.utils.h hVar = new com.airbnb.lottie.utils.h();
        this.f59036c = hVar;
        this.f59037d = true;
        this.f59038e = false;
        this.f59039f = false;
        this.f59040g = b.f59060b;
        this.f59041h = new ArrayList<>();
        this.f59050q = new C();
        this.f59051r = false;
        this.f59052s = true;
        this.f59054u = 255;
        this.f59059z = false;
        this.f59015A = RenderMode.f59154b;
        this.f59016B = false;
        this.f59017C = new Matrix();
        this.f59028N = new float[9];
        this.f59030P = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                List<String> list = B.f59013U;
                B b12 = this.f60169a;
                AsyncUpdates asyncUpdates = b12.f59031Q;
                if (asyncUpdates == null) {
                    asyncUpdates = C27285e.f59570d;
                }
                if (asyncUpdates == AsyncUpdates.f59011c) {
                    b12.invalidateSelf();
                    return;
                }
                com.airbnb.lottie.model.layer.c cVar = b12.f59053t;
                if (cVar != null) {
                    cVar.s(b12.f59036c.i());
                }
            }
        };
        this.f59032R = new Semaphore(1);
        this.f59033S = new RunnableC27294n(this, 2);
        this.f59034T = -3.4028235E38f;
        hVar.addUpdateListener(animatorUpdateListener);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final O2.d dVar, final ColorFilter colorFilter, @j.P final com.airbnb.lottie.value.j jVar) {
        com.airbnb.lottie.model.layer.c cVar = this.f59053t;
        if (cVar == null) {
            this.f59041h.add(new a() { // from class: com.airbnb.lottie.v
                @Override // com.airbnb.lottie.B.a
                public final void run() {
                    List<String> list = B.f59013U;
                    this.f60129a.a(dVar, colorFilter, jVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (dVar == O2.d.f11941c) {
            cVar.a(colorFilter, jVar);
        } else {
            O2.e eVar = dVar.f11943b;
            if (eVar != null) {
                eVar.a(colorFilter, jVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f59053t.b(dVar, 0, arrayList, new O2.d(new String[0]));
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((O2.d) arrayList.get(i12)).f11943b.a(colorFilter, jVar);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (colorFilter == H.f59107z) {
                y(this.f59036c.i());
            }
        }
    }

    public final boolean b(@j.P Context context) {
        if (this.f59038e) {
            return true;
        }
        return this.f59037d && C27285e.f59576j.a(context) == ReducedMotionMode.f59563b;
    }

    public final void c() {
        C27291k c27291k = this.f59035b;
        if (c27291k == null) {
            return;
        }
        JsonReader.a aVar = com.airbnb.lottie.parser.v.f60034a;
        Rect rect = c27291k.f59592k;
        com.airbnb.lottie.model.layer.c cVar = new com.airbnb.lottie.model.layer.c(this, new Layer(Collections.emptyList(), c27291k, "__container", -1L, Layer.LayerType.f59799b, -1L, null, Collections.emptyList(), new com.airbnb.lottie.model.animatable.n(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), Layer.MatteType.f59803b, null, false, null, null, LBlendMode.f59659b), c27291k.f59591j, c27291k);
        this.f59053t = cVar;
        if (this.f59056w) {
            cVar.r(true);
        }
        this.f59053t.f59847M = this.f59052s;
    }

    public final void d() {
        com.airbnb.lottie.utils.h hVar = this.f59036c;
        if (hVar.f60119n) {
            hVar.cancel();
            if (!isVisible()) {
                this.f59040g = b.f59060b;
            }
        }
        this.f59035b = null;
        this.f59053t = null;
        this.f59042i = null;
        this.f59034T = -3.4028235E38f;
        hVar.f60118m = null;
        hVar.f60116k = -2.1474836E9f;
        hVar.f60117l = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@j.N Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.f59053t;
        if (cVar == null) {
            return;
        }
        AsyncUpdates asyncUpdates = this.f59031Q;
        if (asyncUpdates == null) {
            asyncUpdates = C27285e.f59570d;
        }
        boolean z12 = asyncUpdates == AsyncUpdates.f59011c;
        ThreadPoolExecutor threadPoolExecutor = f59014V;
        Semaphore semaphore = this.f59032R;
        RunnableC27294n runnableC27294n = this.f59033S;
        com.airbnb.lottie.utils.h hVar = this.f59036c;
        if (z12) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (C27285e.f59567a) {
                    C27285e.b("Drawable#draw");
                }
                if (!z12) {
                    return;
                }
                semaphore.release();
                if (cVar.f59846L == hVar.i()) {
                    return;
                }
            } catch (Throwable th2) {
                if (C27285e.f59567a) {
                    C27285e.b("Drawable#draw");
                }
                if (z12) {
                    semaphore.release();
                    if (cVar.f59846L != hVar.i()) {
                        threadPoolExecutor.execute(runnableC27294n);
                    }
                }
                throw th2;
            }
        }
        if (C27285e.f59567a) {
            C27285e.a("Drawable#draw");
        }
        if (z12 && z()) {
            y(hVar.i());
        }
        if (this.f59039f) {
            try {
                if (this.f59016B) {
                    o(canvas, cVar);
                } else {
                    h(canvas);
                }
            } catch (Throwable th3) {
                com.airbnb.lottie.utils.e.f60101a.error("Lottie crashed in draw!", th3);
            }
        } else if (this.f59016B) {
            o(canvas, cVar);
        } else {
            h(canvas);
        }
        this.f59030P = false;
        if (C27285e.f59567a) {
            C27285e.b("Drawable#draw");
        }
        if (z12) {
            semaphore.release();
            if (cVar.f59846L == hVar.i()) {
                return;
            }
            threadPoolExecutor.execute(runnableC27294n);
        }
    }

    public final void e() {
        C27291k c27291k = this.f59035b;
        if (c27291k == null) {
            return;
        }
        RenderMode renderMode = this.f59015A;
        int i12 = Build.VERSION.SDK_INT;
        boolean z12 = c27291k.f59596o;
        int i13 = c27291k.f59597p;
        int iOrdinal = renderMode.ordinal();
        boolean z13 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z12 && i12 < 28) || i13 > 4))) {
            z13 = true;
        }
        this.f59016B = z13;
    }

    @RestrictTo
    public final void g(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.c cVar = this.f59053t;
        C27291k c27291k = this.f59035b;
        if (cVar == null || c27291k == null) {
            return;
        }
        AsyncUpdates asyncUpdates = this.f59031Q;
        if (asyncUpdates == null) {
            asyncUpdates = C27285e.f59570d;
        }
        boolean z12 = asyncUpdates == AsyncUpdates.f59011c;
        ThreadPoolExecutor threadPoolExecutor = f59014V;
        Semaphore semaphore = this.f59032R;
        RunnableC27294n runnableC27294n = this.f59033S;
        com.airbnb.lottie.utils.h hVar = this.f59036c;
        if (z12) {
            try {
                semaphore.acquire();
                if (z()) {
                    y(hVar.i());
                }
            } catch (InterruptedException unused) {
                if (!z12) {
                    return;
                }
                semaphore.release();
                if (cVar.f59846L == hVar.i()) {
                    return;
                }
            } catch (Throwable th2) {
                if (z12) {
                    semaphore.release();
                    if (cVar.f59846L != hVar.i()) {
                        threadPoolExecutor.execute(runnableC27294n);
                    }
                }
                throw th2;
            }
        }
        if (this.f59039f) {
            try {
                int i12 = this.f59054u;
                if (this.f59016B) {
                    canvas.save();
                    canvas.concat(matrix);
                    o(canvas, cVar);
                    canvas.restore();
                } else {
                    cVar.d(canvas, matrix, i12, null);
                }
            } catch (Throwable th3) {
                com.airbnb.lottie.utils.e.f60101a.error("Lottie crashed in draw!", th3);
            }
        } else {
            int i13 = this.f59054u;
            if (this.f59016B) {
                canvas.save();
                canvas.concat(matrix);
                o(canvas, cVar);
                canvas.restore();
            } else {
                cVar.d(canvas, matrix, i13, null);
            }
        }
        this.f59030P = false;
        if (z12) {
            semaphore.release();
            if (cVar.f59846L == hVar.i()) {
                return;
            }
            threadPoolExecutor.execute(runnableC27294n);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f59054u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C27291k c27291k = this.f59035b;
        if (c27291k == null) {
            return -1;
        }
        return c27291k.f59592k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C27291k c27291k = this.f59035b;
        if (c27291k == null) {
            return -1;
        }
        return c27291k.f59592k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.f59053t;
        C27291k c27291k = this.f59035b;
        if (cVar == null || c27291k == null) {
            return;
        }
        Matrix matrix = this.f59017C;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / c27291k.f59592k.width(), r3.height() / c27291k.f59592k.height());
        }
        cVar.d(canvas, matrix, this.f59054u, null);
    }

    public final void i(boolean z12) {
        LottieFeatureFlag lottieFeatureFlag = LottieFeatureFlag.f59146b;
        HashSet<LottieFeatureFlag> hashSet = this.f59050q.f59064a;
        boolean zAdd = z12 ? hashSet.add(lottieFeatureFlag) : hashSet.remove(lottieFeatureFlag);
        if (this.f59035b == null || !zAdd) {
            return;
        }
        c();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@j.N Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f59030P) {
            return;
        }
        this.f59030P = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        com.airbnb.lottie.utils.h hVar = this.f59036c;
        if (hVar == null) {
            return false;
        }
        return hVar.f60119n;
    }

    @j.P
    public final Context j() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final com.airbnb.lottie.manager.a k() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f59045l == null) {
            com.airbnb.lottie.manager.a aVar = new com.airbnb.lottie.manager.a(getCallback(), this.f59048o);
            this.f59045l = aVar;
            String str = this.f59047n;
            if (str != null) {
                aVar.f59610e = str;
            }
        }
        return this.f59045l;
    }

    public final boolean l() {
        return this.f59050q.f59064a.contains(LottieFeatureFlag.f59146b);
    }

    public final void m() {
        this.f59041h.clear();
        com.airbnb.lottie.utils.h hVar = this.f59036c;
        hVar.m(true);
        Iterator it = hVar.f60094d.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(hVar);
        }
        if (isVisible()) {
            return;
        }
        this.f59040g = b.f59060b;
    }

    @j.K
    public final void n() {
        if (this.f59053t == null) {
            this.f59041h.add(new y(this, 1));
            return;
        }
        e();
        boolean zB2 = b(j());
        b bVar = b.f59060b;
        com.airbnb.lottie.utils.h hVar = this.f59036c;
        if (zB2 || hVar.getRepeatCount() == 0) {
            if (isVisible()) {
                hVar.f60119n = true;
                boolean zL2 = hVar.l();
                Iterator it = hVar.f60093c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(hVar, zL2);
                }
                hVar.n((int) (hVar.l() ? hVar.j() : hVar.k()));
                hVar.f60112g = 0L;
                hVar.f60115j = 0;
                if (hVar.f60119n) {
                    hVar.m(false);
                    Choreographer.getInstance().postFrameCallback(hVar);
                }
                this.f59040g = bVar;
            } else {
                this.f59040g = b.f59061c;
            }
        }
        if (b(j())) {
            return;
        }
        Iterator<String> it2 = f59013U.iterator();
        O2.g gVarD = null;
        while (it2.hasNext()) {
            gVarD = this.f59035b.d(it2.next());
            if (gVarD != null) {
                break;
            }
        }
        if (gVarD != null) {
            s((int) gVarD.f11947b);
        } else {
            s((int) (hVar.f60110e < 0.0f ? hVar.k() : hVar.j()));
        }
        hVar.m(true);
        hVar.a(hVar.l());
        if (isVisible()) {
            return;
        }
        this.f59040g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.graphics.Canvas r11, com.airbnb.lottie.model.layer.c r12) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.B.o(android.graphics.Canvas, com.airbnb.lottie.model.layer.c):void");
    }

    @j.K
    public final void p() {
        if (this.f59053t == null) {
            this.f59041h.add(new y(this, 0));
            return;
        }
        e();
        boolean zB2 = b(j());
        b bVar = b.f59060b;
        com.airbnb.lottie.utils.h hVar = this.f59036c;
        if (zB2 || hVar.getRepeatCount() == 0) {
            if (isVisible()) {
                hVar.f60119n = true;
                hVar.m(false);
                Choreographer.getInstance().postFrameCallback(hVar);
                hVar.f60112g = 0L;
                if (hVar.l() && hVar.f60114i == hVar.k()) {
                    hVar.n(hVar.j());
                } else if (!hVar.l() && hVar.f60114i == hVar.j()) {
                    hVar.n(hVar.k());
                }
                Iterator it = hVar.f60094d.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(hVar);
                }
                this.f59040g = bVar;
            } else {
                this.f59040g = b.f59062d;
            }
        }
        if (b(j())) {
            return;
        }
        s((int) (hVar.f60110e < 0.0f ? hVar.k() : hVar.j()));
        hVar.m(true);
        hVar.a(hVar.l());
        if (isVisible()) {
            return;
        }
        this.f59040g = bVar;
    }

    public final void q(boolean z12) {
        if (z12 != this.f59052s) {
            this.f59052s = z12;
            com.airbnb.lottie.model.layer.c cVar = this.f59053t;
            if (cVar != null) {
                cVar.f59847M = z12;
            }
            invalidateSelf();
        }
    }

    public final boolean r(C27291k c27291k) {
        if (this.f59035b == c27291k) {
            return false;
        }
        this.f59030P = true;
        d();
        this.f59035b = c27291k;
        c();
        com.airbnb.lottie.utils.h hVar = this.f59036c;
        boolean z12 = hVar.f60118m == null;
        hVar.f60118m = c27291k;
        if (z12) {
            hVar.o(Math.max(hVar.f60116k, c27291k.f59593l), Math.min(hVar.f60117l, c27291k.f59594m));
        } else {
            hVar.o((int) c27291k.f59593l, (int) c27291k.f59594m);
        }
        float f12 = hVar.f60114i;
        hVar.f60114i = 0.0f;
        hVar.f60113h = 0.0f;
        hVar.n((int) f12);
        hVar.e();
        y(hVar.getAnimatedFraction());
        ArrayList<a> arrayList = this.f59041h;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        c27291k.f59582a.f59148a = this.f59055v;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void s(int i12) {
        if (this.f59035b == null) {
            this.f59041h.add(new u(this, i12, 2));
        } else {
            this.f59036c.n(i12);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@j.N Drawable drawable, @j.N Runnable runnable, long j12) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@j.F int i12) {
        this.f59054u = i12;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@j.P ColorFilter colorFilter) {
        com.airbnb.lottie.utils.e.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z12, z13);
        b bVar = b.f59062d;
        if (z12) {
            b bVar2 = this.f59040g;
            if (bVar2 == b.f59061c) {
                n();
            } else if (bVar2 == bVar) {
                p();
            }
        } else if (this.f59036c.f60119n) {
            m();
            this.f59040g = bVar;
        } else if (zIsVisible) {
            this.f59040g = b.f59060b;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @j.K
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        n();
    }

    @Override // android.graphics.drawable.Animatable
    @j.K
    public final void stop() {
        this.f59041h.clear();
        com.airbnb.lottie.utils.h hVar = this.f59036c;
        hVar.m(true);
        hVar.a(hVar.l());
        if (isVisible()) {
            return;
        }
        this.f59040g = b.f59060b;
    }

    public final void t(int i12) {
        if (this.f59035b == null) {
            this.f59041h.add(new u(this, i12, 0));
            return;
        }
        com.airbnb.lottie.utils.h hVar = this.f59036c;
        hVar.o(hVar.f60116k, i12 + 0.99f);
    }

    public final void u(String str) {
        C27291k c27291k = this.f59035b;
        if (c27291k == null) {
            this.f59041h.add(new t(this, str, 1));
            return;
        }
        O2.g gVarD = c27291k.d(str);
        if (gVarD == null) {
            throw new IllegalArgumentException(AK.c.k("Cannot find marker with name ", str, "."));
        }
        t((int) (gVarD.f11947b + gVarD.f11948c));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@j.N Drawable drawable, @j.N Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(String str) {
        C27291k c27291k = this.f59035b;
        ArrayList<a> arrayList = this.f59041h;
        if (c27291k == null) {
            arrayList.add(new t(this, str, 0));
            return;
        }
        O2.g gVarD = c27291k.d(str);
        if (gVarD == null) {
            throw new IllegalArgumentException(AK.c.k("Cannot find marker with name ", str, "."));
        }
        int i12 = (int) gVarD.f11947b;
        int i13 = ((int) gVarD.f11948c) + i12;
        if (this.f59035b == null) {
            arrayList.add(new x(this, i12, i13));
        } else {
            this.f59036c.o(i12, i13 + 0.99f);
        }
    }

    public final void w(int i12) {
        if (this.f59035b == null) {
            this.f59041h.add(new u(this, i12, 1));
        } else {
            this.f59036c.o(i12, (int) r0.f60117l);
        }
    }

    public final void x(String str) {
        C27291k c27291k = this.f59035b;
        if (c27291k == null) {
            this.f59041h.add(new t(this, str, 2));
            return;
        }
        O2.g gVarD = c27291k.d(str);
        if (gVarD == null) {
            throw new IllegalArgumentException(AK.c.k("Cannot find marker with name ", str, "."));
        }
        w((int) gVarD.f11947b);
    }

    public final void y(@InterfaceC42167x float f12) {
        if (this.f59035b == null) {
            this.f59041h.add(new w(this, f12, 2));
            return;
        }
        if (C27285e.f59567a) {
            C27285e.a("Drawable#setProgress");
        }
        C27291k c27291k = this.f59035b;
        this.f59036c.n(com.airbnb.lottie.utils.j.f(c27291k.f59593l, c27291k.f59594m, f12));
        if (C27285e.f59567a) {
            C27285e.b("Drawable#setProgress");
        }
    }

    public final boolean z() {
        C27291k c27291k = this.f59035b;
        if (c27291k == null) {
            return false;
        }
        float f12 = this.f59034T;
        float fI2 = this.f59036c.i();
        this.f59034T = fI2;
        return Math.abs(fI2 - f12) * c27291k.b() >= 50.0f;
    }
}
