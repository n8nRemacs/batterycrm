package com.avito.android.passport.deep_linking;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportAuthSuggestLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PassportAuthSuggestAsyncDeepLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/deep_linking/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PassportAuthSuggestLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.passport.deep_linking.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32954a extends AbstractC40161a<PassportAuthSuggestLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final r60.d f211059f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f211060g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f211061h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final E50.a f211062i;

    @Inject
    public C32954a(@Y61.k r60.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k E50.a aVar2) {
        this.f211059f = dVar;
        this.f211060g = aVar;
        this.f211061h = interfaceC4053a;
        this.f211062i = aVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PassportAuthSuggestLink passportAuthSuggestLink = (PassportAuthSuggestLink) deepLink;
        String str2 = passportAuthSuggestLink.f133530b;
        this.f211059f.a(str2);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().path("/api/3/accounts_merge/restoreOptionsDialog").appendQueryParameter("mergeKey", str2);
        String str3 = passportAuthSuggestLink.f133531c;
        if (str3 != null) {
            builderAppendQueryParameter.appendQueryParameter("verificationFlow", str3);
        }
        String str4 = passportAuthSuggestLink.f133532d;
        BeduinV2PageDeepLink beduinV2PageDeepLink = new BeduinV2PageDeepLink(builderAppendQueryParameter.appendQueryParameter("scenario", str4).build().toString(), "RestoreOptionsDialog", false, false, false, null, null, null, false, 480, null);
        PassportAuthSuggestLink.Scenario[] scenarioArr = PassportAuthSuggestLink.Scenario.f133533b;
        if (L.f(str4, "liveness") || L.f(str4, "blocked.restore_by_docs")) {
            this.f211061h.R(this.f211062i.d(str2, str3, str4), com.avito.android.deeplink_handler.view.b.f134588l);
        } else {
            i(PassportAuthSuggestLink.b.a.f133535b, this.f211060g, beduinV2PageDeepLink);
        }
    }
}
