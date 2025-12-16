package com.avito.android.code_check.phone_list.mvi;

import Qo.C14915b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42784z0;

/* compiled from: PhoneListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f118998a;

    /* renamed from: b, reason: collision with root package name */
    public final g f118999b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f119000c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f119001d;

    public e(b bVar, g gVar, Provider provider, Provider provider2) {
        this.f118998a = bVar;
        this.f118999b = gVar;
        this.f119000c = provider;
        this.f119001d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f118998a.get();
        this.f118999b.getClass();
        f fVar = new f();
        R0 r02 = this.f119000c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f119001d.get();
        C14915b.f14010c.getClass();
        return new d("PhoneList", new C14915b(C42784z0.f406748b), new c(aVar, screenPerformanceTracker, fVar, r02));
    }
}
