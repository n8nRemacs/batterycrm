package com.avito.android.auto_reseller_contacts.deepLink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BuyContactsDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f95732a;

    public e(dv.b bVar) {
        this.f95732a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.d) this.f95732a.get());
    }
}
