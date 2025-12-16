package com.avito.android.publish_limits_info.history.di;

import androidx.fragment.app.ActivityC22955m;
import androidx.view.P0;
import com.avito.android.publish_limits_info.history.m;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishLimitsHistoryModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final l f245840a;

    /* renamed from: b, reason: collision with root package name */
    public final u f245841b;

    public g(l lVar, u uVar) {
        this.f245840a = lVar;
        this.f245841b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ActivityC22955m activityC22955m = (ActivityC22955m) this.f245840a.f393949a;
        P0.c cVar = (P0.c) this.f245841b.get();
        d.f245837a.getClass();
        return (m) new P0(activityC22955m, cVar).a(m.class);
    }
}
