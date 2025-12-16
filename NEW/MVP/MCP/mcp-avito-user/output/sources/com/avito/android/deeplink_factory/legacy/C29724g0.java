package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.ImvSimilarAdvertsLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/ImvSimilarAdvertsLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.g0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29724g0 extends kotlin.jvm.internal.N implements Y41.l<Uri, ImvSimilarAdvertsLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134294l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29724g0(E2 e22) {
        super(1);
        this.f134294l = e22;
    }

    @Override // Y41.l
    public final ImvSimilarAdvertsLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        this.f134294l.getClass();
        String strN = Ku.i.n(uri2, "requestPath");
        String strN2 = Ku.i.n(uri2, "params");
        String strN3 = Ku.i.n(uri2, "from_page");
        long jM2 = Ku.i.m(uri2, "items_count");
        String strN4 = Ku.i.n(uri2, "esid");
        String queryParameter = uri2.getQueryParameter("categoryid");
        Long lZ02 = queryParameter != null ? C43066x.z0(queryParameter) : null;
        String queryParameter2 = uri2.getQueryParameter("iid");
        return new ImvSimilarAdvertsLink(strN, strN2, strN3, jM2, strN4, lZ02, queryParameter2 != null ? C43066x.z0(queryParameter2) : null);
    }
}
