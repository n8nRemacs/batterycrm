package com.avito.android.lib.compose.design.shared.benchmark.deeplinks;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.compose.design.shared.benchmark.BenchmarkComposeDeepLink;
import com.avito.android.util.C;
import com.avito.android.util.E;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BenchmarkComposeDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/benchmark/deeplinks/b;", "Lev/b;", "Lcom/avito/android/lib/compose/design/shared/benchmark/BenchmarkComposeDeepLink;", "_design-modules_compose_shared_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC40162b<BenchmarkComposeDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f177633d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C f177634e;

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k C c12) {
        this.f177633d = interfaceC4053a;
        this.f177634e = c12;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        BenchmarkComposeDeepLink benchmarkComposeDeepLink = (BenchmarkComposeDeepLink) deepLink;
        if (!E.a(this.f177634e.getF125491k())) {
            return AbstractC14250d.b.f9170c;
        }
        this.f177633d.g1(new a(this, benchmarkComposeDeepLink));
        return AbstractC14250d.c.f9171c;
    }
}
