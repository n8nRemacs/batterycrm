package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog;

import Zf.InterfaceC19551a;
import com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.remote.model.model_card.ModelCardInfo;

/* compiled from: DaggerAutoFlatsTwoColumnDialogComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class z {

    /* compiled from: DaggerAutoFlatsTwoColumnDialogComponent.java */
    public static final class b implements com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.a {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC19551a> f68751a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.d f68752b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.b f68753c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f68754d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f68755e;

        /* renamed from: f, reason: collision with root package name */
        public final x f68756f;

        /* compiled from: DaggerAutoFlatsTwoColumnDialogComponent.java */
        public static final class a implements dagger.internal.u<InterfaceC19551a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.b f68757a;

            public a(com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.b bVar) {
                this.f68757a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19551a interfaceC19551aOa = this.f68757a.Oa();
                dagger.internal.t.c(interfaceC19551aOa);
                return interfaceC19551aOa;
            }
        }

        /* compiled from: DaggerAutoFlatsTwoColumnDialogComponent.java */
        /* renamed from: com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.z$b$b, reason: collision with other inner class name */
        public static final class C2151b implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f68758a;

            public C2151b(InterfaceC30106l7 interfaceC30106l7) {
                this.f68758a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f68758a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.b bVar, InterfaceC30106l7 interfaceC30106l7, C28478k c28478k, ModelCardInfo modelCardInfo, a aVar) {
            this.f68751a = new a(bVar);
            j jVar = new j(dagger.internal.l.b(modelCardInfo), this.f68751a);
            this.f68752b = new com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.d(jVar);
            this.f68753c = new com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.b(jVar);
            this.f68754d = new C2151b(interfaceC30106l7);
            this.f68755e = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f68754d);
            this.f68756f = new x(new com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.g(this.f68752b, this.f68753c, com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.i.a(), com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.k.a(), this.f68755e));
        }
    }

    /* compiled from: DaggerAutoFlatsTwoColumnDialogComponent.java */
    public static final class c implements a.InterfaceC2150a {
        public c() {
        }
    }
}
