package com.avito.android.profile.remove.di;

import androidx.view.P0;
import com.avito.android.profile.remove.ProfileRemoveActivity;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<com.avito.android.profile.remove.i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f223919a;

    /* renamed from: b, reason: collision with root package name */
    public final u f223920b;

    public j(l lVar, u uVar) {
        this.f223919a = lVar;
        this.f223920b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ProfileRemoveActivity profileRemoveActivity = (ProfileRemoveActivity) this.f223919a.f393949a;
        P0.c cVar = (P0.c) this.f223920b.get();
        d.f223913a.getClass();
        return (com.avito.android.profile.remove.i) new P0(profileRemoveActivity, cVar).a(com.avito.android.profile.remove.i.class);
    }
}
