package com.avito.android.authorization.deep_linking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.RestorePasswordLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RestorePasswordSyncLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/deep_linking/h0;", "Lev/b;", "Lcom/avito/android/deep_linking/links/auth/RestorePasswordLink;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h0 extends AbstractC40162b<RestorePasswordLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f93787d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Zd.i f93788e;

    @Inject
    public h0(@Y61.k Zd.i iVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f93787d = interfaceC4053a;
        this.f93788e = iVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        RestorePasswordLink restorePasswordLink = (RestorePasswordLink) deepLink;
        String str2 = restorePasswordLink.f133957c;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = restorePasswordLink.f133958d;
        if (str3 == null || str3.length() == 0) {
            AuthSource authSource = AuthSource.f92694c;
            str3 = "restore_auth";
        }
        this.f93787d.R(this.f93788e.b(str2, restorePasswordLink.f133956b, str3), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
