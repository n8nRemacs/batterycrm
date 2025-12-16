package com.avito.android.developments_agency_search.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: TariffCardRegionSelectorLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f136380a;

    public H(dv.b bVar) {
        this.f136380a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G((a.d) this.f136380a.get());
    }
}
