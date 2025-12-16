package com.avito.android.adaptive.image.di;

import android.app.Application;
import com.avito.android.adaptive.image.ab_test.AdaptiveImageLoadingAbTestGroup;
import com.avito.android.adaptive.image.di.a;
import com.avito.android.adaptive.image.di.h;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import u3.l;

/* compiled from: DaggerAdaptiveImagePickerComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class j {

    /* compiled from: DaggerAdaptiveImagePickerComponent.java */
    public static final class b implements com.avito.android.adaptive.image.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.adaptive.image.di.b f68515a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Application> f68516b;

        /* renamed from: c, reason: collision with root package name */
        public final g f68517c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R3.a> f68518d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R3.e> f68519e;

        /* renamed from: f, reason: collision with root package name */
        public final u<H> f68520f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.adaptive.image.a> f68521g;

        /* compiled from: DaggerAdaptiveImagePickerComponent.java */
        public static final class a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.adaptive.image.di.b f68522a;

            public a(com.avito.android.adaptive.image.di.b bVar) {
                this.f68522a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f68522a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerAdaptiveImagePickerComponent.java */
        /* renamed from: com.avito.android.adaptive.image.di.j$b$b, reason: collision with other inner class name */
        public static final class C2145b implements u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.adaptive.image.di.b f68523a;

            public C2145b(com.avito.android.adaptive.image.di.b bVar) {
                this.f68523a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H hY02 = this.f68523a.y0();
                t.c(hY02);
                return hY02;
            }
        }

        public b(com.avito.android.adaptive.image.di.b bVar, a aVar) {
            this.f68515a = bVar;
            g gVar = new g(new a(bVar));
            this.f68517c = gVar;
            this.f68518d = dagger.internal.g.d(new f(gVar));
            u<R3.e> uVarD = dagger.internal.g.d(new i(this.f68517c));
            this.f68519e = uVarD;
            this.f68521g = B.a(new d(this.f68518d, uVarD, new C2145b(bVar), h.a.f68513a));
        }

        @Override // com.avito.android.adaptive.image.di.a
        public final l<AdaptiveImageLoadingAbTestGroup> a() {
            l<AdaptiveImageLoadingAbTestGroup> lVarNd = this.f68515a.nd();
            t.c(lVarNd);
            return lVarNd;
        }

        @Override // com.avito.android.adaptive.image.di.a
        public final Q3.c b() {
            InterfaceC28373a interfaceC28373aA = this.f68515a.a();
            t.c(interfaceC28373aA);
            com.avito.android.adaptive.image.di.c.f68506a.getClass();
            return new Q3.c(interfaceC28373aA);
        }

        @Override // com.avito.android.adaptive.image.di.a
        public final com.avito.android.adaptive.image.a c() {
            return this.f68521g.get();
        }
    }

    /* compiled from: DaggerAdaptiveImagePickerComponent.java */
    public static final class c implements a.InterfaceC2144a {
        public c() {
        }

        @Override // com.avito.android.adaptive.image.di.a.InterfaceC2144a
        public final com.avito.android.adaptive.image.di.a a(com.avito.android.adaptive.image.di.b bVar) {
            return new b(bVar, null);
        }
    }

    public static a.InterfaceC2144a a() {
        return new c();
    }
}
