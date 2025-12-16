package com.avito.android.lib.beduin_v2.feature.di;

import cU0.C27106d;
import cU0.InterfaceC27104b;
import cU0.InterfaceC27108f;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: BeduinFeatureComponent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2_feature_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final D0 f176030a = new D0(new a());

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final N0 f176031b = new N0(new b());

    /* compiled from: BeduinFeatureComponent.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/beduin_v2/feature/di/K$a", "Lcom/avito/android/lib/beduin_v2/feature/di/C0;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements C0 {
        @Override // com.avito.android.lib.beduin_v2.feature.di.C0
        @Y61.k
        public final Set<dU0.c> b() {
            return kotlin.collections.B0.f406639b;
        }

        @Override // com.avito.android.lib.beduin_v2.feature.di.C0
        @Y61.k
        public final Set<com.avito.beduin.v2.handler.flow.j> h() {
            return kotlin.collections.B0.f406639b;
        }

        @Override // com.avito.android.lib.beduin_v2.feature.di.C0
        @Y61.k
        public final Set<InterfaceC27104b> i() {
            return kotlin.collections.B0.f406639b;
        }

        @Override // com.avito.android.lib.beduin_v2.feature.di.C0
        @Y61.k
        public final Set<AbstractC36250j> j() {
            return kotlin.collections.B0.f406639b;
        }
    }

    /* compiled from: BeduinFeatureComponent.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/beduin_v2/feature/di/K$b", "Lcom/avito/android/lib/beduin_v2/feature/di/M0;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements M0 {
    }

    public static H a(H.a aVar, ScreenPerformanceTracker screenPerformanceTracker, ZS.b bVar, cv.d dVar, InterfaceC27108f interfaceC27108f, com.avito.beduin.v2.engine.component.z zVar, ZS.c cVar, int i12) {
        return aVar.a(screenPerformanceTracker, bVar, dVar, f176030a, f176031b, (i12 & 8) != 0 ? new C27106d() : interfaceC27108f, (i12 & 16) != 0 ? new com.avito.beduin.v2.engine.component.x() : zVar, (i12 & 32) != 0 ? new ZS.c(false) : cVar);
    }
}
