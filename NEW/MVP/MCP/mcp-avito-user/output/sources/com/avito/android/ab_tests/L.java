package com.avito.android.ab_tests;

import com.avito.android.I1;
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
import javax.inject.Inject;
import kotlin.Metadata;
import s3.C47973h;
import s3.C47977l;
import s3.C47978m;
import s3.C47979n;
import s3.C47985u;

/* compiled from: PerformanceAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/L;", "Lcom/avito/android/ab_tests/K;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L implements K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I1 f67720a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f67721b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27642e f67722c;

    @Inject
    public L(@Y61.k I1 i12, @Y61.k c0 c0Var, @Y61.k InterfaceC27642e interfaceC27642e) {
        this.f67720a = i12;
        this.f67721b = c0Var;
        this.f67722c = interfaceC27642e;
    }

    @Override // com.avito.android.ab_tests.K
    @Y61.k
    public final u3.f<DegradeScrollTestGroup> a() {
        return new u3.f<>(this.f67722c.c(new C47978m(this.f67720a)), this.f67721b);
    }

    @Override // com.avito.android.ab_tests.K
    @Y61.k
    public final u3.f<ZstdTestGroup> b() {
        return new u3.f<>(this.f67722c.c(new s3.Y()), this.f67721b);
    }

    @Override // com.avito.android.ab_tests.K
    @Y61.k
    public final u3.f<BeduinPatternCachingTestGroup> c() {
        return new u3.f<>(this.f67722c.c(new C47973h()), this.f67721b);
    }

    @Override // com.avito.android.ab_tests.K
    @Y61.k
    public final u3.f<PreloadingPromiseTestGroup> d() {
        return new u3.f<>(this.f67722c.c(new s3.K(this.f67720a)), this.f67721b);
    }

    @Override // com.avito.android.ab_tests.K
    @Y61.k
    public final u3.f<HttpProtocolTestGroup> e() {
        return new u3.f<>(this.f67722c.c(new C47985u(this.f67720a)), this.f67721b);
    }

    @Override // com.avito.android.ab_tests.K
    @Y61.k
    public final u3.f<OfflinizationTestGroup> f() {
        return new u3.f<>(this.f67722c.c(new s3.J()), this.f67721b);
    }

    @Override // com.avito.android.ab_tests.K
    @Y61.k
    public final u3.f<QuicApiRequestsTestGroup> g() {
        return new u3.f<>(this.f67722c.c(new s3.O(this.f67720a)), this.f67721b);
    }

    @Override // com.avito.android.ab_tests.K
    @Y61.k
    public final u3.f<DegradeSomeScreensTestGroup> h() {
        return new u3.f<>(this.f67722c.c(new C47979n(this.f67720a)), this.f67721b);
    }

    @Override // com.avito.android.ab_tests.K
    @Y61.k
    public final u3.f<QuicTuningTestGroup> i() {
        return new u3.f<>(this.f67722c.c(new s3.P(this.f67720a)), this.f67721b);
    }

    @Override // com.avito.android.ab_tests.K
    @Y61.k
    public final u3.f<DegradeApplicationColdStartTestGroup> j() {
        return new u3.f<>(this.f67722c.c(new C47977l(this.f67720a)), this.f67721b);
    }
}
