package com.avito.android.location;

import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import lW.InterfaceC43691a;

/* compiled from: LocationInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30715a> f181792a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<r> f181793b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f181794c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<xI.e> f181795d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC43691a> f181796e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f181797f;

    public k(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f181792a = provider;
        this.f181793b = provider2;
        this.f181794c = provider3;
        this.f181795d = provider4;
        this.f181796e = provider5;
        this.f181797f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f181792a.get(), this.f181793b.get(), this.f181794c.get(), this.f181795d.get(), this.f181796e.get(), (LocationInteractorState) this.f181797f.f393949a);
    }
}
