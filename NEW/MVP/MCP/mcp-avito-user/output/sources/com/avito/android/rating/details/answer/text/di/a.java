package com.avito.android.rating.details.answer.text.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor;
import com.avito.android.rating.details.answer.text.di.b;
import com.avito.android.rating.details.answer.text.f;
import com.avito.android.rating.details.answer.text.h;
import com.avito.android.rating.details.answer.text.mvi.d;
import com.avito.android.rating.details.answer.text.mvi.i;
import com.avito.android.rating.details.answer.text.mvi.k;
import com.avito.android.ratings.RatingActionAnswerLengthValidationData;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerRatingAddAnswerTextComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingAddAnswerTextComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.rating.details.answer.text.di.b.a
        public final com.avito.android.rating.details.answer.text.di.b a(Long l12, RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData, String str, C28478k c28478k, com.avito.android.rating.details.answer.di.c cVar, boolean z12) {
            str.getClass();
            return new c(cVar, l12, ratingActionAnswerLengthValidationData, str, c28478k, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerRatingAddAnswerTextComponent.java */
    public static final class c implements com.avito.android.rating.details.answer.text.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28373a> f246847a;

        /* renamed from: b, reason: collision with root package name */
        public final l f246848b;

        /* renamed from: c, reason: collision with root package name */
        public final d f246849c;

        /* renamed from: d, reason: collision with root package name */
        public final u<RatingAddAnswerTextValidationInteractor> f246850d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.rating.details.answer.text.mvi.b f246851e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f246852f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f246853g;

        /* renamed from: h, reason: collision with root package name */
        public final l f246854h;

        /* compiled from: DaggerRatingAddAnswerTextComponent.java */
        /* renamed from: com.avito.android.rating.details.answer.text.di.a$c$a, reason: collision with other inner class name */
        public static final class C7415a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246855a;

            public C7415a(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246855a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f246855a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerRatingAddAnswerTextComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246856a;

            public b(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246856a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f246856a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.rating.details.answer.di.c cVar, Long l12, RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData, String str, C28478k c28478k, Boolean bool, C7414a c7414a) {
            this.f246847a = new C7415a(cVar);
            this.f246848b = l.b(l12);
            this.f246849c = new d(this.f246848b, l.a(bool), this.f246847a);
            this.f246850d = g.d(new com.avito.android.rating.details.answer.text.e(l.b(ratingActionAnswerLengthValidationData)));
            this.f246851e = new com.avito.android.rating.details.answer.text.mvi.b(this.f246848b, l.a(str), this.f246850d);
            this.f246852f = new b(cVar);
            this.f246853g = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f246852f);
            this.f246854h = l.a(new h(new com.avito.android.rating.details.answer.text.g(new com.avito.android.rating.details.answer.text.mvi.g(this.f246849c, this.f246851e, i.a(), k.a(), this.f246850d, this.f246853g))));
        }

        @Override // com.avito.android.rating.details.answer.text.di.b
        public final void a(RatingAddAnswerTextFragment ratingAddAnswerTextFragment) {
            ratingAddAnswerTextFragment.f246803n0 = (f.a) this.f246854h.f393949a;
            ratingAddAnswerTextFragment.f246805p0 = this.f246853g.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
