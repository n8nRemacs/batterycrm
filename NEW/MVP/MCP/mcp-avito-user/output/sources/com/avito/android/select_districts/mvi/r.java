package com.avito.android.select_districts.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pq0.c;

/* compiled from: SelectDistrictsFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/r;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/mvi/q;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f267086f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o f267087a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f267088b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t f267089c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final v f267090d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f267091e;

    /* compiled from: SelectDistrictsFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/r$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public r(@Y61.k o oVar, @Y61.k m mVar, @Y61.k t tVar, @Y61.k v vVar, @Y61.k dagger.internal.u uVar) {
        this.f267087a = oVar;
        this.f267088b = mVar;
        this.f267089c = tVar;
        this.f267090d = vVar;
        this.f267091e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = (n) this.f267087a.get();
        k kVar = (k) this.f267088b.get();
        this.f267089c.getClass();
        s sVar = new s();
        u uVar = (u) this.f267090d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f267091e.get();
        f267086f.getClass();
        return new q("SelectDistricts", c.C12294c.f428814b, new p(nVar, kVar, screenPerformanceTracker, uVar, sVar));
    }
}
