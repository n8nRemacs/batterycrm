package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet;

import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BuyContactsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final g f95711a;

    public f(g gVar) {
        this.f95711a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.f) this.f95711a.get(), null, 2, null);
    }
}
