package com.avito.android.lib.beduin_v2.feature.tracker;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkRequestTracker_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/j;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/tracker/i;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176387c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f176388a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f176389b;

    /* compiled from: NetworkRequestTracker_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/j$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k dagger.internal.l lVar, @Y61.k h hVar) {
        this.f176388a = lVar;
        this.f176389b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f176388a.f393949a;
        g gVar = (g) this.f176389b.get();
        f176387c.getClass();
        return new i(screenPerformanceTracker, gVar);
    }
}
