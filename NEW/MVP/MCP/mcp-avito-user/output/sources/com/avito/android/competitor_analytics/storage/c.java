package com.avito.android.competitor_analytics.storage;

import AK0.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: CompetitorAnalyticsStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/storage/c;", "Lcom/avito/android/competitor_analytics/storage/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<l> f124570a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f124571b;

    @Inject
    public c(@k R0 r02, @k h31.e eVar) {
        this.f124570a = eVar;
        this.f124571b = r02;
    }

    @Override // com.avito.android.competitor_analytics.storage.a
    @Y61.l
    public final Object a(long j12, @k SuspendLambda suspendLambda) {
        Object objG = C43259k.g(this.f124571b.a(), new b(this, j12, null), suspendLambda);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.competitor_analytics.storage.a
    @k
    public final Set<String> b() {
        Set<String> setF = this.f124570a.get().f("copm_an_closed_banner_key");
        return setF == null ? B0.f406639b : setF;
    }
}
