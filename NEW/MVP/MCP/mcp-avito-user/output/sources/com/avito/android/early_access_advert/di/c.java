package com.avito.android.early_access_advert.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.early_access_advert.di.g;
import com.avito.android.early_access_advert.info_screen.EarlyAccessAdvertInfoFragment;
import com.avito.android.early_access_advert.info_screen.mvi.k;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerEarlyAccessAdvertInfoComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class c {

    /* compiled from: DaggerEarlyAccessAdvertInfoComponent.java */
    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.early_access_advert.info_screen.mvi.d f145610a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.early_access_advert.a> f145611b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.early_access_advert.info_screen.mvi.b f145612c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f145613d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f145614e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.early_access_advert.info_screen.e f145615f;

        /* compiled from: DaggerEarlyAccessAdvertInfoComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f145616a;

            public a(e eVar) {
                this.f145616a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f145616a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerEarlyAccessAdvertInfoComponent.java */
        /* renamed from: com.avito.android.early_access_advert.di.c$b$b, reason: collision with other inner class name */
        public static final class C4232b implements u<com.avito.android.early_access_advert.a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f145617a;

            public C4232b(e eVar) {
                this.f145617a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f145617a.E7();
            }
        }

        public b(e eVar, C28478k c28478k, EarlyAccessAdvert earlyAccessAdvert, a aVar) {
            this.f145610a = new com.avito.android.early_access_advert.info_screen.mvi.d(l.a(earlyAccessAdvert));
            this.f145612c = new com.avito.android.early_access_advert.info_screen.mvi.b(new C4232b(eVar));
            this.f145613d = new a(eVar);
            this.f145614e = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f145613d);
            this.f145615f = new com.avito.android.early_access_advert.info_screen.e(new com.avito.android.early_access_advert.info_screen.mvi.g(this.f145610a, this.f145612c, com.avito.android.early_access_advert.info_screen.mvi.i.a(), k.a(), this.f145614e));
        }

        @Override // com.avito.android.early_access_advert.di.g
        public final void a(EarlyAccessAdvertInfoFragment earlyAccessAdvertInfoFragment) {
            earlyAccessAdvertInfoFragment.f145705n0 = this.f145615f;
            earlyAccessAdvertInfoFragment.f145707p0 = this.f145614e.get();
        }
    }

    /* compiled from: DaggerEarlyAccessAdvertInfoComponent.java */
    /* renamed from: com.avito.android.early_access_advert.di.c$c, reason: collision with other inner class name */
    public static final class C4233c implements g.a {
        public C4233c() {
        }

        @Override // com.avito.android.early_access_advert.di.g.a
        public final g a(e eVar, C28478k c28478k, EarlyAccessAdvert earlyAccessAdvert) {
            return new b(eVar, c28478k, earlyAccessAdvert, null);
        }
    }

    public static g.a a() {
        return new C4233c();
    }
}
