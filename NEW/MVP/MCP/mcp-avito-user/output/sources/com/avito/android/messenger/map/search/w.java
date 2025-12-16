package com.avito.android.messenger.map.search;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.map.search.q;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: GeoSearchPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f196616a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.messenger.map.search.di.f f196617b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f196618c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f196619d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f196620e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f196621f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f196622g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f196623h;

    public w(Provider provider, com.avito.android.messenger.map.search.di.f fVar, dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider3) {
        this.f196616a = provider;
        this.f196617b = fVar;
        this.f196618c = lVar;
        this.f196619d = lVar2;
        this.f196620e = provider2;
        this.f196621f = lVar3;
        this.f196622g = lVar4;
        this.f196623h = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f196616a.get(), (h) this.f196617b.get(), (String) this.f196618c.f393949a, (String) this.f196619d.f393949a, this.f196620e.get(), (String) this.f196621f.f393949a, (q.a) this.f196622g.f393949a, this.f196623h.get());
    }
}
