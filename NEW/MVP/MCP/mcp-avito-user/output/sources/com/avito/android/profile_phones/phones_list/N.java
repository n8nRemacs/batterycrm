package com.avito.android.profile_phones.phones_list;

import android.content.res.Resources;

/* compiled from: PhonesListResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class N implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f227354a;

    public N(dagger.internal.l lVar) {
        this.f227354a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new M((Resources) this.f227354a.f393949a);
    }
}
