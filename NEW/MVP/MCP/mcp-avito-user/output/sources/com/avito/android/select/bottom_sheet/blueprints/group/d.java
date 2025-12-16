package com.avito.android.select.bottom_sheet.blueprints.group;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectableGroupItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f265098a;

    public d(u uVar) {
        this.f265098a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((h) this.f265098a.get());
    }
}
