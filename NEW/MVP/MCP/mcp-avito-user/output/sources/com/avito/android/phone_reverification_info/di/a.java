package com.avito.android.phone_reverification_info.di;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.app.m;
import androidx.view.S0;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30065i;
import com.avito.android.phone_reverification_info.PhoneReverificationInfo;
import com.avito.android.phone_reverification_info.PhoneReverificationInfoActivity;
import com.avito.android.phone_reverification_info.di.b;
import com.avito.android.phone_reverification_info.l;
import com.avito.android.social.C35019k;
import com.avito.android.social.C35033z;
import com.avito.android.social.InterfaceC35017i;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.S;
import com.avito.android.social.V;
import com.avito.android.social.X;
import com.avito.android.social.Z;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import hD.C40806a;
import x70.C49782a;

/* compiled from: DaggerPhoneReverificationInfoComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPhoneReverificationInfoComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.phone_reverification_info.di.b.a
        public final com.avito.android.phone_reverification_info.di.b a(PhoneReverificationInfoActivity phoneReverificationInfoActivity, PhoneReverificationInfo phoneReverificationInfo, S0 s02, com.avito.android.phone_reverification_info.di.c cVar, r rVar) {
            return new c(cVar, phoneReverificationInfoActivity, phoneReverificationInfo, s02, rVar, null);
        }
    }

    /* compiled from: DaggerPhoneReverificationInfoComponent.java */
    public static final class c implements com.avito.android.phone_reverification_info.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.phone_reverification_info.di.c f216057a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC35863o4> f216058b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f216059c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.phone_reverification_info.mvi.e f216060d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Context> f216061e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35017i> f216062f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35029v> f216063g;

        /* renamed from: h, reason: collision with root package name */
        public final u<X> f216064h;

        /* renamed from: i, reason: collision with root package name */
        public final u<R0> f216065i;

        /* renamed from: j, reason: collision with root package name */
        public final u<S> f216066j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C40806a> f216067k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC27663a> f216068l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.phone_reverification_info.mvi.c f216069m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f216070n;

        /* renamed from: o, reason: collision with root package name */
        public final u<C28478k> f216071o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f216072p;

        /* renamed from: q, reason: collision with root package name */
        public final l f216073q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.phone_reverification_info.items.header.c f216074r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.phone_reverification_info.items.attention.c f216075s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.phone_reverification_info.items.text.c f216076t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f216077u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f216078v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f216079w;

        /* renamed from: x, reason: collision with root package name */
        public final u<Resources> f216080x;

        /* compiled from: DaggerPhoneReverificationInfoComponent.java */
        /* renamed from: com.avito.android.phone_reverification_info.di.a$c$a, reason: collision with other inner class name */
        public static final class C6481a implements u<InterfaceC27663a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.phone_reverification_info.di.c f216081a;

            public C6481a(com.avito.android.phone_reverification_info.di.c cVar) {
                this.f216081a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27663a interfaceC27663aW0 = this.f216081a.w0();
                t.c(interfaceC27663aW0);
                return interfaceC27663aW0;
            }
        }

        /* compiled from: DaggerPhoneReverificationInfoComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.phone_reverification_info.di.c f216082a;

            public b(com.avito.android.phone_reverification_info.di.c cVar) {
                this.f216082a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f216082a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPhoneReverificationInfoComponent.java */
        /* renamed from: com.avito.android.phone_reverification_info.di.a$c$c, reason: collision with other inner class name */
        public static final class C6482c implements u<C40806a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.phone_reverification_info.di.c f216083a;

            public C6482c(com.avito.android.phone_reverification_info.di.c cVar) {
                this.f216083a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f216083a.R();
            }
        }

        /* compiled from: DaggerPhoneReverificationInfoComponent.java */
        public static final class d implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.phone_reverification_info.di.c f216084a;

            public d(com.avito.android.phone_reverification_info.di.c cVar) {
                this.f216084a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f216084a.g();
            }
        }

        /* compiled from: DaggerPhoneReverificationInfoComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.phone_reverification_info.di.c f216085a;

            public e(com.avito.android.phone_reverification_info.di.c cVar) {
                this.f216085a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0I0 = this.f216085a.i0();
                t.c(r0I0);
                return r0I0;
            }
        }

        /* compiled from: DaggerPhoneReverificationInfoComponent.java */
        public static final class f implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.phone_reverification_info.di.c f216086a;

            public f(com.avito.android.phone_reverification_info.di.c cVar) {
                this.f216086a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f216086a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerPhoneReverificationInfoComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.phone_reverification_info.di.c f216087a;

            public g(com.avito.android.phone_reverification_info.di.c cVar) {
                this.f216087a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f216087a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.phone_reverification_info.di.c cVar, m mVar, PhoneReverificationInfo phoneReverificationInfo, S0 s02, r rVar, C6480a c6480a) {
            this.f216057a = cVar;
            dagger.internal.l lVarA = dagger.internal.l.a(phoneReverificationInfo);
            com.avito.android.phone_reverification_info.j jVar = new com.avito.android.phone_reverification_info.j(new f(cVar));
            b bVar = new b(cVar);
            this.f216059c = bVar;
            this.f216060d = new com.avito.android.phone_reverification_info.mvi.e(lVarA, jVar, bVar);
            d dVar = new d(cVar);
            this.f216061e = dVar;
            this.f216062f = B.a(new C35019k(dVar));
            this.f216063g = dagger.internal.g.d(new C35033z(this.f216061e));
            this.f216064h = B.a(Z.a());
            u<S> uVarA = B.a(new V(new e(cVar)));
            this.f216066j = uVarA;
            this.f216069m = new com.avito.android.phone_reverification_info.mvi.c(this.f216059c, new A70.b(uVarA, this.f216062f, this.f216063g, this.f216064h, new C6482c(cVar)), new C6481a(cVar));
            this.f216070n = new g(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new k(dagger.internal.l.a(rVar)));
            this.f216071o = uVarD;
            this.f216072p = dagger.internal.g.d(new C30065i(this.f216070n, uVarD));
            this.f216073q = new l(new com.avito.android.phone_reverification_info.mvi.h(this.f216060d, this.f216069m, com.avito.android.phone_reverification_info.mvi.j.a(), com.avito.android.phone_reverification_info.mvi.l.a(), this.f216072p));
            this.f216074r = new com.avito.android.phone_reverification_info.items.header.c(com.avito.android.phone_reverification_info.items.header.e.a());
            this.f216075s = new com.avito.android.phone_reverification_info.items.attention.c(com.avito.android.phone_reverification_info.items.attention.e.a());
            this.f216076t = new com.avito.android.phone_reverification_info.items.text.c(com.avito.android.phone_reverification_info.items.text.e.a());
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new com.avito.android.phone_reverification_info.di.e(this.f216074r, this.f216075s, this.f216076t, new com.avito.android.phone_reverification_info.items.text_point.c(com.avito.android.phone_reverification_info.items.text_point.e.a())));
            this.f216077u = uVarD2;
            u<com.avito.konveyor.adapter.h> uVarD3 = dagger.internal.g.d(new com.avito.android.phone_reverification_info.di.f(uVarD2));
            this.f216078v = uVarD3;
            this.f216079w = dagger.internal.g.d(new com.avito.android.phone_reverification_info.di.g(uVarD3, this.f216077u));
            this.f216080x = dagger.internal.g.d(new j(dagger.internal.l.a(mVar)));
        }

        @Override // com.avito.android.phone_reverification_info.di.b
        public final void a(PhoneReverificationInfoActivity phoneReverificationInfoActivity) {
            phoneReverificationInfoActivity.f216042m = this.f216073q;
            phoneReverificationInfoActivity.f216044o = this.f216072p.get();
            phoneReverificationInfoActivity.f216045p = this.f216057a.i1();
            phoneReverificationInfoActivity.f216046q = this.f216079w.get();
            phoneReverificationInfoActivity.f216047r = this.f216078v.get();
            phoneReverificationInfoActivity.f216048s = new C49782a(this.f216080x.get(), this.f216077u.get());
        }
    }

    public static b.a a() {
        return new b();
    }
}
