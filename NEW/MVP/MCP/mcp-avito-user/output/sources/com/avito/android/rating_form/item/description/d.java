package com.avito.android.rating_form.item.description;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DescriptionItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248377a;

    /* renamed from: b, reason: collision with root package name */
    public final l f248378b;

    public d(l lVar, u uVar) {
        this.f248377a = uVar;
        this.f248378b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f248377a.get(), ((Boolean) this.f248378b.f393949a).booleanValue());
    }
}
