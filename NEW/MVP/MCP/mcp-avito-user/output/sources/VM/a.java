package VM;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ImvCarsDetailsLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.imv_cars_details.presentation.ImvCarsDetailsActivity;
import com.avito.android.imv_cars_details.presentation.ImvCarsDetailsParams;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvCarsDetailsDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LVM/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ImvCarsDetailsLink;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40162b<ImvCarsDetailsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Context f17084d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f17085e;

    @Inject
    public a(@k Context context, @k a.InterfaceC4053a interfaceC4053a) {
        this.f17084d = context;
        this.f17085e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ImvCarsDetailsParams.ItemIdParams itemIdParams = new ImvCarsDetailsParams.ItemIdParams(((ImvCarsDetailsLink) deepLink).f133353b);
        ImvCarsDetailsActivity.f170010n.getClass();
        this.f17085e.R(new Intent(this.f17084d, (Class<?>) ImvCarsDetailsActivity.class).putExtra("open_params", itemIdParams), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
