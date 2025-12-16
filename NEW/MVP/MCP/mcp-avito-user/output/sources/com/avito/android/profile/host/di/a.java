package com.avito.android.profile.host.di;

import com.avito.android.profile.host.UserProfileHostFragment;
import com.avito.android.profile.host.di.b;
import com.avito.android.profile.host.h;
import com.avito.android.profile.host.mvi.domain.f;
import com.avito.android.profile.host.mvi.k;
import com.avito.android.profile.host.mvi.m;
import com.avito.android.profile.host.mvi.o;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import hz.InterfaceC41196a;

/* compiled from: DaggerUserProfileHostComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerUserProfileHostComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile.host.di.b.a
        public final com.avito.android.profile.host.di.b a(com.avito.android.profile.host.di.c cVar) {
            return new c(cVar, null);
        }
    }

    /* compiled from: DaggerUserProfileHostComponent.java */
    public static final class c implements com.avito.android.profile.host.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.profile.host.di.c f222345a;

        /* renamed from: b, reason: collision with root package name */
        public final u<s90.b> f222346b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC41196a> f222347c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f222348d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.account.plugin.rx.a> f222349e;

        /* renamed from: f, reason: collision with root package name */
        public final h f222350f;

        /* compiled from: DaggerUserProfileHostComponent.java */
        /* renamed from: com.avito.android.profile.host.di.a$c$a, reason: collision with other inner class name */
        public static final class C6724a implements u<com.avito.android.account.plugin.rx.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.host.di.c f222351a;

            public C6724a(com.avito.android.profile.host.di.c cVar) {
                this.f222351a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.account.plugin.rx.a aVarV2 = this.f222351a.v2();
                t.c(aVarV2);
                return aVarV2;
            }
        }

        /* compiled from: DaggerUserProfileHostComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.host.di.c f222352a;

            public b(com.avito.android.profile.host.di.c cVar) {
                this.f222352a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f222352a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerUserProfileHostComponent.java */
        /* renamed from: com.avito.android.profile.host.di.a$c$c, reason: collision with other inner class name */
        public static final class C6725c implements u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.host.di.c f222353a;

            public C6725c(com.avito.android.profile.host.di.c cVar) {
                this.f222353a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f222353a.E0();
                t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerUserProfileHostComponent.java */
        public static final class d implements u<s90.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.host.di.c f222354a;

            public d(com.avito.android.profile.host.di.c cVar) {
                this.f222354a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f222354a.w2();
            }
        }

        public c(com.avito.android.profile.host.di.c cVar, C6723a c6723a) {
            this.f222345a = cVar;
            d dVar = new d(cVar);
            C6725c c6725c = new C6725c(cVar);
            f fVar = new f(dVar, c6725c, new b(cVar));
            this.f222350f = new h(new k(new com.avito.android.profile.host.mvi.h(fVar), new com.avito.android.profile.host.mvi.f(fVar, new C6724a(cVar), c6725c), m.a(), o.a()));
        }

        @Override // com.avito.android.profile.host.di.b
        public final void a(UserProfileHostFragment userProfileHostFragment) {
            userProfileHostFragment.f222328t0 = this.f222350f;
            userProfileHostFragment.f222330v0 = this.f222345a.Pa();
        }
    }

    public static b.a a() {
        return new b();
    }
}
