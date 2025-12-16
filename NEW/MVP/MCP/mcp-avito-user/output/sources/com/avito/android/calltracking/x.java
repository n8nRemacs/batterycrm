package com.avito.android.calltracking;

import am.InterfaceC19907a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: CalltrackingInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19907a> f113788a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f113789b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f113790c;

    public x(Provider<InterfaceC19907a> provider, Provider<com.avito.android.remote.error.f> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f113788a = provider;
        this.f113789b = provider2;
        this.f113790c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f113788a.get(), this.f113789b.get(), this.f113790c.get());
    }
}
