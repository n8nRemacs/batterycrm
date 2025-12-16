package com.avito.android.compose_items.multiselect;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiselectComposeItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f125401a;

    /* renamed from: b, reason: collision with root package name */
    public final u f125402b;

    public b(u uVar, Provider provider) {
        this.f125401a = provider;
        this.f125402b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f125401a.get(), (com.avito.android.util.text.a) this.f125402b.get());
    }
}
