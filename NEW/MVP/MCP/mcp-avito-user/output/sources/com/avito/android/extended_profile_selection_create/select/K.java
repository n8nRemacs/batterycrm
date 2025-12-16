package com.avito.android.extended_profile_selection_create.select;

import iT.C41343c;

/* compiled from: ExtendedProfileSelectionCreateViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_selection_create.select.mvi.l f152030a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f152031b;

    public K(com.avito.android.extended_profile_selection_create.select.mvi.l lVar, dagger.internal.u uVar) {
        this.f152030a = lVar;
        this.f152031b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new J((com.avito.android.extended_profile_selection_create.select.mvi.k) this.f152030a.get(), (C41343c) this.f152031b.get());
    }
}
