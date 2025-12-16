package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.InterfaceC34155z;
import com.google.gson.Gson;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ServicesPriceAnalyticsTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class j0 implements dagger.internal.h<i0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f232254a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f232255b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34155z> f232256c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f232257d;

    public j0(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider) {
        this.f232254a = uVar;
        this.f232255b = uVar2;
        this.f232256c = provider;
        this.f232257d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i0((InterfaceC28373a) this.f232254a.get(), (C50213a) this.f232255b.get(), this.f232256c.get(), (Gson) this.f232257d.get());
    }
}
