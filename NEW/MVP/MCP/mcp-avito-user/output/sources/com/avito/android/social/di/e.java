package com.avito.android.social.di;

import com.avito.android.remote.profile.generated.api.ProfileApi;
import com.avito.android.social.di.g;
import com.avito.android.social.esia.EsiaAuthActivity;
import com.avito.android.social.esia.mvi.m;
import com.avito.android.util.R0;
import dagger.internal.t;
import dagger.internal.u;
import hD.C40806a;

/* compiled from: DaggerEsiaAuthComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: DaggerEsiaAuthComponent.java */
    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final u<ProfileApi> f284332a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f284333b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.social.esia.mvi.b f284334c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C40806a> f284335d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.social.esia.mvi.h f284336e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.social.esia.j f284337f;

        /* compiled from: DaggerEsiaAuthComponent.java */
        public static final class a implements u<C40806a> {

            /* renamed from: a, reason: collision with root package name */
            public final g.a f284338a;

            public a(g.a aVar) {
                this.f284338a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f284338a.R();
            }
        }

        /* compiled from: DaggerEsiaAuthComponent.java */
        /* renamed from: com.avito.android.social.di.e$b$b, reason: collision with other inner class name */
        public static final class C8499b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final g.a f284339a;

            public C8499b(g.a aVar) {
                this.f284339a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f284339a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEsiaAuthComponent.java */
        public static final class c implements u<ProfileApi> {

            /* renamed from: a, reason: collision with root package name */
            public final g.a f284340a;

            public c(g.a aVar) {
                this.f284340a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ProfileApi profileApiC7 = this.f284340a.c7();
                t.c(profileApiC7);
                return profileApiC7;
            }
        }

        public b(g.a aVar, a aVar2) {
            this.f284334c = new com.avito.android.social.esia.mvi.b(new com.avito.android.social.esia.mvi.f(new c(aVar), new C8499b(aVar)));
            this.f284336e = new com.avito.android.social.esia.mvi.h(new a(aVar), com.avito.android.social.esia.g.a());
            this.f284337f = new com.avito.android.social.esia.j(new com.avito.android.social.esia.mvi.k(this.f284334c, m.a(), this.f284336e));
        }

        @Override // com.avito.android.social.di.g
        public final void a(EsiaAuthActivity esiaAuthActivity) {
            esiaAuthActivity.f284370b = this.f284337f;
        }
    }

    /* compiled from: DaggerEsiaAuthComponent.java */
    public static final class c implements g.b {
        public c() {
        }

        @Override // com.avito.android.social.di.g.b
        public final g a(g.a aVar) {
            return new b(aVar, null);
        }
    }

    public static g.b a() {
        return new c();
    }
}
