package com.avito.android.rating.details.answer.di;

import androidx.view.T0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating.details.answer.RatingAddAnswerActivity;
import com.avito.android.rating.details.answer.RatingAddAnswerArguments;
import com.avito.android.rating.details.answer.di.b;
import com.avito.android.rating.details.answer.mvi.f;
import com.avito.android.rating.details.answer.mvi.h;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerRatingAddAnswerComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingAddAnswerComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.rating.details.answer.di.b.a
        public final com.avito.android.rating.details.answer.di.b a(RatingAddAnswerActivity ratingAddAnswerActivity, RatingAddAnswerArguments ratingAddAnswerArguments, boolean z12, C28478k c28478k, com.avito.android.rating.details.answer.di.c cVar) {
            return new c(cVar, ratingAddAnswerActivity, ratingAddAnswerArguments, Boolean.valueOf(z12), c28478k, null);
        }
    }

    /* compiled from: DaggerRatingAddAnswerComponent.java */
    public static final class c implements com.avito.android.rating.details.answer.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f246597a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC35863o4> f246598b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.rating.details.answer.e f246599c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f246600d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f246601e;

        /* compiled from: DaggerRatingAddAnswerComponent.java */
        /* renamed from: com.avito.android.rating.details.answer.di.a$c$a, reason: collision with other inner class name */
        public static final class C7396a implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246602a;

            public C7396a(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246602a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f246602a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerRatingAddAnswerComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246603a;

            public b(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246603a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f246603a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.rating.details.answer.di.c cVar, T0 t02, RatingAddAnswerArguments ratingAddAnswerArguments, Boolean bool, C28478k c28478k, C7395a c7395a) {
            this.f246597a = l.a(ratingAddAnswerArguments);
            this.f246599c = new com.avito.android.rating.details.answer.e(new f(new com.avito.android.rating.details.answer.mvi.b(this.f246597a, l.a(bool), new C7396a(cVar)), h.a()));
            this.f246600d = new b(cVar);
            this.f246601e = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f246600d);
        }

        @Override // com.avito.android.rating.details.answer.di.b
        public final void a(RatingAddAnswerActivity ratingAddAnswerActivity) {
            ratingAddAnswerActivity.f246574m = this.f246599c;
            ratingAddAnswerActivity.f246576o = this.f246601e.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
