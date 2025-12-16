package com.avito.android.publish.slots.auto_group_block.contact.item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupContactBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f243075a;

    public b(Provider<e> provider) {
        this.f243075a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f243075a.get());
    }
}
