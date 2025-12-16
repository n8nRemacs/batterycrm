package com.avito.android.blueprints.metro;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiStateMetroItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f106066a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106067b;

    public g(u uVar, Provider provider) {
        this.f106066a = provider;
        this.f106067b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f106066a.get(), (Q1) this.f106067b.get());
    }
}
