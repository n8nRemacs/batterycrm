package Bm;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.car_navigator.link.CarNavigatorLink;
import com.avito.android.car_navigator.link.CarNavigatorSettings;
import com.avito.android.car_navigator.presentation.CarNavigatorScreenTabData;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CarNavigatorLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LBm/a;", "Lev/b;", "Lcom/avito/android/car_navigator/link/CarNavigatorLink;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13161a extends AbstractC40162b<CarNavigatorLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final L f1690d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f1691e;

    @Inject
    public C13161a(@k L l12, @k a.InterfaceC4053a interfaceC4053a) {
        this.f1690d = l12;
        this.f1691e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CarNavigatorLink carNavigatorLink = (CarNavigatorLink) deepLink;
        NavigationTab navigationTab = NavigationTab.f106970f;
        CarNavigatorSettings carNavigatorSettings = carNavigatorLink.f115190c;
        CarNavigatorScreenTabData carNavigatorScreenTabData = new CarNavigatorScreenTabData(carNavigatorLink.f115189b, carNavigatorSettings, navigationTab, true, carNavigatorSettings.f115194e);
        L l12 = this.f1690d;
        Intent intentD = l12.d(carNavigatorScreenTabData);
        intentD.putExtra("up_intent", L.a.a(l12, null, 3));
        this.f1691e.R(intentD, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
