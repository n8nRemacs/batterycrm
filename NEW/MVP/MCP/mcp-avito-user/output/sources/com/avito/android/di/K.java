package com.avito.android.di;

import com.avito.android.profile_settings_extended.deep_linking.ProfileDisableExtendedLink;
import lv.C43834a;

/* compiled from: ProfileSettingsMappingsModule_ProvideProfileDisableExtendedMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final H f139252a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile_settings_extended.deep_linking.j f139253b;

    public K(H h12, com.avito.android.profile_settings_extended.deep_linking.j jVar) {
        this.f139252a = h12;
        this.f139253b = jVar;
    }

    public static C43834a a(H h12, com.avito.android.profile_settings_extended.deep_linking.j jVar) {
        h12.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ProfileDisableExtendedLink.class, new com.avito.android.profile_settings_extended.deep_linking.k(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ProfileDisableExtendedLink.class), jVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f139252a, this.f139253b);
    }
}
