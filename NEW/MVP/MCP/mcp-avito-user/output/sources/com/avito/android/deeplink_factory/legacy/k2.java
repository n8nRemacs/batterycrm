package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeliveryUniversalPayDeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class k2 extends kotlin.jvm.internal.N implements Y41.l<Uri, DeliveryUniversalPayDeepLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134308l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(E2 e22) {
        super(1);
        this.f134308l = e22;
    }

    @Override // Y41.l
    public final DeliveryUniversalPayDeepLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134308l;
        e22.getClass();
        String strN = Ku.i.n(uri2, "paymentUri");
        String queryParameter = uri2.getQueryParameter("orderId");
        String queryParameter2 = uri2.getQueryParameter(BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS);
        String queryParameter3 = uri2.getQueryParameter("closeAlertInfo");
        String queryParameter4 = uri2.getQueryParameter("paymentFailToast");
        boolean z12 = Boolean.parseBoolean(uri2.getQueryParameter("disableParentScreenClose"));
        Gson gson = e22.f134215d;
        try {
            Type type = new j2().getType();
            String queryParameter5 = uri2.getQueryParameter("analyticsParams");
            return new DeliveryUniversalPayDeepLink(strN, queryParameter == null ? "" : queryParameter, queryParameter2, queryParameter3, queryParameter4, (Map) (queryParameter5 != null ? gson.e(queryParameter5, type) : null), z12);
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "analyticsParams", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
