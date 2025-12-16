package com.avito.android.phone_reverification_info.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.phone_reverification_info.PhoneReverificationInfo;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneReverificationInfoBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f216159a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.phone_reverification_info.j f216160b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f216161c;

    public e(dagger.internal.l lVar, com.avito.android.phone_reverification_info.j jVar, Provider provider) {
        this.f216159a = lVar;
        this.f216160b = jVar;
        this.f216161c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((PhoneReverificationInfo) this.f216159a.f393949a, (com.avito.android.phone_reverification_info.i) this.f216160b.get(), this.f216161c.get());
    }
}
