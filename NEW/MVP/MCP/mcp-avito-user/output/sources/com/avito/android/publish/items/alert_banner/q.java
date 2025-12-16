package com.avito.android.publish.items.alert_banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: SelectParameterAlertBannerItemFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f236765a;

    /* renamed from: b, reason: collision with root package name */
    public final u f236766b;

    public q(u uVar, Provider provider) {
        this.f236765a = provider;
        this.f236766b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f236765a.get(), (C43617a) this.f236766b.get());
    }
}
