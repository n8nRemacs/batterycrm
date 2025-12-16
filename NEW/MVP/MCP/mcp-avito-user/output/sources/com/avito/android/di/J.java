package com.avito.android.di;

import com.avito.android.deep_linking.links.ExtendedProfileSettingsLink;
import lv.C43834a;

/* compiled from: ProfileSettingsMappingsModule_ProvideExtendedProfileSettingsLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class J implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final H f139250a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile_settings_extended.deep_linking.c f139251b;

    public J(H h12, com.avito.android.profile_settings_extended.deep_linking.c cVar) {
        this.f139250a = h12;
        this.f139251b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile_settings_extended.deep_linking.c cVar = this.f139251b;
        this.f139250a.getClass();
        return new C43834a(ExtendedProfileSettingsLink.class, null, new C43834a.b.C11809b(cVar));
    }
}
