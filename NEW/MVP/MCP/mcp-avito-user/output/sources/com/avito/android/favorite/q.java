package com.avito.android.favorite;

import com.avito.android.util.InterfaceC35745a5;

/* compiled from: FavoriteAdvertsPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final m f155235a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f155236b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.h f155237c;

    public q(m mVar, dagger.internal.u uVar, dagger.internal.h hVar) {
        this.f155235a = mVar;
        this.f155236b = uVar;
        this.f155237c = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p((h) this.f155235a.get(), (InterfaceC35745a5) this.f155236b.get(), (String) this.f155237c.get());
    }
}
