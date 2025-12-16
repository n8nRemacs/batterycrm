package com.avito.android.publish.realty_address_submission.di;

import com.avito.android.publish.realty_address_submission.RealtyAddressSubmissionBottomSheetDialog;
import com.avito.android.publish.realty_address_submission.di.b;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerRealtyAddressSubmissionComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRealtyAddressSubmissionComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.publish.realty_address_submission.di.c f239047a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f239048b;

        public b() {
        }

        @Override // com.avito.android.publish.realty_address_submission.di.b.a
        public final b.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f239048b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.publish.realty_address_submission.di.b.a
        public final b.a b(com.avito.android.publish.realty_address_submission.di.c cVar) {
            this.f239047a = cVar;
            return this;
        }

        @Override // com.avito.android.publish.realty_address_submission.di.b.a
        public final com.avito.android.publish.realty_address_submission.di.b build() {
            t.a(com.avito.android.publish.realty_address_submission.di.c.class, this.f239047a);
            t.a(cv.b.class, this.f239048b);
            return new c(this.f239047a, this.f239048b, null);
        }
    }

    /* compiled from: DaggerRealtyAddressSubmissionComponent.java */
    public static final class c implements com.avito.android.publish.realty_address_submission.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f239049a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.publish.realty_address_submission.di.c f239050b;

        public c(com.avito.android.publish.realty_address_submission.di.c cVar, cv.b bVar, C7185a c7185a) {
            this.f239049a = bVar;
            this.f239050b = cVar;
        }

        @Override // com.avito.android.publish.realty_address_submission.di.b
        public final void a(RealtyAddressSubmissionBottomSheetDialog realtyAddressSubmissionBottomSheetDialog) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f239049a.u4();
            t.c(aVarU4);
            realtyAddressSubmissionBottomSheetDialog.f239041h0 = aVarU4;
            realtyAddressSubmissionBottomSheetDialog.f239042i0 = this.f239050b.i1();
        }
    }

    public static b.a a() {
        return new b();
    }
}
