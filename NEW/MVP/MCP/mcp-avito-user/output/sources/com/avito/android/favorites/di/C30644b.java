package com.avito.android.favorites.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.favorites.InterfaceC30704y;
import com.avito.android.favorites.O;
import com.avito.android.favorites.S;
import com.avito.android.favorites.di.A;

/* compiled from: DaggerFavoriteAdvertsServiceComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.favorites.di.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30644b {

    /* compiled from: DaggerFavoriteAdvertsServiceComponent.java */
    /* renamed from: com.avito.android.favorites.di.b$b, reason: collision with other inner class name */
    public static final class C4600b implements A.a {

        /* renamed from: a, reason: collision with root package name */
        public B f157310a;

        public C4600b() {
        }
    }

    /* compiled from: DaggerFavoriteAdvertsServiceComponent.java */
    /* renamed from: com.avito.android.favorites.di.b$c */
    public static final class c implements A {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.u<ZC.c> f157311a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorite.x> f157312b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f157313c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<S> f157314d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30704y> f157315e;

        /* compiled from: DaggerFavoriteAdvertsServiceComponent.java */
        /* renamed from: com.avito.android.favorites.di.b$c$a */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final B f157316a;

            public a(B b12) {
                this.f157316a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f157316a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFavoriteAdvertsServiceComponent.java */
        /* renamed from: com.avito.android.favorites.di.b$c$b, reason: collision with other inner class name */
        public static final class C4601b implements dagger.internal.u<S> {

            /* renamed from: a, reason: collision with root package name */
            public final B f157317a;

            public C4601b(B b12) {
                this.f157317a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                S sI9 = this.f157317a.I9();
                dagger.internal.t.c(sI9);
                return sI9;
            }
        }

        /* compiled from: DaggerFavoriteAdvertsServiceComponent.java */
        /* renamed from: com.avito.android.favorites.di.b$c$c, reason: collision with other inner class name */
        public static final class C4602c implements dagger.internal.u<ZC.c> {

            /* renamed from: a, reason: collision with root package name */
            public final B f157318a;

            public C4602c(B b12) {
                this.f157318a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZC.c cVarH5 = this.f157318a.H5();
                dagger.internal.t.c(cVarH5);
                return cVarH5;
            }
        }

        /* compiled from: DaggerFavoriteAdvertsServiceComponent.java */
        /* renamed from: com.avito.android.favorites.di.b$c$d */
        public static final class d implements dagger.internal.u<com.avito.android.favorite.x> {

            /* renamed from: a, reason: collision with root package name */
            public final B f157319a;

            public d(B b12) {
                this.f157319a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f157319a.m0();
            }
        }

        public c(B b12, a aVar) {
            this.f157315e = dagger.internal.g.d(new O(new C4602c(b12), new d(b12), new a(b12), new C4601b(b12)));
        }
    }
}
