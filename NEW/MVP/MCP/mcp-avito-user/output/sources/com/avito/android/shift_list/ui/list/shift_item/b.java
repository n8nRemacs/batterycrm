package com.avito.android.shift_list.ui.list.shift_item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShiftBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f281130a;

    public b(i iVar) {
        this.f281130a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((h) this.f281130a.get());
    }
}
