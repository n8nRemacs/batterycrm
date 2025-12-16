package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.deep_linking.links.auth.SessionsSocialLogoutLink;
import lv.C43834a;

/* compiled from: SafetySettingsDeeplinkModule_ProvideSessionsSocialLogoutLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final y f257589a;

    public p(y yVar) {
        this.f257589a = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        y yVar = this.f257589a;
        j.f257583a.getClass();
        return new C43834a(SessionsSocialLogoutLink.class, null, new C43834a.b.C11809b(yVar));
    }
}
