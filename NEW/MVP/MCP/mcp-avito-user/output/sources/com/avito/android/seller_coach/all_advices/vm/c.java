package com.avito.android.seller_coach.all_advices.vm;

import Cq0.C13345d;
import Cq0.InterfaceC13342a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AllAdvicesViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C13345d f267453a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f267454b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f267455c;

    /* renamed from: d, reason: collision with root package name */
    public final u f267456d;

    public c(C13345d c13345d, Provider provider, Provider provider2, u uVar) {
        this.f267453a = c13345d;
        this.f267454b = provider;
        this.f267455c = provider2;
        this.f267456d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC13342a) this.f267453a.get(), this.f267454b.get(), this.f267455c.get(), (ScreenPerformanceTracker) this.f267456d.get());
    }
}
