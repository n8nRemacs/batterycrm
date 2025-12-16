package com.avito.android.search.filter.adapter.location_group;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationGroupItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f262506a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f262507b;

    public c(u uVar, Provider provider) {
        this.f262506a = uVar;
        this.f262507b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f262506a.get(), this.f262507b.get());
    }
}
