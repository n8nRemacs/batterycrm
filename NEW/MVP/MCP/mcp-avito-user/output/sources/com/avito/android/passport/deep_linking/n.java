package com.avito.android.passport.deep_linking;

import com.avito.android.passport.deeplinks.PassportDuplicationFinishLink;
import lv.C43834a;

/* compiled from: PassportDeepLinkHandlerModule_ProvidePassportDuplicationFinishLinkMapping$_avito_passport_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final N50.b f211077a;

    public n(N50.b bVar) {
        this.f211077a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        N50.b bVar = this.f211077a;
        C32957d.f211067a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportDuplicationFinishLink.class, new N50.c(), new C43834a.b.C11809b(bVar));
    }
}
