package com.avito.android.details_sheet.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.details_sheet.DetailsSheetActivity;
import com.avito.android.details_sheet.di.b;
import cv.InterfaceC39417a;
import dagger.internal.t;

/* compiled from: DaggerDetailsSheetActivityComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerDetailsSheetActivityComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.details_sheet.di.c f135937a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f135938b;

        public b() {
        }

        @Override // com.avito.android.details_sheet.di.b.a
        public final b.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f135938b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.details_sheet.di.b.a
        public final b.a b(com.avito.android.details_sheet.di.c cVar) {
            this.f135937a = cVar;
            return this;
        }

        @Override // com.avito.android.details_sheet.di.b.a
        public final com.avito.android.details_sheet.di.b build() {
            t.a(com.avito.android.details_sheet.di.c.class, this.f135937a);
            t.a(cv.b.class, this.f135938b);
            return new c(this.f135937a, this.f135938b, null);
        }
    }

    /* compiled from: DaggerDetailsSheetActivityComponent.java */
    public static final class c implements com.avito.android.details_sheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.details_sheet.di.c f135939a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f135940b;

        public c(com.avito.android.details_sheet.di.c cVar, cv.b bVar, C4111a c4111a) {
            this.f135939a = cVar;
            this.f135940b = bVar;
        }

        @Override // com.avito.android.details_sheet.di.b
        public final void a(DetailsSheetActivity detailsSheetActivity) {
            com.avito.android.details_sheet.di.c cVar = this.f135939a;
            detailsSheetActivity.f135922n = cVar.h();
            com.avito.android.util.text.a aVarE = cVar.e();
            t.c(aVarE);
            detailsSheetActivity.f135923o = aVarE;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            detailsSheetActivity.f135924p = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f135940b.u4();
            t.c(aVarU4);
            detailsSheetActivity.f135925q = aVarU4;
            com.avito.android.ui.status_bar.e eVarB0 = cVar.b0();
            t.c(eVarB0);
            detailsSheetActivity.f135926r = eVarB0;
        }
    }

    public static b.a a() {
        return new b();
    }
}
