package com.avito.android.oauth.deeplink;

import Ju.AbstractC14250d;
import android.content.Intent;
import com.avito.android.oauth.presentation.OAuthActivity;
import com.avito.android.oauth.presentation.OAuthDetails;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OAuthDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f208214l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OAuthDeepLink f208215m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, OAuthDeepLink oAuthDeepLink) {
        super(0);
        this.f208214l = bVar;
        this.f208215m = oAuthDeepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        OAuthActivity.a aVar = OAuthActivity.f208223r;
        b bVar = this.f208214l;
        aVar.getClass();
        Intent intent = new Intent(bVar.f208217g, (Class<?>) OAuthActivity.class);
        OAuthDeepLink oAuthDeepLink = this.f208215m;
        String str = oAuthDeepLink.f208206b;
        String str2 = oAuthDeepLink.f208211g;
        String str3 = oAuthDeepLink.f208212h;
        intent.putExtra("OAUTH_DETAILS_KEY", new OAuthDetails(oAuthDeepLink.f208213i, str, oAuthDeepLink.f208207c, oAuthDeepLink.f208209e, oAuthDeepLink.f208208d, oAuthDeepLink.f208210f, str2, str3));
        intent.addFlags(268468224);
        bVar.f208216f.R(intent, com.avito.android.deeplink_handler.view.b.f134588l);
        bVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
