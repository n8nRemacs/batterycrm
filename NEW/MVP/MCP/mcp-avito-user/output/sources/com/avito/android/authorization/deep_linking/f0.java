package com.avito.android.authorization.deep_linking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Zd.InterfaceC19542a;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.ResetPasswordLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ResetPasswordSyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/deep_linking/f0;", "Lev/b;", "Lcom/avito/android/deep_linking/links/auth/ResetPasswordLink;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f0 extends AbstractC40162b<ResetPasswordLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f93778d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19542a f93779e;

    @Inject
    public f0(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC19542a interfaceC19542a) {
        this.f93778d = interfaceC4053a;
        this.f93779e = interfaceC19542a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ResetPasswordLink resetPasswordLink = (ResetPasswordLink) deepLink;
        this.f93778d.R(this.f93779e.c(resetPasswordLink.f133953b, resetPasswordLink.f133955d, resetPasswordLink.f133954c), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
