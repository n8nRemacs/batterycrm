package com.avito.android.edit_address.adapter.schedule;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScheduleItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f145807a;

    public c(Provider<f> provider) {
        this.f145807a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f145807a.get());
    }
}
