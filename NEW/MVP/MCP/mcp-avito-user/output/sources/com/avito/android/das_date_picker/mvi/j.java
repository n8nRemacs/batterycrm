package com.avito.android.das_date_picker.mvi;

import com.avito.android.util.R0;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DasCalendarDataBuilderImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f132419a;

    public j(Provider<R0> provider) {
        this.f132419a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f132419a.get());
    }
}
