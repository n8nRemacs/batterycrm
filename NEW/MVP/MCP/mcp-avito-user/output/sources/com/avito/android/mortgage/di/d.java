package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.C32599n;
import com.avito.android.mortgage.deeplink.C32600o;
import com.avito.android.mortgage.deeplink.MortgageApplicationsListLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageApplicationsListLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32599n f198907a;

    public d(C32599n c32599n) {
        this.f198907a = c32599n;
    }

    public static C43834a a(C32599n c32599n) {
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageApplicationsListLink.class, new C32600o(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MortgageApplicationsListLink.class), c32599n));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f198907a);
    }
}
