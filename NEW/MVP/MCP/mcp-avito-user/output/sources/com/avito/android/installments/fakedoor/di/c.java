package com.avito.android.installments.fakedoor.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments.fakedoor.InstallmentsFakedoorDialog;
import com.avito.android.installments.fakedoor.di.f;
import com.avito.android.installments.fakedoor.m;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerInstallmentsFakedoorDialogComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class c {

    /* compiled from: DaggerInstallmentsFakedoorDialogComponent.java */
    public static final class b implements f.a {
        public b() {
        }

        @Override // com.avito.android.installments.fakedoor.di.f.a
        public final f a(e eVar, InterfaceC39417a interfaceC39417a, long j12, String str, String str2, boolean z12, DeepLink deepLink, String str3, long j13) {
            interfaceC39417a.getClass();
            str.getClass();
            str2.getClass();
            deepLink.getClass();
            return new C5085c(eVar, interfaceC39417a, Long.valueOf(j12), str, str2, Boolean.valueOf(z12), deepLink, str3, Long.valueOf(j13), null);
        }
    }

    /* compiled from: DaggerInstallmentsFakedoorDialogComponent.java */
    /* renamed from: com.avito.android.installments.fakedoor.di.c$c, reason: collision with other inner class name */
    public static final class C5085c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final u<XN.a> f172513a;

        /* renamed from: b, reason: collision with root package name */
        public final l f172514b;

        /* renamed from: c, reason: collision with root package name */
        public final l f172515c;

        /* renamed from: d, reason: collision with root package name */
        public final l f172516d;

        /* renamed from: e, reason: collision with root package name */
        public final l f172517e;

        /* renamed from: f, reason: collision with root package name */
        public final l f172518f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f172519g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.installments.fakedoor.f f172520h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f172521i;

        /* renamed from: j, reason: collision with root package name */
        public final m f172522j;

        /* compiled from: DaggerInstallmentsFakedoorDialogComponent.java */
        /* renamed from: com.avito.android.installments.fakedoor.di.c$c$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f172523a;

            public a(e eVar) {
                this.f172523a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f172523a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerInstallmentsFakedoorDialogComponent.java */
        /* renamed from: com.avito.android.installments.fakedoor.di.c$c$b */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f172524a;

            public b(cv.b bVar) {
                this.f172524a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f172524a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerInstallmentsFakedoorDialogComponent.java */
        /* renamed from: com.avito.android.installments.fakedoor.di.c$c$c, reason: collision with other inner class name */
        public static final class C5086c implements u<XN.a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f172525a;

            public C5086c(e eVar) {
                this.f172525a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                XN.a aVarA9 = this.f172525a.a9();
                t.c(aVarA9);
                return aVarA9;
            }
        }

        public C5085c(e eVar, cv.b bVar, Long l12, String str, String str2, Boolean bool, DeepLink deepLink, String str3, Long l13, a aVar) {
            this.f172513a = new C5086c(eVar);
            this.f172514b = l.a(l12);
            this.f172515c = l.a(str);
            this.f172516d = l.a(deepLink);
            this.f172517e = l.a(str3);
            this.f172518f = l.a(l13);
            this.f172520h = new com.avito.android.installments.fakedoor.f(this.f172513a, this.f172514b, this.f172515c, this.f172516d, this.f172517e, this.f172518f, l.a(str2), new a(eVar));
            l lVarA = l.a(bool);
            com.avito.android.installments.fakedoor.f fVar = this.f172520h;
            this.f172522j = new m(new com.avito.android.installments.fakedoor.mvi.g(new com.avito.android.installments.fakedoor.mvi.d(fVar, lVarA), new com.avito.android.installments.fakedoor.mvi.b(fVar, new b(bVar)), com.avito.android.installments.fakedoor.mvi.i.a()));
        }

        @Override // com.avito.android.installments.fakedoor.di.f
        public final void a(InstallmentsFakedoorDialog installmentsFakedoorDialog) {
            installmentsFakedoorDialog.f172491i0 = this.f172522j;
        }
    }

    public static f.a a() {
        return new b();
    }
}
