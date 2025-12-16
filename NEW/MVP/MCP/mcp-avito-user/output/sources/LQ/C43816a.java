package lq;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Xp.InterfaceC17035a;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deeplink.PromoDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PromoDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llq/a;", "Lev/b;", "Lcom/avito/android/comfortable_deal/deeplink/PromoDeeplink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43816a extends AbstractC40162b<PromoDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f414215d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC17035a f414216e;

    @Inject
    public C43816a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC17035a interfaceC17035a) {
        this.f414215d = interfaceC4053a;
        this.f414216e = interfaceC17035a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f414215d.R(this.f414216e.a((PromoDeeplink) deepLink), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
