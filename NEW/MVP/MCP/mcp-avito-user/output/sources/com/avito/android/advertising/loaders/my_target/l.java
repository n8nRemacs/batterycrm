package com.avito.android.advertising.loaders.my_target;

import android.content.Context;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rb.InterfaceC47628b;

/* compiled from: MyTargetBannerLoaderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f88427a;

    /* renamed from: b, reason: collision with root package name */
    public final u f88428b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47628b> f88429c;

    public l(u uVar, Provider provider, Provider provider2) {
        this.f88427a = provider;
        this.f88428b = uVar;
        this.f88429c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f88427a.get(), (com.avito.android.advertising.loaders.f) this.f88428b.get(), this.f88429c.get());
    }
}
