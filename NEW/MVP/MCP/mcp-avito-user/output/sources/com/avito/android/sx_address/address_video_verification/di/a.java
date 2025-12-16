package com.avito.android.sx_address.address_video_verification.di;

import android.content.ContentResolver;
import android.content.res.Resources;
import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.sx_address.SxAddressVideoVerificationParams;
import com.avito.android.sx_address.address_video_verification.SxAddressVideoVerificationFragment;
import com.avito.android.sx_address.address_video_verification.b;
import com.avito.android.sx_address.address_video_verification.di.b;
import com.avito.android.sx_address.address_video_verification.mvi.j;
import com.avito.android.sx_address.address_video_verification.mvi.n;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import zA0.InterfaceC50429b;

/* compiled from: DaggerSxAddressVideoVerificationComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerSxAddressVideoVerificationComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.sx_address.address_video_verification.di.b.a
        public final com.avito.android.sx_address.address_video_verification.di.b a(SxAddressVideoVerificationParams sxAddressVideoVerificationParams, Resources resources, ContentResolver contentResolver, com.avito.android.sx_address.address_video_verification.di.c cVar) {
            return new c(cVar, sxAddressVideoVerificationParams, resources, contentResolver, null);
        }
    }

    /* compiled from: DaggerSxAddressVideoVerificationComponent.java */
    public static final class c implements com.avito.android.sx_address.address_video_verification.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.sx_address.address_video_verification.di.c f292574a;

        /* renamed from: b, reason: collision with root package name */
        public final l f292575b;

        /* renamed from: c, reason: collision with root package name */
        public final u<EA0.a> f292576c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.sx_address.address_video_verification.domain.a> f292577d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f292578e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f292579f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC50429b> f292580g;

        /* renamed from: h, reason: collision with root package name */
        public final u<R0> f292581h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.sx_address.features.a> f292582i;

        /* renamed from: j, reason: collision with root package name */
        public final l f292583j;

        /* renamed from: k, reason: collision with root package name */
        public final u<J0> f292584k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.sx_address.address_video_verification.view.d> f292585l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.sx_address.address_video_verification.domain.d> f292586m;

        /* renamed from: n, reason: collision with root package name */
        public final l f292587n;

        /* compiled from: DaggerSxAddressVideoVerificationComponent.java */
        /* renamed from: com.avito.android.sx_address.address_video_verification.di.a$c$a, reason: collision with other inner class name */
        public static final class C8877a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.address_video_verification.di.c f292588a;

            public C8877a(com.avito.android.sx_address.address_video_verification.di.c cVar) {
                this.f292588a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f292588a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSxAddressVideoVerificationComponent.java */
        public static final class b implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.address_video_verification.di.c f292589a;

            public b(com.avito.android.sx_address.address_video_verification.di.c cVar) {
                this.f292589a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f292589a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerSxAddressVideoVerificationComponent.java */
        /* renamed from: com.avito.android.sx_address.address_video_verification.di.a$c$c, reason: collision with other inner class name */
        public static final class C8878c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.address_video_verification.di.c f292590a;

            public C8878c(com.avito.android.sx_address.address_video_verification.di.c cVar) {
                this.f292590a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f292590a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSxAddressVideoVerificationComponent.java */
        public static final class d implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.address_video_verification.di.c f292591a;

            public d(com.avito.android.sx_address.address_video_verification.di.c cVar) {
                this.f292591a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f292591a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerSxAddressVideoVerificationComponent.java */
        public static final class e implements u<EA0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.address_video_verification.di.c f292592a;

            public e(com.avito.android.sx_address.address_video_verification.di.c cVar) {
                this.f292592a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                EA0.a aVarQ1 = this.f292592a.q1();
                t.c(aVarQ1);
                return aVarQ1;
            }
        }

        /* compiled from: DaggerSxAddressVideoVerificationComponent.java */
        public static final class f implements u<com.avito.android.sx_address.features.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.address_video_verification.di.c f292593a;

            public f(com.avito.android.sx_address.address_video_verification.di.c cVar) {
                this.f292593a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f292593a.J5();
            }
        }

        /* compiled from: DaggerSxAddressVideoVerificationComponent.java */
        public static final class g implements u<com.avito.android.sx_address.address_video_verification.domain.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.address_video_verification.di.c f292594a;

            public g(com.avito.android.sx_address.address_video_verification.di.c cVar) {
                this.f292594a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.sx_address.address_video_verification.domain.a aVarLj = this.f292594a.lj();
                t.c(aVarLj);
                return aVarLj;
            }
        }

        public c(com.avito.android.sx_address.address_video_verification.di.c cVar, SxAddressVideoVerificationParams sxAddressVideoVerificationParams, Resources resources, ContentResolver contentResolver, C8876a c8876a) {
            this.f292574a = cVar;
            this.f292575b = l.a(sxAddressVideoVerificationParams);
            this.f292576c = new e(cVar);
            this.f292577d = new g(cVar);
            this.f292580g = dagger.internal.g.d(new zA0.d(new C8877a(cVar), new b(cVar)));
            this.f292581h = new C8878c(cVar);
            this.f292582i = new f(cVar);
            this.f292583j = l.a(contentResolver);
            this.f292584k = new d(cVar);
            u<com.avito.android.sx_address.address_video_verification.view.d> uVarD = dagger.internal.g.d(new com.avito.android.sx_address.address_video_verification.view.f(l.a(resources)));
            this.f292585l = uVarD;
            u<EA0.a> uVar = this.f292576c;
            u<com.avito.android.sx_address.address_video_verification.domain.a> uVar2 = this.f292577d;
            u<InterfaceC50429b> uVar3 = this.f292580g;
            u<com.avito.android.sx_address.address_video_verification.domain.d> uVarD2 = dagger.internal.g.d(new com.avito.android.sx_address.address_video_verification.domain.l(this.f292575b, this.f292583j, uVarD, uVar, uVar2, uVar3, this.f292581h, this.f292582i, this.f292584k));
            this.f292586m = uVarD2;
            l lVar = this.f292575b;
            u<InterfaceC50429b> uVar4 = this.f292580g;
            this.f292587n = l.a(new com.avito.android.sx_address.address_video_verification.d(new com.avito.android.sx_address.address_video_verification.c(new j(new com.avito.android.sx_address.address_video_verification.mvi.g(lVar, uVarD2, uVar4), new com.avito.android.sx_address.address_video_verification.mvi.e(lVar, uVarD2, uVar4, this.f292581h, this.f292585l), com.avito.android.sx_address.address_video_verification.mvi.l.a(), n.a()))));
        }

        @Override // com.avito.android.sx_address.address_video_verification.di.b
        public final void a(SxAddressVideoVerificationFragment sxAddressVideoVerificationFragment) {
            sxAddressVideoVerificationFragment.f292559n0 = (b.a) this.f292587n.f393949a;
            sxAddressVideoVerificationFragment.f292561p0 = this.f292585l.get();
            sxAddressVideoVerificationFragment.f292562q0 = this.f292574a.h();
        }
    }

    public static b.a a() {
        return new b();
    }
}
