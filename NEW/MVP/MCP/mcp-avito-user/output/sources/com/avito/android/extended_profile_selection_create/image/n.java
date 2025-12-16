package com.avito.android.extended_profile_selection_create.image;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ExtendedProfileSetSelectionImageViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_selection_create.image.mvi.k f151801a;

    public n(com.avito.android.extended_profile_selection_create.image.mvi.k kVar) {
        this.f151801a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.extended_profile_selection_create.image.mvi.j jVar = (com.avito.android.extended_profile_selection_create.image.mvi.j) this.f151801a.get();
        i2.f411430a.getClass();
        return new m(jVar, i2.a.f411433c);
    }
}
