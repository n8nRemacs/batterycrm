package com.avito.android.user_advert.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.L;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertUnblockDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/deeplink/C;", "Lev/b;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Allow;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class C extends AbstractC40162b<MyAdvertLink.Allow> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final eH0.c f310681d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L f310682e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f310683f;

    @Inject
    public C(@Y61.k L l12, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k eH0.c cVar) {
        this.f310681d = cVar;
        this.f310682e = l12;
        this.f310683f = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f310683f.R(this.f310681d.a(((MyAdvertLink.Allow) deepLink).f133473c).putExtra("up_intent", L.a.a(this.f310682e, null, 3)).setFlags(603979776), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
