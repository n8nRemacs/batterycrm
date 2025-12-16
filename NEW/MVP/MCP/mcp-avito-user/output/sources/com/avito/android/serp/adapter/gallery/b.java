package com.avito.android.serp.adapter.gallery;

import com.avito.android.C36135w2;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryHeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f270018a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding_manager.f> f270019b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C36135w2> f270020c;

    public b(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f270018a = uVar;
        this.f270019b = provider;
        this.f270020c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((l) this.f270018a.get(), this.f270019b.get(), this.f270020c.get());
    }
}
