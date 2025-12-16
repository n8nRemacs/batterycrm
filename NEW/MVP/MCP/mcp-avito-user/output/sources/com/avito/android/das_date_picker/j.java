package com.avito.android.das_date_picker;

import com.avito.android.das_date_picker.mvi.l;
import com.avito.android.das_date_picker.mvi.m;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DasCalendarViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final m f132349a;

    public j(m mVar) {
        this.f132349a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((l) this.f132349a.get(), null, 2, null);
    }
}
