package oI0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAdvertsLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import nI0.InterfaceC44261b;

/* compiled from: UserAdvertsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LoI0/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/UserAdvertsLink;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oI0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44650a extends AbstractC40162b<UserAdvertsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC44261b f419695d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f419696e;

    @Inject
    public C44650a(@k InterfaceC44261b interfaceC44261b, @k a.InterfaceC4053a interfaceC4053a) {
        this.f419695d = interfaceC44261b;
        this.f419696e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        UserAdvertsLink userAdvertsLink = (UserAdvertsLink) deepLink;
        this.f419696e.R(InterfaceC44261b.a.a(this.f419695d, userAdvertsLink.f133835b, null, null, userAdvertsLink.f133836c, 14).addFlags(603979776), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
