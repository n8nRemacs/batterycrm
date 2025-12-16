package com.avito.android.edit_address;

import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: EditAddressInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f145934a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f145935b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f145936c;

    public h(Provider<D0> provider, Provider<Gson> provider2, Provider<R0> provider3) {
        this.f145934a = provider;
        this.f145935b = provider2;
        this.f145936c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f145936c.get(), dagger.internal.g.a(dagger.internal.w.a(this.f145934a)), dagger.internal.g.a(dagger.internal.w.a(this.f145935b)));
    }
}
