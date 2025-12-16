package com.avito.android.extended_profile_selection_create.select.mvi;

import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSelectionCreateOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f152402a;

    public n(dagger.internal.l lVar) {
        this.f152402a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((ExtendedProfileSelectionCreateConfig) this.f152402a.f393949a);
    }
}
