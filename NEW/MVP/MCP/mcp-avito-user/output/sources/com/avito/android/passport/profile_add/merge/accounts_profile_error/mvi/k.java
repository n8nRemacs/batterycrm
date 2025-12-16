package com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi;

import com.avito.android.passport.network.model.PassportUserDialogWithProfile;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AccountsProfileErrorReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f212444a;

    public k(l lVar) {
        this.f212444a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((PassportUserDialogWithProfile) this.f212444a.f393949a);
    }
}
