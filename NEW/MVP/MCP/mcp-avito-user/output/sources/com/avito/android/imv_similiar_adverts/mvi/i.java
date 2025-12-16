package com.avito.android.imv_similiar_adverts.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import sN.C48078c;

/* compiled from: ImvSimilarAdvertsFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/i;", "Ldagger/internal/h;", "Lcom/avito/android/imv_similiar_adverts/mvi/h;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f170923f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f170924a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f170925b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f170926c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final m f170927d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u f170928e;

    /* compiled from: ImvSimilarAdvertsFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/i$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k f fVar, @Y61.k d dVar, @Y61.k k kVar, @Y61.k m mVar, @Y61.k u uVar) {
        this.f170924a = fVar;
        this.f170925b = dVar;
        this.f170926c = kVar;
        this.f170927d = mVar;
        this.f170928e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f170924a.get();
        c cVar = (c) this.f170925b.get();
        this.f170926c.getClass();
        j jVar = new j();
        l lVar = (l) this.f170927d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f170928e.get();
        f170923f.getClass();
        C48078c.f437631c.getClass();
        return new h("ImvSimilarAdverts", C48078c.f437632d, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
