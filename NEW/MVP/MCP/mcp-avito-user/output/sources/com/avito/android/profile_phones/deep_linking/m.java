package com.avito.android.profile_phones.deep_linking;

import com.avito.android.deep_linking.links.auth.LandlinePhoneVerificationLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VerificationPhonesLinkHandlerModule_ProvideLandlinePhoneVerificationMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f227149a;

    public m(b bVar) {
        this.f227149a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = this.f227149a;
        l.f227148a.getClass();
        return new C43834a(LandlinePhoneVerificationLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(LandlinePhoneVerificationLink.class), bVar));
    }
}
