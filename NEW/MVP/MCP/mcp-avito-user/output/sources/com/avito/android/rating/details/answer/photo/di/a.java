package com.avito.android.rating.details.answer.photo.di;

import Mg0.InterfaceC14487a;
import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.T0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.dialog.o;
import com.avito.android.photo_cache.j;
import com.avito.android.photo_list_view.C33210d;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.InterfaceC33220n;
import com.avito.android.photo_list_view.r;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.b0;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoFragment;
import com.avito.android.rating.details.answer.photo.di.b;
import com.avito.android.rating.details.answer.photo.g;
import com.avito.android.rating.details.answer.photo.mvi.n;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import zz.C50648b;
import zz.C50650d;

/* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.rating.details.answer.photo.di.b.a
        public final com.avito.android.rating.details.answer.photo.di.b a(ActivityC22955m activityC22955m, Resources resources, RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment, RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment2, RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments, Long l12, C28478k c28478k, com.avito.android.rating.details.answer.di.c cVar, InterfaceC39417a interfaceC39417a, boolean z12) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, activityC22955m, resources, ratingAddAnswerPhotoFragment, ratingAddAnswerPhotoFragment2, ratingAddAnswerPhotoArguments, l12, c28478k, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
    public static final class c implements com.avito.android.rating.details.answer.photo.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<s> f246658A;

        /* renamed from: B, reason: collision with root package name */
        public final u<C33210d.a> f246659B;

        /* renamed from: C, reason: collision with root package name */
        public final l f246660C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f246661D;

        /* renamed from: E, reason: collision with root package name */
        public final u<InterfaceC30274a> f246662E;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.rating.details.answer.di.c f246663a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f246664b;

        /* renamed from: c, reason: collision with root package name */
        public final l f246665c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f246666d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35745a5> f246667e;

        /* renamed from: f, reason: collision with root package name */
        public final u<j> f246668f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f246669g;

        /* renamed from: h, reason: collision with root package name */
        public final l f246670h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.rating.details.answer.photo.mvi.g f246671i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC14487a> f246672j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.rating.details.answer.photo.a> f246673k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.rating.details.answer.upload.a> f246674l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC35741a1> f246675m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C50648b> f246676n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.rating.details.answer.photo.mvi.e f246677o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.rating.details.answer.photo.mvi.l f246678p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC28481c> f246679q;

        /* renamed from: r, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f246680r;

        /* renamed from: s, reason: collision with root package name */
        public final l f246681s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC33220n> f246682t;

        /* renamed from: u, reason: collision with root package name */
        public final u<Application> f246683u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC33214h> f246684v;

        /* renamed from: w, reason: collision with root package name */
        public final u<PhotoPickerIntentFactory> f246685w;

        /* renamed from: x, reason: collision with root package name */
        public final u<b0> f246686x;

        /* renamed from: y, reason: collision with root package name */
        public final u<s.b> f246687y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f246688z;

        /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
        /* renamed from: com.avito.android.rating.details.answer.photo.di.a$c$a, reason: collision with other inner class name */
        public static final class C7404a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246689a;

            public C7404a(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246689a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f246689a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
        public static final class b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246690a;

            public b(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246690a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f246690a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
        /* renamed from: com.avito.android.rating.details.answer.photo.di.a$c$c, reason: collision with other inner class name */
        public static final class C7405c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f246691a;

            public C7405c(cv.b bVar) {
                this.f246691a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f246691a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
        public static final class d implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246692a;

            public d(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246692a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f246692a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
        public static final class e implements u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246693a;

            public e(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246693a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f246693a.F();
                t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
        public static final class f implements u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246694a;

            public f(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246694a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f246694a.X();
            }
        }

        /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
        public static final class g implements u<InterfaceC14487a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246695a;

            public g(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246695a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14487a interfaceC14487aI1 = this.f246695a.I1();
                t.c(interfaceC14487aI1);
                return interfaceC14487aI1;
            }
        }

        /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
        public static final class h implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246696a;

            public h(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246696a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f246696a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerRatingAddAnswerPhotoComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.details.answer.di.c f246697a;

            public i(com.avito.android.rating.details.answer.di.c cVar) {
                this.f246697a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f246697a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.rating.details.answer.di.c cVar, cv.b bVar, Activity activity, Resources resources, T0 t02, RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment, RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments, Long l12, C28478k c28478k, Boolean bool, C7403a c7403a) {
            this.f246663a = cVar;
            this.f246664b = bVar;
            l lVarA = l.a(ratingAddAnswerPhotoArguments);
            this.f246665c = lVarA;
            e eVar = new e(cVar);
            this.f246666d = eVar;
            h hVar = new h(cVar);
            this.f246667e = hVar;
            this.f246668f = dagger.internal.g.d(new com.avito.android.rating.details.answer.photo.picker.di.g(lVarA, eVar, hVar));
            this.f246669g = new C7404a(cVar);
            this.f246670h = l.b(l12);
            this.f246671i = new com.avito.android.rating.details.answer.photo.mvi.g(this.f246670h, l.a(bool), this.f246668f, this.f246669g);
            this.f246673k = dagger.internal.g.d(new com.avito.android.rating.details.answer.photo.c(new g(cVar)));
            this.f246674l = dagger.internal.g.d(com.avito.android.rating.details.answer.upload.c.a());
            this.f246675m = new d(cVar);
            u<C50648b> uVarA = B.a(new C50650d(this.f246675m, l.a(resources)));
            this.f246676n = uVarA;
            this.f246677o = new com.avito.android.rating.details.answer.photo.mvi.e(this.f246665c, uVarA, this.f246673k, this.f246674l);
            this.f246678p = new com.avito.android.rating.details.answer.photo.mvi.l(this.f246670h, this.f246669g);
            this.f246679q = new i(cVar);
            this.f246680r = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f246679q);
            this.f246681s = l.a(new com.avito.android.rating.details.answer.photo.i(new com.avito.android.rating.details.answer.photo.h(new com.avito.android.rating.details.answer.photo.mvi.j(this.f246671i, this.f246677o, this.f246678p, n.a(), this.f246680r))));
            u<InterfaceC33220n> uVarD = dagger.internal.g.d(new r(this.f246666d));
            this.f246682t = uVarD;
            b bVar2 = new b(cVar);
            this.f246683u = bVar2;
            this.f246684v = dagger.internal.g.d(new com.avito.android.rating.details.answer.photo.picker.di.d(this.f246665c, uVarD, this.f246667e, bVar2));
            f fVar = new f(cVar);
            u<b0> uVarD2 = dagger.internal.g.d(new com.avito.android.rating.details.answer.photo.picker.di.h(this.f246665c, this.f246683u, fVar));
            this.f246686x = uVarD2;
            this.f246687y = dagger.internal.g.d(new com.avito.android.rating.details.answer.photo.picker.di.f(uVarD2));
            this.f246658A = dagger.internal.g.d(new com.avito.android.rating.details.answer.photo.picker.di.e(l.a(ratingAddAnswerPhotoFragment), this.f246684v, this.f246687y, this.f246667e, new C7405c(bVar), this.f246669g));
            this.f246659B = dagger.internal.g.d(com.avito.android.rating.details.answer.photo.picker.di.c.a());
            l lVarA2 = l.a(activity);
            this.f246660C = lVarA2;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA2 = B.a(new KU.b(lVarA2));
            this.f246661D = uVarA2;
            this.f246662E = B.a(new o(uVarA2, this.f246660C));
        }

        @Override // com.avito.android.rating.details.answer.photo.di.b
        public final void a(RatingAddAnswerPhotoFragment ratingAddAnswerPhotoFragment) {
            ratingAddAnswerPhotoFragment.f246624n0 = (g.a) this.f246681s.f393949a;
            ratingAddAnswerPhotoFragment.f246626p0 = this.f246658A.get();
            ratingAddAnswerPhotoFragment.f246627q0 = this.f246659B.get();
            ratingAddAnswerPhotoFragment.f246628r0 = new com.avito.android.rating.details.answer.photo.picker.b(this.f246663a.X(), this.f246658A.get());
            ratingAddAnswerPhotoFragment.f246629s0 = this.f246662E.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f246664b.u4();
            t.c(aVarU4);
            ratingAddAnswerPhotoFragment.f246630t0 = aVarU4;
            ratingAddAnswerPhotoFragment.f246631u0 = this.f246680r.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
