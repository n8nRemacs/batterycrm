package com.avito.android.publish_limits_info.history.di;

import com.avito.android.publish_limits_info.history.m;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishLimitsHistoryModule_ProvideHistoryProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<com.avito.android.publish_limits_info.history.tab.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245839a;

    public f(u uVar) {
        this.f245839a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f245839a.get();
        d.f245837a.getClass();
        return mVar;
    }
}
