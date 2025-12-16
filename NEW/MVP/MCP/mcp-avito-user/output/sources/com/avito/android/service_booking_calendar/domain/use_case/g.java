package com.avito.android.service_booking_calendar.domain.use_case;

import Ys0.InterfaceC18323a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import it0.InterfaceC42109d;
import javax.inject.Provider;

/* compiled from: LoadFlexibleScheduleUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC18323a> f275600a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.domain.c> f275601b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f275602c;

    /* renamed from: d, reason: collision with root package name */
    public final l f275603d;

    /* renamed from: e, reason: collision with root package name */
    public final l f275604e;

    /* renamed from: f, reason: collision with root package name */
    public final l f275605f;

    /* renamed from: g, reason: collision with root package name */
    public final u f275606g;

    public g(l lVar, l lVar2, l lVar3, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f275600a = provider;
        this.f275601b = provider2;
        this.f275602c = provider3;
        this.f275603d = lVar;
        this.f275604e = lVar2;
        this.f275605f = lVar3;
        this.f275606g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f275600a.get(), this.f275601b.get(), this.f275602c.get(), (Integer) this.f275603d.f393949a, ((Boolean) this.f275604e.f393949a).booleanValue(), ((Boolean) this.f275605f.f393949a).booleanValue(), (InterfaceC42109d) this.f275606g.get());
    }
}
