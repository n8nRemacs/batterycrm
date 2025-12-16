package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sI0.InterfaceC48055a;

/* compiled from: SoaInfoDialogSharingInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48055a> f313467a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f313468b;

    public e(Provider<InterfaceC48055a> provider, Provider<R0> provider2) {
        this.f313467a = provider;
        this.f313468b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f313468b.get(), dagger.internal.g.b(this.f313467a));
    }
}
