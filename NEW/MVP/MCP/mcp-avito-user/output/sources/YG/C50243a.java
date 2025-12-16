package yg;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Lg.InterfaceC14392c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.L;
import com.avito.android.avl.deeplink.AvlLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AvlDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyg/a;", "Lev/b;", "Lcom/avito/android/avl/deeplink/AvlLink;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50243a extends AbstractC40162b<AvlLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f443435d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC14392c f443436e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final L f443437f;

    @Inject
    public C50243a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC14392c interfaceC14392c, @k L l12) {
        this.f443435d = interfaceC4053a;
        this.f443436e = interfaceC14392c;
        this.f443437f = l12;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        AvlLink avlLink = (AvlLink) deepLink;
        Intent intentA = this.f443436e.a("", null, avlLink.f98075b, avlLink.f98076c);
        Intent intentA2 = L.a.a(this.f443437f, null, 3);
        intentA2.addFlags(268468224);
        a.InterfaceC4053a interfaceC4053a = this.f443435d;
        interfaceC4053a.R(intentA2, com.avito.android.deeplink_handler.view.b.f134588l);
        interfaceC4053a.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
