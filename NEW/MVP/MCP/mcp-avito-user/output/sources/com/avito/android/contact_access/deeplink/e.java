package com.avito.android.contact_access.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactsPackagesApplyLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f126075a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f126076b;

    public e(dv.b bVar, dv.b bVar2) {
        this.f126075a = bVar;
        this.f126076b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.d) this.f126075a.get(), (a.f) this.f126076b.get());
    }
}
