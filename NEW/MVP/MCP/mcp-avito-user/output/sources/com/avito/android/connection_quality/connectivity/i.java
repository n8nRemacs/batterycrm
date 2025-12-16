package com.avito.android.connection_quality.connectivity;

import android.content.Context;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConnectivityProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f125705a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f125706b;

    public i(u uVar, Provider provider) {
        this.f125705a = uVar;
        this.f125706b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f125705a.get(), this.f125706b.get());
    }
}
