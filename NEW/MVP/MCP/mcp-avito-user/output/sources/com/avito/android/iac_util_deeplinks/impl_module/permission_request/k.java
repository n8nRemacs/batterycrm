package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import com.avito.android.permissions.z;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PermissionRequestCheckLinkHandler_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z> f169184a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f169185b;

    public k(dagger.internal.f fVar, Provider provider) {
        this.f169184a = provider;
        this.f169185b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.deeplink_handler.handler.composite.a) this.f169185b.get(), this.f169184a.get());
    }
}
