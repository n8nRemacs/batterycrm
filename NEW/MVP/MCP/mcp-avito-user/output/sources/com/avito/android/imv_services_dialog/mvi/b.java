package com.avito.android.imv_services_dialog.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mN.InterfaceC43983a;

/* compiled from: ImvServicesDialogActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43983a> f170789a;

    public b(Provider<InterfaceC43983a> provider) {
        this.f170789a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f170789a.get());
    }
}
