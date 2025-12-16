package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.InfoPageLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/InfoPageLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.x0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29775x0 extends kotlin.jvm.internal.N implements Y41.l<Uri, InfoPageLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134351l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29775x0(E2 e22) {
        super(1);
        this.f134351l = e22;
    }

    @Override // Y41.l
    public final InfoPageLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        this.f134351l.getClass();
        String strN = Ku.i.n(uri2, "slug");
        String queryParameter = uri2.getQueryParameter("title");
        if (queryParameter == null) {
            queryParameter = "";
        }
        return new InfoPageLink(strN, queryParameter);
    }
}
