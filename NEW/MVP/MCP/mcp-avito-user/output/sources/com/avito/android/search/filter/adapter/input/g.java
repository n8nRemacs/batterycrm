package com.avito.android.search.filter.adapter.input;

import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.l1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262422a;

    /* renamed from: b, reason: collision with root package name */
    public final u f262423b;

    public g(u uVar, Provider provider) {
        this.f262422a = provider;
        this.f262423b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f262422a.get(), (l1) this.f262423b.get());
    }
}
