package com.avito.android.service_booking.mvi;

import android.content.Context;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ys0.InterfaceC50295f;

/* compiled from: SbActionsTrackerWrapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f274314a;

    /* renamed from: b, reason: collision with root package name */
    public final l f274315b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC50295f> f274316c;

    /* renamed from: d, reason: collision with root package name */
    public final u f274317d;

    public c(l lVar, l lVar2, u uVar, Provider provider) {
        this.f274314a = lVar;
        this.f274315b = lVar2;
        this.f274316c = provider;
        this.f274317d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f274314a.f393949a, (Context) this.f274315b.f393949a, this.f274316c.get(), (com.avito.android.service_booking.mvi.domain.a) this.f274317d.get());
    }
}
