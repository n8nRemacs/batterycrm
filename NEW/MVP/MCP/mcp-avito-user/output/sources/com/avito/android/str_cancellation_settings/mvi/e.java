package com.avito.android.str_cancellation_settings.mvi;

import com.avito.android.str_cancellation_settings.domain.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrCancellationSettingsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_cancellation_settings.domain.n f288438a;

    /* renamed from: b, reason: collision with root package name */
    public final r f288439b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_cancellation_settings.domain.c f288440c;

    public e(com.avito.android.str_cancellation_settings.domain.n nVar, r rVar, com.avito.android.str_cancellation_settings.domain.c cVar) {
        this.f288438a = nVar;
        this.f288439b = rVar;
        this.f288440c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.str_cancellation_settings.domain.d) this.f288438a.get(), (com.avito.android.str_cancellation_settings.domain.p) this.f288439b.get(), (com.avito.android.str_cancellation_settings.domain.a) this.f288440c.get());
    }
}
