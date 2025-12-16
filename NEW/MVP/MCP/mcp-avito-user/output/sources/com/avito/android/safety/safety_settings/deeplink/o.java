package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.deep_linking.links.auth.SessionsInfoLink;
import lv.C43834a;

/* compiled from: SafetySettingsDeeplinkModule_ProvideSessionsSocialInfoLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final v f257588a;

    public o(v vVar) {
        this.f257588a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j.f257583a.getClass();
        return new C43834a(SessionsInfoLink.class, null, new C43834a.b.C11809b(this.f257588a));
    }
}
