package com.my.target;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.my.target.C37803o0;
import e11.C39907t0;
import e11.C39924z;
import e11.W1;
import e11.X1;
import e11.e2;
import e11.k2;
import e11.m2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.my.target.o0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37803o0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final e11.S0 f365043a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final e11.S0 f365044b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final e2 f365045c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final W1 f365046d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f365047e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f365048f;

    /* renamed from: g, reason: collision with root package name */
    public final float f365049g;

    /* renamed from: h, reason: collision with root package name */
    public final long f365050h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public a f365051i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public WeakReference<View> f365052j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public WeakReference<C37820x0> f365053k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public Context f365054l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f365055m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f365056n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f365057o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f365058p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f365059q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f365060r;

    /* renamed from: s, reason: collision with root package name */
    public long f365061s = 0;

    /* renamed from: t, reason: collision with root package name */
    public float f365062t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    @j.N
    public final ArrayList<X1> f365063u;

    /* JADX WARN: Type inference failed for: r0v2, types: [e11.S0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [e11.S0] */
    public C37803o0(@j.N e11.H0 h02, @j.N e2 e2Var, boolean z12) {
        final int i12 = 0;
        this.f365043a = new Runnable(this) { // from class: e11.S0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C37803o0 f394479c;

            {
                this.f394479c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f394479c.b();
                        break;
                    default:
                        this.f394479c.d(false);
                        break;
                }
            }
        };
        final int i13 = 1;
        this.f365044b = new Runnable(this) { // from class: e11.S0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C37803o0 f394479c;

            {
                this.f394479c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f394479c.b();
                        break;
                    default:
                        this.f394479c.d(false);
                        break;
                }
            }
        };
        this.f365049g = h02.f394362b * 100.0f;
        this.f365050h = (long) (h02.f394363c * 1000.0f);
        this.f365045c = e2Var;
        this.f365047e = z12;
        float f12 = h02.f394361a;
        if (f12 == 1.0f) {
            this.f365046d = W1.f394499e;
        } else {
            this.f365046d = new W1((int) (f12 * 1000.0f));
        }
        this.f365063u = e2Var.e("viewabilityDuration");
        this.f365048f = !r5.isEmpty();
    }

    public static double a(@j.P View view) {
        if (view == null || view.getVisibility() != 0 || view.getWindowVisibility() != 0 || view.getParent() == null || view.getAlpha() < 0.5f) {
            return 0.0d;
        }
        int width = view.getWidth();
        if (view.getHeight() <= 0 || width <= 0) {
            return 0.0d;
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            return 0.0d;
        }
        return (r4.height() * r4.width()) / ((width * r3) / 100.0d);
    }

    public final void b() {
        WeakReference<View> weakReference = this.f365052j;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            f();
            return;
        }
        float fA2 = (float) a(view);
        this.f365062t = Math.max(this.f365062t, fA2);
        boolean z12 = C39907t0.a(fA2, this.f365049g) != -1;
        if (this.f365055m != z12) {
            this.f365055m = z12;
            a aVar = this.f365051i;
            if (aVar != null) {
                aVar.b(z12);
            }
        }
        if (this.f365058p) {
            return;
        }
        if (!this.f365055m) {
            this.f365061s = 0L;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f365061s == 0) {
            this.f365061s = jCurrentTimeMillis;
        }
        if (jCurrentTimeMillis - this.f365061s < this.f365050h) {
            return;
        }
        this.f365058p = true;
        W1 w12 = this.f365046d;
        boolean z13 = this.f365048f;
        if (z13 && !this.f365057o && !this.f365060r) {
            this.f365057o = true;
            w12.a(this.f365044b);
        }
        if (this.f365047e) {
            if (z13) {
                w12.b(this.f365043a);
            } else {
                f();
            }
        }
        Context context = view.getContext();
        String strQ = C39924z.q(context);
        e2 e2Var = this.f365045c;
        if (strQ != null) {
            k2.a(context, e2Var.a(strQ));
        }
        k2.a(context, e2Var.e("show"));
        a aVar2 = this.f365051i;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    public final void c(@j.N View view) {
        if (this.f365056n) {
            return;
        }
        boolean z12 = this.f365058p;
        boolean z13 = this.f365047e;
        if (z12 && z13) {
            return;
        }
        this.f365056n = true;
        this.f365061s = 0L;
        this.f365052j = new WeakReference<>(view);
        this.f365054l = view.getContext().getApplicationContext();
        if (!this.f365059q) {
            k2.a(view.getContext(), this.f365045c.e("render"));
            this.f365059q = true;
        }
        b();
        if (this.f365058p && z13) {
            return;
        }
        this.f365046d.a(this.f365043a);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            WeakReference<C37820x0> weakReference = this.f365053k;
            if (weakReference != null) {
                C37820x0 c37820x0 = weakReference.get();
                this.f365053k = null;
                if (c37820x0 != null) {
                    c37820x0.setStateChangedListener(null);
                    ViewParent parent = c37820x0.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c37820x0);
                    }
                }
            }
            try {
                C37820x0 c37820x02 = new C37820x0(viewGroup.getContext());
                C39924z.m(c37820x02, "viewability_view");
                viewGroup.addView(c37820x02);
                c37820x02.setStateChangedListener(new com.my.target.ads.a(this, 13));
                this.f365053k = new WeakReference<>(c37820x02);
            } catch (Throwable th2) {
                th2.getMessage();
                this.f365053k = null;
            }
        }
    }

    public final void d(boolean z12) {
        Context context;
        if (!this.f365048f || this.f365060r || !this.f365058p || (context = this.f365054l) == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f365061s;
        if (!z12) {
            WeakReference<View> weakReference = this.f365052j;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null) {
                f();
                return;
            }
            float fA2 = (float) a(view);
            this.f365062t = Math.max(this.f365062t, fA2);
            if (C39907t0.a(fA2, this.f365049g) != -1 && jCurrentTimeMillis < 60000) {
                return;
            }
        }
        float f12 = this.f365062t;
        this.f365057o = false;
        this.f365060r = true;
        String strValueOf = String.valueOf((int) f12);
        String str = String.format(Locale.getDefault(), "%.1f", Float.valueOf(Math.min(jCurrentTimeMillis, 60000L) / 1000.0f));
        HashMap map = new HashMap();
        map.put("viewability_percent", strValueOf);
        map.put("viewability_duration", str);
        ArrayList<X1> arrayList = this.f365063u;
        k2 k2Var = k2.f394669a;
        k2Var.getClass();
        if (arrayList != null && arrayList.size() != 0) {
            m2.c(new FX0.a(k2Var, arrayList, map, context, 12));
        }
        if (e()) {
            f();
        } else {
            this.f365057o = false;
            this.f365046d.b(this.f365044b);
        }
    }

    public final boolean e() {
        return (this.f365058p && this.f365047e) && (this.f365060r || !this.f365048f);
    }

    public final void f() {
        d(true);
        this.f365055m = false;
        this.f365056n = false;
        e11.S0 s02 = this.f365043a;
        W1 w12 = this.f365046d;
        w12.b(s02);
        this.f365057o = false;
        w12.b(this.f365044b);
        WeakReference<C37820x0> weakReference = this.f365053k;
        if (weakReference != null) {
            C37820x0 c37820x0 = weakReference.get();
            this.f365053k = null;
            if (c37820x0 != null) {
                c37820x0.setStateChangedListener(null);
                ViewParent parent = c37820x0.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(c37820x0);
                }
            }
        }
        this.f365052j = null;
        this.f365054l = null;
    }

    /* renamed from: com.my.target.o0$a */
    public static abstract class a {
        public void a() {
        }

        public void b(boolean z12) {
        }
    }
}
