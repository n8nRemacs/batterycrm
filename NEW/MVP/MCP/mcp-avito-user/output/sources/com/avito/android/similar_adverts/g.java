package com.avito.android.similar_adverts;

import com.avito.android.rec.ScreenSource;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import fa.InterfaceC40383a;
import javax.inject.Provider;

/* compiled from: SimilarAdvertsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40383a> f283929a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f283930b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f283931c;

    public g(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f283929a = provider;
        this.f283930b = provider2;
        this.f283931c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f283929a.get(), this.f283930b.get(), (ScreenSource) this.f283931c.f393949a);
    }
}
