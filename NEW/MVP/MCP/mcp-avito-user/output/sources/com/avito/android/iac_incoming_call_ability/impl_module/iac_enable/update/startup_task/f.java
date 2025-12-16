package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.startup_task;

import com.avito.android.account.E;
import com.avito.android.permissions.z;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacUpdateAvailabilityTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<IacUpdateAvailabilityTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f168386a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<z> f168387b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f168388c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.a> f168389d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<NL.e> f168390e;

    public f(Provider<com.avito.android.app_foreground_provider.util_module.a> provider, Provider<z> provider2, Provider<E> provider3, Provider<com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.a> provider4, Provider<NL.e> provider5) {
        this.f168386a = provider;
        this.f168387b = provider2;
        this.f168388c = provider3;
        this.f168389d = provider4;
        this.f168390e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new IacUpdateAvailabilityTask(this.f168386a.get(), this.f168387b.get(), this.f168388c.get(), this.f168389d.get(), this.f168390e.get());
    }
}
