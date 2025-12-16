package cr0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.send_esia_data_screen.SendEsiaDataDeeplink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SendEsiaDataDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcr0/a;", "Lev/b;", "Lcom/avito/android/send_esia_data_screen/SendEsiaDataDeeplink;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cr0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39402a extends AbstractC40162b<SendEsiaDataDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f392971d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.send_esia_data_screen.ui.b f392972e;

    @Inject
    public C39402a(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.send_esia_data_screen.ui.b bVar) {
        this.f392971d = interfaceC4053a;
        this.f392972e = bVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        SendEsiaDataDeeplink sendEsiaDataDeeplink = (SendEsiaDataDeeplink) deepLink;
        this.f392971d.R(this.f392972e.a(sendEsiaDataDeeplink.f268239b, sendEsiaDataDeeplink.f268240c, sendEsiaDataDeeplink.f268241d), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
