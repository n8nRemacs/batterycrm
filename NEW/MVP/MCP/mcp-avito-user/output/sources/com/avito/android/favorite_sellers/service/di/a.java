package com.avito.android.favorite_sellers.service.di;

import com.avito.android.InterfaceC34162r0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.favorite_sellers.service.FavoriteSellerService;
import com.avito.android.favorite_sellers.service.di.b;
import com.avito.android.notification.m;
import com.avito.android.remote.Q;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerFavoriteSellerServiceComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerFavoriteSellerServiceComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.favorite_sellers.service.di.c f156120a;

        public b() {
        }

        @Override // com.avito.android.favorite_sellers.service.di.b.a
        public final b.a a(com.avito.android.favorite_sellers.service.di.c cVar) {
            this.f156120a = cVar;
            return this;
        }

        @Override // com.avito.android.favorite_sellers.service.di.b.a
        public final com.avito.android.favorite_sellers.service.di.b build() {
            t.a(com.avito.android.favorite_sellers.service.di.c.class, this.f156120a);
            return new c(this.f156120a, null);
        }
    }

    /* compiled from: DaggerFavoriteSellerServiceComponent.java */
    public static final class c implements com.avito.android.favorite_sellers.service.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.service.di.c f156121a;

        public c(com.avito.android.favorite_sellers.service.di.c cVar, C4570a c4570a) {
            this.f156121a = cVar;
        }

        @Override // com.avito.android.favorite_sellers.service.di.b
        public final void a(FavoriteSellerService favoriteSellerService) {
            com.avito.android.favorite_sellers.service.di.c cVar = this.f156121a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            favoriteSellerService.f156107b = interfaceC28373aA;
            m mVarA0 = cVar.A0();
            t.c(mVarA0);
            favoriteSellerService.f156108c = mVarA0;
            Q qK1 = cVar.K1();
            t.c(qK1);
            InterfaceC34162r0 interfaceC34162r0J2 = cVar.j2();
            t.c(interfaceC34162r0J2);
            favoriteSellerService.f156109d = new com.avito.android.favorite_sellers.service.e(qK1, interfaceC34162r0J2);
        }
    }

    public static b.a a() {
        return new b();
    }
}
