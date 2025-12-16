package com.avito.android.profile_phones.deep_linking;

import com.avito.android.deep_linking.links.auth.MobilePhoneVerificationLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VerificationPhonesLinkHandlerModule_ProvideMobilePhoneVerificationMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f227150a;

    public n(d dVar) {
        this.f227150a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f227150a;
        l.f227148a.getClass();
        return new C43834a(MobilePhoneVerificationLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MobilePhoneVerificationLink.class), dVar));
    }
}
