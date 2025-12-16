package com.avito.android.advert.item.anchor_trust_factors.topbar;

import com.avito.android.remote.anchors.AnchorTrustFactors;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import r4.C47486a;
import s4.C47993a;

/* compiled from: AdvertDetailsTopBarAnchorsStateHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/topbar/h;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface h {
    void a(@Y61.k AnchorTrustFactors anchorTrustFactors, @Y61.k Y41.l<? super C47486a.C12352a, G0> lVar);

    void b(@Y61.k AnchorTrustFactors anchorTrustFactors);

    void c(@Y61.k Set<String> set);

    @Y61.k
    /* renamed from: getState */
    C47486a getF72866a();

    @Y61.k
    /* renamed from: getStyle */
    C47993a getF72867b();

    void reset();
}
