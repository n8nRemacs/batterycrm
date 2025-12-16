package com.avito.android.blueprints.withSuggestedOptions;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectWithSuggestedOptionsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f106775a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f106776b;

    public c(u uVar, Provider provider) {
        this.f106775a = uVar;
        this.f106776b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f106775a.get(), this.f106776b.get());
    }
}
