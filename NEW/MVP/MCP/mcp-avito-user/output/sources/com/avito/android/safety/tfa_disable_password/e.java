package com.avito.android.safety.tfa_disable_password;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.TfaDisableScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SafetySettingsTfaDisablePasswordModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f258100a;

    public e(dagger.internal.l lVar) {
        this.f258100a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f258100a.f393949a;
        d.f258099a.getClass();
        return new C28478k(TfaDisableScreen.f90533d, rVar, "confirmDisableTfa");
    }
}
