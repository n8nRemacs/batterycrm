package VM;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ImvCarsDetailsLinkV2;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.imv_cars_details.presentation.ImvCarsDetailsActivity;
import com.avito.android.imv_cars_details.presentation.ImvCarsDetailsParams;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvCarsDetailsDeepLinkV2Handler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LVM/c;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ImvCarsDetailsLinkV2;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC40162b<ImvCarsDetailsLinkV2> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Context f17088d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f17089e;

    @Inject
    public c(@k Context context, @k a.InterfaceC4053a interfaceC4053a) {
        this.f17088d = context;
        this.f17089e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ImvCarsDetailsLinkV2 imvCarsDetailsLinkV2 = (ImvCarsDetailsLinkV2) deepLink;
        ImvCarsDetailsParams.ImvIdParams imvIdParams = new ImvCarsDetailsParams.ImvIdParams(imvCarsDetailsLinkV2.f133354b, imvCarsDetailsLinkV2.f133355c);
        ImvCarsDetailsActivity.f170010n.getClass();
        this.f17089e.R(new Intent(this.f17088d, (Class<?>) ImvCarsDetailsActivity.class).putExtra("open_params", imvIdParams), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
