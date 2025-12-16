package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.C32589d;
import com.avito.android.mortgage.deeplink.C32590e;
import com.avito.android.mortgage.deeplink.MortgageApplicationLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageApplicationLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32589d f198905a;

    public b(C32589d c32589d) {
        this.f198905a = c32589d;
    }

    public static C43834a a(C32589d c32589d) {
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageApplicationLink.class, new C32590e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MortgageApplicationLink.class), c32589d));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f198905a);
    }
}
