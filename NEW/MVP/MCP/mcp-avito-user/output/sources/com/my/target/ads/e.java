package com.my.target.ads;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import com.my.target.C37810s0;
import com.my.target.C37818w0;
import com.my.target.InterfaceC37776b;
import com.my.target.p1;
import e11.C39856c;
import e11.C39901r0;
import e11.C39924z;
import e11.D1;
import j.N;
import j.P;
import j.X;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class e extends FrameLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f364690j = 0;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final C39901r0 f364691b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final AtomicBoolean f364692c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public b f364693d;

    /* renamed from: e, reason: collision with root package name */
    @P
    @X
    public c f364694e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public C37818w0 f364695f;

    /* renamed from: g, reason: collision with root package name */
    @N
    public a f364696g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f364697h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f364698i;

    public interface b {
        void a(@N String str);

        void b();

        void c(@N e eVar);

        void onClick();
    }

    @X
    public interface c {
        void a();
    }

    public e(@N Context context) {
        super(context, null, 0);
        this.f364692c = new AtomicBoolean();
        this.f364697h = false;
        this.f364691b = new C39901r0(0, "");
        this.f364696g = a.b(context);
    }

    public final void a(@P D1 d12, @P String str, @N p1.a aVar) {
        b bVar = this.f364693d;
        if (bVar == null) {
            return;
        }
        if (d12 == null) {
            if (str == null) {
                str = "no ad";
            }
            bVar.a(str);
            return;
        }
        C37818w0 c37818w0 = this.f364695f;
        if (c37818w0 != null) {
            C37818w0.b bVar2 = c37818w0.f365207c;
            if (bVar2.f365218a) {
                c37818w0.g();
            }
            bVar2.f365223f = false;
            bVar2.f365220c = false;
            c37818w0.d();
        }
        C39901r0 c39901r0 = this.f364691b;
        C37818w0 c37818w02 = new C37818w0(this, c39901r0, aVar);
        this.f364695f = c37818w02;
        c37818w02.a(this.f364698i);
        this.f364695f.b(d12);
        c39901r0.f394770g = null;
    }

    public final void b() {
        if (this.f364692c.compareAndSet(false, true)) {
            C39901r0 c39901r0 = this.f364691b;
            p1.a aVar = new p1.a(c39901r0.f394772i);
            p1 p1VarA = aVar.a();
            c();
            C37810s0 c37810s0 = new C37810s0(c39901r0, aVar, null);
            c37810s0.f364679d = new d(this, aVar, 1);
            c37810s0.a(p1VarA, getContext());
        }
    }

    public final void c() {
        C39901r0 c39901r0;
        String str;
        a aVar = this.f364696g;
        if (aVar == a.f364699f) {
            c39901r0 = this.f364691b;
            str = "standard_320x50";
        } else if (aVar == a.f364700g) {
            c39901r0 = this.f364691b;
            str = "standard_300x250";
        } else if (aVar == a.f364701h) {
            c39901r0 = this.f364691b;
            str = "standard_728x90";
        } else {
            c39901r0 = this.f364691b;
            str = "standard";
        }
        c39901r0.f394773j = str;
    }

    @P
    public String getAdSource() {
        InterfaceC37776b interfaceC37776b;
        C37818w0 c37818w0 = this.f364695f;
        if (c37818w0 == null || (interfaceC37776b = c37818w0.f365210f) == null) {
            return null;
        }
        return interfaceC37776b.c();
    }

    public float getAdSourcePriority() {
        InterfaceC37776b interfaceC37776b;
        C37818w0 c37818w0 = this.f364695f;
        if (c37818w0 == null || (interfaceC37776b = c37818w0.f365210f) == null) {
            return 0.0f;
        }
        return interfaceC37776b.d();
    }

    @N
    public f11.c getCustomParams() {
        return this.f364691b.f394764a;
    }

    @P
    public b getListener() {
        return this.f364693d;
    }

    @P
    @X
    public c getRenderCrashListener() {
        return this.f364694e;
    }

    @N
    public a getSize() {
        return this.f364696g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f364698i = true;
        C37818w0 c37818w0 = this.f364695f;
        if (c37818w0 != null) {
            c37818w0.a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f364698i = false;
        C37818w0 c37818w0 = this.f364695f;
        if (c37818w0 != null) {
            c37818w0.a(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        InterfaceC37776b interfaceC37776b;
        if (!this.f364697h) {
            Context context = getContext();
            Point pointK = C39924z.k(context);
            int i14 = pointK.x;
            float f12 = pointK.y;
            if (i14 != this.f364696g.f364702a || r3.f364703b > f12 * 0.15f) {
                a aVarB = a.b(context);
                this.f364696g = aVarB;
                C37818w0 c37818w0 = this.f364695f;
                if (c37818w0 != null && (interfaceC37776b = c37818w0.f365210f) != null) {
                    interfaceC37776b.b(aVarB);
                }
            }
        }
        super.onMeasure(i12, i13);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z12) {
        super.onWindowFocusChanged(z12);
        C37818w0 c37818w0 = this.f364695f;
        if (c37818w0 != null) {
            C37818w0.b bVar = c37818w0.f365207c;
            bVar.f365222e = z12;
            if (bVar.b()) {
                c37818w0.f();
                return;
            }
            if (bVar.a()) {
                c37818w0.e();
                return;
            }
            if (bVar.f365219b || !bVar.f365218a) {
                return;
            }
            if (bVar.f365224g || !bVar.f365222e) {
                c37818w0.c();
            }
        }
    }

    public void setAdSize(@N a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f364697h && a.a(this.f364696g, aVar)) {
            return;
        }
        this.f364697h = true;
        if (this.f364692c.get()) {
            a aVar2 = this.f364696g;
            a aVar3 = a.f364700g;
            if (a.a(aVar2, aVar3) || a.a(aVar, aVar3)) {
                return;
            }
        }
        C37818w0 c37818w0 = this.f364695f;
        if (c37818w0 != null) {
            InterfaceC37776b interfaceC37776b = c37818w0.f365210f;
            if (interfaceC37776b != null) {
                interfaceC37776b.b(aVar);
            }
            View childAt = getChildAt(0);
            if (childAt instanceof C39856c) {
                childAt.requestLayout();
            }
        }
        this.f364696g = aVar;
        c();
    }

    public void setListener(@P b bVar) {
        this.f364693d = bVar;
    }

    public void setMediationEnabled(boolean z12) {
        this.f364691b.f394767d = z12;
    }

    public void setRefreshAd(boolean z12) {
        this.f364691b.f394768e = z12;
    }

    @X
    public void setRenderCrashListener(@P c cVar) {
        this.f364694e = cVar;
    }

    public void setSlotId(int i12) {
        if (this.f364692c.get()) {
            return;
        }
        this.f364691b.f394772i = i12;
    }

    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final a f364699f = new a(320, 50, 0);

        /* renamed from: g, reason: collision with root package name */
        public static final a f364700g = new a(300, 250, 1);

        /* renamed from: h, reason: collision with root package name */
        public static final a f364701h = new a(728, 90, 2);

        /* renamed from: a, reason: collision with root package name */
        public final int f364702a;

        /* renamed from: b, reason: collision with root package name */
        public final int f364703b;

        /* renamed from: c, reason: collision with root package name */
        public final int f364704c;

        /* renamed from: d, reason: collision with root package name */
        public final int f364705d;

        /* renamed from: e, reason: collision with root package name */
        public final int f364706e;

        public a(int i12, int i13, int i14) {
            this.f364702a = i12;
            this.f364703b = i13;
            int i15 = C39924z.f394913b;
            float f12 = C39924z.a.f394915a;
            this.f364704c = (int) (i12 * f12);
            this.f364705d = (int) (i13 * f12);
            this.f364706e = i14;
        }

        public static boolean a(a aVar, a aVar2) {
            return aVar.f364703b == aVar2.f364703b && aVar.f364702a == aVar2.f364702a && aVar.f364706e == aVar2.f364706e;
        }

        @N
        public static a b(@N Context context) {
            float f12 = C39924z.k(context).x;
            float f13 = r5.y * 0.15f;
            float f14 = C39924z.a.f394915a;
            float fMax = Math.max(Math.min(f12 > 524.0f ? (f12 / 728.0f) * 90.0f : (f12 / 320.0f) * 50.0f, f13), 50.0f * f14);
            return new a((int) (f12 / f14), (int) (fMax / f14), (int) f12, (int) fMax);
        }

        public a(int i12, int i13, int i14, int i15) {
            this.f364702a = i12;
            this.f364703b = i13;
            this.f364704c = i14;
            this.f364705d = i15;
            this.f364706e = 3;
        }
    }
}
