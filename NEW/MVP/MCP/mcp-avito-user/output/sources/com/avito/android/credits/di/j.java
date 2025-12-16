package com.avito.android.credits.di;

import com.avito.android.deep_linking.links.CreditPartnerLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import ws.C49678b;

/* compiled from: CreditDeepLinksHandlerModule_ProvideCreditPartnerLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C49678b f128858a;

    public j(C49678b c49678b) {
        this.f128858a = c49678b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C49678b c49678b = this.f128858a;
        i.f128857a.getClass();
        return new C43834a(CreditPartnerLink.class, null, new C43834a.b.C11809b(c49678b));
    }
}
