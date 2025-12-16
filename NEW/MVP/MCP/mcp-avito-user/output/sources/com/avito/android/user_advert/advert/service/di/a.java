package com.avito.android.user_advert.advert.service.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.notification.m;
import com.avito.android.user_advert.advert.service.UserAdvertService;
import com.avito.android.user_advert.advert.service.di.b;
import dagger.internal.e;
import dagger.internal.t;
import lI0.InterfaceC43640a;

/* compiled from: DaggerUserAdvertServiceComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerUserAdvertServiceComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.user_advert.advert.service.di.c f310625a;

        public b() {
        }

        @Override // com.avito.android.user_advert.advert.service.di.b.a
        public final b.a a(com.avito.android.user_advert.advert.service.di.c cVar) {
            this.f310625a = cVar;
            return this;
        }

        @Override // com.avito.android.user_advert.advert.service.di.b.a
        public final com.avito.android.user_advert.advert.service.di.b build() {
            t.a(com.avito.android.user_advert.advert.service.di.c.class, this.f310625a);
            return new c(this.f310625a, null);
        }
    }

    /* compiled from: DaggerUserAdvertServiceComponent.java */
    public static final class c implements com.avito.android.user_advert.advert.service.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_advert.advert.service.di.c f310626a;

        public c(com.avito.android.user_advert.advert.service.di.c cVar, C9511a c9511a) {
            this.f310626a = cVar;
        }

        @Override // com.avito.android.user_advert.advert.service.di.b
        public final void a(UserAdvertService userAdvertService) {
            com.avito.android.user_advert.advert.service.di.c cVar = this.f310626a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            userAdvertService.f310613b = interfaceC28373aA;
            userAdvertService.f310614c = cVar.m2();
            userAdvertService.f310615d = cVar.i1();
            userAdvertService.f310616e = cVar.C1();
            m mVarA0 = cVar.A0();
            t.c(mVarA0);
            userAdvertService.f310617f = mVarA0;
            InterfaceC43640a interfaceC43640aF3 = cVar.f3();
            t.c(interfaceC43640aF3);
            InterfaceC28373a interfaceC28373aA2 = cVar.a();
            t.c(interfaceC28373aA2);
            userAdvertService.f310618g = new com.avito.android.user_advert.advert.service.c(interfaceC43640aF3, interfaceC28373aA2);
        }
    }

    public static b.a a() {
        return new b();
    }
}
