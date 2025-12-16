package com.avito.android.profile.remove.confirm.di;

import com.avito.android.profile.remove.ProfileRemoveActivity;
import com.avito.android.profile.remove.m;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveConfirmationModule_ProvideNavBarHolderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final l f223842a;

    public f(l lVar) {
        this.f223842a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ProfileRemoveActivity profileRemoveActivity = (ProfileRemoveActivity) this.f223842a.f393949a;
        d.f223840a.getClass();
        return profileRemoveActivity;
    }
}
