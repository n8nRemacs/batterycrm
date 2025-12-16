package com.avito.android.cv_upload.di.cv_picker;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cv_upload.di.cv_picker.a;
import com.avito.android.cv_upload.screens.cv_picker.CvPickerActivity;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerCvPickerComponent.java */
@e
/* loaded from: classes12.dex */
public final class c {

    /* compiled from: DaggerCvPickerComponent.java */
    public static final class b implements com.avito.android.cv_upload.di.cv_picker.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f131632a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.cv_upload.di.cv_picker.b f131633b;

        public b(cv.b bVar, com.avito.android.cv_upload.di.cv_picker.b bVar2, a aVar) {
            this.f131632a = bVar;
            this.f131633b = bVar2;
        }

        @Override // com.avito.android.cv_upload.di.cv_picker.a
        public final void a(CvPickerActivity cvPickerActivity) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f131632a.u4();
            t.c(aVarU4);
            cvPickerActivity.f131688m = aVarU4;
            InterfaceC28373a interfaceC28373aA = this.f131633b.a();
            t.c(interfaceC28373aA);
            cvPickerActivity.f131689n = interfaceC28373aA;
        }
    }

    /* compiled from: DaggerCvPickerComponent.java */
    /* renamed from: com.avito.android.cv_upload.di.cv_picker.c$c, reason: collision with other inner class name */
    public static final class C3937c implements a.InterfaceC3936a {
        public C3937c() {
        }

        @Override // com.avito.android.cv_upload.di.cv_picker.a.InterfaceC3936a
        public final com.avito.android.cv_upload.di.cv_picker.a a(InterfaceC39417a interfaceC39417a, com.avito.android.cv_upload.di.cv_picker.b bVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC39417a, bVar, null);
        }
    }

    public static a.InterfaceC3936a a() {
        return new C3937c();
    }
}
