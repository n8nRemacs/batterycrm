package com.avito.android.work_profile.profile.cvs.mvi;

import com.avito.android.di.module.C30103l4;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvsMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final C30103l4 f331063a;

    public i(C30103l4 c30103l4) {
        this.f331063a = c30103l4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.date_time_formatter.b) this.f331063a.get());
    }
}
