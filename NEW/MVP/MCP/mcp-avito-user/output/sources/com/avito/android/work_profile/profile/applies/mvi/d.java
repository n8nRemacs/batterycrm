package com.avito.android.work_profile.profile.applies.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppliesToVacancyActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f330886a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.work_profile.profile.applies.mvi.action_handlers.b f330887b;

    public d(Provider provider, com.avito.android.work_profile.profile.applies.mvi.action_handlers.b bVar) {
        this.f330886a = provider;
        this.f330887b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f330886a.get(), (com.avito.android.work_profile.profile.applies.mvi.action_handlers.a) this.f330887b.get());
    }
}
