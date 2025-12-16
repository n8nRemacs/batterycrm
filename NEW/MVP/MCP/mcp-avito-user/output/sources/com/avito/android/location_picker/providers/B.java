package com.avito.android.location_picker.providers;

import android.content.res.Resources;

/* compiled from: LocationPickerResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f182439a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f182440b;

    public B(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f182439a = lVar;
        this.f182440b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new A((Resources) this.f182439a.f393949a, ((Boolean) this.f182440b.f393949a).booleanValue());
    }
}
