package xi;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.L;
import com.avito.android.beduin.ui.screen.home_tab.BeduinScreenTabData;
import com.avito.android.beduin.ui.screen.home_tab.HomeTabBeduinScreenLink;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HomeTabBeduinScreenLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxi/a;", "Lev/b;", "Lcom/avito/android/beduin/ui/screen/home_tab/HomeTabBeduinScreenLink;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49948a extends AbstractC40162b<HomeTabBeduinScreenLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final L f442604d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f442605e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f442606f;

    @Inject
    public C49948a(@k L l12, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.navigation.a aVar) {
        this.f442604d = l12;
        this.f442605e = interfaceC4053a;
        this.f442606f = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        HomeTabBeduinScreenLink homeTabBeduinScreenLink = (HomeTabBeduinScreenLink) deepLink;
        NavigationTabSetItem navigationTabSetItemA = homeTabBeduinScreenLink.f104404d;
        if (navigationTabSetItemA == null && (navigationTabSetItemA = this.f442606f.a()) == null) {
            navigationTabSetItemA = NavigationTab.f106970f;
        }
        this.f442605e.R(this.f442604d.d(new BeduinScreenTabData(homeTabBeduinScreenLink.f104402b, homeTabBeduinScreenLink.f104403c, navigationTabSetItemA, homeTabBeduinScreenLink.f104405e, homeTabBeduinScreenLink.f104406f)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
