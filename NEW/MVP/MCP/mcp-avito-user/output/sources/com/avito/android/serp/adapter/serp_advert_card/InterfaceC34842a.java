package com.avito.android.serp.adapter.serp_advert_card;

import android.net.Uri;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.text.AttributedText;
import hw.InterfaceC41177b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: RdsSerpAdvertCard.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/a;", "Lru/avito/component/serp/AsyncViewportTracker;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.serp_advert_card.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34842a extends AsyncViewportTracker {

    /* compiled from: RdsSerpAdvertCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.a$a, reason: collision with other inner class name */
    public static final class C8081a {
    }

    void B1(long j12);

    void C(@Y61.l String str);

    void D0(@Y61.l QuorumFilterInfo quorumFilterInfo);

    void E0(@Y61.l String str);

    void F0(@Y61.k Y41.a<G0> aVar);

    void M1(@Y61.l String str);

    void Ny(@Y61.k List list);

    @Y61.k
    Uri O(@Y61.k com.avito.android.image_loader.k kVar);

    void Ol(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12);

    void PT(boolean z12);

    void Q0(@Y61.l DeliveryTerms deliveryTerms);

    void S0(@Y61.l String str);

    void V(@Y61.l String str);

    void V8(@Y61.l List<SerpBadge> list);

    void b2(@Y61.l String str);

    void c(@Y61.k Y41.a<G0> aVar);

    void d1(boolean z12);

    void e1(@Y61.k Badge badge);

    void f1(@Y61.l String str);

    void i1(@Y61.l String str);

    void k1(@Y61.l String str);

    void k10(@Y61.l String str, boolean z12);

    void l3(@Y61.l String str);

    void o3(@Y61.l String str);

    void q50(@Y61.l AttributedText attributedText);

    void setActive(boolean z12);

    void setFavorite(boolean z12);

    void setTitle(@Y61.k String str);

    void setViewed(boolean z12);

    void w0();

    void z0(boolean z12);
}
