package com.avito.android.search.filter.adapter.keywords;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: KeywordsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f262453a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f262454b;

    public f(u uVar, Provider provider) {
        this.f262453a = uVar;
        this.f262454b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((j) this.f262453a.get(), this.f262454b.get());
    }
}
