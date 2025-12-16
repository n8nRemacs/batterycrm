package com.avito.android.app.task;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* compiled from: SendRostelecomUserHashTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class Q1 implements dagger.internal.h<SendRostelecomUserHashTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<OkHttpClient> f91503a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f91504b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f91505c;

    public Q1(Provider<OkHttpClient> provider, Provider<com.avito.android.account.G> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f91503a = provider;
        this.f91504b = provider2;
        this.f91505c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SendRostelecomUserHashTask(dagger.internal.g.b(this.f91503a), this.f91504b.get(), this.f91505c.get());
    }
}
