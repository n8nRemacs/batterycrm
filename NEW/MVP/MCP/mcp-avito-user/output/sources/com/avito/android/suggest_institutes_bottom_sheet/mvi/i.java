package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestInstitutesBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.suggest_institutes_bottom_sheet.domain.b f292062a;

    public i(com.avito.android.suggest_institutes_bottom_sheet.domain.b bVar) {
        this.f292062a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.suggest_institutes_bottom_sheet.domain.a) this.f292062a.get());
    }
}
