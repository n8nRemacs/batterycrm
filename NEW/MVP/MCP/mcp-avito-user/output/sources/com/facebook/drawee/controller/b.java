package com.facebook.drawee.controller;

import HW0.a;
import I41.h;
import QW0.c;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.facebook.common.executors.i;
import com.facebook.common.internal.k;
import com.facebook.common.internal.n;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.components.a;
import com.facebook.drawee.drawable.r;
import java.util.Map;
import uW0.C48986a;
import uW0.C48987b;

/* compiled from: AbstractDraweeController.java */
@J41.c
/* loaded from: classes.dex */
public abstract class b<T, INFO> implements IW0.a, a.InterfaceC10530a, a.InterfaceC0409a {

    /* renamed from: p, reason: collision with root package name */
    public static final Map<String, Object> f339990p = k.a("component_tag", "drawee");

    /* renamed from: q, reason: collision with root package name */
    public static final Map<String, Object> f339991q = k.b("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: r, reason: collision with root package name */
    public static final Class<?> f339992r = b.class;

    /* renamed from: a, reason: collision with root package name */
    public final DraweeEventTracker f339993a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.drawee.components.a f339994b;

    /* renamed from: c, reason: collision with root package name */
    public final i f339995c;

    /* renamed from: d, reason: collision with root package name */
    @h
    public e<INFO> f339996d;

    /* renamed from: e, reason: collision with root package name */
    public final QW0.e<INFO> f339997e;

    /* renamed from: f, reason: collision with root package name */
    @h
    public IW0.c f339998f;

    /* renamed from: g, reason: collision with root package name */
    @h
    public EW0.a f339999g;

    /* renamed from: h, reason: collision with root package name */
    public String f340000h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f340001i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f340002j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f340003k;

    /* renamed from: l, reason: collision with root package name */
    @h
    public com.facebook.datasource.f<T> f340004l;

    /* renamed from: m, reason: collision with root package name */
    @h
    public T f340005m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f340006n;

    /* renamed from: o, reason: collision with root package name */
    @h
    public Drawable f340007o;

    /* compiled from: AbstractDraweeController.java */
    class a extends com.facebook.datasource.e<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f340008a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f340009b;

        public a(String str, boolean z12) {
            this.f340008a = str;
            this.f340009b = z12;
        }

        @Override // com.facebook.datasource.e
        public final void a(com.facebook.datasource.f<Object> fVar) {
            Throwable thF = fVar.f();
            Map<String, Object> map = b.f339990p;
            b.this.p(this.f340008a, fVar, thF, true);
        }

        @Override // com.facebook.datasource.e, com.facebook.datasource.k
        public final void d(com.facebook.datasource.f<Object> fVar) {
            boolean zG2 = fVar.g();
            float fC2 = fVar.c();
            Map<String, Object> map = b.f339990p;
            b bVar = b.this;
            if (!bVar.k(this.f340008a, fVar)) {
                bVar.l("ignore_old_datasource @ onProgress", null);
                fVar.close();
            } else {
                if (zG2) {
                    return;
                }
                bVar.f339998f.c(fC2, false);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.datasource.e
        public final void f(com.facebook.datasource.f<Object> fVar) {
            boolean zG2 = fVar.g();
            boolean zE2 = fVar.e();
            float fC2 = fVar.c();
            Object objA = fVar.a();
            if (objA != null) {
                Map<String, Object> map = b.f339990p;
                b.this.r(this.f340008a, fVar, objA, fC2, zG2, this.f340009b, zE2);
                return;
            }
            if (zG2) {
                NullPointerException nullPointerException = new NullPointerException();
                Map<String, Object> map2 = b.f339990p;
                b.this.p(this.f340008a, fVar, nullPointerException, true);
            }
        }
    }

    /* compiled from: AbstractDraweeController.java */
    /* renamed from: com.facebook.drawee.controller.b$b, reason: collision with other inner class name */
    public static class C10531b<INFO> extends g<INFO> {
    }

    public b(com.facebook.drawee.components.a aVar, i iVar) {
        this.f339993a = DraweeEventTracker.f339951c ? new DraweeEventTracker() : DraweeEventTracker.f339950b;
        this.f339997e = new QW0.e<>();
        this.f340006n = true;
        this.f339994b = aVar;
        this.f339995c = iVar;
        j(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(e<? super INFO> eVar) {
        eVar.getClass();
        e<INFO> eVar2 = this.f339996d;
        if (eVar2 instanceof C10531b) {
            ((C10531b) eVar2).g(eVar);
            return;
        }
        if (eVar2 == null) {
            this.f339996d = eVar;
            return;
        }
        com.facebook.imagepipeline.systrace.b.a();
        C10531b c10531b = new C10531b();
        c10531b.g(eVar2);
        c10531b.g(eVar);
        com.facebook.imagepipeline.systrace.b.a();
        this.f339996d = c10531b;
    }

    public final void b(QW0.c<INFO> cVar) {
        QW0.e<INFO> eVar = this.f339997e;
        synchronized (eVar) {
            eVar.f13752b.add(cVar);
        }
    }

    public abstract Drawable c(T t12);

    @h
    public T d() {
        return null;
    }

    public final e<INFO> e() {
        e<INFO> eVar = this.f339996d;
        return eVar == null ? d.f340016b : eVar;
    }

    public abstract com.facebook.datasource.f<T> f();

    @Override // IW0.a
    public final void f2() {
        com.facebook.imagepipeline.systrace.b.a();
        if (C48986a.f440079a.a(2)) {
            C48986a.e(f339992r, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f340000h);
        }
        this.f339993a.a(DraweeEventTracker.Event.f339960i);
        this.f340001i = false;
        this.f339994b.c(this);
        com.facebook.imagepipeline.systrace.b.a();
    }

    public int g(@h T t12) {
        return System.identityHashCode(t12);
    }

    @Override // IW0.a
    public final boolean g2(MotionEvent motionEvent) {
        if (!C48986a.f440079a.a(2)) {
            return false;
        }
        C48986a.f(f339992r, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f340000h, motionEvent);
        return false;
    }

    @h
    public abstract YW0.f h(Object obj);

    @Override // IW0.a
    public final void h2() {
        com.facebook.imagepipeline.systrace.b.a();
        if (C48986a.f440079a.a(2)) {
            C48986a.f(f339992r, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f340000h, this.f340002j ? "request already submitted" : "request needs submit");
        }
        this.f339993a.a(DraweeEventTracker.Event.f339959h);
        this.f339998f.getClass();
        this.f339994b.a(this);
        this.f340001i = true;
        if (!this.f340002j) {
            com.facebook.imagepipeline.systrace.b.a();
            T tD2 = d();
            DraweeEventTracker draweeEventTracker = this.f339993a;
            if (tD2 != null) {
                com.facebook.imagepipeline.systrace.b.a();
                this.f340004l = null;
                this.f340002j = true;
                this.f340003k = false;
                draweeEventTracker.a(DraweeEventTracker.Event.f339971t);
                com.facebook.datasource.f<T> fVar = this.f340004l;
                YW0.f fVarH = h(tD2);
                e().a(this.f340000h);
                String str = this.f340000h;
                i();
                this.f339997e.d(str, n(fVar != null ? fVar.getExtras() : null, o(fVarH)));
                q(tD2, this.f340000h);
                r(this.f340000h, this.f340004l, tD2, 1.0f, true, true, true);
                com.facebook.imagepipeline.systrace.b.a();
                com.facebook.imagepipeline.systrace.b.a();
            } else {
                draweeEventTracker.a(DraweeEventTracker.Event.f339962k);
                this.f339998f.c(0.0f, true);
                this.f340002j = true;
                this.f340003k = false;
                com.facebook.datasource.f<T> fVarF = f();
                this.f340004l = fVarF;
                e().a(this.f340000h);
                String str2 = this.f340000h;
                i();
                this.f339997e.d(str2, n(fVarF == null ? null : fVarF.getExtras(), o(null)));
                if (C48986a.f440079a.a(2)) {
                    C48986a.f(f339992r, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f340000h, Integer.valueOf(System.identityHashCode(this.f340004l)));
                }
                this.f340004l.d(new a(this.f340000h, this.f340004l.b()), this.f339995c);
                com.facebook.imagepipeline.systrace.b.a();
            }
        }
        com.facebook.imagepipeline.systrace.b.a();
    }

    @h
    public Uri i() {
        return null;
    }

    @Override // IW0.a
    public void i2(@h IW0.b bVar) {
        if (C48986a.f440079a.a(2)) {
            C48986a.f(f339992r, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f340000h, bVar);
        }
        this.f339993a.a(bVar != null ? DraweeEventTracker.Event.f339953b : DraweeEventTracker.Event.f339954c);
        if (this.f340002j) {
            this.f339994b.a(this);
            release();
        }
        IW0.c cVar = this.f339998f;
        if (cVar != null) {
            cVar.e(null);
            this.f339998f = null;
        }
        if (bVar != null) {
            if (!(bVar instanceof IW0.c)) {
                throw new IllegalArgumentException();
            }
            IW0.c cVar2 = (IW0.c) bVar;
            this.f339998f = cVar2;
            cVar2.e(this.f339999g);
        }
    }

    public final synchronized void j(String str) {
        com.facebook.drawee.components.a aVar;
        try {
            com.facebook.imagepipeline.systrace.b.a();
            this.f339993a.a(DraweeEventTracker.Event.f339958g);
            if (!this.f340006n && (aVar = this.f339994b) != null) {
                aVar.a(this);
            }
            this.f340001i = false;
            t();
            e<INFO> eVar = this.f339996d;
            if (eVar instanceof C10531b) {
                C10531b c10531b = (C10531b) eVar;
                synchronized (c10531b) {
                    c10531b.f340017b.clear();
                }
            } else {
                this.f339996d = null;
            }
            IW0.c cVar = this.f339998f;
            if (cVar != null) {
                cVar.reset();
                this.f339998f.e(null);
                this.f339998f = null;
            }
            this.f339999g = null;
            if (C48986a.f440079a.a(2)) {
                C48986a.f(f339992r, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f340000h, str);
            }
            this.f340000h = str;
            com.facebook.imagepipeline.systrace.b.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // IW0.a
    @h
    public final IW0.c j2() {
        return this.f339998f;
    }

    public final boolean k(String str, com.facebook.datasource.f<T> fVar) {
        if (fVar == null && this.f340004l == null) {
            return true;
        }
        return str.equals(this.f340000h) && fVar == this.f340004l && this.f340002j;
    }

    public final void l(String str, Throwable th2) {
        if (C48986a.f440079a.a(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f340000h;
            C48987b c48987b = C48986a.f440079a;
            if (c48987b.a(2)) {
                c48987b.b(2, f339992r.getSimpleName(), String.format(null, "controller %x %s: %s: failure: %s", numValueOf, str2, str, th2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(Object obj, String str) {
        if (C48986a.f440079a.a(2)) {
            Object[] objArr = {Integer.valueOf(System.identityHashCode(this)), this.f340000h, str, obj != 0 ? obj.getClass().getSimpleName() : "<null>", Integer.valueOf(g(obj))};
            C48987b c48987b = C48986a.f440079a;
            if (c48987b.a(2)) {
                c48987b.b(2, f339992r.getSimpleName(), String.format(null, "controller %x %s: %s: image: %s %x", objArr));
            }
        }
    }

    public final c.a n(@h Map map, @h Map map2) {
        IW0.c cVar = this.f339998f;
        if (cVar instanceof GW0.a) {
            GW0.a aVar = (GW0.a) cVar;
            String.valueOf(!(aVar.k(2) instanceof r) ? null : aVar.l(2).f340122f);
            if (aVar.k(2) instanceof r) {
                PointF pointF = aVar.l(2).f340124h;
            }
        }
        IW0.c cVar2 = this.f339998f;
        Rect bounds = cVar2 != null ? cVar2.getBounds() : null;
        c.a aVar2 = new c.a();
        if (bounds != null) {
            bounds.width();
            bounds.height();
        }
        aVar2.f13750c = map;
        aVar2.f13751d = map2;
        aVar2.f13749b = f339991q;
        aVar2.f13748a = f339990p;
        return aVar2;
    }

    @h
    public abstract Map<String, Object> o(INFO info);

    public final void p(String str, com.facebook.datasource.f<T> fVar, Throwable th2, boolean z12) {
        com.facebook.imagepipeline.systrace.b.a();
        if (!k(str, fVar)) {
            l("ignore_old_datasource @ onFailure", th2);
            fVar.close();
            com.facebook.imagepipeline.systrace.b.a();
            return;
        }
        this.f339993a.a(z12 ? DraweeEventTracker.Event.f339965n : DraweeEventTracker.Event.f339966o);
        QW0.e<INFO> eVar = this.f339997e;
        if (z12) {
            l("final_failed @ onFailure", th2);
            this.f340004l = null;
            this.f340003k = true;
            IW0.c cVar = this.f339998f;
            if (cVar != null) {
                cVar.b();
            }
            c.a aVarN = n(fVar == null ? null : fVar.getExtras(), o(null));
            e().e(this.f340000h, th2);
            eVar.c(this.f340000h, th2, aVarN);
        } else {
            l("intermediate_failed @ onFailure", th2);
            e().b(this.f340000h, th2);
            eVar.getClass();
        }
        com.facebook.imagepipeline.systrace.b.a();
    }

    public final void r(String str, com.facebook.datasource.f<T> fVar, @h T t12, float f12, boolean z12, boolean z13, boolean z14) {
        try {
            com.facebook.imagepipeline.systrace.b.a();
            if (!k(str, fVar)) {
                m(t12, "ignore_old_datasource @ onNewResult");
                u(t12);
                fVar.close();
                com.facebook.imagepipeline.systrace.b.a();
                return;
            }
            this.f339993a.a(z12 ? DraweeEventTracker.Event.f339963l : DraweeEventTracker.Event.f339964m);
            try {
                Drawable drawableC = c(t12);
                T t13 = this.f340005m;
                Drawable drawable = this.f340007o;
                this.f340005m = t12;
                this.f340007o = drawableC;
                try {
                    if (z12) {
                        m(t12, "set_final_result @ onNewResult");
                        this.f340004l = null;
                        this.f339998f.d(drawableC, 1.0f, z13);
                        w(str, t12, fVar);
                    } else if (z14) {
                        m(t12, "set_temporary_result @ onNewResult");
                        this.f339998f.d(drawableC, 1.0f, z13);
                        w(str, t12, fVar);
                    } else {
                        m(t12, "set_intermediate_result @ onNewResult");
                        this.f339998f.d(drawableC, f12, z13);
                        e().d(h(t12), str);
                        this.f339997e.getClass();
                    }
                    if (drawable != null && drawable != drawableC) {
                        s(drawable);
                    }
                    if (t13 != null && t13 != t12) {
                        m(t13, "release_previous_result @ onNewResult");
                        u(t13);
                    }
                    com.facebook.imagepipeline.systrace.b.a();
                } catch (Throwable th2) {
                    if (drawable != null && drawable != drawableC) {
                        s(drawable);
                    }
                    if (t13 != null && t13 != t12) {
                        m(t13, "release_previous_result @ onNewResult");
                        u(t13);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                m(t12, "drawable_failed @ onNewResult");
                u(t12);
                p(str, fVar, e12, z12);
                com.facebook.imagepipeline.systrace.b.a();
            }
        } catch (Throwable th3) {
            com.facebook.imagepipeline.systrace.b.a();
            throw th3;
        }
    }

    @Override // com.facebook.drawee.components.a.InterfaceC10530a
    public final void release() {
        this.f339993a.a(DraweeEventTracker.Event.f339961j);
        IW0.c cVar = this.f339998f;
        if (cVar != null) {
            cVar.reset();
        }
        t();
    }

    public abstract void s(@h Drawable drawable);

    public final void t() {
        Map<String, Object> extras;
        boolean z12 = this.f340002j;
        this.f340002j = false;
        this.f340003k = false;
        com.facebook.datasource.f<T> fVar = this.f340004l;
        Map<String, Object> map = null;
        if (fVar != null) {
            extras = fVar.getExtras();
            this.f340004l.close();
            this.f340004l = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f340007o;
        if (drawable != null) {
            s(drawable);
        }
        this.f340007o = null;
        T t12 = this.f340005m;
        if (t12 != null) {
            Map<String, Object> mapO = o(h(t12));
            m(this.f340005m, "release");
            u(this.f340005m);
            this.f340005m = null;
            map = mapO;
        }
        if (z12) {
            e().c(this.f340000h);
            this.f339997e.a(this.f340000h, n(extras, map));
        }
    }

    public String toString() {
        n.b bVarB = n.b(this);
        bVarB.a("isAttached", this.f340001i);
        bVarB.a("isRequestSubmitted", this.f340002j);
        bVarB.a("hasFetchFailed", this.f340003k);
        bVarB.b(String.valueOf(g(this.f340005m)), "fetchedImage");
        bVarB.b(this.f339993a.f339952a.toString(), "events");
        return bVarB.toString();
    }

    public abstract void u(@h T t12);

    public final void v(e<? super INFO> eVar) {
        eVar.getClass();
        e<INFO> eVar2 = this.f339996d;
        if (!(eVar2 instanceof C10531b)) {
            if (eVar2 == eVar) {
                this.f339996d = null;
            }
        } else {
            C10531b c10531b = (C10531b) eVar2;
            synchronized (c10531b) {
                int iIndexOf = c10531b.f340017b.indexOf(eVar);
                if (iIndexOf != -1) {
                    c10531b.f340017b.set(iIndexOf, null);
                }
            }
        }
    }

    public final void w(String str, @h T t12, @h com.facebook.datasource.f<T> fVar) {
        YW0.f fVarH = h(t12);
        e<INFO> eVarE = e();
        Object obj = this.f340007o;
        eVarE.f(str, fVarH, obj instanceof Animatable ? (Animatable) obj : null);
        this.f339997e.b(str, fVarH, n(fVar != null ? fVar.getExtras() : null, o(fVarH)));
    }

    public void q(Object obj, String str) {
    }
}
