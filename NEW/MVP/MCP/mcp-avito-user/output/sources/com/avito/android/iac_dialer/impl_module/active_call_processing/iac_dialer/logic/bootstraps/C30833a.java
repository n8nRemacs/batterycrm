package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;
import mL.InterfaceC43977a;

/* compiled from: ActivityLauncherBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30833a implements dagger.internal.h<ActivityLauncherBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f165341a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165342b;

    public C30833a(dagger.internal.u uVar, Provider provider) {
        this.f165341a = uVar;
        this.f165342b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ActivityLauncherBootstrap((InterfaceC43977a) this.f165341a.get(), this.f165342b.get());
    }
}
