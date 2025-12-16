package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import Tv.C15414e;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorMainFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/v;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/u;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f135728f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final s f135729a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f135730b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f135731c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final z f135732d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f135733e;

    /* compiled from: TarifikatorMainFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/v$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public v(@Y61.k s sVar, @Y61.k q qVar, @Y61.k x xVar, @Y61.k z zVar, @Y61.k dagger.internal.l lVar) {
        this.f135729a = sVar;
        this.f135730b = qVar;
        this.f135731c = xVar;
        this.f135732d = zVar;
        this.f135733e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f135729a.get();
        b bVar = (b) this.f135730b.get();
        this.f135731c.getClass();
        w wVar = new w();
        y yVar = (y) this.f135732d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f135733e.f393949a;
        f135728f.getClass();
        C15414e.f16011d.getClass();
        return new u("TarifikatorMainFeature", C15414e.f16012e, new t(rVar, bVar, screenPerformanceTracker, yVar, wVar));
    }
}
