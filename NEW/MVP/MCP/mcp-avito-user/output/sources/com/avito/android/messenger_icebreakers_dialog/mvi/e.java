package com.avito.android.messenger_icebreakers_dialog.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import iZ.C41367c;
import javax.inject.Provider;

/* compiled from: MessengerIcebreakerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f197670a;

    /* renamed from: b, reason: collision with root package name */
    public final g f197671b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f197672c;

    public e(b bVar, g gVar, Provider provider) {
        this.f197670a = bVar;
        this.f197671b = gVar;
        this.f197672c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f197670a.get();
        this.f197671b.getClass();
        f fVar = new f();
        ScreenPerformanceTracker screenPerformanceTracker = this.f197672c.get();
        C41367c.f398559c.getClass();
        return new d("MessengerIcebreaker", C41367c.f398560d, new c(aVar, screenPerformanceTracker, fVar));
    }
}
