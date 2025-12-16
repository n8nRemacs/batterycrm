package com.avito.android.extended_profile_selection_create.name.mvi;

import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameConfig;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ExtendedProfileSetSelectionNameReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f151929a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f151930b;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f151929a = lVar;
        this.f151930b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Z1) this.f151929a.f393949a, (ExtendedProfileSetSelectionNameConfig) this.f151930b.f393949a);
    }
}
