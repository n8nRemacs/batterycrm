package com.avito.android.tariff.detailssheet.di;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.detailssheet.TariffDetailsSheetDialogFragment;
import com.avito.android.tariff.detailssheet.di.c;
import com.avito.android.tariff.detailssheet.vm.n;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTariffDetailsSheetFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffDetailsSheetFragmentComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.tariff.detailssheet.di.c.a
        public final com.avito.android.tariff.detailssheet.di.c a(TariffDetailsSheetDialogFragment tariffDetailsSheetDialogFragment, com.avito.android.tariff.detailssheet.di.b bVar, DeepLink deepLink) {
            return new c(bVar, tariffDetailsSheetDialogFragment, deepLink, null);
        }
    }

    /* compiled from: DaggerTariffDetailsSheetFragmentComponent.java */
    public static final class c implements com.avito.android.tariff.detailssheet.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.tariff.detailssheet.di.b f297406a;

        /* renamed from: b, reason: collision with root package name */
        public final l f297407b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f297408c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f297409d;

        /* renamed from: e, reason: collision with root package name */
        public final u<WB0.a> f297410e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.tariff.detailssheet.vm.e> f297411f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.tariff.detailssheet.vm.a> f297412g;

        /* renamed from: h, reason: collision with root package name */
        public final n f297413h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.tariff.detailssheet.vm.l> f297414i;

        /* compiled from: DaggerTariffDetailsSheetFragmentComponent.java */
        /* renamed from: com.avito.android.tariff.detailssheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C9083a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff.detailssheet.di.b f297415a;

            public C9083a(com.avito.android.tariff.detailssheet.di.b bVar) {
                this.f297415a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f297415a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerTariffDetailsSheetFragmentComponent.java */
        public static final class b implements u<WB0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff.detailssheet.di.b f297416a;

            public b(com.avito.android.tariff.detailssheet.di.b bVar) {
                this.f297416a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WB0.a aVarT6 = this.f297416a.T6();
                t.c(aVarT6);
                return aVarT6;
            }
        }

        /* compiled from: DaggerTariffDetailsSheetFragmentComponent.java */
        /* renamed from: com.avito.android.tariff.detailssheet.di.a$c$c, reason: collision with other inner class name */
        public static final class C9084c implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff.detailssheet.di.b f297417a;

            public C9084c(com.avito.android.tariff.detailssheet.di.b bVar) {
                this.f297417a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f297417a.o();
            }
        }

        public c(com.avito.android.tariff.detailssheet.di.b bVar, TariffDetailsSheetDialogFragment tariffDetailsSheetDialogFragment, DeepLink deepLink, C9082a c9082a) {
            this.f297406a = bVar;
            this.f297407b = l.a(deepLink);
            C9083a c9083a = new C9083a(bVar);
            this.f297408c = c9083a;
            this.f297409d = new C9084c(bVar);
            this.f297411f = dagger.internal.g.d(new com.avito.android.tariff.detailssheet.vm.g(new b(bVar), c9083a));
            u<com.avito.android.tariff.detailssheet.vm.a> uVarD = dagger.internal.g.d(com.avito.android.tariff.detailssheet.vm.c.a());
            this.f297412g = uVarD;
            this.f297413h = new n(this.f297407b, uVarD, this.f297408c, this.f297409d, this.f297411f);
            this.f297414i = dagger.internal.g.d(new g(this.f297413h, l.a(tariffDetailsSheetDialogFragment)));
        }

        @Override // com.avito.android.tariff.detailssheet.di.c
        public final void a(TariffDetailsSheetDialogFragment tariffDetailsSheetDialogFragment) {
            tariffDetailsSheetDialogFragment.f297396h0 = this.f297414i.get();
            com.avito.android.util.text.a aVarE = this.f297406a.e();
            t.c(aVarE);
            tariffDetailsSheetDialogFragment.f297397i0 = aVarE;
        }
    }

    public static c.a a() {
        return new b();
    }
}
