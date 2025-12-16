package com.avito.android.select.bottom_sheet.blueprints;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckableItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f265082a;

    public d(u uVar) {
        this.f265082a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((m) this.f265082a.get());
    }
}
