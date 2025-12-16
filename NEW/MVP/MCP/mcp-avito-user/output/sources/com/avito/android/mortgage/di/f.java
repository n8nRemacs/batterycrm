package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.B;
import com.avito.android.mortgage.deeplink.C32609y;
import com.avito.android.mortgage.deeplink.MortgageDocumentRequirementsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageDocumentRequirementsLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32609y f198909a;

    public f(C32609y c32609y) {
        this.f198909a = c32609y;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C32609y c32609y = this.f198909a;
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageDocumentRequirementsLink.class, new B(), new C43834a.b.C11809b(c32609y));
    }
}
