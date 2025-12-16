package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.E;
import com.avito.android.mortgage.deeplink.H;
import com.avito.android.mortgage.deeplink.MortgageDocumentUploadLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageDocumentUploadLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final E f198910a;

    public g(E e12) {
        this.f198910a = e12;
    }

    public static C43834a a(E e12) {
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageDocumentUploadLink.class, new H(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MortgageDocumentUploadLink.class), e12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f198910a);
    }
}
