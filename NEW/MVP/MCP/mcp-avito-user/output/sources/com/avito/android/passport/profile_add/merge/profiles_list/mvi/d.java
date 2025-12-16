package com.avito.android.passport.profile_add.merge.profiles_list.mvi;

import com.avito.android.passport.profile_add.merge.domain.MergeFlow;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfilesListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.domain.i f213270a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f213271b;

    public d(com.avito.android.passport.profile_add.merge.domain.i iVar, dagger.internal.l lVar) {
        this.f213270a = iVar;
        this.f213271b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.passport.profile_add.merge.domain.a) this.f213270a.get(), (MergeFlow) this.f213271b.f393949a);
    }
}
