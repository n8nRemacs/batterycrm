package com.avito.android.publish.items.iac_for_pro;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacForProItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f236915a;

    public b(Provider<d> provider) {
        this.f236915a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f236915a.get());
    }
}
