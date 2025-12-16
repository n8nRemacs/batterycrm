package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.InAppBrowserLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.M6;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/InAppBrowserLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class Y0 extends kotlin.jvm.internal.N implements Y41.l<Uri, InAppBrowserLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134273l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(E2 e22) {
        super(1);
        this.f134273l = e22;
    }

    @Override // Y41.l
    public final InAppBrowserLink invoke(Uri uri) throws DeeplinkParsingError.Custom {
        Uri uri2 = uri;
        E2 e22 = this.f134273l;
        e22.getClass();
        Uri uri3 = Uri.parse(Ku.i.p(uri2, TooltipAttribute.PARAM_DEEP_LINK));
        if (M6.a(uri3, "avito.ru")) {
            return new InAppBrowserLink(uri3);
        }
        Ku.i.g(e22, uri2, "uri must have root domain avito.ru");
        throw null;
    }
}
