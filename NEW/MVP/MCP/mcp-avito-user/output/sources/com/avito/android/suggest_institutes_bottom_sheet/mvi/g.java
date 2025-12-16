package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestInstitutesActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.suggest_institutes_bottom_sheet.domain.b f292054a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f292055b;

    public g(com.avito.android.suggest_institutes_bottom_sheet.domain.b bVar, Provider provider) {
        this.f292054a = bVar;
        this.f292055b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.suggest_institutes_bottom_sheet.domain.a) this.f292054a.get(), this.f292055b.get());
    }
}
