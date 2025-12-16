package com.avito.android.bxcontent.shared_listeners;

import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.location.InterfaceC31506h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BxSharedLocationListenerInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC31506h> f112927a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC31062w> f112928b;

    public i(Provider<InterfaceC31506h> provider, Provider<InterfaceC31062w> provider2) {
        this.f112927a = provider;
        this.f112928b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f112927a.get(), this.f112928b.get());
    }
}
