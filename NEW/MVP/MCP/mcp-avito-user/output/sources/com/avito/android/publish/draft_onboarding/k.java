package com.avito.android.publish.draft_onboarding;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PrefDraftOnboardingSessionStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f235314a;

    public k(C30214v6 c30214v6) {
        this.f235314a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((l) this.f235314a.get());
    }
}
