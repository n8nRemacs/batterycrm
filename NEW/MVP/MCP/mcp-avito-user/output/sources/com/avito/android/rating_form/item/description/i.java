package com.avito.android.rating_form.item.description;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DescriptionItemRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248384a;

    /* renamed from: b, reason: collision with root package name */
    public final l f248385b;

    public i(l lVar, u uVar) {
        this.f248384a = uVar;
        this.f248385b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((e) this.f248384a.get(), ((Boolean) this.f248385b.f393949a).booleanValue());
    }
}
