package com.avito.android;

import com.avito.android.A0;
import com.avito.android.ab_tests.configs.DegradeApplicationColdStartTestGroup;
import com.avito.android.ab_tests.configs.DegradeScrollTestGroup;
import com.avito.android.ab_tests.configs.DegradeSomeScreensTestGroup;
import com.avito.android.ab_tests.configs.HttpProtocolTestGroup;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.ab_tests.configs.QuicApiRequestsTestGroup;
import com.avito.android.ab_tests.configs.QuicTuningTestGroup;
import com.avito.android.ab_tests.configs.ZstdTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.InterfaceC35950u;
import com.avito.android.util.feature.OptionSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;

/* compiled from: PerformanceFeatures.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/I1;", "Lcom/avito/android/A0;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class I1 extends A0 {

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f67278k0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final A0.a f67279A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final A0.a f67280B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final A0.a f67281C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final A0.a f67282D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final A0.a f67283E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final A0.a f67284F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final A0.a f67285G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final A0.a f67286H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final A0.a f67287I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final A0.a f67288J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final A0.a f67289K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final A0.a f67290L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final A0.a f67291M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final A0.a f67292N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final A0.a f67293O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final A0.a f67294P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final A0.a f67295Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final A0.a f67296R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final A0.a f67297S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final A0.a f67298T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final A0.a f67299U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final A0.a f67300V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final A0.a f67301W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final A0.a f67302X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final A0.a f67303Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final A0.a f67304Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final A0.a f67305a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f67306b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final A0.a f67307b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f67308c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final A0.a f67309c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f67310d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final A0.a f67311d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A0.a f67312e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final A0.a f67313e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A0.a f67314f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final A0.a f67315f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final A0.a f67316g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final A0.a f67317g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final A0.a f67318h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final A0.a f67319h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final A0.a f67320i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final A0.a f67321i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final A0.a f67322j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final A0.a f67323j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final A0.a f67324k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final A0.a f67325l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final A0.a f67326m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final A0.a f67327n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final A0.a f67328o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final A0.a f67329p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final A0.a f67330q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final A0.a f67331r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final A0.a f67332s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final A0.a f67333t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final A0.a f67334u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final A0.a f67335v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final A0.a f67336w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final A0.a f67337x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final A0.a f67338y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final A0.a f67339z;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(I1.class, "groupingAdvertsWithoutActivity", "getGroupingAdvertsWithoutActivity()Lcom/avito/android/toggle/Feature;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f67278k0 = new kotlin.reflect.n[]{n0Var.i(h0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "channelWithoutActivity", "getChannelWithoutActivity()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "filtersLocationPickerWithoutActivity", "getFiltersLocationPickerWithoutActivity()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "screenPerformanceMetricsToDwh", "getScreenPerformanceMetricsToDwh()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "screenPerformanceMetricsToStatsd", "getScreenPerformanceMetricsToStatsd()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "imageMetricToDwh", "getImageMetricToDwh()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "imageStatsdMetrics", "getImageStatsdMetrics()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "collectMemoryMetrics", "getCollectMemoryMetrics()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "leakCanaryReleases", "getLeakCanaryReleases()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "measureNetworkRequestsDurationForClickstream", "getMeasureNetworkRequestsDurationForClickstream()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "measureNetworkRequestsDurationForStatsd", "getMeasureNetworkRequestsDurationForStatsd()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "collectFps", "getCollectFps()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "topLocationSingleRequest", "getTopLocationSingleRequest()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendNetworkErrorMetrics", "getSendNetworkErrorMetrics()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendNetworkErrorDebugMetrics", "getSendNetworkErrorDebugMetrics()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendImageErrorMetrics", "getSendImageErrorMetrics()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendErrorDialogMetrics", "getSendErrorDialogMetrics()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "screenCoverage", "getScreenCoverage()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendMemoryWarnings", "getSendMemoryWarnings()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendNetworkSuccessRateMetrics", "getSendNetworkSuccessRateMetrics()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "retryRecoverableNetworkErrors", "getRetryRecoverableNetworkErrors()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "collectColdWarmHotStarts", "getCollectColdWarmHotStarts()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "quicImages", "getQuicImages()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "quicTuning", "getQuicTuning()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "quicTuningMode", "getQuicTuningMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "quicApiRequests", "getQuicApiRequests()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "quicApiRequestsMode", "getQuicApiRequestsMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "cronetNonFatalReports", "getCronetNonFatalReports()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "httpProtocol", "getHttpProtocol()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "httpProtocolMode", "getHttpProtocolMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "screenActivityAndFragmentsOpenings", "getScreenActivityAndFragmentsOpenings()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendAnrWatchdogMetricsToDwh", "getSendAnrWatchdogMetricsToDwh()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendAnrWatchdogMetricsToCrashlytics", "getSendAnrWatchdogMetricsToCrashlytics()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "degradeSomeScreens", "getDegradeSomeScreens()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "degradeSomeScreensMode", "getDegradeSomeScreensMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "degradeScroll", "getDegradeScroll()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "degradeScrollMode", "getDegradeScrollMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "enableTogglesDebugging", "getEnableTogglesDebugging()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "debugNonRotatableToggle", "getDebugNonRotatableToggle()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "debugRotatableToggle", "getDebugRotatableToggle()Lcom/avito/android/toggle/Feature;", 0, n0Var), n0Var.i(new kotlin.jvm.internal.h0(I1.class, "sendVerticalizationInfo", "getSendVerticalizationInfo()Lcom/avito/android/toggle/Feature;", 0)), com.akita.compose.theme.re23.style.C0.k(I1.class, "useLatestTouchBeforeSpanStartTime", "getUseLatestTouchBeforeSpanStartTime()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "useFullColdStartupTime", "getUseFullColdStartupTime()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "degradeColdStartMode", "getDegradeColdStartMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "usePreloadingPromise", "getUsePreloadingPromise()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "usePreloadingPromiseMode", "getUsePreloadingPromiseMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "useProfilePreloadingPromise", "getUseProfilePreloadingPromise()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendInterruptedLoadingEvent", "getSendInterruptedLoadingEvent()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "useZstd", "getUseZstd()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "useZstdMode", "getUseZstdMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendNetworkRegionMetric", "getSendNetworkRegionMetric()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendCompressionMetrics", "getSendCompressionMetrics()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "reportRetrofitExceptions", "getReportRetrofitExceptions()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "offlineCacheResponses", "getOfflineCacheResponses()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "disableSendingNetworkErrorWithCanceledOrInterruptedSubtype", "getDisableSendingNetworkErrorWithCanceledOrInterruptedSubtype()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "offlineCacheMetrics", "getOfflineCacheMetrics()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "offlineCacheMeasureRequestDuration", "getOfflineCacheMeasureRequestDuration()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "sendCacheIOResults", "getSendCacheIOResults()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "offlineStaticFallback", "getOfflineStaticFallback()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "periodicRemoteTogglesFetching", "getPeriodicRemoteTogglesFetching()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "api4FeaturesForegroundOnly", "getApi4FeaturesForegroundOnly()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "beduinPatternCaching", "getBeduinPatternCaching()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(I1.class, "beduinPatternCachingEvents", "getBeduinPatternCachingEvents()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public I1(@Y61.k InterfaceC35950u interfaceC35950u) {
        Owners owners = Owners.f210465Z0;
        Boolean bool = Boolean.TRUE;
        A0.u(this, "Открытие экрана группировки объявлений в виде фрагмента", "groupingAdvertsWithoutActivity", bool, false, 0, owners, 56);
        this.f67306b = A0.u(this, "Открытие экрана чата в виде фрагмента", "channelWithoutActivity", bool, false, 0, owners, 56);
        Boolean bool2 = Boolean.FALSE;
        this.f67308c = A0.u(this, "Открытие экрана выбора радиуса в расширенных фильтрах поиска в виде фрагмента", "locationPickerWithoutActivity", bool2, false, 0, owners, 56);
        this.f67310d = A0.u(this, "Отсылать screen performance метрики в DWH. События 3223, 3224, 3225, 3226", "per_sendScreenPerformanceMetricsToDwh", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67312e = A0.u(this, "Отсылать screen performance метрики в Statsd", "per_sendScreenPerformanceMetricsToGrafana", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67314f = A0.u(this, "Отсылать Image Loading в DWH. Событие 4204", "per_sendImageMetricsToDwh", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67316g = A0.u(this, "Отсылать Image metrics в statsd", "per_sendImageMetricsToGrafana", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67318h = A0.u(this, "Собирать метрики памяти", "collectMemoryMetrics", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67320i = A0.u(this, "Активирует LeakCanary for releases", "per_leakCanaryReleases", bool2, false, 0, owners, 56);
        this.f67322j = A0.u(this, "Измерять скорость сетевых запросов (событие 6545)", "per_measure_network_requests_duration", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67324k = A0.u(this, "Измерять скорость сетевых запросов и отправлят в statsd", "per_measure_network_requests_duration_for_statsd", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        interfaceC35950u.o().getClass();
        this.f67325l = A0.u(this, "Собирать метрики fps и отправлять на наши сервера", "per_collectFps", false, false, 0, owners, 56);
        this.f67326m = A0.u(this, "Единый запрос 2/locations/top за время жизни приложения", "topLocationSingleRequest", bool, false, 0, owners, 56);
        this.f67327n = A0.u(this, "Отсылать события по ошибкам сетевых запросов в DWH. Событие 4599", "per_sendNetworkErrorMetricsToDwh", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67328o = A0.u(this, "Отсылать для отладки в Clickstream ошибки, для которых не удалось извлечь явное описание. Событие 5723", "per_sendNetworkErrorDebugMetrics", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67329p = A0.u(this, "Отсылать события по ошибкам загрузки картинок в DWH. Событие 4599", "per_sendImageNetworkErrorMetricsToDwh", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67330q = A0.u(this, "Отсылать события о показах диалогов об ошибках (алерты/тосты) в DWH. Событие 5596", "per_sendErrorDialogMetricsToDwh", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67331r = A0.u(this, "Отсылать статистику покрытия экранов перформанс-метриками. Событие 4944", "per_sendPerfMetricsCoverageEvent", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67332s = A0.u(this, "Отсылать события о memory warning в DWH. Событие 4237", "per_sendMemoryWarningEventsToDwh", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67333t = A0.u(this, "Отсылать url'ы успешных и неуспешных запросов контента и картинок в DWH. Событие 5888", "per_sendNetworkSliMetricsToDwh", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67334u = A0.u(this, "Отправлять повторно сетевые запросы. Вторая версия тогла, работает вместе с ретраером от OkHttp. Событие 5743", "per_retryRecoverableNetworkErrorsV2", bool, false, 0, owners, 56);
        this.f67335v = A0.u(this, "Собирать данные о типах старта - холодном, тёплом, горячем", "per_collectColdWarmHotStarts", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        this.f67336w = A0.u(this, "Использовать http3 (quic) протокол для части запросов картинок", "per_quicImages", bool2, false, 0, owners, 56);
        this.f67337x = A0.u(this, "Эксперименты по донастройке http3 (quic)", "per_quicTuninng", bool2, false, 0, owners, 56);
        QuicTuningTestGroup[] quicTuningTestGroupArrValues = QuicTuningTestGroup.values();
        ArrayList arrayList = new ArrayList(quicTuningTestGroupArrValues.length);
        for (QuicTuningTestGroup quicTuningTestGroup : quicTuningTestGroupArrValues) {
            arrayList.add(quicTuningTestGroup.f67916b);
        }
        String str = "";
        OptionSet optionSet = new OptionSet("", C42745f0.M0(arrayList));
        Owners owners2 = Owners.f210465Z0;
        this.f67338y = A0.u(this, "Эксперименты по донастройке http3 (quic)", "per_quicTuningMode", optionSet, false, 0, owners2, 40);
        this.f67339z = A0.u(this, "Использовать http3 (quic) протокол для части запросов к app.avito.ru (с возможной подменой хоста)", "per_quicApiRequests", Boolean.FALSE, false, 0, owners2, 56);
        QuicApiRequestsTestGroup[] quicApiRequestsTestGroupArrValues = QuicApiRequestsTestGroup.values();
        ArrayList arrayList2 = new ArrayList(quicApiRequestsTestGroupArrValues.length);
        for (QuicApiRequestsTestGroup quicApiRequestsTestGroup : quicApiRequestsTestGroupArrValues) {
            arrayList2.add(quicApiRequestsTestGroup.f67912b);
        }
        OptionSet optionSet2 = new OptionSet("", C42745f0.M0(arrayList2));
        Owners owners3 = Owners.f210465Z0;
        this.f67279A = A0.u(this, "Использовать http3 (quic) протокол для части запросов к app.avito.ru (с возможной подменой хоста)", "per_quicApiRequestsMode", optionSet2, false, 0, owners3, 40);
        this.f67280B = A0.u(this, "Отправлять или нет non-fatal ошибки Cronet в Crashlytics", "per_cronetNonFatalReports", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners3, 56);
        this.f67281C = A0.u(this, "Эксперимент по включению / отключению определённых HTTP протоколов", "per_httpProtocol", Boolean.FALSE, false, 0, owners3, 56);
        HttpProtocolTestGroup[] httpProtocolTestGroupArrValues = HttpProtocolTestGroup.values();
        ArrayList arrayList3 = new ArrayList(httpProtocolTestGroupArrValues.length);
        for (HttpProtocolTestGroup httpProtocolTestGroup : httpProtocolTestGroupArrValues) {
            arrayList3.add(httpProtocolTestGroup.f67828b);
        }
        OptionSet optionSet3 = new OptionSet("", C42745f0.M0(arrayList3));
        Owners owners4 = Owners.f210465Z0;
        this.f67282D = A0.u(this, "Эксперимент по включению / отключению определённых HTTP протоколов", "per_httpProtocolMode", optionSet3, false, 0, owners4, 40);
        this.f67283E = A0.u(this, "Отсылать статистику по использованию activity и fragment в Statsd", "per_reportScreensCreation", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners4, 56);
        this.f67284F = A0.u(this, "Собирать и отправлять inhouse статистику по ANR-крешам в DWH", "per_sendAnrWatchdogMetrics", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners4, 56);
        this.f67285G = A0.u(this, "Собирать и отправлять inhouse статистику по ANR-крешам в Crashlytics", "per_sendAnrWatchdogMetricsToCrashlytics", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners4, 56);
        this.f67286H = A0.u(this, "АБ на ухудшение перф-метрик нескольких экранов (MainPage, Serp, UserProfile)", "per_degradeSomeScreens", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners4, 56);
        DegradeSomeScreensTestGroup[] degradeSomeScreensTestGroupArrValues = DegradeSomeScreensTestGroup.values();
        ArrayList arrayList4 = new ArrayList(degradeSomeScreensTestGroupArrValues.length);
        for (DegradeSomeScreensTestGroup degradeSomeScreensTestGroup : degradeSomeScreensTestGroupArrValues) {
            arrayList4.add(degradeSomeScreensTestGroup.f67815b);
        }
        OptionSet optionSet4 = new OptionSet("", C42745f0.M0(arrayList4));
        Owners owners5 = Owners.f210465Z0;
        this.f67287I = A0.u(this, "АБ на ухудшение перф-метрик нескольких экранов (MainPage, Serp, UserProfile)", "per_degradeSomeScreensMode", optionSet4, false, 0, owners5, 40);
        this.f67288J = A0.u(this, "АБ на ухудшение FPS-метрик", "per_degradeScroll", Boolean.FALSE, false, 0, owners5, 56);
        DegradeScrollTestGroup[] degradeScrollTestGroupArrValues = DegradeScrollTestGroup.values();
        ArrayList arrayList5 = new ArrayList(degradeScrollTestGroupArrValues.length);
        for (DegradeScrollTestGroup degradeScrollTestGroup : degradeScrollTestGroupArrValues) {
            arrayList5.add(degradeScrollTestGroup.f67810b);
        }
        OptionSet optionSet5 = new OptionSet("", C42745f0.M0(arrayList5));
        Owners owners6 = Owners.f210465Z0;
        this.f67289K = A0.u(this, "АБ на ухудшение FPS-метрик", "per_degradeScrollMode", optionSet5, false, 0, owners6, 40);
        Boolean bool3 = Boolean.TRUE;
        this.f67290L = A0.u(this, "Метрики для анализа/отладки скорости применения тогглов. События 10040-10043", "per_enableTogglesDebugging", bool3, false, 0, owners6, 56);
        Boolean bool4 = Boolean.FALSE;
        this.f67291M = A0.u(this, "Метрики для анализа/отладки скорости применения тогглов. События 10040-10043", "per_debugNonRotatableToggle", bool4, false, 0, owners6, 56);
        this.f67292N = A0.u(this, "Метрики для анализа/отладки скорости применения ротируемых тогглов. События 10040-10043", "per_debugRotatableToggle", bool4, false, 0, owners6, 56);
        this.f67293O = A0.u(this, "PER-7490: Логируем информацию о категории и микрокатегории горизонтального экрана. Событие 8843", "per_logScreenVerticalizationInfoAlongWithPerformanceMetrics", bool3, false, 0, owners6, 56);
        this.f67294P = A0.u(this, "PER-7364: В statsd-метриках начинаем запоминать время тача на начало, а не конец замеров", "per_useLatestTouchBeforeSpanStartTimeInStatsd", bool3, false, 0, owners6, 56);
        this.f67295Q = A0.u(this, "Временно отправляем полное время холодного старта в событие 5968", "per_measureFullColdStartupTime", bool4, false, 0, owners6, 56);
        DegradeApplicationColdStartTestGroup[] degradeApplicationColdStartTestGroupArrValues = DegradeApplicationColdStartTestGroup.values();
        ArrayList arrayList6 = new ArrayList(degradeApplicationColdStartTestGroupArrValues.length);
        for (DegradeApplicationColdStartTestGroup degradeApplicationColdStartTestGroup : degradeApplicationColdStartTestGroupArrValues) {
            arrayList6.add(degradeApplicationColdStartTestGroup.f67804b);
        }
        OptionSet optionSet6 = new OptionSet("", C42745f0.M0(arrayList6));
        Owners owners7 = Owners.f210465Z0;
        this.f67296R = A0.u(this, "АБ на ухудшение времени холодного старта в приложении", "per_degradeColdStartMode", optionSet6, false, 0, owners7, 40);
        this.f67297S = A0.u(this, "API для предзагрузки данных для экрана", "per_usePreloadingPromise", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners7, 56);
        if (interfaceC35950u.l()) {
            PreloadingPromiseTestGroup preloadingPromiseTestGroup = PreloadingPromiseTestGroup.f67893c;
        } else {
            PreloadingPromiseTestGroup preloadingPromiseTestGroup2 = PreloadingPromiseTestGroup.f67893c;
            str = "test";
        }
        List list = PreloadingPromiseTestGroup.f67896f;
        ArrayList arrayList7 = new ArrayList(C42745f0.q(list, 10));
        Iterator it = ((AbstractC42738c) list).iterator();
        while (it.hasNext()) {
            arrayList7.add(((PreloadingPromiseTestGroup) it.next()).f67897b);
        }
        OptionSet optionSet7 = new OptionSet(str, C42745f0.M0(arrayList7));
        Owners owners8 = Owners.f210465Z0;
        this.f67298T = A0.u(this, "АБ на предзагрузку данных для экрана", "per_usePreloadingPromiseMode", optionSet7, false, 0, owners8, 40);
        this.f67299U = A0.u(this, "PreloadingPromise на экране UserProfile", "per_useProfilePreloadingPromise", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners8, 56);
        this.f67300V = A0.u(this, "Отправлять событие 13867, если пользователь не дождался загрузки контента", "per_sendInterruptedLoadingEvent", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners8, 56);
        this.f67301W = A0.u(this, "Использует Zstd для сжатия апи респонсов", "per_useZstd", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners8, 56);
        List list2 = ZstdTestGroup.f67938f;
        ArrayList arrayList8 = new ArrayList(C42745f0.q(list2, 10));
        Iterator it2 = ((AbstractC42738c) list2).iterator();
        while (it2.hasNext()) {
            arrayList8.add(((ZstdTestGroup) it2.next()).f67939b);
        }
        OptionSet optionSet8 = new OptionSet("control", C42745f0.M0(arrayList8));
        Owners owners9 = Owners.f210465Z0;
        A0.u(this, "АБ на Zstd для сжатия апи респонсов", "per_useZstdMode", optionSet8, false, 0, owners9, 40);
        this.f67302X = A0.u(this, "Включает отправку метрик со сбором региона", "per_sendNetworkRegionMetrics", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67303Y = A0.u(this, "Включает сбор метрик по сжатию респонсов", "per_sendCompressionMetrics", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67304Z = A0.u(this, "Собирает ошибки, происходящие в Retrofit (не OkHttp)", "per_reportRetrofitExceptions", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67305a0 = A0.u(this, "Включает кеширование нетворк запросов для оффлайн режима", "per_offlineCacheResponses", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67307b0 = A0.u(this, "Убираем отправку ошибок нетворк слоя с subtype == canceled и interrupted", "per_disableSendingNetworkErrorWithCanceledOrInterruptedSubtype", Boolean.FALSE, false, 0, owners9, 56);
        this.f67309c0 = A0.u(this, "Включает метрики кеширования для оффлайн режима", "per_collectCacheEvents", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67311d0 = A0.u(this, "Включает отправку метрик по времени выполнения кешированных запросов", "per_measureCacheableRequestDuration", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67313e0 = A0.u(this, "Включает метрики IO операций создания/удаления кеша для офлайн режима", "per_sendCacheIOResults", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67315f0 = A0.u(this, "Включает проверку статик фолбеков перед записью в кеш", "per_offlineStaticFallback", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67317g0 = A0.u(this, "Включает регулярное обновление фича-тогглов через workManager", "per_periodicRemoteTogglesFetching", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67319h0 = A0.u(this, "Заставляет запрос 4/features выполняться не со стартом процесса, а только с форграундом", "per_fetchAbForeground", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67321i0 = A0.u(this, "Включает кеширование шаблонов для beduin v2", "per_beduinPatternCaching", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
        this.f67323j0 = A0.u(this, "Включает метрики кеширование шаблонов для beduin v2", "per_collectPatternCacheEvents", Boolean.valueOf(!interfaceC35950u.l()), false, 0, owners9, 56);
    }

    @Y61.k
    public final DE0.a<Boolean> v() {
        kotlin.reflect.n<Object> nVar = f67278k0[1];
        return this.f67306b.a();
    }

    @Y61.k
    public final DE0.a<Boolean> w() {
        kotlin.reflect.n<Object> nVar = f67278k0[3];
        return this.f67310d.a();
    }

    @Y61.k
    public final DE0.a<Boolean> x() {
        kotlin.reflect.n<Object> nVar = f67278k0[48];
        return this.f67301W.a();
    }
}
