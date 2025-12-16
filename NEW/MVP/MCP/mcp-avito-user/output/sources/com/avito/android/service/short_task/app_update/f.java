package com.avito.android.service.short_task.app_update;

import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import f90.L;
import javax.inject.Provider;

/* compiled from: AppUpdateInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<L> f274046a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f274047b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f274048c;

    /* renamed from: d, reason: collision with root package name */
    public final S f274049d;

    public f(Provider provider, Provider provider2, dagger.internal.f fVar, S s5) {
        this.f274046a = provider;
        this.f274047b = provider2;
        this.f274048c = fVar;
        this.f274049d = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f274046a.get(), this.f274047b.get(), (InterfaceC28373a) this.f274048c.get(), (P) this.f274049d.get());
    }
}
