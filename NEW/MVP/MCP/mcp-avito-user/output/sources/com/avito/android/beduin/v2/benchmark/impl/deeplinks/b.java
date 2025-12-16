package com.avito.android.beduin.v2.benchmark.impl.deeplinks;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.beduin.v2.benchmark.BeduinV2BenchmarkPageDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C;
import com.avito.android.util.E;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinV2BenchmarkPageDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/v2/benchmark/impl/deeplinks/b;", "Lev/b;", "Lcom/avito/android/beduin/v2/benchmark/BeduinV2BenchmarkPageDeepLink;", "_design-modules_beduin-v2_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40162b<BeduinV2BenchmarkPageDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f104622d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C f104623e;

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k C c12) {
        this.f104622d = interfaceC4053a;
        this.f104623e = c12;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        BeduinV2BenchmarkPageDeepLink beduinV2BenchmarkPageDeepLink = (BeduinV2BenchmarkPageDeepLink) deepLink;
        if (!E.a(this.f104623e.getF125491k())) {
            return AbstractC14250d.b.f9170c;
        }
        this.f104622d.g1(new a(this, beduinV2BenchmarkPageDeepLink));
        return AbstractC14250d.c.f9171c;
    }
}
