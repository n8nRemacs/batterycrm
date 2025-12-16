package com.avito.android.extended_profile_personal_link_edit.di;

import Y41.l;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditConfig;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditFragment;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditScreen;
import com.avito.android.extended_profile_personal_link_edit.di.b;
import com.avito.android.extended_profile_personal_link_edit.i;
import com.avito.android.extended_profile_personal_link_edit.mvi.k;
import com.avito.android.extended_profile_personal_link_edit.n;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPersonalLinkEditComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerPersonalLinkEditComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.extended_profile_personal_link_edit.di.b.a
        public final com.avito.android.extended_profile_personal_link_edit.di.b a(PersonalLinkEditConfig personalLinkEditConfig, com.avito.android.extended_profile_personal_link_edit.di.c cVar, r rVar, PersonalLinkEditScreen personalLinkEditScreen, l lVar, boolean z12) {
            personalLinkEditConfig.getClass();
            personalLinkEditScreen.getClass();
            return new c(cVar, personalLinkEditConfig, rVar, personalLinkEditScreen, lVar, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerPersonalLinkEditComponent.java */
    public static final class c implements com.avito.android.extended_profile_personal_link_edit.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.extended_profile_personal_link_edit.mvi.d f151471a;

        /* renamed from: b, reason: collision with root package name */
        public final u<D0> f151472b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f151473c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Gson> f151474d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35863o4> f151475e;

        /* renamed from: f, reason: collision with root package name */
        public final u<i> f151476f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.extended_profile_personal_link_edit.mvi.b f151477g;

        /* renamed from: h, reason: collision with root package name */
        public final k f151478h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f151479i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f151480j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C28478k> f151481k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f151482l;

        /* renamed from: m, reason: collision with root package name */
        public final n f151483m;

        /* compiled from: DaggerPersonalLinkEditComponent.java */
        /* renamed from: com.avito.android.extended_profile_personal_link_edit.di.a$c$a, reason: collision with other inner class name */
        public static final class C4428a implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_personal_link_edit.di.c f151484a;

            public C4428a(com.avito.android.extended_profile_personal_link_edit.di.c cVar) {
                this.f151484a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0B7 = this.f151484a.b7();
                t.c(d0B7);
                return d0B7;
            }
        }

        /* compiled from: DaggerPersonalLinkEditComponent.java */
        public static final class b implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_personal_link_edit.di.c f151485a;

            public b(com.avito.android.extended_profile_personal_link_edit.di.c cVar) {
                this.f151485a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f151485a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerPersonalLinkEditComponent.java */
        /* renamed from: com.avito.android.extended_profile_personal_link_edit.di.a$c$c, reason: collision with other inner class name */
        public static final class C4429c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_personal_link_edit.di.c f151486a;

            public C4429c(com.avito.android.extended_profile_personal_link_edit.di.c cVar) {
                this.f151486a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C4 = this.f151486a.C4();
                t.c(r0C4);
                return r0C4;
            }
        }

        /* compiled from: DaggerPersonalLinkEditComponent.java */
        public static final class d implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_personal_link_edit.di.c f151487a;

            public d(com.avito.android.extended_profile_personal_link_edit.di.c cVar) {
                this.f151487a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f151487a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerPersonalLinkEditComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_personal_link_edit.di.c f151488a;

            public e(com.avito.android.extended_profile_personal_link_edit.di.c cVar) {
                this.f151488a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f151488a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.extended_profile_personal_link_edit.di.c cVar, PersonalLinkEditConfig personalLinkEditConfig, r rVar, Screen screen, l lVar, Boolean bool, C4427a c4427a) {
            this.f151471a = new com.avito.android.extended_profile_personal_link_edit.mvi.d(dagger.internal.l.a(bool));
            this.f151476f = g.d(new com.avito.android.extended_profile_personal_link_edit.k(new C4428a(cVar), new C4429c(cVar), new b(cVar), new d(cVar)));
            dagger.internal.l lVarA = dagger.internal.l.a(personalLinkEditConfig);
            this.f151477g = new com.avito.android.extended_profile_personal_link_edit.mvi.b(lVarA, this.f151476f);
            this.f151478h = new k(lVarA);
            this.f151479i = new e(cVar);
            this.f151480j = dagger.internal.l.a(screen);
            u<C28478k> uVarD = g.d(new com.avito.android.extended_profile_personal_link_edit.di.e(this.f151480j, dagger.internal.l.a(rVar)));
            this.f151481k = uVarD;
            this.f151482l = com.avito.android.advert.item.delivery_suggests.l.i(this.f151479i, uVarD);
            this.f151483m = new n(new com.avito.android.extended_profile_personal_link_edit.mvi.g(this.f151471a, this.f151477g, com.avito.android.extended_profile_personal_link_edit.mvi.i.a(), this.f151478h, this.f151482l));
        }

        @Override // com.avito.android.extended_profile_personal_link_edit.di.b
        public final void a(PersonalLinkEditFragment personalLinkEditFragment) {
            personalLinkEditFragment.f151446n0 = this.f151483m;
            personalLinkEditFragment.f151448p0 = this.f151482l.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
