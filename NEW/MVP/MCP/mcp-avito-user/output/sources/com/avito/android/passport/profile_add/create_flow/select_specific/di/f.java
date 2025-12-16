package com.avito.android.passport.profile_add.create_flow.select_specific.di;

import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificArguments;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectSpecificModule_ProvideFlowFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<ProfileCreateExtendedFlow> {

    /* renamed from: a, reason: collision with root package name */
    public final l f211707a;

    public f(l lVar) {
        this.f211707a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        SelectSpecificArguments selectSpecificArguments = (SelectSpecificArguments) this.f211707a.f393949a;
        c.f211702a.getClass();
        ProfileCreateExtendedFlow profileCreateExtendedFlow = selectSpecificArguments.f211619f;
        t.d(profileCreateExtendedFlow);
        return profileCreateExtendedFlow;
    }
}
