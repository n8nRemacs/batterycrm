package com.avito.android.di;

import com.avito.android.deep_linking.links.ThemeSettingsLink;
import iE0.C41276b;
import lv.C43834a;

/* compiled from: SettingsMappingsModule_ProvideThemeSettingsLinkMappingsFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class V implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C41276b f139265a;

    public V(C41276b c41276b) {
        this.f139265a = c41276b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C41276b c41276b = this.f139265a;
        U.f139264a.getClass();
        return new C43834a(ThemeSettingsLink.class, null, new C43834a.b.C11809b(c41276b));
    }
}
