package com.avito.android.passport.profile_add.create_flow.select_vertical.di;

import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalArguments;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectVerticalModule_ProvideFlowFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<ProfileCreateExtendedFlow> {

    /* renamed from: a, reason: collision with root package name */
    public final l f211899a;

    public f(l lVar) {
        this.f211899a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        SelectVerticalArguments selectVerticalArguments = (SelectVerticalArguments) this.f211899a.f393949a;
        c.f211894a.getClass();
        ProfileCreateExtendedFlow profileCreateExtendedFlow = selectVerticalArguments.f211807c;
        t.d(profileCreateExtendedFlow);
        return profileCreateExtendedFlow;
    }
}
