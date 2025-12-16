package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutCourierDeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeliveryUniversalCheckoutCourierDeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.f2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29722f2 extends kotlin.jvm.internal.N implements Y41.l<Uri, DeliveryUniversalCheckoutCourierDeepLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134292l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29722f2(E2 e22) {
        super(1);
        this.f134292l = e22;
    }

    @Override // Y41.l
    public final DeliveryUniversalCheckoutCourierDeepLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134292l;
        e22.getClass();
        String strO = Ku.i.o(uri2, "deliveryType");
        String strO2 = Ku.i.o(uri2, "providerKey");
        String strO3 = Ku.i.o(uri2, AddressParameter.TYPE);
        Gson gson = e22.f134215d;
        try {
            Type type = new C29718e2().getType();
            String queryParameter = uri2.getQueryParameter("contactEvent");
            ParametrizedEvent parametrizedEvent = (ParametrizedEvent) (queryParameter != null ? gson.e(queryParameter, type) : null);
            String queryParameter2 = uri2.getQueryParameter("itemId");
            String queryParameter3 = uri2.getQueryParameter("addressDetails");
            String queryParameter4 = uri2.getQueryParameter("checkoutViewMode");
            String queryParameter5 = uri2.getQueryParameter(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE);
            String queryParameter6 = uri2.getQueryParameter("context");
            String str = (String) C42745f0.K(0, uri2.getQueryParameters("courierDeliveryStartDate"));
            String str2 = (String) C42745f0.K(0, uri2.getQueryParameters("courierDeliveryEndDate"));
            String queryParameter7 = uri2.getQueryParameter("deliveryLatitude");
            Double dW02 = queryParameter7 != null ? C43066x.w0(queryParameter7) : null;
            String queryParameter8 = uri2.getQueryParameter("deliveryLongitude");
            return new DeliveryUniversalCheckoutCourierDeepLink(strO, strO2, strO3, queryParameter2, queryParameter3, queryParameter4, queryParameter5, parametrizedEvent, queryParameter6, str, str2, dW02, queryParameter8 != null ? C43066x.w0(queryParameter8) : null);
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "contactEvent", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
