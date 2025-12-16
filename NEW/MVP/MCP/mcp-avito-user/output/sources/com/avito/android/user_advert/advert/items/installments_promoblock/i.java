package com.avito.android.user_advert.advert.items.installments_promoblock;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsPromoBlockItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309526a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309527b;

    /* renamed from: c, reason: collision with root package name */
    public final u f309528c;

    public i(u uVar, u uVar2, u uVar3) {
        this.f309526a = uVar;
        this.f309527b = uVar2;
        this.f309528c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.lib.util.groupable_item.b) this.f309526a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f309527b.get(), (InterfaceC28373a) this.f309528c.get());
    }
}
