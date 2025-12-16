package com.avito.android.profile.remove.di;

import com.avito.android.profile.remove.ProfileRemoveActivity;
import com.avito.android.profile.remove.m;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveModule_ProvideToolbarHolderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final l f223918a;

    public i(l lVar) {
        this.f223918a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ProfileRemoveActivity profileRemoveActivity = (ProfileRemoveActivity) this.f223918a.f393949a;
        d.f223913a.getClass();
        return profileRemoveActivity;
    }
}
