package com.avito.android.extended_profile_selection_create.image.mvi;

import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageConfig;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ExtendedProfileSetSelectionImageReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f151799a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f151800b;

    public o(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f151799a = lVar;
        this.f151800b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((ExtendedProfileSetSelectionImageConfig) this.f151799a.f393949a, (Z1) this.f151800b.f393949a);
    }
}
