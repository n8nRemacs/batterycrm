package com.avito.android.work_profile.profile.applies.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AppliesToVacancyBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f330898a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.work_profile.profile.applies.mvi.action_handlers.b f330899b;

    public f(dagger.internal.l lVar, com.avito.android.work_profile.profile.applies.mvi.action_handlers.b bVar) {
        this.f330898a = lVar;
        this.f330899b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(((Boolean) this.f330898a.f393949a).booleanValue(), (com.avito.android.work_profile.profile.applies.mvi.action_handlers.a) this.f330899b.get());
    }
}
