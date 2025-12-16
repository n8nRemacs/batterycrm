package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.C37798m;
import com.my.target.C37818w0;
import com.my.target.Y0;
import com.my.target.a1;
import com.my.target.ads.e;
import com.my.target.h1;
import com.my.target.p1;
import com.my.target.r;
import e11.AbstractC39895p;
import e11.C39856c;
import e11.C39865f;
import e11.J1;
import e11.k2;
import java.util.ArrayList;

/* renamed from: com.my.target.m0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37799m0 implements InterfaceC37776b {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final Y0 f364926a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final com.my.target.ads.e f364927b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final e11.G0 f364928c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final Context f364929d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final b f364930e = new b(this);

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final ArrayList<C39865f> f364931f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final C37803o0 f364932g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final C37798m f364933h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final p1.a f364934i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public a1 f364935j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public C37818w0.a f364936k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f364937l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public p1 f364938m;

    /* renamed from: com.my.target.m0$a */
    public class a implements C37798m.a {
        public a() {
        }

        @Override // com.my.target.C37798m.a
        public final void a(@j.N Context context) {
            C37799m0 c37799m0 = C37799m0.this;
            k2.a(c37799m0.f364929d, c37799m0.f364928c.f394702a.e("closedByUser"));
            C37818w0.a aVar = c37799m0.f364936k;
            if (aVar == null) {
                return;
            }
            aVar.f365217a.d();
        }
    }

    /* renamed from: com.my.target.m0$b */
    public static class b implements a1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C37799m0 f364940a;

        public b(@j.N C37799m0 c37799m0) {
            this.f364940a = c37799m0;
        }

        public final void a(@j.N WebView webView) {
            a1 a1Var;
            C37799m0 c37799m0 = this.f364940a;
            Y0 y02 = c37799m0.f364926a;
            if (y02 == null || (a1Var = c37799m0.f364935j) == null) {
                return;
            }
            y02.c(webView, new Y0.c(a1Var.getView().getAdChoicesView(), 3));
            y02.g();
        }

        public final void b(@j.N AbstractC39895p abstractC39895p) {
            C37799m0 c37799m0 = this.f364940a;
            C37803o0 c37803o0 = c37799m0.f364932g;
            c37803o0.f();
            c37803o0.f365051i = new C37797l0(c37799m0, abstractC39895p);
            boolean z12 = c37799m0.f364937l;
            com.my.target.ads.e eVar = c37799m0.f364927b;
            if (z12) {
                c37803o0.c(eVar);
            }
            k2.a(eVar.getContext(), abstractC39895p.f394702a.e("playbackStarted"));
        }

        public final void c(@j.N AbstractC39895p abstractC39895p, @j.P String str) {
            C37799m0 c37799m0 = this.f364940a;
            C37818w0.a aVar = c37799m0.f364936k;
            if (aVar != null) {
                aVar.b();
            }
            J1 j12 = new J1();
            boolean zIsEmpty = TextUtils.isEmpty(str);
            com.my.target.ads.e eVar = c37799m0.f364927b;
            if (!zIsEmpty) {
                j12.a(abstractC39895p, str, eVar.getContext());
            } else {
                j12.a(abstractC39895p, abstractC39895p.f394697C, eVar.getContext());
            }
        }
    }

    /* renamed from: com.my.target.m0$c */
    public static class c implements h1.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C37799m0 f364941a;

        public c(@j.N C37799m0 c37799m0) {
            this.f364941a = c37799m0;
        }
    }

    /* renamed from: com.my.target.m0$d */
    public static class d implements r.c {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C37799m0 f364942a;

        public d(@j.N C37799m0 c37799m0) {
            this.f364942a = c37799m0;
        }

        public final void a() {
            C37818w0.a aVar = this.f364942a.f364936k;
            if (aVar != null) {
                C37818w0 c37818w0 = aVar.f365217a;
                C37818w0.b bVar = c37818w0.f365207c;
                bVar.f365223f = false;
                if (bVar.a()) {
                    c37818w0.e();
                }
            }
        }

        public final void b() {
            C37818w0.a aVar = this.f364942a.f364936k;
            if (aVar != null) {
                C37818w0 c37818w0 = aVar.f365217a;
                C37818w0.b bVar = c37818w0.f365207c;
                if (!bVar.f365219b && bVar.f365218a && (bVar.f365224g || !bVar.f365222e)) {
                    c37818w0.c();
                }
                bVar.f365223f = true;
            }
        }
    }

    public C37799m0(@j.N com.my.target.ads.e eVar, @j.N e11.G0 g02, @j.N p1.a aVar) {
        this.f364927b = eVar;
        this.f364928c = g02;
        this.f364929d = eVar.getContext();
        this.f364934i = aVar;
        ArrayList<C39865f> arrayList = new ArrayList<>();
        this.f364931f = arrayList;
        arrayList.addAll(g02.f394702a.f());
        this.f364932g = new C37803o0(g02.f394703b, g02.f394702a, true);
        this.f364933h = new C37798m(g02.f394698D, null, null);
        this.f364926a = Y0.a(g02, 1, null, eVar.getContext());
    }

    @Override // com.my.target.InterfaceC37776b
    public final void a() {
        a1 a1Var = this.f364935j;
        if (a1Var != null) {
            a1Var.a();
        }
        this.f364937l = true;
        this.f364932g.c(this.f364927b);
    }

    @Override // com.my.target.InterfaceC37776b
    public final void b(@j.N e.a aVar) {
        a1 a1Var = this.f364935j;
        if (a1Var == null) {
            return;
        }
        C39856c view = a1Var.getView();
        view.f394555c = aVar.f364704c;
        view.f394556d = aVar.f364705d;
    }

    @Override // com.my.target.InterfaceC37776b
    public final void c(@j.P C37818w0.a aVar) {
        this.f364936k = aVar;
    }

    public final void d(@j.N C39856c c39856c) {
        a1 a1Var = this.f364935j;
        com.my.target.ads.e eVar = this.f364927b;
        if (a1Var != null) {
            e.a size = eVar.getSize();
            C39856c view = this.f364935j.getView();
            view.f394555c = size.f364704c;
            view.f394556d = size.f364705d;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c39856c.setLayoutParams(layoutParams);
        eVar.removeAllViews();
        eVar.addView(c39856c);
        if (this.f364928c.f394698D == null) {
            return;
        }
        this.f364933h.b(c39856c.getAdChoicesView(), new a());
    }

    @Override // com.my.target.InterfaceC37776b
    public final void destroy() {
        this.f364932g.f();
        this.f364933h.a();
        Y0 y02 = this.f364926a;
        if (y02 != null) {
            y02.f();
        }
        a1 a1Var = this.f364935j;
        if (a1Var != null) {
            a1Var.a(y02 != null ? 7000 : 0);
            this.f364935j = null;
        }
    }

    @Override // com.my.target.InterfaceC37776b
    public final void e() {
        a1 a1Var = this.f364935j;
        if (a1Var != null) {
            a1Var.a(this.f364926a == null);
        }
    }

    @Override // com.my.target.InterfaceC37776b
    public final void f() {
        this.f364937l = true;
        a1 a1Var = this.f364935j;
        if (a1Var != null) {
            a1Var.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.my.target.h1] */
    @Override // com.my.target.InterfaceC37776b
    public final void i() {
        O0 o02;
        r rVar;
        p1.a aVar = this.f364934i;
        p1 p1Var = new p1(aVar.f365074a, "myTarget", 4);
        p1Var.f365073e = aVar.f365075b;
        this.f364938m = p1Var;
        e11.G0 g02 = this.f364928c;
        boolean zEquals = "mraid".equals(g02.f394725x);
        b bVar = this.f364930e;
        Y0 y02 = this.f364926a;
        if (zEquals) {
            a1 a1Var = this.f364935j;
            if (a1Var instanceof r) {
                rVar = (r) a1Var;
            } else {
                if (a1Var != null) {
                    a1Var.e();
                    this.f364935j.a(y02 != null ? 7000 : 0);
                }
                rVar = new r(this.f364927b);
                rVar.f365092k = bVar;
                this.f364935j = rVar;
                d(rVar.f365083b);
            }
            rVar.f365093l = new d(this);
            rVar.c(g02);
            return;
        }
        a1 a1Var2 = this.f364935j;
        if (a1Var2 instanceof O0) {
            o02 = (h1) a1Var2;
        } else {
            if (a1Var2 != null) {
                a1Var2.e();
                this.f364935j.a(y02 != null ? 7000 : 0);
            }
            O0 o03 = new O0(this.f364929d);
            o03.f364517d = bVar;
            this.f364935j = o03;
            d(o03.f364516c);
            o02 = o03;
        }
        o02.b(new c(this));
        o02.c(g02);
    }

    @Override // com.my.target.InterfaceC37776b
    @j.P
    public final String c() {
        return "myTarget";
    }

    @Override // com.my.target.InterfaceC37776b
    public final void b() {
        a1 a1Var = this.f364935j;
        if (a1Var != null) {
            a1Var.b();
        }
        this.f364937l = false;
        this.f364932g.f();
    }

    @Override // com.my.target.InterfaceC37776b
    public final float d() {
        return 0.0f;
    }
}
