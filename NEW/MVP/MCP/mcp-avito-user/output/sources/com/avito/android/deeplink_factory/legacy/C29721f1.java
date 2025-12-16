package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.payment.service.OrderItem;
import com.avito.android.remote.model.payment.service.OrderItemKt;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/PaymentSessionLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.f1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29721f1 extends kotlin.jvm.internal.N implements Y41.l<Uri, PaymentSessionLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134291l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29721f1(E2 e22) {
        super(1);
        this.f134291l = e22;
    }

    @Override // Y41.l
    public final PaymentSessionLink invoke(Uri uri) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        Set<OrderItem> orderItemSet = OrderItemKt.parseOrderItemSet(uri2);
        E2 e22 = this.f134291l;
        e22.getClass();
        String queryParameter = uri2.getQueryParameter("context");
        String queryParameter2 = uri2.getQueryParameter("promoCode");
        String queryParameter3 = uri2.getQueryParameter("paymentUrl");
        Gson gson = e22.f134215d;
        try {
            Type type = new C29717e1().getType();
            String queryParameter4 = uri2.getQueryParameter("analyticsParams");
            Map map = (Map) (queryParameter4 != null ? gson.e(queryParameter4, type) : null);
            if (!orderItemSet.isEmpty()) {
                return new PaymentSessionLink(orderItemSet, queryParameter, queryParameter2, queryParameter3, map);
            }
            Ku.i.g(e22, uri2, "orderItems must not be empty");
            throw null;
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "analyticsParams", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
