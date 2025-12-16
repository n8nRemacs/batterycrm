package com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.di;

import androidx.view.T0;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.StatsFavoriteTabMviFragment;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.c;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.d;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.di.b;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.g;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.i;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.u;

/* compiled from: DaggerStatsFavoriteTabComponent.java */
@e
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: DaggerStatsFavoriteTabComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.di.b.a
        public final com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.di.b a(StatsFavoriteTabMviFragment statsFavoriteTabMviFragment, r rVar, C28478k c28478k, com.avito.android.advert_stats.detail.di.r rVar2) {
            return new c(rVar2, statsFavoriteTabMviFragment, rVar, c28478k, null);
        }
    }

    /* compiled from: DaggerStatsFavoriteTabComponent.java */
    public static final class c implements com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f86218a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f86219b;

        /* renamed from: c, reason: collision with root package name */
        public final l f86220c;

        /* compiled from: DaggerStatsFavoriteTabComponent.java */
        /* renamed from: com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.di.a$c$a, reason: collision with other inner class name */
        public static final class C2572a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.di.r f86221a;

            public C2572a(com.avito.android.advert_stats.detail.di.r rVar) {
                this.f86221a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f86221a.b();
            }
        }

        public c(com.avito.android.advert_stats.detail.di.r rVar, T0 t02, r rVar2, C28478k c28478k, C2571a c2571a) {
            this.f86218a = new C2572a(rVar);
            this.f86219b = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f86218a);
            this.f86220c = l.a(new com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.e(new d(new com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.e(com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.b.a(), g.a(), i.a(), this.f86219b))));
        }

        @Override // com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.di.b
        public final void a(StatsFavoriteTabMviFragment statsFavoriteTabMviFragment) {
            statsFavoriteTabMviFragment.f86200n0 = (c.a) this.f86220c.f393949a;
            statsFavoriteTabMviFragment.f86202p0 = this.f86219b.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
