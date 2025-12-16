package com.avito.android.profile_phones.deep_linking;

import com.avito.android.deep_linking.links.auth.PhoneAddLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VerificationPhonesLinkHandlerModule_ProvidePhoneAddDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f227151a;

    /* renamed from: b, reason: collision with root package name */
    public final h f227152b;

    public o(f fVar, h hVar) {
        this.f227151a = fVar;
        this.f227152b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f227152b.getClass();
        g gVar = new g();
        l.f227148a.getClass();
        return new C43834a(PhoneAddLink.class, gVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PhoneAddLink.class), this.f227151a));
    }
}
