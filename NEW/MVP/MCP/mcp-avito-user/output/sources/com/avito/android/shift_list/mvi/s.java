package com.avito.android.shift_list.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShiftListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final m f281079a;

    public s(m mVar) {
        this.f281079a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((l) this.f281079a.get(), null, 2, null);
    }
}
