package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeliveryUniversalCheckoutLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i2 extends kotlin.jvm.internal.N implements Y41.l<Uri, DeliveryUniversalCheckoutLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134301l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(E2 e22) {
        super(1);
        this.f134301l = e22;
    }

    @Override // Y41.l
    public final DeliveryUniversalCheckoutLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Map map;
        Uri uri2 = uri;
        Gson gson = this.f134301l.f134215d;
        C29726g2 c29726g2 = new C29726g2(uri2);
        try {
            Type type = new h2().getType();
            String queryParameter = uri2.getQueryParameter("extraRequestParams");
            if (queryParameter != null && (map = (Map) gson.e(queryParameter, type)) != null) {
                if (map.isEmpty()) {
                    map = null;
                }
                if (map != null) {
                    return new DeliveryUniversalCheckoutLink(map);
                }
            }
            c29726g2.invoke(new IllegalArgumentException("Parameter extraRequestParams is null!"));
            throw null;
        } catch (JsonParseException e12) {
            c29726g2.invoke(e12);
            throw null;
        }
    }
}
