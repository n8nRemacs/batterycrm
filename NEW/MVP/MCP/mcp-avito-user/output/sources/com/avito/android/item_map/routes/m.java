package com.avito.android.item_map.routes;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RoutesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f173403a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<e> f173404b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f173405c;

    public m(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f173403a = provider;
        this.f173404b = provider2;
        this.f173405c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f173403a.get(), this.f173404b.get(), (Kundle) this.f173405c.f393949a);
    }
}
