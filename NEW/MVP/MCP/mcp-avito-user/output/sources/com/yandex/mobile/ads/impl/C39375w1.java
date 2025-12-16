package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.w1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39375w1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final p60 f391247a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39304a2 f391248b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final h50 f391249c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final e3 f391250d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C39316d2 f391251e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private InterfaceC39378x1 f391252f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f391253g;

    /* renamed from: com.yandex.mobile.ads.impl.w1$a */
    public class a implements g3 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.g3
        public final void a() {
            EnumC39384z1 enumC39384z1A = C39375w1.this.f391248b.a(C39375w1.this.f391247a);
            if (enumC39384z1A.equals(EnumC39384z1.f392146h) || enumC39384z1A.equals(EnumC39384z1.f392145g)) {
                C39375w1.this.f391248b.a(C39375w1.this.f391247a, EnumC39384z1.f392142d);
                C39375w1.this.f391251e.a();
                if (C39375w1.this.f391252f != null) {
                    C39375w1.this.f391252f.e();
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.g3
        public final void b() {
            C39375w1.this.f391248b.a(C39375w1.this.f391247a, EnumC39384z1.f392144f);
            C39375w1.this.f391251e.b();
            if (C39375w1.this.f391252f != null) {
                C39375w1.this.f391252f.g();
            }
        }

        @Override // com.yandex.mobile.ads.impl.g3
        public final void c() {
            C39375w1.this.f391248b.a(C39375w1.this.f391247a, EnumC39384z1.f392144f);
            C39375w1.this.f391251e.b();
            if (C39375w1.this.f391252f != null) {
                C39375w1.this.f391252f.g();
            }
        }

        public /* synthetic */ a(C39375w1 c39375w1, int i12) {
            this();
        }
    }

    public C39375w1(@j.N Context context, @j.N p60 p60Var, @j.N v40 v40Var, @j.N h50 h50Var, @j.N l50 l50Var, @j.N C39304a2 c39304a2) {
        this.f391247a = p60Var;
        this.f391248b = c39304a2;
        this.f391249c = h50Var;
        this.f391250d = new e3(context, p60Var, v40Var, h50Var, l50Var, new a(this, 0));
        this.f391251e = new C39316d2(context, p60Var.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            com.yandex.mobile.ads.impl.a2 r0 = r3.f391248b
            com.yandex.mobile.ads.impl.p60 r1 = r3.f391247a
            com.yandex.mobile.ads.impl.z1 r0 = r0.a(r1)
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L2b
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 5
            if (r0 == r1) goto L1c
            r1 = 6
            if (r0 == r1) goto L2b
            r1 = 7
            if (r0 == r1) goto L2b
            goto L3e
        L1c:
            com.yandex.mobile.ads.impl.a2 r0 = r3.f391248b
            com.yandex.mobile.ads.impl.p60 r1 = r3.f391247a
            com.yandex.mobile.ads.impl.z1 r2 = com.yandex.mobile.ads.impl.EnumC39384z1.f392139a
            r0.a(r1, r2)
            com.yandex.mobile.ads.impl.e3 r0 = r3.f391250d
            r0.a()
            goto L3e
        L2b:
            com.yandex.mobile.ads.impl.a2 r0 = r3.f391248b
            com.yandex.mobile.ads.impl.p60 r1 = r3.f391247a
            com.yandex.mobile.ads.impl.z1 r2 = com.yandex.mobile.ads.impl.EnumC39384z1.f392139a
            r0.a(r1, r2)
            com.yandex.mobile.ads.impl.e3 r0 = r3.f391250d
            r0.g()
            com.yandex.mobile.ads.impl.e3 r0 = r3.f391250d
            r0.a()
        L3e:
            r0 = 0
            r3.f391253g = r0
            com.yandex.mobile.ads.impl.h50 r0 = r3.f391249c
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C39375w1.e():void");
    }

    public final void a(@j.P InterfaceC39378x1 interfaceC39378x1) {
        this.f391252f = interfaceC39378x1;
    }

    public final void b() {
        int iOrdinal = this.f391248b.a(this.f391247a).ordinal();
        if (iOrdinal == 1) {
            this.f391248b.a(this.f391247a, EnumC39384z1.f392139a);
            this.f391250d.g();
            this.f391250d.a();
        } else if (iOrdinal == 2) {
            this.f391253g = false;
            this.f391248b.a(this.f391247a, EnumC39384z1.f392139a);
            this.f391250d.g();
            this.f391250d.a();
        } else if (iOrdinal == 5) {
            this.f391248b.a(this.f391247a, EnumC39384z1.f392139a);
            this.f391250d.a();
        } else if (iOrdinal == 6 || iOrdinal == 7) {
            this.f391253g = true;
            this.f391248b.a(this.f391247a, EnumC39384z1.f392139a);
            this.f391250d.g();
            this.f391250d.a();
        }
        this.f391249c.a();
    }

    public final void c() {
        int iOrdinal = this.f391248b.a(this.f391247a).ordinal();
        if (iOrdinal == 1) {
            this.f391248b.a(this.f391247a, EnumC39384z1.f392139a);
            this.f391250d.g();
        } else if (iOrdinal == 6 || iOrdinal == 7) {
            this.f391248b.a(this.f391247a, EnumC39384z1.f392145g);
            this.f391250d.c();
        }
        this.f391249c.a();
    }

    public final void d() {
        if (this.f391248b.a(this.f391247a).equals(EnumC39384z1.f392139a)) {
            this.f391248b.a(this.f391247a, EnumC39384z1.f392140b);
            this.f391250d.e();
        }
    }

    public final void f() {
        int iOrdinal = this.f391248b.a(this.f391247a).ordinal();
        if (iOrdinal == 0) {
            if (this.f391248b.a(this.f391247a).equals(EnumC39384z1.f392139a)) {
                this.f391248b.a(this.f391247a, EnumC39384z1.f392140b);
                this.f391250d.e();
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 6 || iOrdinal == 7) {
                this.f391250d.f();
                return;
            }
            return;
        }
        if (this.f391248b.a(this.f391247a).equals(EnumC39384z1.f392141c)) {
            InterfaceC39378x1 interfaceC39378x1 = this.f391252f;
            if (interfaceC39378x1 != null) {
                interfaceC39378x1.d();
            }
            this.f391250d.d();
        }
    }

    public final void g() {
        if (this.f391248b.a(this.f391247a).equals(EnumC39384z1.f392141c)) {
            InterfaceC39378x1 interfaceC39378x1 = this.f391252f;
            if (interfaceC39378x1 != null) {
                interfaceC39378x1.d();
            }
            this.f391250d.d();
        }
    }

    public final void a(@j.P qe1 qe1Var) {
        this.f391250d.a(qe1Var);
    }

    public final void a() {
        int iOrdinal = this.f391248b.a(this.f391247a).ordinal();
        if (iOrdinal == 6 || iOrdinal == 7) {
            this.f391248b.a(this.f391247a, EnumC39384z1.f392145g);
            this.f391250d.c();
        }
    }

    public static void e(C39375w1 c39375w1) {
        if (c39375w1.f391248b.a(c39375w1.f391247a).equals(EnumC39384z1.f392141c)) {
            InterfaceC39378x1 interfaceC39378x1 = c39375w1.f391252f;
            if (interfaceC39378x1 != null) {
                interfaceC39378x1.d();
            }
            c39375w1.f391250d.d();
        }
    }
}
