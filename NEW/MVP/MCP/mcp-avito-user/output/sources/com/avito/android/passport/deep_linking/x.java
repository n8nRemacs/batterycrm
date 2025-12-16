package com.avito.android.passport.deep_linking;

import com.avito.android.passport.deeplinks.PhonesListLink;
import lv.C43834a;

/* compiled from: PhoneDeepLinkHandlerModule_ProvidePhonesListMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class x implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final D f211107a;

    public x(D d12) {
        this.f211107a = d12;
    }

    public static C43834a a(D d12) {
        v.f211104a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PhonesListLink.class, new E(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PhonesListLink.class), d12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f211107a);
    }
}
