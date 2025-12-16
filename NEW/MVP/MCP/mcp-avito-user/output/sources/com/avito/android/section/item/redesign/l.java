package com.avito.android.section.item.redesign;

import android.net.Uri;
import com.avito.android.image_loader.From;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import hw.InterfaceC41177b;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: ComplementaryAdvertRedesignItemView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/item/redesign/l;", "LTV0/e;", "Lru/avito/component/serp/AsyncViewportTracker;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface l extends TV0.e, AsyncViewportTracker {

    /* compiled from: ComplementaryAdvertRedesignItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void B1(long j12);

    void B3(@Y61.k com.avito.android.image_loader.a aVar, @Y61.l String str, @Y61.k From from);

    void F0(@Y61.k Y41.a<G0> aVar);

    @Y61.k
    Uri O(@Y61.k com.avito.android.image_loader.k kVar);

    void Q0(@Y61.l DeliveryTerms deliveryTerms);

    void V(@Y61.l String str);

    void a(@Y61.k Y41.a<G0> aVar);

    void o5(@Y61.l SerpBadgeBar serpBadgeBar);

    void p(@Y61.l String str);

    void qJ(boolean z12);

    void setActive(boolean z12);

    void setFavorite(boolean z12);

    void setTitle(@Y61.k String str);

    void setViewed(boolean z12);
}
