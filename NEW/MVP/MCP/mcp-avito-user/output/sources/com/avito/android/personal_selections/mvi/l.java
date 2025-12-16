package com.avito.android.personal_selections.mvi;

import com.avito.android.personal_selections.mvi.k;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonalSelectionsItemFeatureViewModel_Factory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k.a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f215835a;

    public l(j jVar) {
        this.f215835a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k.a((i) this.f215835a.get());
    }
}
