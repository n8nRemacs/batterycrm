package com.my.target;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.my.target.A;
import com.my.target.I0;
import com.my.target.InterfaceC37779c0;
import com.my.target.X;
import com.my.target.i1;
import com.my.target.s1;
import e11.AbstractC39895p;
import e11.C39852a1;
import e11.C39855b1;
import e11.C39877j;
import e11.C39878j0;
import e11.C39883l;
import e11.C39884l0;
import e11.C39897p1;
import e11.C39899q0;
import e11.C39913v0;
import e11.E1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class b4 implements i1, I0.a, s1.a, InterfaceC37779c0.a, A.a {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39884l0 f364729b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final E1 f364730c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final X.a f364731d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final N0 f364732e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final c f364733f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final C39852a1 f364734g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final Handler f364735h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f f364736i = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 19);

    /* renamed from: j, reason: collision with root package name */
    public final boolean f364737j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public final s1 f364738k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public final D f364739l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    public a f364740m;

    /* renamed from: n, reason: collision with root package name */
    public long f364741n;

    /* renamed from: o, reason: collision with root package name */
    public final long f364742o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f364743p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f364744q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f364745b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f364746c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f364747d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f364748e;

        static {
            a aVar = new a("DISABLED", 0);
            f364745b = aVar;
            a aVar2 = new a("RULED_BY_POST", 1);
            f364746c = aVar2;
            a aVar3 = new a("RULED_BY_VIDEO", 2);
            f364747d = aVar3;
            f364748e = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f364748e.clone();
        }
    }

    public interface b extends i1.a {
    }

    public static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final b4 f364749b;

        public c(@j.N b4 b4Var) {
            this.f364749b = b4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b4 b4Var = this.f364749b;
            a aVar = b4Var.f364740m;
            if (aVar != a.f364745b) {
                if (aVar == a.f364746c) {
                    b4Var.f364741n -= 200;
                }
                if (b4Var.f364741n > 0) {
                    b4Var.g();
                    return;
                }
            }
            b4Var.e();
        }
    }

    public b4(@j.N U u12, @j.N C39884l0 c39884l0, @j.N X.a aVar) {
        a aVar2;
        ArrayList arrayList;
        a aVar3 = a.f364745b;
        this.f364740m = aVar3;
        this.f364729b = c39884l0;
        E1 e12 = c39884l0.f394718q;
        this.f364730c = e12;
        this.f364731d = aVar;
        this.f364735h = new Handler(Looper.getMainLooper());
        Context context = u12.f364615c;
        C39852a1 c39852a1 = new C39852a1(context, null, R.attr.progressBarStyleHorizontal);
        this.f364734g = c39852a1;
        c39852a1.setColor(c39884l0.f394671L.f394737h);
        m7 m7Var = new m7(u12.f364616d, context, this);
        m7Var.setBanner(c39884l0);
        C39913v0<com.my.target.common.models.e> c39913v0 = c39884l0.f394673N;
        ArrayList arrayList2 = c39884l0.f394672M;
        if (!arrayList2.isEmpty()) {
            C c12 = new C(context);
            C37794k c37794k = new C37794k(c12, arrayList2, this);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new o1((C39883l) it.next(), c37794k));
            }
            c12.setAdapter(new C39878j0(arrayList3, u12));
            this.f364732e = u12.a(c39884l0, m7Var, c39852a1, c12, this);
        } else if (c39913v0 != null) {
            this.f364737j = e12.f394345n || e12.f394344m;
            U0 u02 = new U0(context);
            N0 n0A = u12.a(c39884l0, m7Var, c39852a1, u02, this);
            this.f364732e = n0A;
            u02.b(c39913v0.c(), c39913v0.b());
            this.f364738k = new s1(c39913v0, u02, this, u12, e11.P0.a(u02.getContext(), u12.f364617e));
            c39852a1.setMaxTime(c39913v0.f394724w);
            com.my.target.common.models.b bVar = c39913v0.f394858L;
            n0A.setBackgroundImage(bVar == null ? c39884l0.f394716o : bVar);
        } else {
            N0 n0A2 = u12.a(c39884l0, m7Var, c39852a1, null, this);
            this.f364732e = n0A2;
            n0A2.g();
            n0A2.setBackgroundImage(c39884l0.f394716o);
        }
        this.f364732e.setBanner(c39884l0);
        this.f364733f = new c(this);
        C39913v0<com.my.target.common.models.e> c39913v02 = c39884l0.f394673N;
        N0 n02 = this.f364732e;
        if (c39913v02 != null && c39913v02.f394863Q) {
            if (c39913v02.f394867U) {
                long j12 = (long) (c39913v02.f394872Z * 1000.0f);
                this.f364742o = j12;
                this.f364741n = j12;
                if (j12 > 0) {
                    aVar2 = a.f364747d;
                    this.f364740m = aVar2;
                    g();
                }
                e();
            }
            n02.f();
        } else if (c39884l0.f394743J) {
            long j13 = (long) (c39884l0.f394742I * 1000.0f);
            this.f364742o = j13;
            this.f364741n = j13;
            if (j13 > 0) {
                aVar2 = a.f364746c;
                this.f364740m = aVar2;
                g();
            }
            e();
        } else {
            this.f364740m = aVar3;
            n02.f();
        }
        N0 n03 = this.f364732e;
        n03.getClass();
        aVar.b(c39884l0, n03);
        C37788h c37788h = c39884l0.f394698D;
        if (c37788h == null || (arrayList = c37788h.f364853c) == null) {
            return;
        }
        D d12 = new D(arrayList, new C39877j());
        this.f364739l = d12;
        d12.f364362e = new com.my.target.ads.a(this, 9);
    }

    public final void a(@j.P AbstractC39895p abstractC39895p) {
        X.a aVar = this.f364731d;
        N0 n02 = this.f364732e;
        if (abstractC39895p != null) {
            n02.getClass();
            aVar.f(abstractC39895p, null, n02.getContext());
        } else {
            n02.getClass();
            aVar.f(this.f364729b, null, n02.getContext());
        }
    }

    public final void b(boolean z12) {
        C39897p1 c39897p1 = this.f364729b.f394671L;
        int i12 = c39897p1.f394736g;
        int iArgb = Color.argb((int) (c39897p1.f394739j * 255.0f), Color.red(i12), Color.green(i12), Color.blue(i12));
        if (z12) {
            i12 = iArgb;
        }
        this.f364732e.setPanelColor(i12);
    }

    public final void c() {
        N0 n02 = this.f364732e;
        n02.e(false);
        n02.b(true);
        n02.g();
        n02.d(false);
        n02.f364488b.setVisibility(8);
        this.f364734g.setVisible(false);
        e();
    }

    public final void d() {
        N0 n02 = this.f364732e;
        n02.e(true);
        n02.g();
        n02.b(false);
        n02.d(true);
        this.f364734g.setVisible(true);
    }

    @Override // com.my.target.i1
    public final void destroy() {
        s1 s1Var = this.f364738k;
        if (s1Var != null) {
            s1Var.d();
            s1Var.f365134d.destroy();
            C39855b1 c39855b1 = s1Var.f365135e;
            WeakReference<View> weakReference = c39855b1.f394538c;
            if (weakReference != null) {
                weakReference.clear();
            }
            c39855b1.f394537b.clear();
            c39855b1.f394536a.clear();
            c39855b1.f394538c = null;
        }
        i();
    }

    public final void e() {
        N0 n02 = this.f364732e;
        n02.f364490d.setVisibility(0);
        n02.f364507u.setVisibility(8);
        this.f364735h.removeCallbacks(this.f364733f);
        this.f364740m = a.f364745b;
    }

    public final void g() {
        Handler handler = this.f364735h;
        c cVar = this.f364733f;
        handler.removeCallbacks(cVar);
        handler.postDelayed(cVar, 200L);
        float f12 = this.f364742o;
        long j12 = this.f364741n;
        float f13 = (f12 - j12) / f12;
        int i12 = (int) ((j12 / 1000) + 1);
        C39899q0 c39899q0 = this.f364732e.f364507u;
        c39899q0.setDigit(i12);
        c39899q0.setProgress(f13);
    }

    @Override // com.my.target.i1
    @j.P
    public final View getCloseButton() {
        return this.f364732e.getCloseButton();
    }

    public final void i() {
        this.f364743p = false;
        this.f364735h.removeCallbacks(this.f364736i);
    }

    @Override // com.my.target.i1
    @j.N
    public final View j() {
        N0 n02 = this.f364732e;
        n02.getClass();
        return n02;
    }
}
