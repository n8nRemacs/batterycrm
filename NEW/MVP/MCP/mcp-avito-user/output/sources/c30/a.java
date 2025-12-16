package C30;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NotificationCenterMainLandingLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationCenterLandingMainDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LC30/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/NotificationCenterMainLandingLink;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40162b<NotificationCenterMainLandingLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f1899d;

    @Inject
    public a(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f1899d = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f1899d.r6(bundle, new BeduinV2PageDeepLink("/api/1/notifications/general/" + ((NotificationCenterMainLandingLink) deepLink).f133516b, "NotificationCenterMainLanding", false, false, false, null, null, null, false, 480, null), str);
        return AbstractC14250d.c.f9171c;
    }
}
