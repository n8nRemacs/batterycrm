package com.avito.android.cpt.pre_activation.mvi;

import com.avito.android.cpt.pre_activation.data.PreActivationData;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreActivationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f126739a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f126740b;

    public g(dagger.internal.l lVar, Provider provider) {
        this.f126739a = lVar;
        this.f126740b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((PreActivationData) this.f126739a.f393949a, this.f126740b.get());
    }
}
