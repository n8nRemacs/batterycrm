package hH0;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import fH0.InterfaceC40292b;
import kH0.AbstractC42582a;
import kotlin.Metadata;

/* compiled from: AlertBannerPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LhH0/b;", "LkH0/a;", "LhH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hH0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40825b extends AbstractC42582a implements InterfaceC40824a {
    @Override // hH0.InterfaceC40824a
    public final void J1(@k com.avito.android.user_advert.advert.items.alert_banner.a aVar) {
        DeepLink deepLink = aVar.f309185h;
        if (deepLink != null) {
            this.f395801b.accept(new InterfaceC40292b.a(deepLink));
        }
    }

    @Override // hH0.InterfaceC40824a
    public final void K0(@k com.avito.android.user_advert.advert.items.alert_banner.a aVar) {
        DeepLink deepLink = aVar.f309183f;
        if (deepLink != null) {
            this.f395801b.accept(new InterfaceC40292b.a(deepLink));
        }
    }

    @Override // hH0.InterfaceC40824a
    public final void a(@k MyAdvertDetailsItem myAdvertDetailsItem) {
        this.f406223f = myAdvertDetailsItem;
    }

    @Override // hH0.InterfaceC40824a
    public final void y1(@k com.avito.android.user_advert.advert.items.alert_banner.a aVar) {
        DeepLink deepLink = aVar.f309183f;
        if ((deepLink instanceof WebViewLink) && ((WebViewLink) deepLink).getF133855b().getBooleanQueryParameter("sendAlertBannerEvent", false)) {
            S(this.f406223f);
        }
    }
}
