package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/q;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/p;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f176344f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f176345a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f176346b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f176347c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final w f176348d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f176349e;

    /* compiled from: BeduinFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/q$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public q(@Y61.k j jVar, @Y61.k h hVar, @Y61.k u uVar, @Y61.k w wVar, @Y61.k dagger.internal.l lVar) {
        this.f176345a = jVar;
        this.f176346b = hVar;
        this.f176347c = uVar;
        this.f176348d = wVar;
        this.f176349e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f176345a.get();
        g gVar = (g) this.f176346b.get();
        t tVar = (t) this.f176347c.get();
        v vVar = (v) this.f176348d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f176349e.f393949a;
        f176344f.getClass();
        return new p("BeduinV2", AbstractC40048c.C11084c.f395217b, new o(iVar, gVar, screenPerformanceTracker, vVar, tVar));
    }
}
