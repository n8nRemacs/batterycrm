package com.avito.android.beduin.v2.benchmark.impl.deeplinks;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.beduin.v2.benchmark.BeduinV2BenchmarkPageDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: BeduinV2BenchmarkPageDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/v2/benchmark/impl/deeplinks/d;", "LKu/a;", "Lcom/avito/android/beduin/v2/benchmark/BeduinV2BenchmarkPageDeepLink;", "<init>", "()V", "_design-modules_beduin-v2_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends AbstractC14350a<BeduinV2BenchmarkPageDeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new BeduinV2BenchmarkPageDeepLink(i.n(uri, "sampleId"), i.n(uri, "screenName"));
    }
}
