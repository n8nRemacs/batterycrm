package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi;

import Xv.C17052c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorRegionFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/q;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/p;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f135869f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f135870a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f135871b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final s f135872c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final u f135873d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f135874e;

    /* compiled from: TarifikatorRegionFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/q$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public q(@Y61.k n nVar, @Y61.k l lVar, @Y61.k s sVar, @Y61.k u uVar, @Y61.k dagger.internal.l lVar2) {
        this.f135870a = nVar;
        this.f135871b = lVar;
        this.f135872c = sVar;
        this.f135873d = uVar;
        this.f135874e = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f135870a.get();
        com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a aVar = (com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a) this.f135871b.get();
        this.f135872c.getClass();
        r rVar = new r();
        t tVar = (t) this.f135873d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f135874e.f393949a;
        f135869f.getClass();
        C17052c.f19147h.getClass();
        return new p("TarifikatorRegionFeature", C17052c.f19148i, new o(mVar, aVar, screenPerformanceTracker, tVar, rVar));
    }
}
