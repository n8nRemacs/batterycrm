package com.avito.android.rating_form.info.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating_form.info.RatingFormInfoFragment;
import com.avito.android.rating_form.info.di.b;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerRatingFormInfoComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingFormInfoComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.rating_form.info.di.b.a
        public final com.avito.android.rating_form.info.di.b a(C28478k c28478k, com.avito.android.rating_form.info.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, null);
        }
    }

    /* compiled from: DaggerRatingFormInfoComponent.java */
    public static final class c implements com.avito.android.rating_form.info.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f248162a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f248163b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f248164c;

        /* compiled from: DaggerRatingFormInfoComponent.java */
        /* renamed from: com.avito.android.rating_form.info.di.a$c$a, reason: collision with other inner class name */
        public static final class C7468a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating_form.info.di.c f248165a;

            public C7468a(com.avito.android.rating_form.info.di.c cVar) {
                this.f248165a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f248165a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.rating_form.info.di.c cVar, cv.b bVar, C28478k c28478k, C7467a c7467a) {
            this.f248162a = bVar;
            this.f248163b = new C7468a(cVar);
            this.f248164c = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f248163b);
        }

        @Override // com.avito.android.rating_form.info.di.b
        public final void a(RatingFormInfoFragment ratingFormInfoFragment) {
            ratingFormInfoFragment.f248155n0 = this.f248164c.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f248162a.u4();
            t.c(aVarU4);
            ratingFormInfoFragment.f248156o0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
