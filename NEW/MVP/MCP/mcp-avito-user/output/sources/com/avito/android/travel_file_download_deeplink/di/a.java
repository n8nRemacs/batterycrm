package com.avito.android.travel_file_download_deeplink.di;

import Y41.l;
import android.app.DownloadManager;
import android.content.Context;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.travel_file_download_deeplink.FileDownloadActivity;
import com.avito.android.travel_file_download_deeplink.FileDownloadOpenParams;
import com.avito.android.travel_file_download_deeplink.di.b;
import com.avito.android.travel_file_download_deeplink.mvi.j;
import com.avito.android.travel_file_download_deeplink.mvi.m;
import com.avito.android.travel_file_download_deeplink.mvi.r;
import com.avito.android.travel_file_download_deeplink.mvi.v;
import com.avito.android.util.C;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import rm0.InterfaceC47681a;

/* compiled from: DaggerFileDownloadComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerFileDownloadComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.travel_file_download_deeplink.di.b.a
        public final com.avito.android.travel_file_download_deeplink.di.b a(InterfaceC39417a interfaceC39417a, e eVar, C28478k c28478k, l lVar, FileDownloadOpenParams fileDownloadOpenParams) {
            interfaceC39417a.getClass();
            return new c(new f(), interfaceC39417a, eVar, c28478k, lVar, fileDownloadOpenParams, null);
        }
    }

    /* compiled from: DaggerFileDownloadComponent.java */
    public static final class c implements com.avito.android.travel_file_download_deeplink.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f301731a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Context> f301732b;

        /* renamed from: c, reason: collision with root package name */
        public final u<DownloadManager> f301733c;

        /* renamed from: d, reason: collision with root package name */
        public final u<M> f301734d;

        /* renamed from: e, reason: collision with root package name */
        public final u<P0> f301735e;

        /* renamed from: f, reason: collision with root package name */
        public final u<B0> f301736f;

        /* renamed from: g, reason: collision with root package name */
        public final u<U0> f301737g;

        /* renamed from: h, reason: collision with root package name */
        public final u<I> f301738h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC47681a> f301739i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C> f301740j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.travel_file_download_deeplink.mvi.f f301741k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.travel_file_download_deeplink.mvi.d f301742l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f301743m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f301744n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.travel_file_download_deeplink.i f301745o;

        /* compiled from: DaggerFileDownloadComponent.java */
        /* renamed from: com.avito.android.travel_file_download_deeplink.di.a$c$a, reason: collision with other inner class name */
        public static final class C9239a implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_file_download_deeplink.di.e f301746a;

            public C9239a(com.avito.android.travel_file_download_deeplink.di.e eVar) {
                this.f301746a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f301746a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerFileDownloadComponent.java */
        public static final class b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_file_download_deeplink.di.e f301747a;

            public b(com.avito.android.travel_file_download_deeplink.di.e eVar) {
                this.f301747a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f301747a.g();
            }
        }

        /* compiled from: DaggerFileDownloadComponent.java */
        /* renamed from: com.avito.android.travel_file_download_deeplink.di.a$c$c, reason: collision with other inner class name */
        public static final class C9240c implements u<I> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_file_download_deeplink.di.e f301748a;

            public C9240c(com.avito.android.travel_file_download_deeplink.di.e eVar) {
                this.f301748a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f301748a.U2();
            }
        }

        /* compiled from: DaggerFileDownloadComponent.java */
        public static final class d implements u<M> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_file_download_deeplink.di.e f301749a;

            public d(com.avito.android.travel_file_download_deeplink.di.e eVar) {
                this.f301749a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f301749a.X2();
            }
        }

        /* compiled from: DaggerFileDownloadComponent.java */
        public static final class e implements u<InterfaceC47681a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_file_download_deeplink.di.e f301750a;

            public e(com.avito.android.travel_file_download_deeplink.di.e eVar) {
                this.f301750a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f301750a.n0();
            }
        }

        /* compiled from: DaggerFileDownloadComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_file_download_deeplink.di.e f301751a;

            public f(com.avito.android.travel_file_download_deeplink.di.e eVar) {
                this.f301751a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f301751a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerFileDownloadComponent.java */
        public static final class g implements u<B0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_file_download_deeplink.di.e f301752a;

            public g(com.avito.android.travel_file_download_deeplink.di.e eVar) {
                this.f301752a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f301752a.s5();
            }
        }

        /* compiled from: DaggerFileDownloadComponent.java */
        public static final class h implements u<P0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_file_download_deeplink.di.e f301753a;

            public h(com.avito.android.travel_file_download_deeplink.di.e eVar) {
                this.f301753a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f301753a.d1();
            }
        }

        /* compiled from: DaggerFileDownloadComponent.java */
        public static final class i implements u<U0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_file_download_deeplink.di.e f301754a;

            public i(com.avito.android.travel_file_download_deeplink.di.e eVar) {
                this.f301754a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f301754a.I0();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.travel_file_download_deeplink.di.f fVar, cv.b bVar, com.avito.android.travel_file_download_deeplink.di.e eVar, C28478k c28478k, l lVar, FileDownloadOpenParams fileDownloadOpenParams, C9238a c9238a) {
            this.f301731a = dagger.internal.l.a(fileDownloadOpenParams);
            u<DownloadManager> uVarD = dagger.internal.g.d(new com.avito.android.travel_file_download_deeplink.di.g(fVar, new b(eVar)));
            this.f301733c = uVarD;
            r rVar = new r(uVarD, new m(new d(eVar), new h(eVar), new g(eVar), new i(eVar), new C9240c(eVar), new e(eVar), new C9239a(eVar)));
            this.f301741k = new com.avito.android.travel_file_download_deeplink.mvi.f(this.f301731a, rVar);
            this.f301742l = new com.avito.android.travel_file_download_deeplink.mvi.d(rVar);
            this.f301743m = new f(eVar);
            this.f301744n = dagger.internal.g.d(new com.avito.android.travel_file_download_deeplink.di.h(fVar, this.f301743m, dagger.internal.l.a(c28478k)));
            this.f301745o = new com.avito.android.travel_file_download_deeplink.i(new j(this.f301741k, this.f301742l, com.avito.android.travel_file_download_deeplink.mvi.t.a(), v.a(), this.f301744n));
        }

        @Override // com.avito.android.travel_file_download_deeplink.di.b
        public final void a(FileDownloadActivity fileDownloadActivity) {
            fileDownloadActivity.f301655m = this.f301745o;
            fileDownloadActivity.f301657o = this.f301744n.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
