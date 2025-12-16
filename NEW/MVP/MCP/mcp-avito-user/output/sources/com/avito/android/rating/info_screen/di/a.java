package com.avito.android.rating.info_screen.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.rating.info_screen.RatingDetailsInfoActivity;
import com.avito.android.rating.info_screen.di.b;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerRatingDetailsInfoComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRatingDetailsInfoComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.rating.info_screen.di.b.a
        public final com.avito.android.rating.info_screen.di.b a(InterfaceC39417a interfaceC39417a, com.avito.android.rating.info_screen.di.c cVar) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, cVar, null);
        }
    }

    /* compiled from: DaggerRatingDetailsInfoComponent.java */
    public static final class c implements com.avito.android.rating.info_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f247622a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.rating.info_screen.di.c f247623b;

        public c(cv.b bVar, com.avito.android.rating.info_screen.di.c cVar, C7431a c7431a) {
            this.f247622a = bVar;
            this.f247623b = cVar;
        }

        @Override // com.avito.android.rating.info_screen.di.b
        public final void a(RatingDetailsInfoActivity ratingDetailsInfoActivity) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f247622a.u4();
            t.c(aVarU4);
            ratingDetailsInfoActivity.f247617m = aVarU4;
            com.avito.android.rating.info_screen.di.c cVar = this.f247623b;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            ratingDetailsInfoActivity.f247618n = interfaceC28373aA;
            com.avito.android.analytics.provider.a aVarV = cVar.v();
            t.c(aVarV);
            ratingDetailsInfoActivity.f247619o = aVarV;
        }
    }

    public static b.a a() {
        return new b();
    }
}
