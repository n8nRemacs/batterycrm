package com.avito.android.imv_goods_poll.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvGoodsPollFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/j;", "Ldagger/internal/h;", "Lcom/avito/android/imv_goods_poll/mvi/i;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f170706f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f170707a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f170708b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f170709c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f170710d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u f170711e;

    /* compiled from: ImvGoodsPollFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/j$a;", "", "<init>", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k g gVar, @Y61.k e eVar, @Y61.k l lVar, @Y61.k o oVar, @Y61.k u uVar) {
        this.f170707a = gVar;
        this.f170708b = eVar;
        this.f170709c = lVar;
        this.f170710d = oVar;
        this.f170711e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f170707a.get();
        b bVar = (b) this.f170708b.get();
        this.f170709c.getClass();
        k kVar = new k();
        m mVar = (m) this.f170710d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f170711e.get();
        f170706f.getClass();
        fN.c.f395862d.getClass();
        return new i("ImvGoodsPoll", fN.c.f395863e, new h(fVar, bVar, kVar, screenPerformanceTracker, mVar));
    }
}
