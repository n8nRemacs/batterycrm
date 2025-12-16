package com.avito.android.quic.cronet;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CronetEngineCreator_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f246200a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.quic.p> f246201b;

    public c(C30102l3 c30102l3, Provider provider) {
        this.f246200a = c30102l3;
        this.f246201b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f246200a.get(), this.f246201b.get());
    }
}
