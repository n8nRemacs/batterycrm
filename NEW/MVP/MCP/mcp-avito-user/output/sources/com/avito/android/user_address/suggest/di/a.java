package com.avito.android.user_address.suggest.di;

import Y41.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_address.suggest.UserAddressSuggestFragment;
import com.avito.android.user_address.suggest.di.e;
import com.avito.android.user_address.suggest.h;
import com.avito.android.user_address.suggest.i;
import com.avito.android.user_address.suggest.mvi.o;
import com.avito.android.user_address.suggest.mvi.s;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;
import kotlin.G0;

/* compiled from: DaggerUserAddressSuggestComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerUserAddressSuggestComponent.java */
    public static final class b implements e.a {
        public b() {
        }

        @Override // com.avito.android.user_address.suggest.di.e.a
        public final e a(Resources resources, l<? super Integer, G0> lVar, com.avito.android.user_address.g gVar, String str, r rVar, f fVar, com.avito.android.user_address.di.b bVar) {
            str.getClass();
            bVar.getClass();
            return new c(fVar, bVar, resources, lVar, gVar, str, rVar, null);
        }
    }

    /* compiled from: DaggerUserAddressSuggestComponent.java */
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_address.di.b f308026a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.user_address.g f308027b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TG0.a> f308028c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.user_address.suggest.domain.a> f308029d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.user_address.a> f308030e;

        /* renamed from: f, reason: collision with root package name */
        public final o f308031f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.user_address.suggest.mvi.b f308032g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f308033h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f308034i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f308035j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f308036k;

        /* renamed from: l, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f308037l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.user_address.suggest.view.recycler.c> f308038m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f308039n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f308040o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f308041p;

        /* renamed from: q, reason: collision with root package name */
        public final u<j> f308042q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.user_address.suggest.e> f308043r;

        /* compiled from: DaggerUserAddressSuggestComponent.java */
        /* renamed from: com.avito.android.user_address.suggest.di.a$c$a, reason: collision with other inner class name */
        public static final class C9457a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final f f308044a;

            public C9457a(f fVar) {
                this.f308044a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f308044a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerUserAddressSuggestComponent.java */
        public static final class b implements u<com.avito.android.user_address.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.di.b f308045a;

            public b(com.avito.android.user_address.di.b bVar) {
                this.f308045a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.user_address.a aVarC = this.f308045a.c();
                t.c(aVarC);
                return aVarC;
            }
        }

        /* compiled from: DaggerUserAddressSuggestComponent.java */
        /* renamed from: com.avito.android.user_address.suggest.di.a$c$c, reason: collision with other inner class name */
        public static final class C9458c implements u<TG0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f308046a;

            public C9458c(f fVar) {
                this.f308046a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                TG0.a aVarF7 = this.f308046a.f7();
                t.c(aVarF7);
                return aVarF7;
            }
        }

        public c() {
            throw null;
        }

        public c(f fVar, com.avito.android.user_address.di.b bVar, Resources resources, l lVar, com.avito.android.user_address.g gVar, String str, r rVar, C9456a c9456a) {
            this.f308026a = bVar;
            this.f308027b = gVar;
            u<com.avito.android.user_address.suggest.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.user_address.suggest.domain.e(new C9458c(fVar)));
            this.f308029d = uVarD;
            this.f308031f = new o(uVarD, new b(bVar));
            this.f308032g = new com.avito.android.user_address.suggest.mvi.b(dagger.internal.l.a(str));
            this.f308033h = new C9457a(fVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new h(dagger.internal.l.a(rVar)));
            this.f308034i = uVarD2;
            this.f308035j = com.avito.android.advert.item.delivery_suggests.l.i(this.f308033h, uVarD2);
            this.f308036k = dagger.internal.l.a(new com.avito.android.user_address.suggest.j(new i(new com.avito.android.user_address.suggest.mvi.e(this.f308031f, s.a(), com.avito.android.user_address.suggest.mvi.u.a(), this.f308032g, this.f308035j))));
            this.f308037l = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.user_address.suggest.view.recycler.c> uVarD3 = dagger.internal.g.d(new com.avito.android.user_address.suggest.view.recycler.f(dagger.internal.l.a(lVar)));
            this.f308038m = uVarD3;
            this.f308039n = dagger.internal.g.d(new com.avito.android.user_address.suggest.view.recycler.b(uVarD3));
            A.b bVarA = A.a(1, 1);
            bVarA.f393938b.add(this.f308037l);
            bVarA.f393937a.add(this.f308039n);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f308040o = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f308041p = uVarH;
            this.f308042q = dagger.internal.g.d(new d(uVarH, this.f308040o));
            this.f308043r = dagger.internal.g.d(new com.avito.android.user_address.suggest.g(dagger.internal.l.a(resources)));
        }

        @Override // com.avito.android.user_address.suggest.di.e
        public final void a(UserAddressSuggestFragment userAddressSuggestFragment) {
            userAddressSuggestFragment.f308000n0 = this.f308027b;
            userAddressSuggestFragment.f308001o0 = (h.a) this.f308036k.f393949a;
            userAddressSuggestFragment.f308003q0 = this.f308042q.get();
            userAddressSuggestFragment.f308004r0 = this.f308041p.get();
            userAddressSuggestFragment.f308005s0 = this.f308043r.get();
            userAddressSuggestFragment.f308006t0 = this.f308035j.get();
        }
    }

    public static e.a a() {
        return new b();
    }
}
