package com.avito.android.candy;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RemoteCarImageSource_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f114908a;

    /* renamed from: b, reason: collision with root package name */
    public final d f114909b;

    public s(Provider provider, d dVar) {
        this.f114908a = provider;
        this.f114909b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f114908a.get(), (c) this.f114909b.get());
    }
}
