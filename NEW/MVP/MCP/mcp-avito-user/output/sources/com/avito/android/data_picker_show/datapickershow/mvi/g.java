package com.avito.android.data_picker_show.datapickershow.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DataPickerShowFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f132521a;

    /* renamed from: b, reason: collision with root package name */
    public final b f132522b;

    /* renamed from: c, reason: collision with root package name */
    public final i f132523c;

    /* renamed from: d, reason: collision with root package name */
    public final l f132524d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f132525e;

    public g(d dVar, b bVar, i iVar, l lVar, Provider provider) {
        this.f132521a = dVar;
        this.f132522b = bVar;
        this.f132523c = iVar;
        this.f132524d = lVar;
        this.f132525e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f132521a.get();
        this.f132522b.getClass();
        a aVar = new a();
        this.f132523c.getClass();
        h hVar = new h();
        this.f132524d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f132525e.get();
        gu.c.f396931g.getClass();
        return new f("DataPickerShow", gu.c.f396932h, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
