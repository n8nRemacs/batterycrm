package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class f41 implements g6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39375w1 f385169a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private h6 f385170b;

    public class a implements InterfaceC39378x1 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
        public final void a() {
            if (f41.this.f385170b != null) {
                f41.this.f385170b.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
        public final void e() {
            if (f41.this.f385170b != null) {
                f41.this.f385170b.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
        public final void g() {
            if (f41.this.f385170b != null) {
                f41.this.f385170b.a();
            }
        }

        public /* synthetic */ a(f41 f41Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
        public final void b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
        public final void d() {
        }
    }

    public f41(@j.N Context context, @j.N p60 p60Var, @j.N v40 v40Var, @j.N h50 h50Var, @j.N l50 l50Var, @j.N C39304a2 c39304a2) {
        a aVar = new a(this, 0);
        C39375w1 c39375w1 = new C39375w1(context, p60Var, v40Var, h50Var, l50Var, c39304a2);
        this.f385169a = c39375w1;
        c39375w1.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void c() {
        this.f385169a.b();
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void f() {
        this.f385169a.c();
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void prepare() {
        this.f385169a.d();
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void resume() {
        this.f385169a.f();
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void start() {
        this.f385169a.g();
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void a(@j.P h6 h6Var) {
        this.f385170b = h6Var;
    }

    @Override // com.yandex.mobile.ads.impl.g6
    public final void a(@j.P re1 re1Var) {
        this.f385169a.a(re1Var);
    }
}
