package com.avito.android.di.component;

import com.avito.android.P;
import com.avito.android.di.InterfaceC29968e;
import com.avito.android.di.component.InterfaceC29906m;
import com.avito.android.di.module.B2;
import com.avito.android.di.module.C2;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;

/* compiled from: DaggerCheckRequestComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class r {

    /* compiled from: DaggerCheckRequestComponent.java */
    public static final class b implements InterfaceC29906m.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC29968e f139322a;

        public b() {
        }

        @Override // com.avito.android.di.component.InterfaceC29906m.a
        public final InterfaceC29906m.a a(InterfaceC29968e interfaceC29968e) {
            this.f139322a = interfaceC29968e;
            return this;
        }

        @Override // com.avito.android.di.component.InterfaceC29906m.a
        public final InterfaceC29906m build() {
            dagger.internal.t.a(InterfaceC29968e.class, this.f139322a);
            return new c(this.f139322a, null);
        }
    }

    /* compiled from: DaggerCheckRequestComponent.java */
    public static final class c implements InterfaceC29906m {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC29968e f139323a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<Gson> f139324b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.a> f139325c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service.short_task.o> f139326d;

        /* compiled from: DaggerCheckRequestComponent.java */
        public static final class a implements dagger.internal.u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29968e f139327a;

            public a(InterfaceC29968e interfaceC29968e) {
                this.f139327a = interfaceC29968e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f139327a.s();
                dagger.internal.t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerCheckRequestComponent.java */
        public static final class b implements dagger.internal.u<com.avito.android.server_time.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29968e f139328a;

            public b(InterfaceC29968e interfaceC29968e) {
                this.f139328a = interfaceC29968e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.a aVarT = this.f139328a.T();
                dagger.internal.t.c(aVarT);
                return aVarT;
            }
        }

        public c(InterfaceC29968e interfaceC29968e, a aVar) {
            this.f139323a = interfaceC29968e;
            this.f139326d = dagger.internal.g.d(new C2(new a(interfaceC29968e), new b(interfaceC29968e)));
        }

        @Override // com.avito.android.di.component.InterfaceC29906m
        public final com.avito.android.service.short_task.p a() {
            InterfaceC29968e interfaceC29968e = this.f139323a;
            OkHttpClient okHttpClientIl = interfaceC29968e.Il();
            dagger.internal.t.c(okHttpClientIl);
            P pE2 = interfaceC29968e.E();
            com.avito.android.service.short_task.b bVar = new com.avito.android.service.short_task.b(interfaceC29968e.Dd());
            com.avito.android.service.short_task.o oVar = this.f139326d.get();
            B2.f143846a.getClass();
            return new com.avito.android.service.short_task.p(okHttpClientIl, pE2, bVar, oVar);
        }
    }

    public static InterfaceC29906m.a a() {
        return new b();
    }
}
