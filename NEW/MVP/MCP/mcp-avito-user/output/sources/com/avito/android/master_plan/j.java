package com.avito.android.master_plan;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import tY.InterfaceC48614a;

/* compiled from: MasterPlanInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48614a> f186054a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f186055b;

    public j(Provider<InterfaceC48614a> provider, Provider<R0> provider2) {
        this.f186054a = provider;
        this.f186055b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f186054a.get(), this.f186055b.get());
    }
}
