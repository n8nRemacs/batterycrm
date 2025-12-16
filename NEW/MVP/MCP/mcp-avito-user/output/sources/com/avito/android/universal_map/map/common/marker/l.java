package com.avito.android.universal_map.map.common.marker;

import android.content.Context;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MarkerLabelManagerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AvitoMapAttachHelper> f304984a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f304985b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f304984a = provider;
        this.f304985b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f304984a.get(), (Context) this.f304985b.f393949a);
    }
}
