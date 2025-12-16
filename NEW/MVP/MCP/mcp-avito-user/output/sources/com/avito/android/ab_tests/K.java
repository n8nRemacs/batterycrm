package com.avito.android.ab_tests;

import com.avito.android.ab_tests.configs.BeduinPatternCachingTestGroup;
import com.avito.android.ab_tests.configs.DegradeApplicationColdStartTestGroup;
import com.avito.android.ab_tests.configs.DegradeScrollTestGroup;
import com.avito.android.ab_tests.configs.DegradeSomeScreensTestGroup;
import com.avito.android.ab_tests.configs.HttpProtocolTestGroup;
import com.avito.android.ab_tests.configs.OfflinizationTestGroup;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.ab_tests.configs.QuicApiRequestsTestGroup;
import com.avito.android.ab_tests.configs.QuicTuningTestGroup;
import com.avito.android.ab_tests.configs.ZstdTestGroup;
import kotlin.Metadata;

/* compiled from: PerformanceAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/K;", "", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface K {
    @Y61.k
    u3.f<DegradeScrollTestGroup> a();

    @Y61.k
    u3.f<ZstdTestGroup> b();

    @Y61.k
    u3.f<BeduinPatternCachingTestGroup> c();

    @Y61.k
    u3.f<PreloadingPromiseTestGroup> d();

    @Y61.k
    u3.f<HttpProtocolTestGroup> e();

    @Y61.k
    u3.f<OfflinizationTestGroup> f();

    @Y61.k
    u3.f<QuicApiRequestsTestGroup> g();

    @Y61.k
    u3.f<DegradeSomeScreensTestGroup> h();

    @Y61.k
    u3.f<QuicTuningTestGroup> i();

    @Y61.k
    u3.f<DegradeApplicationColdStartTestGroup> j();
}
