package com.avito.android.universal_map;

import android.app.Application;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalMapIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f304777a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f304778b;

    public g(dagger.internal.l lVar, Provider provider) {
        this.f304777a = lVar;
        this.f304778b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Application) this.f304777a.f393949a, dagger.internal.g.b(this.f304778b));
    }
}
