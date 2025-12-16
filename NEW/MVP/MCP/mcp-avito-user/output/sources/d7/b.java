package D7;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.L;
import com.avito.android.advert_collection.InterfaceC28257e;
import com.avito.android.advert_collection.deeplink.AdvertCollectionDeepLink;
import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LD7/b;", "Lev/b;", "Lcom/avito/android/advert_collection/deeplink/AdvertCollectionDeepLink;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends AbstractC40162b<AdvertCollectionDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28257e f2941d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final L f2942e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f2943f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f2944g;

    @Inject
    public b(@k InterfaceC28257e interfaceC28257e, @k L l12, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.navigation.a aVar) {
        this.f2941d = interfaceC28257e;
        this.f2942e = l12;
        this.f2943f = interfaceC4053a;
        this.f2944g = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        AdvertCollectionDeepLink advertCollectionDeepLink = (AdvertCollectionDeepLink) deepLink;
        Intent intentA = this.f2941d.a(advertCollectionDeepLink.f81324b, advertCollectionDeepLink.f81325c, kotlin.jvm.internal.L.f(bundle != null ? bundle.getString("screen_source") : null, "appLink") ? FromPageSource.AppLink.f82325c.f82321b : bundle != null ? bundle.getString("from_page") : null, this.f2944g.a());
        if (bundle != null ? bundle.getBoolean("with_up_intent", true) : true) {
            intentA.putExtra("up_intent", L.a.a(this.f2942e, null, 3));
        }
        this.f2943f.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
