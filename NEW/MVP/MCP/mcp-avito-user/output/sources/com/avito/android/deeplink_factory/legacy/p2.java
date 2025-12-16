package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/MyAdvertDetailsLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class p2 extends kotlin.jvm.internal.N implements Y41.l<Uri, MyAdvertDetailsLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134326l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(E2 e22) {
        super(1);
        this.f134326l = e22;
    }

    @Override // Y41.l
    public final MyAdvertDetailsLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        DeepLink deepLink;
        Uri uri2 = uri;
        E2 e22 = this.f134326l;
        e22.getClass();
        String strN = Ku.i.n(uri2, "itemId");
        String queryParameter = uri2.getQueryParameter("invokeAction");
        if (queryParameter != null) {
            InterfaceC42726C interfaceC42726C = e22.f134220i;
            DeepLink deepLinkD = ((com.avito.android.deep_linking.x) interfaceC42726C.getValue()).d(queryParameter);
            if (deepLinkD == null) {
                deepLinkD = ((com.avito.android.deep_linking.x) interfaceC42726C.getValue()).b(queryParameter);
            }
            deepLink = deepLinkD;
        } else {
            deepLink = null;
        }
        return new MyAdvertDetailsLink(strN, deepLink, false, 4, null);
    }
}
