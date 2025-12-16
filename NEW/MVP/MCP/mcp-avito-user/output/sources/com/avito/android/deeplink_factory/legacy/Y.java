package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/CartLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class Y extends kotlin.jvm.internal.N implements Y41.l<Uri, CartLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134272l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(E2 e22) {
        super(1);
        this.f134272l = e22;
    }

    @Override // Y41.l
    public final CartLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        Gson gson = this.f134272l.f134215d;
        try {
            Type type = new X().getType();
            String queryParameter = uri2.getQueryParameter("extraParameters");
            return new CartLink((Map) (queryParameter != null ? gson.e(queryParameter, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "extraParameters", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
