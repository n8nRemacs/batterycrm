package com.avito.android.quic;

import android.app.Application;
import dagger.internal.y;

/* compiled from: QuicModule_ProvideQuicHintsStorageFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f246270a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f246271b;

    public m(f fVar, dagger.internal.l lVar) {
        this.f246270a = fVar;
        this.f246271b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f246271b.f393949a;
        this.f246270a.getClass();
        return new a(new g(application), null, 2, null);
    }
}
