package com.avito.android.iac_dialer.impl_module.audio.ringtone;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacRingingModeProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165867a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PL.i> f165868b;

    /* renamed from: c, reason: collision with root package name */
    public final j f165869c;

    /* renamed from: d, reason: collision with root package name */
    public final b f165870d;

    public e(C30102l3 c30102l3, Provider provider, j jVar, b bVar) {
        this.f165867a = c30102l3;
        this.f165868b = provider;
        this.f165869c = jVar;
        this.f165870d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Context) this.f165867a.get(), this.f165868b.get(), (i) this.f165869c.get(), (a) this.f165870d.get());
    }
}
