package com.avito.android.extended_profile_selection_create.name.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameConfig;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameFragment;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameScreen;
import com.avito.android.extended_profile_selection_create.name.di.b;
import com.avito.android.extended_profile_selection_create.name.h;
import com.avito.android.extended_profile_selection_create.name.mvi.i;
import com.avito.android.extended_profile_selection_create.name.mvi.k;
import com.avito.android.extended_profile_selection_create.name.mvi.m;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import kotlinx.coroutines.flow.Z1;

/* compiled from: DaggerExtendedProfileSetSelectionNameComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerExtendedProfileSetSelectionNameComponent.java */
    public static final class b implements com.avito.android.extended_profile_selection_create.name.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<D0> f151844a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Gson> f151845b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f151846c;

        /* renamed from: d, reason: collision with root package name */
        public final l f151847d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.extended_profile_selection_create.name.f> f151848e;

        /* renamed from: f, reason: collision with root package name */
        public final u<E> f151849f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f151850g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.extended_profile_selection_create.name.mvi.d f151851h;

        /* renamed from: i, reason: collision with root package name */
        public final k f151852i;

        /* renamed from: j, reason: collision with root package name */
        public final m f151853j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f151854k;

        /* renamed from: l, reason: collision with root package name */
        public final l f151855l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f151856m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f151857n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.extended_profile_selection_create.name.k f151858o;

        /* compiled from: DaggerExtendedProfileSetSelectionNameComponent.java */
        /* renamed from: com.avito.android.extended_profile_selection_create.name.di.a$b$a, reason: collision with other inner class name */
        public static final class C4441a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151859a;

            public C4441a(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151859a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f151859a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionNameComponent.java */
        /* renamed from: com.avito.android.extended_profile_selection_create.name.di.a$b$b, reason: collision with other inner class name */
        public static final class C4442b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151860a;

            public C4442b(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151860a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f151860a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionNameComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151861a;

            public c(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151861a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f151861a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionNameComponent.java */
        public static final class d implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151862a;

            public d(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151862a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f151862a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionNameComponent.java */
        public static final class e implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151863a;

            public e(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151863a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0S2 = this.f151863a.S2();
                t.c(d0S2);
                return d0S2;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionNameComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151864a;

            public f(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151864a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f151864a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.extended_profile_selection_create.select.di.c cVar, Fragment fragment, Resources resources, ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig, Z1 z12, r rVar, Screen screen, InterfaceC22983P interfaceC22983P, Y41.l lVar, C4440a c4440a) {
            this.f151844a = new e(cVar);
            this.f151845b = new d(cVar);
            this.f151846c = new c(cVar);
            l lVarA = l.a(extendedProfileSetSelectionNameConfig);
            this.f151847d = lVarA;
            this.f151848e = g.d(new h(lVarA, this.f151844a, this.f151845b, this.f151846c));
            l lVarA2 = l.a(z12);
            C4441a c4441a = new C4441a(cVar);
            C4442b c4442b = new C4442b(cVar);
            u<com.avito.android.extended_profile_selection_create.name.f> uVar = this.f151848e;
            l lVar2 = this.f151847d;
            this.f151851h = new com.avito.android.extended_profile_selection_create.name.mvi.d(lVarA2, lVar2, uVar, c4441a, c4442b);
            this.f151852i = new k(lVar2);
            this.f151853j = new m(lVarA2, lVar2);
            this.f151854k = new f(cVar);
            this.f151855l = l.a(screen);
            u<C28478k> uVarD = g.d(new com.avito.android.extended_profile_selection_create.name.di.d(this.f151855l, l.a(rVar)));
            this.f151856m = uVarD;
            this.f151857n = com.avito.android.advert.item.delivery_suggests.l.i(this.f151854k, uVarD);
            this.f151858o = new com.avito.android.extended_profile_selection_create.name.k(new i(com.avito.android.extended_profile_selection_create.name.mvi.f.a(), this.f151851h, this.f151852i, this.f151853j, this.f151857n));
        }

        @Override // com.avito.android.extended_profile_selection_create.name.di.b
        public final void a(ExtendedProfileSetSelectionNameFragment extendedProfileSetSelectionNameFragment) {
            extendedProfileSetSelectionNameFragment.f151812n0 = this.f151858o;
            extendedProfileSetSelectionNameFragment.f151814p0 = this.f151857n.get();
        }
    }

    /* compiled from: DaggerExtendedProfileSetSelectionNameComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.extended_profile_selection_create.name.di.b.a
        public final com.avito.android.extended_profile_selection_create.name.di.b a(ExtendedProfileSetSelectionNameFragment extendedProfileSetSelectionNameFragment, Resources resources, ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig, Z1 z12, com.avito.android.extended_profile_selection_create.select.di.c cVar, r rVar, ExtendedProfileSetSelectionNameScreen extendedProfileSetSelectionNameScreen, ExtendedProfileSetSelectionNameFragment extendedProfileSetSelectionNameFragment2, Y41.l lVar) {
            extendedProfileSetSelectionNameConfig.getClass();
            z12.getClass();
            extendedProfileSetSelectionNameScreen.getClass();
            return new b(cVar, extendedProfileSetSelectionNameFragment, resources, extendedProfileSetSelectionNameConfig, z12, rVar, extendedProfileSetSelectionNameScreen, extendedProfileSetSelectionNameFragment2, lVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
