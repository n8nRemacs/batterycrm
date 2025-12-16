package Ri0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.referral_contacts.ReferralContactsDeeplink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReferralContactsDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LRi0/a;", "Lev/b;", "Lcom/avito/android/referral_contacts/ReferralContactsDeeplink;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ri0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15045a extends AbstractC40162b<ReferralContactsDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f14567d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.referral_contacts.ui.b f14568e;

    @Inject
    public C15045a(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.referral_contacts.ui.b bVar) {
        this.f14567d = interfaceC4053a;
        this.f14568e = bVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f14567d.R(this.f14568e.a(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
