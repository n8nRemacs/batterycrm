package Iv0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.services_video_call.deeplink.ServicesVideoCallDeepLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesVideoCallDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIv0/b;", "Lev/b;", "Lcom/avito/android/services_video_call/deeplink/ServicesVideoCallDeepLink;", "_avito_services-video-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40162b<ServicesVideoCallDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f8600d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final h31.e<com.avito.android.services_video_call.deeplink.service.a> f8601e;

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k h31.e<com.avito.android.services_video_call.deeplink.service.a> eVar) {
        this.f8600d = aVar;
        this.f8601e = eVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ServicesVideoCallDeepLink servicesVideoCallDeepLink = (ServicesVideoCallDeepLink) deepLink;
        h31.e<com.avito.android.services_video_call.deeplink.service.a> eVar = this.f8601e;
        boolean zB2 = eVar.get().b();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f8600d;
        if (zB2) {
            eVar.get().a();
            b.a.a(aVar, servicesVideoCallDeepLink.f280691c, null, null, 6);
        } else {
            b.a.a(aVar, servicesVideoCallDeepLink.f280690b, null, null, 6);
        }
        return AbstractC14250d.c.f9171c;
    }
}
