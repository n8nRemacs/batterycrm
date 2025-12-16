package com.avito.android.passport.deep_linking;

import com.avito.android.deep_linking.links.PassportAuthSuggestLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvidePassportAuthSuggestAsyncDeepLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32955b f211074a;

    public k(C32955b c32955b) {
        this.f211074a = c32955b;
    }

    public static C43834a a(C32955b c32955b) {
        C32957d.f211067a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportAuthSuggestLink.class, new C32956c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PassportAuthSuggestLink.class), c32955b));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f211074a);
    }
}
