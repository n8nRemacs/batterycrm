package com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.tariff_lf_constructor.configure.MnzTariffConstructorScreen;
import com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.ConstructorTariffBottomSheetActivity;
import com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di.a;
import com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.h;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import gD0.InterfaceC40574b;
import hD0.InterfaceC40810b;

/* compiled from: DaggerConstructorTariffBottomSheetComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: DaggerConstructorTariffBottomSheetComponent.java */
    /* renamed from: com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di.b$b, reason: collision with other inner class name */
    public static final class C9160b implements a.InterfaceC9159a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC40574b f299563a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f299564b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f299565c;

        /* renamed from: d, reason: collision with root package name */
        public MnzTariffConstructorScreen f299566d;

        public C9160b() {
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di.a.InterfaceC9159a
        public final a.InterfaceC9159a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f299564b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di.a.InterfaceC9159a
        public final a.InterfaceC9159a b(Resources resources) {
            resources.getClass();
            this.f299565c = resources;
            return this;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di.a.InterfaceC9159a
        public final com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di.a build() {
            t.a(InterfaceC40574b.class, this.f299563a);
            t.a(cv.b.class, this.f299564b);
            t.a(Resources.class, this.f299565c);
            t.a(Screen.class, this.f299566d);
            return new c(this.f299563a, this.f299564b, this.f299565c, this.f299566d, null);
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di.a.InterfaceC9159a
        public final a.InterfaceC9159a c(InterfaceC40574b interfaceC40574b) {
            this.f299563a = interfaceC40574b;
            return this;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di.a.InterfaceC9159a
        public final a.InterfaceC9159a d(MnzTariffConstructorScreen mnzTariffConstructorScreen) {
            mnzTariffConstructorScreen.getClass();
            this.f299566d = mnzTariffConstructorScreen;
            return this;
        }
    }

    /* compiled from: DaggerConstructorTariffBottomSheetComponent.java */
    public static final class c implements com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f299567a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC40574b f299568b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC40810b> f299569c = dagger.internal.g.d(h.a());

        public c(InterfaceC40574b interfaceC40574b, cv.b bVar, Resources resources, Screen screen, a aVar) {
            this.f299567a = bVar;
            this.f299568b = interfaceC40574b;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.di.a
        public final void a(ConstructorTariffBottomSheetActivity constructorTariffBottomSheetActivity) {
            constructorTariffBottomSheetActivity.f299550m = this.f299569c.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f299567a.u4();
            t.c(aVarU4);
            constructorTariffBottomSheetActivity.f299551n = aVarU4;
            constructorTariffBottomSheetActivity.f299552o = this.f299568b.O();
        }
    }

    public static a.InterfaceC9159a a() {
        return new C9160b();
    }
}
