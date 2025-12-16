package com.avito.android.profile.remove.confirm.di;

import com.avito.android.profile.remove.ProfileRemoveActivity;
import com.avito.android.profile.remove.o;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveConfirmationModule_ProvideRemoveRouterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final l f223843a;

    public g(l lVar) {
        this.f223843a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ProfileRemoveActivity profileRemoveActivity = (ProfileRemoveActivity) this.f223843a.f393949a;
        d.f223840a.getClass();
        return profileRemoveActivity;
    }
}
