package com.avito.android.publish_limits_info.history.di;

import androidx.fragment.app.ActivityC22955m;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishLimitsHistoryModule_ProvideDialogRouterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<com.avito.android.progress_overlay.h> {

    /* renamed from: a, reason: collision with root package name */
    public final l f245838a;

    public e(l lVar) {
        this.f245838a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ActivityC22955m activityC22955m = (ActivityC22955m) this.f245838a.f393949a;
        d.f245837a.getClass();
        return new com.avito.android.progress_overlay.h(activityC22955m);
    }
}
