package com.avito.android.str_cancellation_settings.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrCancellationSettingsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final q f288521a;

    public n(q qVar) {
        this.f288521a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((o) this.f288521a.get());
    }
}
