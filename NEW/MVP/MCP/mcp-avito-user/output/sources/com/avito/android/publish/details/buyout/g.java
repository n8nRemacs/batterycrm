package com.avito.android.publish.details.buyout;

import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SendDraftToInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H0> f233576a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f233577b;

    public g(Provider<H0> provider, Provider<InterfaceC35745a5> provider2) {
        this.f233576a = provider;
        this.f233577b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f233576a.get(), this.f233577b.get());
    }
}
