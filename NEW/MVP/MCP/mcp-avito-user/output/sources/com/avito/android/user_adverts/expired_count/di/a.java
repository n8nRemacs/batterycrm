package com.avito.android.user_adverts.expired_count.di;

import Wl0.InterfaceC15774a;
import com.avito.android.user_adverts.expired_count.di.b;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerUserAdvertsInfoComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerUserAdvertsInfoComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.user_adverts.expired_count.di.c f312129a;

        public b() {
        }
    }

    /* compiled from: DaggerUserAdvertsInfoComponent.java */
    public static final class c implements com.avito.android.user_adverts.expired_count.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_adverts.expired_count.di.c f312130a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC15774a> f312131b;

        /* compiled from: DaggerUserAdvertsInfoComponent.java */
        /* renamed from: com.avito.android.user_adverts.expired_count.di.a$c$a, reason: collision with other inner class name */
        public static final class C9522a implements u<InterfaceC15774a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.expired_count.di.c f312132a;

            public C9522a(com.avito.android.user_adverts.expired_count.di.c cVar) {
                this.f312132a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC15774a interfaceC15774aE3 = this.f312132a.e3();
                t.c(interfaceC15774aE3);
                return interfaceC15774aE3;
            }
        }

        public c(com.avito.android.user_adverts.expired_count.di.c cVar, C9521a c9521a) {
            this.f312130a = cVar;
            this.f312131b = new C9522a(cVar);
        }
    }
}
