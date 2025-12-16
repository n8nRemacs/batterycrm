package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi;

import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.data.BuyContactOpenParams;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BuyContactsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f95717a;

    public d(l lVar) {
        this.f95717a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((BuyContactOpenParams) this.f95717a.f393949a);
    }
}
