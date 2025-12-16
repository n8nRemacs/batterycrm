package iH0;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import fH0.InterfaceC40292b;
import kH0.AbstractC42582a;
import kotlin.Metadata;

/* compiled from: AuctionBannerPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LiH0/b;", "LkH0/a;", "LiH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC42582a implements InterfaceC41288a {
    @Override // iH0.InterfaceC41288a
    public final void a(@k MyAdvertDetailsItem myAdvertDetailsItem) {
        this.f406223f = myAdvertDetailsItem;
    }

    @Override // iH0.InterfaceC41288a
    public final void f1(@k DeepLink deepLink) {
        this.f395801b.accept(new InterfaceC40292b.a(deepLink));
    }

    @Override // iH0.InterfaceC41288a
    public final void i1(@k com.avito.android.user_advert.advert.items.auction_banner.a aVar) {
        S(this.f406223f);
    }
}
