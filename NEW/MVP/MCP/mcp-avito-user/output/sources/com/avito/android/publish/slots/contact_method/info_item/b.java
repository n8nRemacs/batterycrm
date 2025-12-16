package com.avito.android.publish.slots.contact_method.info_item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactMethodInfoBlockItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f243275a;

    public b(Provider<c> provider) {
        this.f243275a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f243275a.get());
    }
}
