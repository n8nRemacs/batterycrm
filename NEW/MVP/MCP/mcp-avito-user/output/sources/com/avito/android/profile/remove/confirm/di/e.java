package com.avito.android.profile.remove.confirm.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.profile.remove.ProfileRemoveConfirmScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveConfirmationModule_ProvideConfirmPerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f223841a;

    public e(l lVar) {
        this.f223841a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f223841a.f393949a;
        d.f223840a.getClass();
        return new C28478k(ProfileRemoveConfirmScreen.f223766d, rVar, "userProfileRemoveConfirm");
    }
}
