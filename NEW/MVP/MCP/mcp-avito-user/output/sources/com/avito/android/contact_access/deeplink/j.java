package com.avito.android.contact_access.deeplink;

import Gr.InterfaceC13909a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactsPackagesBuyLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f126085a;

    /* renamed from: b, reason: collision with root package name */
    public final Gr.d f126086b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f126087c;

    public j(dv.b bVar, Gr.d dVar, dv.b bVar2) {
        this.f126085a = bVar;
        this.f126086b = dVar;
        this.f126087c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((a.InterfaceC4053a) this.f126085a.get(), (InterfaceC13909a) this.f126086b.get(), (a.b) this.f126087c.get());
    }
}
