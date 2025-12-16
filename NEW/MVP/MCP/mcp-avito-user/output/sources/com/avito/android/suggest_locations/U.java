package com.avito.android.suggest_locations;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import javax.inject.Provider;
import nF.C44245a;
import sA0.InterfaceC48020a;

/* compiled from: SuggestLocationsPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class U implements dagger.internal.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final C35155u f292190a;

    /* renamed from: b, reason: collision with root package name */
    public final sA0.c f292191b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f292192c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f292193d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f292194e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f292195f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f292196g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f292197h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f292198i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f292199j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f292200k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f292201l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<C44245a> f292202m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f292203n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.l f292204o;

    public U(C35155u c35155u, sA0.c cVar, Provider provider, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.l lVar6, dagger.internal.l lVar7, dagger.internal.l lVar8, dagger.internal.l lVar9, Provider provider2, Provider provider3, dagger.internal.l lVar10) {
        this.f292190a = c35155u;
        this.f292191b = cVar;
        this.f292192c = provider;
        this.f292193d = lVar;
        this.f292194e = lVar2;
        this.f292195f = lVar3;
        this.f292196g = lVar4;
        this.f292197h = lVar5;
        this.f292198i = lVar6;
        this.f292199j = lVar7;
        this.f292200k = lVar8;
        this.f292201l = lVar9;
        this.f292202m = provider2;
        this.f292203n = provider3;
        this.f292204o = lVar10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new T((InterfaceC35144i) this.f292190a.get(), (InterfaceC48020a) this.f292191b.get(), this.f292192c.get(), (String) this.f292193d.f393949a, (String) this.f292194e.f393949a, (Integer) this.f292195f.f393949a, ((Boolean) this.f292196g.f393949a).booleanValue(), (String) this.f292197h.f393949a, (PublishIntentFactory.SuggestLocationsFlowType) this.f292198i.f393949a, (String) this.f292199j.f393949a, ((Boolean) this.f292200k.f393949a).booleanValue(), (Boolean) this.f292201l.f393949a, this.f292202m.get(), this.f292203n.get(), (Kundle) this.f292204o.f393949a);
    }
}
