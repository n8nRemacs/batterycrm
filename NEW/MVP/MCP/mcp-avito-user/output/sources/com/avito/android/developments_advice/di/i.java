package com.avito.android.developments_advice.di;

import com.avito.android.util.L4;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConsultationFormModule_ProvideRussianNumberFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<L4> {

    /* renamed from: a, reason: collision with root package name */
    public final g f136065a;

    public i(g gVar) {
        this.f136065a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f136065a.getClass();
        return new L4(false, false, 3, null);
    }
}
