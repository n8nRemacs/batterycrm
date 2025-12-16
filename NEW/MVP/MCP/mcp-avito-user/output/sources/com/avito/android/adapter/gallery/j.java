package com.avito.android.adapter.gallery;

import Y41.p;
import com.avito.android.W1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<W1> f68462a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f68463b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f68464c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Pv0.b> f68465d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f68466e;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f68462a = provider;
        this.f68463b = lVar;
        this.f68464c = lVar2;
        this.f68465d = provider2;
        this.f68466e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f68462a.get(), (p) this.f68463b.f393949a, (Y41.a) this.f68464c.f393949a, this.f68465d.get(), this.f68466e.get());
    }
}
