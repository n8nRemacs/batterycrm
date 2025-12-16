package com.avito.android.profile_phones.deep_linking;

import com.avito.android.deep_linking.links.auth.PhoneVerificationStatusLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VerificationPhonesLinkHandlerModule_ProvidePhoneVerificationStatusMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f227153a;

    public p(j jVar) {
        this.f227153a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = this.f227153a;
        l.f227148a.getClass();
        return new C43834a(PhoneVerificationStatusLink.class, null, new C43834a.b.C11809b(jVar));
    }
}
