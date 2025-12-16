package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di;

import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.BuyContactBottomSheet;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.data.BuyContactOpenParams;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.a;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.f;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.d;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.g;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.i;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.k;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;

/* compiled from: DaggerBuyContactComponent.java */
@e
/* loaded from: classes11.dex */
public final class c {

    /* compiled from: DaggerBuyContactComponent.java */
    public static final class b implements com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f95707a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.b f95708b;

        /* renamed from: c, reason: collision with root package name */
        public final d f95709c;

        /* renamed from: d, reason: collision with root package name */
        public final f f95710d;

        public b(cv.b bVar, com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.b bVar2, BuyContactOpenParams buyContactOpenParams, a aVar) {
            this.f95707a = bVar;
            this.f95708b = bVar2;
            this.f95709c = new d(l.a(buyContactOpenParams));
            this.f95710d = new f(new g(com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.b.a(), this.f95709c, k.a(), i.a()));
        }

        @Override // com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.a
        public final void a(BuyContactBottomSheet buyContactBottomSheet) {
            buyContactBottomSheet.f95688i0 = this.f95710d;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f95707a.u4();
            t.c(aVarU4);
            buyContactBottomSheet.f95695p0 = aVarU4;
            com.avito.android.util.text.a aVarE = this.f95708b.e();
            t.c(aVarE);
            buyContactBottomSheet.f95696q0 = aVarE;
        }
    }

    /* compiled from: DaggerBuyContactComponent.java */
    /* renamed from: com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.c$c, reason: collision with other inner class name */
    public static final class C2831c implements a.InterfaceC2830a {
        public C2831c() {
        }

        @Override // com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.a.InterfaceC2830a
        public final com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.a a(com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.di.b bVar, InterfaceC39417a interfaceC39417a, BuyContactOpenParams buyContactOpenParams) {
            interfaceC39417a.getClass();
            buyContactOpenParams.getClass();
            return new b(interfaceC39417a, bVar, buyContactOpenParams, null);
        }
    }

    public static a.InterfaceC2830a a() {
        return new C2831c();
    }
}
