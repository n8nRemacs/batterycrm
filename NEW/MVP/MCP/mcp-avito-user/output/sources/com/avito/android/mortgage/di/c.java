package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.C32594i;
import com.avito.android.mortgage.deeplink.C32595j;
import com.avito.android.mortgage.deeplink.MortgageApplicationProxyLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageApplicationProxyLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32594i f198906a;

    public c(C32594i c32594i) {
        this.f198906a = c32594i;
    }

    public static C43834a a(C32594i c32594i) {
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageApplicationProxyLink.class, new C32595j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MortgageApplicationProxyLink.class), c32594i));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f198906a);
    }
}
