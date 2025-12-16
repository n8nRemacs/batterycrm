package com.avito.android.adapter.gallery;

import android.app.Activity;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f68442a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f68443b;

    public b(dagger.internal.l lVar, Provider provider) {
        this.f68442a = provider;
        this.f68443b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f68442a.get(), (Activity) this.f68443b.f393949a);
    }
}
