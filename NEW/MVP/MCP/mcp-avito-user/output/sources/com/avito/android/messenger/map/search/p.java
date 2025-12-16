package com.avito.android.messenger.map.search;

import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: GeoSearchInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f196583a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f196584b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f196585c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f196586d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f196587e;

    public p(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, Provider provider, Provider provider2) {
        this.f196583a = lVar;
        this.f196584b = lVar2;
        this.f196585c = lVar3;
        this.f196586d = provider;
        this.f196587e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((String) this.f196583a.f393949a, (GeoPoint) this.f196584b.f393949a, (GeoPoint) this.f196585c.f393949a, this.f196586d.get(), this.f196587e.get());
    }
}
