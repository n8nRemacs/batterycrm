package com.avito.android.search.filter.adapter.chips;

import dagger.internal.x;
import dagger.internal.y;
import ur.InterfaceC49101b;

/* compiled from: ChipsSingleSelectItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f262176a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f262177b;

    public p(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f262176a = uVar;
        this.f262177b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((q) this.f262176a.get(), (InterfaceC49101b) this.f262177b.get());
    }
}
