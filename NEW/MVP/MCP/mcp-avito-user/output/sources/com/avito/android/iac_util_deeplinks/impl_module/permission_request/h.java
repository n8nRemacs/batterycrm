package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestAppSettingsWithReturnLink;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PermissionRequestAppSettingsWithReturnLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f169180a;

    public h(f fVar) {
        this.f169180a = fVar;
    }

    public static C43834a a(f fVar) {
        g.f169179a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PermissionRequestAppSettingsWithReturnLink.class, new i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PermissionRequestAppSettingsWithReturnLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f169180a);
    }
}
