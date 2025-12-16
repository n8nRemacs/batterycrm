package com.avito.android.di.component;

import android.app.Application;
import android.content.Context;
import com.avito.android.di.component.E;
import com.avito.android.di.module.C30169r5;
import com.avito.android.di.module.C30180s5;
import com.avito.android.di.module.C30191t5;
import com.avito.android.di.module.C30202u5;
import com.avito.android.photo_picker.Q;
import com.avito.android.photo_picker.T;
import com.avito.android.photo_picker.U;
import com.avito.android.photo_picker.W;
import com.avito.android.photo_picker.X;
import com.avito.android.photo_picker.Z;
import com.avito.android.photo_picker.legacy.service.ImageUploadService;
import com.avito.android.service.d;
import com.avito.android.util.InterfaceC35745a5;
import com.google.common.collect.AbstractC37412t1;
import com.google.gson.Gson;
import java.util.Map;
import n80.InterfaceC44212a;

/* compiled from: DaggerImageUploadServiceComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class u {

    /* compiled from: DaggerImageUploadServiceComponent.java */
    public static final class b implements E.a {

        /* renamed from: a, reason: collision with root package name */
        public F f139361a;

        /* renamed from: b, reason: collision with root package name */
        public ImageUploadService f139362b;

        /* renamed from: c, reason: collision with root package name */
        public Gson f139363c;

        public b() {
        }

        @Override // com.avito.android.di.component.E.a
        public final E.a a(Gson gson) {
            this.f139363c = gson;
            return this;
        }

        @Override // com.avito.android.di.component.E.a
        @Deprecated
        public final E.a b(C30169r5 c30169r5) {
            c30169r5.getClass();
            return this;
        }

        @Override // com.avito.android.di.component.E.a
        public final E build() {
            dagger.internal.t.a(F.class, this.f139361a);
            dagger.internal.t.a(d.a.class, this.f139362b);
            dagger.internal.t.a(Gson.class, this.f139363c);
            return new c(this.f139361a, this.f139362b, this.f139363c, null);
        }

        @Override // com.avito.android.di.component.E.a
        public final E.a c(F f12) {
            this.f139361a = f12;
            return this;
        }

        @Override // com.avito.android.di.component.E.a
        public final E.a d(ImageUploadService imageUploadService) {
            this.f139362b = imageUploadService;
            return this;
        }
    }

    /* compiled from: DaggerImageUploadServiceComponent.java */
    public static final class c implements E {

        /* renamed from: a, reason: collision with root package name */
        public final F f139364a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_cache.b> f139365b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<Map<String, InterfaceC44212a>> f139366c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<U> f139367d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<Application> f139368e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<Context> f139369f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.photo_storage.k f139370g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.converter.b> f139371h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<Q> f139372i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<Map<String, n80.b>> f139373j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<X> f139374k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f139375l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.legacy.service.c> f139376m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service.d> f139377n;

        /* compiled from: DaggerImageUploadServiceComponent.java */
        public static final class a implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final F f139378a;

            public a(F f12) {
                this.f139378a = f12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f139378a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerImageUploadServiceComponent.java */
        public static final class b implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final F f139379a;

            public b(F f12) {
                this.f139379a = f12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f139379a.g();
            }
        }

        /* compiled from: DaggerImageUploadServiceComponent.java */
        /* renamed from: com.avito.android.di.component.u$c$c, reason: collision with other inner class name */
        public static final class C4205c implements dagger.internal.u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final F f139380a;

            public C4205c(F f12) {
                this.f139380a = f12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f139380a.F();
                dagger.internal.t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerImageUploadServiceComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final F f139381a;

            public d(F f12) {
                this.f139381a = f12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f139381a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerImageUploadServiceComponent.java */
        public static final class e implements dagger.internal.u<Map<String, InterfaceC44212a>> {

            /* renamed from: a, reason: collision with root package name */
            public final F f139382a;

            public e(F f12) {
                this.f139382a = f12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AbstractC37412t1 abstractC37412t1Jk = this.f139382a.jk();
                dagger.internal.t.c(abstractC37412t1Jk);
                return abstractC37412t1Jk;
            }
        }

        /* compiled from: DaggerImageUploadServiceComponent.java */
        public static final class f implements dagger.internal.u<Map<String, n80.b>> {

            /* renamed from: a, reason: collision with root package name */
            public final F f139383a;

            public f(F f12) {
                this.f139383a = f12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Map<String, n80.b> mapWg = this.f139383a.wg();
                dagger.internal.t.c(mapWg);
                return mapWg;
            }
        }

        public c(F f12, d.a aVar, Gson gson, a aVar2) {
            this.f139364a = f12;
            this.f139365b = new C4205c(f12);
            this.f139367d = dagger.internal.g.d(new W(new e(f12)));
            this.f139368e = new a(f12);
            com.avito.android.photo_storage.k kVarA = com.avito.android.photo_storage.k.a(new b(f12));
            this.f139370g = kVarA;
            this.f139371h = dagger.internal.g.d(new C30180s5(this.f139368e, kVarA));
            this.f139372i = dagger.internal.g.d(new T(this.f139368e, this.f139370g, this.f139371h, N70.d.a(dagger.internal.l.a(gson))));
            dagger.internal.u<X> uVarD = dagger.internal.g.d(new Z(new f(f12)));
            this.f139374k = uVarD;
            this.f139376m = dagger.internal.g.d(new C30191t5(uVarD, this.f139365b, this.f139367d, this.f139372i, new d(f12)));
            this.f139377n = dagger.internal.g.d(new C30202u5(dagger.internal.l.a(aVar)));
        }

        @Override // com.avito.android.di.component.E
        public final void a(ImageUploadService imageUploadService) {
            imageUploadService.f219845b = this.f139376m.get();
            imageUploadService.f219846c = this.f139377n.get();
            imageUploadService.f219847d = this.f139364a.Y5();
        }
    }

    public static E.a a() {
        return new b();
    }
}
