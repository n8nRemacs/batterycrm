package com.avito.android.extended_profile_tabs.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsArguments;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsFragment;
import com.avito.android.extended_profile_tabs.di.e;
import com.avito.android.extended_profile_tabs.i;
import com.avito.android.extended_profile_tabs.m;
import com.avito.android.extended_profile_tabs.mvi.k;
import com.avito.android.extended_profile_tabs.q;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.util.R0;
import dB.InterfaceC39552a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import iA.InterfaceC41258a;
import kotlin.G0;

/* compiled from: DaggerExtendedProfileTabsComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerExtendedProfileTabsComponent.java */
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final f f153184a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC41258a> f153185b;

        /* renamed from: c, reason: collision with root package name */
        public final l f153186c;

        /* renamed from: d, reason: collision with root package name */
        public final u<SearchParamsConverter> f153187d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f153188e;

        /* renamed from: f, reason: collision with root package name */
        public final u<i> f153189f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.extended_profile_tabs.mvi.b f153190g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.extended_profile_tabs.mvi.d f153191h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f153192i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f153193j;

        /* renamed from: k, reason: collision with root package name */
        public final q f153194k;

        /* compiled from: DaggerExtendedProfileTabsComponent.java */
        /* renamed from: com.avito.android.extended_profile_tabs.di.a$b$a, reason: collision with other inner class name */
        public static final class C4470a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final f f153195a;

            public C4470a(f fVar) {
                this.f153195a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f153195a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerExtendedProfileTabsComponent.java */
        /* renamed from: com.avito.android.extended_profile_tabs.di.a$b$b, reason: collision with other inner class name */
        public static final class C4471b implements u<InterfaceC41258a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f153196a;

            public C4471b(f fVar) {
                this.f153196a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41258a interfaceC41258aF9 = this.f153196a.f9();
                t.c(interfaceC41258aF9);
                return interfaceC41258aF9;
            }
        }

        /* compiled from: DaggerExtendedProfileTabsComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final f f153197a;

            public c(f fVar) {
                this.f153197a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f153197a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(f fVar, ExtendedProfileTabsArguments extendedProfileTabsArguments, Y41.l lVar, C28478k c28478k, C4469a c4469a) {
            this.f153184a = fVar;
            this.f153185b = new C4471b(fVar);
            this.f153186c = l.a(extendedProfileTabsArguments);
            u<SearchParamsConverter> uVarD = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            this.f153187d = uVarD;
            C4470a c4470a = new C4470a(fVar);
            u<i> uVarD2 = dagger.internal.g.d(new m(this.f153186c, uVarD, this.f153185b, c4470a));
            this.f153189f = uVarD2;
            this.f153190g = new com.avito.android.extended_profile_tabs.mvi.b(uVarD2);
            this.f153191h = new com.avito.android.extended_profile_tabs.mvi.d(uVarD2);
            this.f153192i = new c(fVar);
            this.f153193j = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f153192i);
            this.f153194k = new q(new com.avito.android.extended_profile_tabs.mvi.g(this.f153190g, com.avito.android.extended_profile_tabs.mvi.i.a(), k.a(), this.f153191h, this.f153193j, this.f153186c));
        }

        @Override // com.avito.android.extended_profile_tabs.di.e
        public final void a(ExtendedProfileTabsFragment extendedProfileTabsFragment) {
            extendedProfileTabsFragment.f153159t0 = this.f153194k;
            extendedProfileTabsFragment.f153161v0 = this.f153193j.get();
            f fVar = this.f153184a;
            extendedProfileTabsFragment.f153162w0 = fVar.yl();
            extendedProfileTabsFragment.f153163x0 = fVar.Eg();
        }
    }

    /* compiled from: DaggerExtendedProfileTabsComponent.java */
    public static final class c implements e.a {
        public c() {
        }

        @Override // com.avito.android.extended_profile_tabs.di.e.a
        public final e a(ExtendedProfileTabsArguments extendedProfileTabsArguments, Y41.l<? super InterfaceC39552a, G0> lVar, C28478k c28478k, f fVar) {
            extendedProfileTabsArguments.getClass();
            return new b(fVar, extendedProfileTabsArguments, lVar, c28478k, null);
        }
    }

    public static e.a a() {
        return new c();
    }
}
