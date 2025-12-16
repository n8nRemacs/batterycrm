package com.avito.android.developments_agency_search.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: HelpCenterLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<C29842m> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f136452a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f136453b;

    public n(dagger.internal.f fVar, dv.b bVar) {
        this.f136452a = bVar;
        this.f136453b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29842m((a.d) this.f136452a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f136453b.get());
    }
}
