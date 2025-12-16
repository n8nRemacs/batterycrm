package com.avito.android.das_date_picker.mvi;

import dagger.internal.y;

/* compiled from: DasCalendarReducer_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f132460a;

    public u(dagger.internal.u uVar) {
        this.f132460a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((v) this.f132460a.get());
    }
}
