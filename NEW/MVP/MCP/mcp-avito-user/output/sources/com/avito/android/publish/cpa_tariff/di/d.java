package com.avito.android.publish.cpa_tariff.di;

import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.cpa_tariff.CpaTariffActivity;
import com.avito.android.publish.cpa_tariff.di.a;
import com.avito.android.publish.cpa_tariff.mvi.h;
import com.avito.android.publish.cpa_tariff.mvi.l;
import com.avito.android.remote.H0;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import dl0.InterfaceC39749a;

/* compiled from: DaggerCpaTariffComponent.java */
@e
/* loaded from: classes16.dex */
public final class d {

    /* compiled from: DaggerCpaTariffComponent.java */
    public static final class b implements com.avito.android.publish.cpa_tariff.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<R0> f232439a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC39749a> f232440b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC33535v> f232441c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.publish.cpa_tariff.mvi.domain.e> f232442d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.publish.cpa_tariff.mvi.c f232443e;

        /* renamed from: f, reason: collision with root package name */
        public final u<H0> f232444f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.publish.cpa_tariff.mvi.domain.a> f232445g;

        /* renamed from: h, reason: collision with root package name */
        public final l f232446h;

        /* compiled from: DaggerCpaTariffComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.cpa_tariff.di.b f232447a;

            public a(com.avito.android.publish.cpa_tariff.di.b bVar) {
                this.f232447a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f232447a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCpaTariffComponent.java */
        /* renamed from: com.avito.android.publish.cpa_tariff.di.d$b$b, reason: collision with other inner class name */
        public static final class C7068b implements u<InterfaceC39749a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.cpa_tariff.di.b f232448a;

            public C7068b(com.avito.android.publish.cpa_tariff.di.b bVar) {
                this.f232448a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39749a interfaceC39749aRa = this.f232448a.Ra();
                t.c(interfaceC39749aRa);
                return interfaceC39749aRa;
            }
        }

        /* compiled from: DaggerCpaTariffComponent.java */
        public static final class c implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.cpa_tariff.di.b f232449a;

            public c(com.avito.android.publish.cpa_tariff.di.b bVar) {
                this.f232449a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f232449a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerCpaTariffComponent.java */
        /* renamed from: com.avito.android.publish.cpa_tariff.di.d$b$d, reason: collision with other inner class name */
        public static final class C7069d implements u<InterfaceC33535v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.cpa_tariff.di.b f232450a;

            public C7069d(com.avito.android.publish.cpa_tariff.di.b bVar) {
                this.f232450a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f232450a.P();
            }
        }

        public b(com.avito.android.publish.cpa_tariff.di.b bVar, Integer num, a aVar) {
            this.f232439a = new a(bVar);
            u<com.avito.android.publish.cpa_tariff.mvi.domain.e> uVarD = g.d(new com.avito.android.publish.cpa_tariff.mvi.domain.g(dagger.internal.l.a(num), this.f232439a, new C7068b(bVar), new C7069d(bVar)));
            this.f232442d = uVarD;
            this.f232443e = new com.avito.android.publish.cpa_tariff.mvi.c(uVarD);
            u<com.avito.android.publish.cpa_tariff.mvi.domain.a> uVarD2 = g.d(new com.avito.android.publish.cpa_tariff.mvi.domain.c(this.f232439a, new c(bVar)));
            this.f232445g = uVarD2;
            this.f232446h = new l(new h(this.f232443e, new com.avito.android.publish.cpa_tariff.mvi.e(uVarD2)));
        }

        @Override // com.avito.android.publish.cpa_tariff.di.a
        public final void a(CpaTariffActivity cpaTariffActivity) {
            cpaTariffActivity.f232421m = this.f232446h;
        }
    }

    /* compiled from: DaggerCpaTariffComponent.java */
    public static final class c implements a.InterfaceC7067a {
        public c() {
        }

        @Override // com.avito.android.publish.cpa_tariff.di.a.InterfaceC7067a
        public final com.avito.android.publish.cpa_tariff.di.a a(com.avito.android.publish.cpa_tariff.di.b bVar, int i12) {
            return new b(bVar, Integer.valueOf(i12), null);
        }
    }

    public static a.InterfaceC7067a a() {
        return new c();
    }
}
