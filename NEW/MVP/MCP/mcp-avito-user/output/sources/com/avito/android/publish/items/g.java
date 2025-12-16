package com.avito.android.publish.items;

import com.avito.android.publish.details.InterfaceC33675a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xe0.C49932c;
import xe0.InterfaceC49930a;

/* compiled from: PublishStepHeaderProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33675a> f236850a;

    /* renamed from: b, reason: collision with root package name */
    public final C49932c f236851b;

    public g(Provider provider, C49932c c49932c) {
        this.f236850a = provider;
        this.f236851b = c49932c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f236850a.get(), (InterfaceC49930a) this.f236851b.get());
    }
}
