package com.avito.android.serp.adapter.vertical_main.cv.cv_display;

import com.avito.android.di.module.C30103l4;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvDisplayItemConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30103l4 f272783a;

    public d(C30103l4 c30103l4) {
        this.f272783a = c30103l4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.date_time_formatter.b) this.f272783a.get());
    }
}
