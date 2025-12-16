package com.avito.android.passport.profile_add.create_flow.set_profile_name.di;

import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameArgs;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SetProfileNameModule_ProvideFlowFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<ProfileCreateExtendedFlow> {

    /* renamed from: a, reason: collision with root package name */
    public final l f212107a;

    public d(l lVar) {
        this.f212107a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        SetProfileNameArgs setProfileNameArgs = (SetProfileNameArgs) this.f212107a.f393949a;
        c.f212106a.getClass();
        ProfileCreateExtendedFlow profileCreateExtendedFlow = setProfileNameArgs.f212035e;
        t.d(profileCreateExtendedFlow);
        return profileCreateExtendedFlow;
    }
}
