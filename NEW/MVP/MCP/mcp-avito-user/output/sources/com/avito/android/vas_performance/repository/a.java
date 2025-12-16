package com.avito.android.vas_performance.repository;

import Y61.k;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VasRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/repository/a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {
    @k
    z<P2<DeepLinkResponse>> a(@k String str, @k String str2, @k Set<String> set);

    @k
    z<P2<CL0.c>> b(@k String str, @k String str2);

    @k
    z<P2<BL0.d>> c(@k String str);

    @k
    z<P2<DeepLinkResponse>> d(@k String str, @k String str2, @k Set<String> set);

    @k
    z<P2<HL0.b>> e(@k String str, @k String str2);

    @k
    z<P2<FL0.d>> f(@k String str, @k String str2);

    @k
    B0 g(@k String str, @k String str2);

    @k
    z<P2<GL0.c>> h(@k String str);

    @k
    z<P2<G0>> i(@k String str, @k Set<String> set);
}
