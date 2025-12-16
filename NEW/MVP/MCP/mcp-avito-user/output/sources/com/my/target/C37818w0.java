package com.my.target;

import android.app.Activity;
import com.my.target.InterfaceC37776b;
import com.my.target.ads.e;
import com.my.target.p1;
import e11.C39901r0;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.w0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37818w0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final com.my.target.ads.e f365205a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39901r0 f365206b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final b f365207c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final c f365208d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final p1.a f365209e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public InterfaceC37776b f365210f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f365211g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f365212h;

    /* renamed from: i, reason: collision with root package name */
    public int f365213i;

    /* renamed from: j, reason: collision with root package name */
    public long f365214j;

    /* renamed from: k, reason: collision with root package name */
    public long f365215k;

    /* renamed from: l, reason: collision with root package name */
    @j.X
    public int f365216l;

    /* renamed from: com.my.target.w0$a */
    public static class a implements InterfaceC37776b.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C37818w0 f365217a;

        public a(@j.N C37818w0 c37818w0) {
            this.f365217a = c37818w0;
        }

        public final void a() {
            e.b listener = this.f365217a.f365205a.getListener();
            if (listener != null) {
                listener.b();
            }
        }

        public final void b() {
            e.b listener = this.f365217a.f365205a.getListener();
            if (listener != null) {
                listener.onClick();
            }
        }

        public final void c() {
            C37818w0 c37818w0 = this.f365217a;
            boolean z12 = c37818w0.f365211g;
            b bVar = c37818w0.f365207c;
            if (z12) {
                bVar.f365220c = true;
                com.my.target.ads.e eVar = c37818w0.f365205a;
                e.b listener = eVar.getListener();
                if (listener != null) {
                    listener.c(eVar);
                }
                c37818w0.f365211g = false;
            }
            if (bVar.b()) {
                c37818w0.f();
            }
        }

        public final void d(@j.N String str) {
            C37818w0 c37818w0 = this.f365217a;
            boolean z12 = c37818w0.f365211g;
            com.my.target.ads.e eVar = c37818w0.f365205a;
            if (z12) {
                c37818w0.f365207c.f365220c = false;
                e.b listener = eVar.getListener();
                if (listener != null) {
                    listener.a(str);
                }
                c37818w0.f365211g = false;
                return;
            }
            c37818w0.d();
            if (!c37818w0.f365212h || c37818w0.f365213i <= 0) {
                return;
            }
            c cVar = c37818w0.f365208d;
            eVar.removeCallbacks(cVar);
            eVar.postDelayed(cVar, c37818w0.f365213i);
        }
    }

    /* renamed from: com.my.target.w0$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f365218a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f365219b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f365220c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f365221d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f365222e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f365223f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f365224g;

        public final boolean a() {
            return this.f365220c && this.f365218a && (this.f365224g || this.f365222e) && !this.f365223f && this.f365219b;
        }

        public final boolean b() {
            return this.f365221d && this.f365220c && (this.f365224g || this.f365222e) && !this.f365218a;
        }
    }

    /* renamed from: com.my.target.w0$c */
    public static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final WeakReference<C37818w0> f365225b;

        public c(@j.N C37818w0 c37818w0) {
            this.f365225b = new WeakReference<>(c37818w0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            C37818w0 c37818w0 = this.f365225b.get();
            if (c37818w0 != null) {
                p1.a aVar = c37818w0.f365209e;
                p1 p1VarA = aVar.a();
                C37810s0 c37810s0 = new C37810s0(c37818w0.f365206b, aVar, null);
                c37810s0.f364679d = new com.my.target.ads.a(c37818w0, 14);
                c37810s0.a(p1VarA, c37818w0.f365205a.getContext());
            }
        }
    }

    public C37818w0(@j.N com.my.target.ads.e eVar, @j.N C39901r0 c39901r0, @j.N p1.a aVar) {
        b bVar = new b();
        this.f365207c = bVar;
        this.f365211g = true;
        this.f365213i = -1;
        this.f365216l = 0;
        this.f365205a = eVar;
        this.f365206b = c39901r0;
        this.f365209e = aVar;
        this.f365208d = new c(this);
        if (eVar.getContext() instanceof Activity) {
            bVar.f365224g = false;
        } else {
            bVar.f365224g = true;
        }
    }

    public final void a(boolean z12) {
        b bVar = this.f365207c;
        bVar.f365221d = z12;
        bVar.f365222e = this.f365205a.hasWindowFocus();
        if (bVar.b()) {
            f();
        } else {
            if (z12 || !bVar.f365218a) {
                return;
            }
            g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@j.N e11.D1 r8) {
        /*
            r7 = this;
            com.my.target.w0$b r0 = r7.f365207c
            boolean r0 = r0.f365218a
            if (r0 == 0) goto L9
            r7.g()
        L9:
            r7.d()
            boolean r0 = r8.f394309c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L24
            e11.r0 r0 = r7.f365206b
            boolean r3 = r0.f394768e
            if (r3 == 0) goto L24
            java.lang.String r0 = r0.f394773j
            java.lang.String r3 = "standard_300x250"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L24
            r0 = r2
            goto L25
        L24:
            r0 = r1
        L25:
            r7.f365212h = r0
            e11.G0 r3 = r8.f394308b
            if (r3 != 0) goto L58
            e11.X0 r8 = r8.f394557a
            if (r8 != 0) goto L3d
            com.my.target.ads.e r8 = r7.f365205a
            com.my.target.ads.e$b r8 = r8.getListener()
            if (r8 == 0) goto L69
            java.lang.String r0 = "no ad"
            r8.a(r0)
            goto L69
        L3d:
            com.my.target.ads.e r3 = r7.f365205a
            e11.r0 r4 = r7.f365206b
            com.my.target.p1$a r5 = r7.f365209e
            com.my.target.n1 r6 = new com.my.target.n1
            r6.<init>(r3, r8, r4, r5)
            r7.f365210f = r6
            if (r0 == 0) goto L69
            int r8 = r8.f394505b
            int r8 = r8 * 1000
            r7.f365213i = r8
            if (r8 <= 0) goto L55
            r1 = r2
        L55:
            r7.f365212h = r1
            goto L69
        L58:
            com.my.target.ads.e r8 = r7.f365205a
            com.my.target.p1$a r0 = r7.f365209e
            com.my.target.m0 r1 = new com.my.target.m0
            r1.<init>(r8, r3, r0)
            r7.f365210f = r1
            int r8 = r3.f394358J
            int r8 = r8 * 1000
            r7.f365213i = r8
        L69:
            com.my.target.b r8 = r7.f365210f
            if (r8 != 0) goto L6e
            return
        L6e:
            com.my.target.w0$a r0 = new com.my.target.w0$a
            r0.<init>(r7)
            r8.c(r0)
            long r0 = java.lang.System.currentTimeMillis()
            int r8 = r7.f365213i
            long r2 = (long) r8
            long r0 = r0 + r2
            r7.f365214j = r0
            r0 = 0
            r7.f365215k = r0
            boolean r8 = r7.f365212h
            if (r8 == 0) goto L90
            com.my.target.w0$b r8 = r7.f365207c
            boolean r8 = r8.f365219b
            if (r8 == 0) goto L90
            r7.f365215k = r2
        L90:
            com.my.target.b r8 = r7.f365210f
            r8.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.C37818w0.b(e11.D1):void");
    }

    public final void c() {
        this.f365205a.removeCallbacks(this.f365208d);
        if (this.f365212h) {
            this.f365215k = this.f365214j - System.currentTimeMillis();
        }
        InterfaceC37776b interfaceC37776b = this.f365210f;
        if (interfaceC37776b != null) {
            interfaceC37776b.b();
        }
        this.f365207c.f365219b = true;
    }

    public final void d() {
        InterfaceC37776b interfaceC37776b = this.f365210f;
        if (interfaceC37776b != null) {
            interfaceC37776b.destroy();
            this.f365210f.c(null);
            this.f365210f = null;
        }
        this.f365205a.removeAllViews();
    }

    public final void e() {
        if (this.f365215k > 0 && this.f365212h) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j12 = this.f365215k;
            this.f365214j = jCurrentTimeMillis + j12;
            this.f365205a.postDelayed(this.f365208d, j12);
            this.f365215k = 0L;
        }
        InterfaceC37776b interfaceC37776b = this.f365210f;
        if (interfaceC37776b != null) {
            interfaceC37776b.a();
        }
        this.f365207c.f365219b = false;
    }

    public final void f() {
        int i12 = this.f365213i;
        if (i12 > 0 && this.f365212h) {
            this.f365205a.postDelayed(this.f365208d, i12);
        }
        InterfaceC37776b interfaceC37776b = this.f365210f;
        if (interfaceC37776b != null) {
            interfaceC37776b.f();
        }
        b bVar = this.f365207c;
        bVar.f365218a = true;
        bVar.f365219b = false;
    }

    public final void g() {
        b bVar = this.f365207c;
        bVar.f365218a = false;
        bVar.f365219b = false;
        this.f365205a.removeCallbacks(this.f365208d);
        InterfaceC37776b interfaceC37776b = this.f365210f;
        if (interfaceC37776b != null) {
            interfaceC37776b.e();
        }
    }
}
