package com.avito.android.app.task;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: FingerprintCalculationSchedulerTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class H implements dagger.internal.h<FingerprintCalculationSchedulerTask> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f91454a;

    public H(C30102l3 c30102l3) {
        this.f91454a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new FingerprintCalculationSchedulerTask((Context) this.f91454a.get());
    }
}
