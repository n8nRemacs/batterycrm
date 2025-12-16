package com.avito.android.lib.beduin_v2.feature.di;

import C11.b;
import cU0.InterfaceC27108f;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinFeatureComponentImpl.kt */
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/I;", "Lcom/avito/android/lib/beduin_v2/feature/di/H;", "a", "b", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@V0
/* loaded from: classes14.dex */
public interface I extends H {

    /* compiled from: BeduinFeatureComponentImpl.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/I$a;", "", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        I a(@h31.b @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @h31.b @Y61.k ZS.b bVar, @Y61.k cv.d dVar, @Y61.k D0 d02, @Y61.k N0 n02, @h31.b @Y61.k InterfaceC27108f interfaceC27108f, @h31.b @Y61.k com.avito.beduin.v2.engine.component.z zVar, @h31.b @Y61.k ZS.c cVar);
    }

    /* compiled from: BeduinFeatureComponentImpl.kt */
    @ContributesBinding
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/I$b;", "Lcom/avito/android/lib/beduin_v2/feature/di/H$a;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements H.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a f176027a;

        @Inject
        public b(@Y61.k a aVar) {
            this.f176027a = aVar;
        }

        @Override // com.avito.android.lib.beduin_v2.feature.di.H.a
        @Y61.k
        public final I a(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k ZS.b bVar, @Y61.k cv.d dVar, @Y61.k D0 d02, @Y61.k N0 n02, @Y61.k InterfaceC27108f interfaceC27108f, @Y61.k com.avito.beduin.v2.engine.component.z zVar, @Y61.k ZS.c cVar) {
            return this.f176027a.a(screenPerformanceTracker, bVar, dVar, d02, n02, interfaceC27108f, zVar, cVar);
        }
    }
}
