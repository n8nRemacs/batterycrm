package com.avito.android.work_profile.profile.applies.mvi;

import com.avito.android.di.module.C30125n4;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AppliesToVacancyMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final C30125n4 f330909a;

    public k(C30125n4 c30125n4) {
        this.f330909a = c30125n4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.date_time_formatter.b) this.f330909a.get());
    }
}
