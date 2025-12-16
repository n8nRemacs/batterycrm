package com.avito.android.mortgage.root.list.items.immutable_info.description.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.root.list.items.immutable_info.description.model.ImmutableInfoDescriptionArguments;
import d10.C39483c;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImmutableInfoDescriptionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f202622a;

    /* renamed from: b, reason: collision with root package name */
    public final d f202623b;

    /* renamed from: c, reason: collision with root package name */
    public final b f202624c;

    /* renamed from: d, reason: collision with root package name */
    public final i f202625d;

    /* renamed from: e, reason: collision with root package name */
    public final k f202626e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f202627f;

    public g(l lVar, d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f202622a = lVar;
        this.f202623b = dVar;
        this.f202624c = bVar;
        this.f202625d = iVar;
        this.f202626e = kVar;
        this.f202627f = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ImmutableInfoDescriptionArguments immutableInfoDescriptionArguments = (ImmutableInfoDescriptionArguments) this.f202622a.f393949a;
        c cVar = (c) this.f202623b.get();
        a aVar = (a) this.f202624c.get();
        this.f202625d.getClass();
        h hVar = new h();
        this.f202626e.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f202627f.get();
        C39483c.f393617h.getClass();
        return new f("ImmutableInfoDescriptionDialog", new C39483c(immutableInfoDescriptionArguments.f202606b, 0, immutableInfoDescriptionArguments.f202607c, immutableInfoDescriptionArguments.f202608d), new e(cVar, aVar, hVar, screenPerformanceTracker, jVar));
    }
}
