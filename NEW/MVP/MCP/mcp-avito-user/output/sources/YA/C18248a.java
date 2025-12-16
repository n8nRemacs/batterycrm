package Ya;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.advert_stats.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemStatsLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertStatsDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LYa/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ItemStatsLink;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ya.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C18248a extends AbstractC40162b<ItemStatsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f19517d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l f19518e;

    @Inject
    public C18248a(@k a.InterfaceC4053a interfaceC4053a, @k l lVar) {
        this.f19517d = interfaceC4053a;
        this.f19518e = lVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ItemStatsLink itemStatsLink = (ItemStatsLink) deepLink;
        Boolean bool = itemStatsLink.f133401c;
        this.f19517d.R(this.f19518e.a(itemStatsLink.f133400b, itemStatsLink.f133402d, bool != null ? bool.booleanValue() : false), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
