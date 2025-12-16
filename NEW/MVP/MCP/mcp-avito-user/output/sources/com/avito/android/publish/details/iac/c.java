package com.avito.android.publish.details.iac;

import com.avito.android.permissions.z;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacPermissionCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<OL.a> f234710a;

    /* renamed from: b, reason: collision with root package name */
    public final u f234711b;

    /* renamed from: c, reason: collision with root package name */
    public final u f234712c;

    public c(u uVar, u uVar2, Provider provider) {
        this.f234710a = provider;
        this.f234711b = uVar;
        this.f234712c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f234710a.get(), (z) this.f234711b.get(), (com.avito.android.server_time.f) this.f234712c.get());
    }
}
