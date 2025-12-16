package com.avito.android.cv_validation_bottom_sheet.di;

import Y41.l;
import android.content.res.Resources;
import androidx.recyclerview.widget.C;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cv_validation_bottom_sheet.di.a;
import com.avito.android.cv_validation_bottom_sheet.di.d;
import com.avito.android.cv_validation_bottom_sheet.list.CvItem;
import com.avito.android.cv_validation_bottom_sheet.mvi.p;
import com.avito.android.cv_validation_bottom_sheet.mvi.r;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheet;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheetOpenParams;
import com.avito.android.di.module.C30125n4;
import com.avito.android.di.module.C30136o4;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import iQ.InterfaceC41332a;
import java.util.Locale;
import kotlin.G0;

/* compiled from: DaggerCvValidationBottomSheetComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class i {

    /* compiled from: DaggerCvValidationBottomSheetComponent.java */
    public static final class b implements com.avito.android.cv_validation_bottom_sheet.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super CvItem, G0> f131829a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.cv_validation_bottom_sheet.di.b f131830b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.f f131831c;

        /* renamed from: d, reason: collision with root package name */
        public final e f131832d;

        /* renamed from: e, reason: collision with root package name */
        public final u<j> f131833e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C> f131834f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f131835g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f131836h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Locale> f131837i;

        /* renamed from: j, reason: collision with root package name */
        public final C30125n4 f131838j;

        /* renamed from: k, reason: collision with root package name */
        public final r f131839k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f131840l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f131841m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC41332a> f131842n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.cv_validation_bottom_sheet.mvi.u f131843o;

        /* compiled from: DaggerCvValidationBottomSheetComponent.java */
        public static final class a implements u<InterfaceC41332a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_validation_bottom_sheet.di.b f131844a;

            public a(com.avito.android.cv_validation_bottom_sheet.di.b bVar) {
                this.f131844a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41332a interfaceC41332aCb = this.f131844a.cb();
                t.c(interfaceC41332aCb);
                return interfaceC41332aCb;
            }
        }

        /* compiled from: DaggerCvValidationBottomSheetComponent.java */
        /* renamed from: com.avito.android.cv_validation_bottom_sheet.di.i$b$b, reason: collision with other inner class name */
        public static final class C3946b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f131845a;

            public C3946b(cv.b bVar) {
                this.f131845a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f131845a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCvValidationBottomSheetComponent.java */
        public static final class c implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_validation_bottom_sheet.di.b f131846a;

            public c(com.avito.android.cv_validation_bottom_sheet.di.b bVar) {
                this.f131846a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f131846a.locale();
            }
        }

        /* compiled from: DaggerCvValidationBottomSheetComponent.java */
        public static final class d implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_validation_bottom_sheet.di.b f131847a;

            public d(com.avito.android.cv_validation_bottom_sheet.di.b bVar) {
                this.f131847a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f131847a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.cv_validation_bottom_sheet.di.b bVar, cv.b bVar2, CvValidationBottomSheetOpenParams cvValidationBottomSheetOpenParams, Resources resources, l lVar, a aVar) {
            this.f131829a = lVar;
            this.f131830b = bVar;
            this.f131831c = new dagger.internal.f();
            e eVar = new e(new com.avito.android.cv_validation_bottom_sheet.list.b(new com.avito.android.cv_validation_bottom_sheet.list.d(dagger.internal.l.a(lVar))));
            this.f131832d = eVar;
            u<j> uVarD = dagger.internal.g.d(new h(this.f131831c, eVar));
            this.f131833e = uVarD;
            this.f131834f = dagger.internal.g.d(new g(uVarD));
            u<com.avito.android.recycler.data_aware.e> uVarD2 = dagger.internal.g.d(d.a.f131821a);
            this.f131835g = uVarD2;
            dagger.internal.f.a(this.f131831c, dagger.internal.g.d(new f(this.f131834f, this.f131832d, uVarD2)));
            this.f131836h = new d(bVar);
            C30125n4 c30125n4 = new C30125n4(this.f131836h, new C30136o4(com.avito.android.date_time_formatter.i.b(new com.avito.android.date_time_formatter.h(dagger.internal.l.a(resources)))), new c(bVar));
            this.f131838j = c30125n4;
            this.f131839k = new r(c30125n4);
            this.f131840l = new C3946b(bVar2);
            dagger.internal.l lVarA = dagger.internal.l.a(cvValidationBottomSheetOpenParams);
            this.f131841m = lVarA;
            this.f131843o = new com.avito.android.cv_validation_bottom_sheet.mvi.u(new com.avito.android.cv_validation_bottom_sheet.mvi.l(this.f131839k, new com.avito.android.cv_validation_bottom_sheet.mvi.i(this.f131840l, lVarA, new com.avito.android.cv_validation_bottom_sheet.domain.b(new a(bVar))), p.a(), this.f131841m, this.f131838j));
        }

        @Override // com.avito.android.cv_validation_bottom_sheet.di.a
        public final void a(CvValidationBottomSheet cvValidationBottomSheet) throws BlueprintCollisionException {
            com.avito.android.cv_validation_bottom_sheet.list.a aVar = new com.avito.android.cv_validation_bottom_sheet.list.a(new com.avito.android.cv_validation_bottom_sheet.list.c(this.f131829a));
            com.avito.android.cv_validation_bottom_sheet.di.c.f131820a.getClass();
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(aVar);
            c10493a.a();
            com.avito.android.cv_validation_bottom_sheet.di.b bVar = this.f131830b;
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            cvValidationBottomSheet.f131927h0 = interfaceC28373aA;
            com.avito.android.analytics.provider.a aVarV = bVar.v();
            t.c(aVarV);
            cvValidationBottomSheet.f131928i0 = aVarV;
            cvValidationBottomSheet.f131929j0 = (com.avito.konveyor.adapter.a) this.f131831c.get();
            cvValidationBottomSheet.f131930k0 = this.f131833e.get();
            cvValidationBottomSheet.f131931l0 = this.f131843o;
        }
    }

    /* compiled from: DaggerCvValidationBottomSheetComponent.java */
    public static final class c implements a.InterfaceC3945a {
        public c() {
        }

        @Override // com.avito.android.cv_validation_bottom_sheet.di.a.InterfaceC3945a
        public final com.avito.android.cv_validation_bottom_sheet.di.a a(CvValidationBottomSheetOpenParams cvValidationBottomSheetOpenParams, Resources resources, l lVar, com.avito.android.cv_validation_bottom_sheet.di.b bVar, InterfaceC39417a interfaceC39417a) {
            cvValidationBottomSheetOpenParams.getClass();
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, cvValidationBottomSheetOpenParams, resources, lVar, null);
        }
    }

    public static a.InterfaceC3945a a() {
        return new c();
    }
}
