package com.avito.android.suggest_addresses.di;

import Y41.l;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.suggest_addresses.SuggestAddressesFragment;
import com.avito.android.suggest_addresses.di.c;
import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import com.avito.android.suggest_addresses.mvi.n;
import com.avito.android.suggest_addresses.mvi.q;
import com.avito.android.suggest_addresses.mvi.s;
import com.avito.android.util.R0;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import kotlin.G0;
import lA0.InterfaceC43610a;
import oA0.InterfaceC44610a;

/* compiled from: DaggerSuggestAddressesComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: DaggerSuggestAddressesComponent.java */
    /* renamed from: com.avito.android.suggest_addresses.di.b$b, reason: collision with other inner class name */
    public static final class C8837b implements c.a {
        public C8837b() {
        }

        @Override // com.avito.android.suggest_addresses.di.c.a
        public final com.avito.android.suggest_addresses.di.c a(InterfaceC30106l7 interfaceC30106l7, d dVar, C28478k c28478k, SuggestAddressesParams suggestAddressesParams, l<? super InterfaceC44610a, G0> lVar) {
            suggestAddressesParams.getClass();
            return new c(interfaceC30106l7, dVar, c28478k, suggestAddressesParams, lVar, null);
        }
    }

    /* compiled from: DaggerSuggestAddressesComponent.java */
    public static final class c implements com.avito.android.suggest_addresses.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final n f291802a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC43610a> f291803b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f291804c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.suggest_addresses.domain.a> f291805d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.suggest_addresses.i f291806e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f291807f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f291808g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f291809h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f291810i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f291811j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f291812k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f291813l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f291814m;

        /* renamed from: n, reason: collision with root package name */
        public final u<j> f291815n;

        /* compiled from: DaggerSuggestAddressesComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final d f291816a;

            public a(d dVar) {
                this.f291816a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f291816a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSuggestAddressesComponent.java */
        /* renamed from: com.avito.android.suggest_addresses.di.b$c$b, reason: collision with other inner class name */
        public static final class C8838b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f291817a;

            public C8838b(InterfaceC30106l7 interfaceC30106l7) {
                this.f291817a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f291817a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSuggestAddressesComponent.java */
        /* renamed from: com.avito.android.suggest_addresses.di.b$c$c, reason: collision with other inner class name */
        public static final class C8839c implements u<InterfaceC43610a> {

            /* renamed from: a, reason: collision with root package name */
            public final d f291818a;

            public C8839c(d dVar) {
                this.f291818a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC43610a interfaceC43610aLg = this.f291818a.Lg();
                t.c(interfaceC43610aLg);
                return interfaceC43610aLg;
            }
        }

        public c() {
            throw null;
        }

        public c(InterfaceC30106l7 interfaceC30106l7, d dVar, C28478k c28478k, SuggestAddressesParams suggestAddressesParams, l lVar, a aVar) {
            dagger.internal.l lVarA = dagger.internal.l.a(suggestAddressesParams);
            this.f291802a = new n(lVarA);
            u<com.avito.android.suggest_addresses.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.suggest_addresses.domain.c(lVarA, new C8839c(dVar), new a(dVar)));
            this.f291805d = uVarD;
            this.f291806e = new com.avito.android.suggest_addresses.i(new q(this.f291802a, new com.avito.android.suggest_addresses.mvi.l(uVarD), com.avito.android.suggest_addresses.mvi.u.a(), s.a()));
            this.f291807f = new C8838b(interfaceC30106l7);
            this.f291808g = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f291807f);
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f291809h = lVarA2;
            this.f291810i = dagger.internal.g.d(new com.avito.android.suggest_addresses.domain.adapter.addresses.b(new com.avito.android.suggest_addresses.domain.adapter.addresses.f(lVarA2)));
            this.f291811j = dagger.internal.g.d(new com.avito.android.suggest_addresses.domain.adapter.chips.b(new com.avito.android.suggest_addresses.domain.adapter.chips.g(this.f291809h)));
            this.f291812k = dagger.internal.g.d(new com.avito.android.suggest_addresses.domain.adapter.error.b(new com.avito.android.suggest_addresses.domain.adapter.error.f(this.f291809h)));
            A.b bVarA = A.a(3, 0);
            u<TV0.b<?, ?>> uVar = this.f291810i;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f291811j);
            list.add(this.f291812k);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new h(bVarA.b()));
            this.f291813l = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new g(uVarD2));
            this.f291814m = uVarD3;
            this.f291815n = dagger.internal.g.d(new i(uVarD3, this.f291813l));
        }

        @Override // com.avito.android.suggest_addresses.di.c
        public final void yd(SuggestAddressesFragment suggestAddressesFragment) {
            suggestAddressesFragment.f291784t0 = this.f291806e;
            suggestAddressesFragment.f291786v0 = this.f291808g.get();
            suggestAddressesFragment.f291787w0 = this.f291815n.get();
            suggestAddressesFragment.f291788x0 = this.f291814m.get();
        }
    }

    public static c.a a() {
        return new C8837b();
    }
}
