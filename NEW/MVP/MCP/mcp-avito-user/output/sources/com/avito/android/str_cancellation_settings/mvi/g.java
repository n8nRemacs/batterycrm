package com.avito.android.str_cancellation_settings.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrCancellationSettingsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_cancellation_settings.domain.n f288503a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.str_cancellation_settings.domain.c f288504b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f288505c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f288506d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f288507e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f288508f;

    public g(com.avito.android.str_cancellation_settings.domain.n nVar, com.avito.android.str_cancellation_settings.domain.c cVar, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4) {
        this.f288503a = nVar;
        this.f288504b = cVar;
        this.f288505c = lVar;
        this.f288506d = lVar2;
        this.f288507e = lVar3;
        this.f288508f = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.str_cancellation_settings.domain.d) this.f288503a.get(), (com.avito.android.str_cancellation_settings.domain.a) this.f288504b.get(), ((Long) this.f288505c.f393949a).longValue(), (String) this.f288506d.f393949a, (String) this.f288507e.f393949a, (String) this.f288508f.f393949a);
    }
}
