package com.avito.android.advert.badge_details.di;

import android.content.res.Resources;
import com.avito.android.advert.badge_details.BadgeDetailsActivity;
import com.avito.android.advert.badge_details.di.a;
import com.avito.android.advert.badge_details.h;
import com.avito.android.advert.badge_details.n;
import com.avito.android.advert.badge_details.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import fa.InterfaceC40383a;

/* compiled from: DaggerBadgeDetailsComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class e {

    /* compiled from: DaggerBadgeDetailsComponent.java */
    public static final class b implements com.avito.android.advert.badge_details.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final l f68762a;

        /* renamed from: b, reason: collision with root package name */
        public final l f68763b;

        /* renamed from: c, reason: collision with root package name */
        public final l f68764c;

        /* renamed from: d, reason: collision with root package name */
        public final l f68765d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f68766e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC40383a> f68767f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.advert.badge_details.d> f68768g;

        /* renamed from: h, reason: collision with root package name */
        public final u<n> f68769h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC35745a5> f68770i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f68771j;

        /* renamed from: k, reason: collision with root package name */
        public final u<h> f68772k;

        /* compiled from: DaggerBadgeDetailsComponent.java */
        public static final class a implements u<InterfaceC40383a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.badge_details.di.b f68773a;

            public a(com.avito.android.advert.badge_details.di.b bVar) {
                this.f68773a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40383a interfaceC40383aD2 = this.f68773a.d2();
                t.c(interfaceC40383aD2);
                return interfaceC40383aD2;
            }
        }

        /* compiled from: DaggerBadgeDetailsComponent.java */
        /* renamed from: com.avito.android.advert.badge_details.di.e$b$b, reason: collision with other inner class name */
        public static final class C2153b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.badge_details.di.b f68774a;

            public C2153b(com.avito.android.advert.badge_details.di.b bVar) {
                this.f68774a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f68774a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerBadgeDetailsComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f68775a;

            public c(cv.b bVar) {
                this.f68775a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f68775a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerBadgeDetailsComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.badge_details.di.b f68776a;

            public d(com.avito.android.advert.badge_details.di.b bVar) {
                this.f68776a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f68776a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public b(com.avito.android.advert.badge_details.di.b bVar, cv.b bVar2, Integer num, String str, String str2, Kundle kundle, Resources resources, a aVar) {
            this.f68762a = l.a(num);
            this.f68763b = l.a(str);
            this.f68764c = l.a(str2);
            this.f68765d = l.b(kundle);
            this.f68766e = new C2153b(bVar);
            this.f68768g = dagger.internal.g.d(new com.avito.android.advert.badge_details.g(new a(bVar)));
            u<n> uVarD = dagger.internal.g.d(new p(l.a(resources)));
            this.f68769h = uVarD;
            this.f68772k = dagger.internal.g.d(new com.avito.android.advert.badge_details.l(this.f68762a, this.f68763b, this.f68764c, this.f68765d, this.f68766e, this.f68768g, uVarD, new d(bVar), new c(bVar2)));
        }

        @Override // com.avito.android.advert.badge_details.di.a
        public final void a(BadgeDetailsActivity badgeDetailsActivity) {
            badgeDetailsActivity.f68760m = this.f68772k.get();
        }
    }

    /* compiled from: DaggerBadgeDetailsComponent.java */
    public static final class c implements a.InterfaceC2152a {
        public c() {
        }

        @Override // com.avito.android.advert.badge_details.di.a.InterfaceC2152a
        public final com.avito.android.advert.badge_details.di.a a(int i12, String str, String str2, Kundle kundle, Resources resources, com.avito.android.advert.badge_details.di.b bVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, Integer.valueOf(i12), str, str2, kundle, resources, null);
        }
    }

    public static a.InterfaceC2152a a() {
        return new c();
    }
}
