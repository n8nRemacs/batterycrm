package com.avito.android.favorite_apprater;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteAppRaterPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.favorite.m f155277a;

    /* renamed from: b, reason: collision with root package name */
    public final e f155278b;

    /* renamed from: c, reason: collision with root package name */
    public final u f155279c;

    public i(com.avito.android.favorite.m mVar, e eVar, u uVar) {
        this.f155277a = mVar;
        this.f155278b = eVar;
        this.f155279c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.favorite.h) this.f155277a.get(), (b) this.f155278b.get(), (InterfaceC35745a5) this.f155279c.get());
    }
}
