package com.avito.android.di;

import Cb0.C13239b;
import com.avito.android.deep_linking.links.ProfileSettingsLink;
import lv.C43834a;

/* compiled from: ProfileSettingsMappingsModule_ProvideProfileSettingsLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class L implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final H f139254a;

    /* renamed from: b, reason: collision with root package name */
    public final C13239b f139255b;

    public L(H h12, C13239b c13239b) {
        this.f139254a = h12;
        this.f139255b = c13239b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C13239b c13239b = this.f139255b;
        this.f139254a.getClass();
        return new C43834a(ProfileSettingsLink.class, null, new C43834a.b.C11809b(c13239b));
    }
}
