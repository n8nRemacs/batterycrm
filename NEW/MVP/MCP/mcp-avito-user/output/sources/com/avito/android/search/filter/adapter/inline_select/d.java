package com.avito.android.search.filter.adapter.inline_select;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import ur.InterfaceC49101b;

/* compiled from: InlineSelectItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f262398a;

    /* renamed from: b, reason: collision with root package name */
    public final u f262399b;

    public d(u uVar, u uVar2) {
        this.f262398a = uVar;
        this.f262399b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f262398a.get(), (InterfaceC49101b) this.f262399b.get());
    }
}
