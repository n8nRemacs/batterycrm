package com.avito.android.favorites.adapter.advert;

import com.avito.android.B2;
import com.avito.android.di.module.C30125n4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f156436a;

    /* renamed from: b, reason: collision with root package name */
    public final C30125n4 f156437b;

    /* renamed from: c, reason: collision with root package name */
    public final u f156438c;

    public b(Provider provider, C30125n4 c30125n4, u uVar) {
        this.f156436a = provider;
        this.f156437b = c30125n4;
        this.f156438c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f156436a.get(), (com.avito.android.date_time_formatter.b) this.f156437b.get(), (B2) this.f156438c.get());
    }
}
