package com.avito.android.publish.slots.contact_method.item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactMethodItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f243295a;

    public b(Provider<d> provider) {
        this.f243295a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f243295a.get());
    }
}
