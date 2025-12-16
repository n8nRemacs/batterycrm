package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.PlayerLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.M6;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/PlayerLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29762t extends kotlin.jvm.internal.N implements Y41.l<Uri, PlayerLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134338l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29762t(E2 e22) {
        super(1);
        this.f134338l = e22;
    }

    @Override // Y41.l
    public final PlayerLink invoke(Uri uri) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134338l;
        e22.getClass();
        String strN = Ku.i.n(uri2, ContextActionHandler.Link.URL);
        String queryParameter = uri2.getQueryParameter("slug");
        String queryParameter2 = uri2.getQueryParameter("block");
        String queryParameter3 = uri2.getQueryParameter("session");
        String queryParameter4 = uri2.getQueryParameter(SearchParamsConverterKt.SOURCE);
        Uri uri3 = Uri.parse(strN);
        String queryParameter5 = uri2.getQueryParameter("categoryId");
        String queryParameter6 = uri2.getQueryParameter("itemId");
        if ((uri3 != null && M6.a(uri3, "avito.ru")) || ((uri3 != null && M6.a(uri3, "kinescope.io")) || (uri3 != null && M6.a(uri3, "avito.st")))) {
            return new PlayerLink(strN, queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter6);
        }
        Ku.i.g(e22, uri2, "url must have root domain avito.ru or kinescope.io or avito.st");
        throw null;
    }
}
