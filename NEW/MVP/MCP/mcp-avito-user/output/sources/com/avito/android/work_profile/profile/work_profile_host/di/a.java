package com.avito.android.work_profile.profile.work_profile_host.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import com.avito.android.work_profile.WorkProfileOpenParams;
import com.avito.android.work_profile.domain.g;
import com.avito.android.work_profile.domain.i;
import com.avito.android.work_profile.profile.work_profile_host.di.b;
import com.avito.android.work_profile.profile.work_profile_host.mvi.h;
import com.avito.android.work_profile.profile.work_profile_host.mvi.j;
import com.avito.android.work_profile.profile.work_profile_host.ui.WorkProfileHostFragment;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import qQ0.C47333b;

/* compiled from: DaggerWorkProfileHostComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerWorkProfileHostComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.work_profile.profile.work_profile_host.di.b.a
        public final com.avito.android.work_profile.profile.work_profile_host.di.b a(com.avito.android.work_profile.profile.work_profile_host.di.c cVar, WorkProfileOpenParams workProfileOpenParams) {
            return new c(cVar, workProfileOpenParams, null);
        }
    }

    /* compiled from: DaggerWorkProfileHostComponent.java */
    public static final class c implements com.avito.android.work_profile.profile.work_profile_host.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<ZP0.a> f331258a;

        /* renamed from: b, reason: collision with root package name */
        public final l f331259b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f331260c;

        /* renamed from: d, reason: collision with root package name */
        public final u<g> f331261d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f331262e;

        /* renamed from: f, reason: collision with root package name */
        public final C47333b f331263f;

        /* compiled from: DaggerWorkProfileHostComponent.java */
        /* renamed from: com.avito.android.work_profile.profile.work_profile_host.di.a$c$a, reason: collision with other inner class name */
        public static final class C10297a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.work_profile_host.di.c f331264a;

            public C10297a(com.avito.android.work_profile.profile.work_profile_host.di.c cVar) {
                this.f331264a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f331264a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerWorkProfileHostComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.work_profile_host.di.c f331265a;

            public b(com.avito.android.work_profile.profile.work_profile_host.di.c cVar) {
                this.f331265a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f331265a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerWorkProfileHostComponent.java */
        /* renamed from: com.avito.android.work_profile.profile.work_profile_host.di.a$c$c, reason: collision with other inner class name */
        public static final class C10298c implements u<ZP0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.work_profile_host.di.c f331266a;

            public C10298c(com.avito.android.work_profile.profile.work_profile_host.di.c cVar) {
                this.f331266a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZP0.a aVarK7 = this.f331266a.k7();
                t.c(aVarK7);
                return aVarK7;
            }
        }

        public c(com.avito.android.work_profile.profile.work_profile_host.di.c cVar, WorkProfileOpenParams workProfileOpenParams, C10296a c10296a) {
            this.f331258a = new C10298c(cVar);
            l lVarA = l.a(workProfileOpenParams);
            this.f331259b = lVarA;
            this.f331260c = new b(cVar);
            u<g> uVarD = dagger.internal.g.d(new i(this.f331258a, lVarA, com.avito.android.work_profile.profile.work_profile_host.mvi.l.a(), this.f331260c));
            this.f331261d = uVarD;
            this.f331263f = new C47333b(new h(new com.avito.android.work_profile.profile.work_profile_host.mvi.e(uVarD), new com.avito.android.work_profile.profile.work_profile_host.mvi.c(new YP0.e(this.f331259b, new C10297a(cVar)), uVarD), j.a()));
        }

        @Override // com.avito.android.work_profile.profile.work_profile_host.di.b
        public final void a(WorkProfileHostFragment workProfileHostFragment) {
            workProfileHostFragment.f331293n0 = this.f331263f;
        }
    }

    public static b.a a() {
        return new b();
    }
}
