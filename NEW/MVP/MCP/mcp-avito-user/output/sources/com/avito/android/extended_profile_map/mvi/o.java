package com.avito.android.extended_profile_map.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileMapReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final u f151309a;

    public o(u uVar) {
        this.f151309a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((com.avito.android.extended_profile_map.bottom_sheet.h) this.f151309a.get());
    }
}
