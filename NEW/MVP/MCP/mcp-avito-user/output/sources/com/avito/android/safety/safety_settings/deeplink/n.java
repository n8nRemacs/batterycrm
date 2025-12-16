package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.deep_linking.links.auth.SessionDeleteLink;
import lv.C43834a;

/* compiled from: SafetySettingsDeeplinkModule_ProvideSessionDeleteLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final t f257587a;

    public n(t tVar) {
        this.f257587a = tVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        t tVar = this.f257587a;
        j.f257583a.getClass();
        return new C43834a(SessionDeleteLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SessionDeleteLink.class), tVar));
    }
}
