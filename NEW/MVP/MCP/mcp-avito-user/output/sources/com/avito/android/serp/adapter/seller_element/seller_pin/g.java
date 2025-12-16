package com.avito.android.serp.adapter.seller_element.seller_pin;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SellerElement;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PinnedSellerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/seller_element/seller_pin/g;", "LTV0/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface g extends TV0.e {

    /* compiled from: PinnedSellerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void EP(@l SellerElement.DeveloperInfo developerInfo);

    void My(@l Image image);

    void P3(@k List<SerpBadge> list);

    void c(@k Y41.a<G0> aVar);

    void setTitle(@k String str);
}
