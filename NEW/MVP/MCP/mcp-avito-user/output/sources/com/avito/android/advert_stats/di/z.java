package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.AdvertStatsActivity;
import com.avito.android.advert_stats.di.InterfaceC28317b;
import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: DaggerAdvertStatisticHostComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class z {

    /* compiled from: DaggerAdvertStatisticHostComponent.java */
    public static final class b implements InterfaceC28317b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.advert_stats.di.c f86664a;

        public b(com.avito.android.advert_stats.di.c cVar, a aVar) {
            this.f86664a = cVar;
        }

        @Override // com.avito.android.advert_stats.di.InterfaceC28317b
        public final void a(AdvertStatsActivity advertStatsActivity) {
            InterfaceC28373a interfaceC28373aA = this.f86664a.a();
            dagger.internal.t.c(interfaceC28373aA);
            advertStatsActivity.f85978m = interfaceC28373aA;
        }
    }

    /* compiled from: DaggerAdvertStatisticHostComponent.java */
    public static final class c implements InterfaceC28317b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.advert_stats.di.c f86665a;

        public c() {
        }

        @Override // com.avito.android.advert_stats.di.InterfaceC28317b.a
        public final InterfaceC28317b build() {
            dagger.internal.t.a(com.avito.android.advert_stats.di.c.class, this.f86665a);
            return new b(this.f86665a, null);
        }

        @Override // com.avito.android.advert_stats.di.InterfaceC28317b.a
        public final InterfaceC28317b.a d(com.avito.android.advert_stats.di.c cVar) {
            this.f86665a = cVar;
            return this;
        }
    }

    public static InterfaceC28317b.a a() {
        return new c();
    }
}
