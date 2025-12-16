package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.util.MortgageVerificationFlowLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageVerificationFlowLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final YZ.b f198916a;

    public m(YZ.b bVar) {
        this.f198916a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        YZ.b bVar = this.f198916a;
        a.f198904a.getClass();
        return new C43834a(MortgageVerificationFlowLink.class, null, new C43834a.b.C11809b(bVar));
    }
}
