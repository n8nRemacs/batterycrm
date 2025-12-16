package On0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.SingleTimeLink;
import com.avito.android.deeplink_handler.handler.b;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SingleTimeDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOn0/d;", "Lev/b;", "Lcom/avito/android/deep_linking/links/SingleTimeLink;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends AbstractC40162b<SingleTimeLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC14715a f12517d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f12518e;

    @Inject
    public d(@k InterfaceC14715a interfaceC14715a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f12517d = interfaceC14715a;
        this.f12518e = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        SingleTimeLink singleTimeLink = (SingleTimeLink) deepLink;
        String str2 = singleTimeLink.f133673b;
        InterfaceC14715a interfaceC14715a = this.f12517d;
        if (!interfaceC14715a.a(str2)) {
            interfaceC14715a.b(str2);
            b.a.a(this.f12518e, singleTimeLink.f133674c, null, null, 6);
        }
        return AbstractC14250d.c.f9171c;
    }
}
