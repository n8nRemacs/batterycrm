package Bq0;

import Aq0.InterfaceC13071a;
import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.AllAdvicesLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AllAdvicesLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LBq0/b;", "Lev/b;", "Lcom/avito/android/deep_linking/links/AllAdvicesLink;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13177b extends AbstractC40162b<AllAdvicesLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC13071a f1729d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f1730e;

    @Inject
    public C13177b(@k InterfaceC13071a interfaceC13071a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f1729d = interfaceC13071a;
        this.f1730e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f1730e.R(this.f1729d.a(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
