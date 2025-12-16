package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemSettingsLink;
import lv.C43834a;

/* compiled from: PermissionSystemSettingsLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class K implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final I f169126a;

    public K(I i12) {
        this.f169126a = i12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        J.f169125a.getClass();
        return new C43834a(PermissionSystemSettingsLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PermissionSystemSettingsLink.class), this.f169126a));
    }
}
