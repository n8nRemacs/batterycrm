package com.avito.android.search.filter.adapter.chips;

import dagger.internal.x;
import dagger.internal.y;
import ur.InterfaceC49101b;

/* compiled from: ChipsMultiSelectItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f262156a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f262157b;

    public f(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f262156a = uVar;
        this.f262157b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f262156a.get(), (InterfaceC49101b) this.f262157b.get());
    }
}
