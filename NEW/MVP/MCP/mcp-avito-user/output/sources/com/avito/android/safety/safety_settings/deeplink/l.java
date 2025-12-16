package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.deep_linking.links.auth.PasswordSettingLink;
import lv.C43834a;

/* compiled from: SafetySettingsDeeplinkModule_ProvidePasswordSettingLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f257585a;

    public l(e eVar) {
        this.f257585a = eVar;
    }

    public static C43834a a(e eVar) {
        j.f257583a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PasswordSettingLink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PasswordSettingLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f257585a);
    }
}
