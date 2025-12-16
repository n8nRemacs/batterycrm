package com.avito.android.rating.summary.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating.summary.RatingSummaryActivity;
import com.avito.android.rating.summary.di.b;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerRatingSummaryComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingSummaryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.rating.summary.di.b.a
        public final com.avito.android.rating.summary.di.b a(C28478k c28478k, com.avito.android.rating.summary.di.c cVar) {
            return new c(cVar, c28478k, null);
        }
    }

    /* compiled from: DaggerRatingSummaryComponent.java */
    public static final class c implements com.avito.android.rating.summary.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f247642a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f247643b;

        /* compiled from: DaggerRatingSummaryComponent.java */
        /* renamed from: com.avito.android.rating.summary.di.a$c$a, reason: collision with other inner class name */
        public static final class C7433a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.summary.di.c f247644a;

            public C7433a(com.avito.android.rating.summary.di.c cVar) {
                this.f247644a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f247644a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.rating.summary.di.c cVar, C28478k c28478k, C7432a c7432a) {
            this.f247642a = new C7433a(cVar);
            this.f247643b = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f247642a);
        }

        @Override // com.avito.android.rating.summary.di.b
        public final void a(RatingSummaryActivity ratingSummaryActivity) {
            ratingSummaryActivity.f247641m = this.f247643b.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
