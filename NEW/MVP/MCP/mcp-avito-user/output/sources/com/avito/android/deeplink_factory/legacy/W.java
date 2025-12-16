package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.UniversalDeliveryTypeDeeplink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/UniversalDeliveryTypeDeeplink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class W extends kotlin.jvm.internal.N implements Y41.l<Uri, UniversalDeliveryTypeDeeplink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134267l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(E2 e22) {
        super(1);
        this.f134267l = e22;
    }

    @Override // Y41.l
    public final UniversalDeliveryTypeDeeplink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134267l;
        e22.getClass();
        String queryParameter = uri2.getQueryParameter("deliveryType");
        try {
            Type type = new U().getType();
            String queryParameter2 = uri2.getQueryParameter("extraRequestParams");
            Gson gson = e22.f134215d;
            Map map = (Map) (queryParameter2 != null ? gson.e(queryParameter2, type) : null);
            String queryParameter3 = uri2.getQueryParameter("nextScreen");
            String queryParameter4 = uri2.getQueryParameter("itemId");
            String queryParameter5 = uri2.getQueryParameter("context");
            try {
                Type type2 = new V().getType();
                String queryParameter6 = uri2.getQueryParameter("contactEvent");
                return new UniversalDeliveryTypeDeeplink(queryParameter, map, queryParameter3, queryParameter4, queryParameter5, (ParametrizedEvent) (queryParameter6 != null ? gson.e(queryParameter6, type2) : null), uri2.getQueryParameter("promocode"), uri2.getQueryParameter("reloadReason"));
            } catch (JsonParseException e12) {
                throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "contactEvent", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
            }
        } catch (JsonParseException e13) {
            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "extraRequestParams", DeeplinkParsingError.FieldConstraint.Json.f133986b, e13);
        }
    }
}
