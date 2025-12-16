package com.avito.android.das_date_picker.mvi;

import com.avito.android.J0;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DasCalendarViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f132462a;

    public x(Provider<J0> provider) {
        this.f132462a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f132462a.get());
    }
}
