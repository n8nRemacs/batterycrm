package com.avito.android.passport.deep_linking;

import com.avito.android.passport.deeplinks.PhoneManagementLink;
import lv.C43834a;

/* compiled from: PhoneDeepLinkHandlerModule_ProvidePhoneManagementDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final z f211105a;

    /* renamed from: b, reason: collision with root package name */
    public final B f211106b;

    public w(z zVar, B b12) {
        this.f211105a = zVar;
        this.f211106b = b12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f211106b.getClass();
        A a12 = new A();
        z zVar = this.f211105a;
        v.f211104a.getClass();
        return new C43834a(PhoneManagementLink.class, a12, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PhoneManagementLink.class), zVar));
    }
}
