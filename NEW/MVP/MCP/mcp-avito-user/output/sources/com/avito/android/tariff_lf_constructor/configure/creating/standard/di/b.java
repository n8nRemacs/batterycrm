package com.avito.android.tariff_lf_constructor.configure.creating.standard.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.tariff_lf_constructor.configure.MnzTariffConstructorScreen;
import com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.h;
import com.avito.android.tariff_lf_constructor.configure.creating.standard.ConstructorTariffActivity;
import com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import gD0.InterfaceC40574b;
import hD0.InterfaceC40810b;

/* compiled from: DaggerConstructorTariffComponent.java */
@e
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: DaggerConstructorTariffComponent.java */
    /* renamed from: com.avito.android.tariff_lf_constructor.configure.creating.standard.di.b$b, reason: collision with other inner class name */
    public static final class C9162b implements a.InterfaceC9161a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC40574b f299603a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f299604b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f299605c;

        /* renamed from: d, reason: collision with root package name */
        public MnzTariffConstructorScreen f299606d;

        public C9162b() {
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a.InterfaceC9161a
        public final a.InterfaceC9161a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f299604b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a.InterfaceC9161a
        public final a.InterfaceC9161a b(Resources resources) {
            resources.getClass();
            this.f299605c = resources;
            return this;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a.InterfaceC9161a
        public final com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a build() {
            t.a(InterfaceC40574b.class, this.f299603a);
            t.a(cv.b.class, this.f299604b);
            t.a(Resources.class, this.f299605c);
            t.a(Screen.class, this.f299606d);
            return new c(this.f299603a, this.f299604b, this.f299605c, this.f299606d, null);
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a.InterfaceC9161a
        public final a.InterfaceC9161a c(InterfaceC40574b interfaceC40574b) {
            this.f299603a = interfaceC40574b;
            return this;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a.InterfaceC9161a
        public final a.InterfaceC9161a d(MnzTariffConstructorScreen mnzTariffConstructorScreen) {
            mnzTariffConstructorScreen.getClass();
            this.f299606d = mnzTariffConstructorScreen;
            return this;
        }
    }

    /* compiled from: DaggerConstructorTariffComponent.java */
    public static final class c implements com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f299607a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC40574b f299608b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC40810b> f299609c = g.d(h.a());

        public c(InterfaceC40574b interfaceC40574b, cv.b bVar, Resources resources, Screen screen, a aVar) {
            this.f299607a = bVar;
            this.f299608b = interfaceC40574b;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a
        public final void a(ConstructorTariffActivity constructorTariffActivity) {
            constructorTariffActivity.f299595m = this.f299609c.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f299607a.u4();
            t.c(aVarU4);
            constructorTariffActivity.f299596n = aVarU4;
            constructorTariffActivity.f299597o = this.f299608b.O();
        }
    }

    public static a.InterfaceC9161a a() {
        return new C9162b();
    }
}
