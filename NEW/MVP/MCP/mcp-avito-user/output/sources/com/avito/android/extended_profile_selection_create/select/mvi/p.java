package com.avito.android.extended_profile_selection_create.select.mvi;

import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSelectionCreateReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152404a;

    public p(dagger.internal.l lVar) {
        this.f152404a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((ExtendedProfileSelectionCreateConfig) this.f152404a.f393949a);
    }
}
