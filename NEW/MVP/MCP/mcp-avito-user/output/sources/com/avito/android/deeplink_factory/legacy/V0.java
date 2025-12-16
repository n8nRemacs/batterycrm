package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deeplink_factory.legacy.E2;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/WebViewLink$OnlyAvitoDomain;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class V0 extends kotlin.jvm.internal.N implements Y41.l<Uri, WebViewLink.OnlyAvitoDomain> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134265l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(E2 e22) {
        super(1);
        this.f134265l = e22;
    }

    @Override // Y41.l
    public final WebViewLink.OnlyAvitoDomain invoke(Uri uri) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        E2.b bVarS = E2.s(this.f134265l, uri, "avito.ru");
        return new WebViewLink.OnlyAvitoDomain(bVarS.f134221a, bVarS.f134222b, bVarS.f134223c);
    }
}
