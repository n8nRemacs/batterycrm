package com.avito.android.certificate_pinning.domain;

import com.avito.android.H0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* compiled from: UnsafeNetworkInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H0> f117790a;

    /* renamed from: b, reason: collision with root package name */
    public final A f117791b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f117792c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<OkHttpClient> f117793d;

    public f(A a12, Provider provider, Provider provider2, Provider provider3) {
        this.f117790a = provider;
        this.f117791b = a12;
        this.f117792c = provider2;
        this.f117793d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f117790a.get(), (Set) this.f117791b.get(), this.f117792c.get(), this.f117793d);
    }
}
