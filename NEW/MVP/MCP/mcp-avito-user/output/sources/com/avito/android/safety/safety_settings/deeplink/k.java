package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.deep_linking.links.auth.PasswordChangeLink;
import lv.C43834a;

/* compiled from: SafetySettingsDeeplinkModule_ProvidePasswordChangeLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f257584a;

    public k(c cVar) {
        this.f257584a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = this.f257584a;
        j.f257583a.getClass();
        return new C43834a(PasswordChangeLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PasswordChangeLink.class), cVar));
    }
}
