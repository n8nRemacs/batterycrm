package com.avito.android.rating_form.item.multiLineInput;

import Kh0.C14315a;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiLineInputItemRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f248483a;

    /* renamed from: b, reason: collision with root package name */
    public final u f248484b;

    /* renamed from: c, reason: collision with root package name */
    public final l f248485c;

    public i(l lVar, u uVar, Provider provider) {
        this.f248483a = provider;
        this.f248484b = uVar;
        this.f248485c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f248483a.get(), (C14315a) this.f248484b.get(), ((Boolean) this.f248485c.f393949a).booleanValue());
    }
}
