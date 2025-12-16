package com.avito.android.shift_list.ui.list.time_item;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShiftTimeBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f281159a;

    public b(f fVar) {
        this.f281159a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f281159a.get());
    }
}
