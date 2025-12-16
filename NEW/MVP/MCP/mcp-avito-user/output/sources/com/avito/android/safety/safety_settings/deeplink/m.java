package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.safety.deeplink.SafetySettingsLink;
import lv.C43834a;

/* compiled from: SafetySettingsDeeplinkModule_ProvideSafetySettingsLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f257586a;

    public m(i iVar) {
        this.f257586a = iVar;
    }

    public static C43834a a(i iVar) {
        j.f257583a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SafetySettingsLink.class, new q(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SafetySettingsLink.class), iVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f257586a);
    }
}
