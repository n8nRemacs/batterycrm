package q70;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.phone_confirmation.P;
import com.avito.android.phone_confirmation.deep_linking.PhoneVerifyLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneVerifySyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq70/d;", "Lev/b;", "Lcom/avito/android/phone_confirmation/deep_linking/PhoneVerifyLink;", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends AbstractC40162b<PhoneVerifyLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final P f429040d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f429041e;

    @Inject
    public d(@k P p12, @k a.InterfaceC4053a interfaceC4053a) {
        this.f429040d = p12;
        this.f429041e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        PhoneVerifyLink phoneVerifyLink = (PhoneVerifyLink) deepLink;
        this.f429041e.R(this.f429040d.a(phoneVerifyLink.f215906b, null, phoneVerifyLink.f215907c, false), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
