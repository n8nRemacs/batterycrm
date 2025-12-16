package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.auth.SessionsSocialLogoutLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/auth/SessionsSocialLogoutLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class C2 extends kotlin.jvm.internal.N implements Y41.l<Uri, SessionsSocialLogoutLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134204l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2(E2 e22) {
        super(1);
        this.f134204l = e22;
    }

    @Override // Y41.l
    public final SessionsSocialLogoutLink invoke(Uri uri) throws DeeplinkParsingError.Custom {
        Uri uri2 = uri;
        E2 e22 = this.f134204l;
        e22.getClass();
        if (kotlin.jvm.internal.L.f(uri2.getQueryParameter("view"), "nopassword")) {
            return new SessionsSocialLogoutLink(uri2.getQueryParameter(SearchParamsConverterKt.SOURCE), uri2.getQueryParameter(ChannelContext.Item.USER_ID), uri2.getQueryParameter("loginType"), uri2.getQueryParameter("sessionIdHash"), Ku.i.p(uri2, "deviceId"), kotlin.jvm.internal.L.f(uri2.getQueryParameter("mode"), "safetySessionFlow") ? SessionsSocialLogoutLink.Mode.f133981c : SessionsSocialLogoutLink.Mode.f133980b);
        }
        Ku.i.g(e22, uri2, "parameter \"view\" must be \"nopassword\"");
        throw null;
    }
}
