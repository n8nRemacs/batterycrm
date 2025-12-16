package com.avito.android.profile.remove.di;

import com.avito.android.profile.remove.ProfileRemoveActivity;
import com.avito.android.profile.remove.o;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveModule_ProvideRemoveRouterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final l f223915a;

    public f(l lVar) {
        this.f223915a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ProfileRemoveActivity profileRemoveActivity = (ProfileRemoveActivity) this.f223915a.f393949a;
        d.f223913a.getClass();
        return profileRemoveActivity;
    }
}
