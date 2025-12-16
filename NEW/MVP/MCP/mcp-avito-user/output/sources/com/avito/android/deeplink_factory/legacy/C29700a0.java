package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.AddItemToCartLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/AddItemToCartLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.a0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29700a0 extends kotlin.jvm.internal.N implements Y41.l<Uri, AddItemToCartLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134277l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29700a0(E2 e22) {
        super(1);
        this.f134277l = e22;
    }

    @Override // Y41.l
    public final AddItemToCartLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134277l;
        e22.getClass();
        String strN = Ku.i.n(uri2, "itemId");
        Gson gson = e22.f134215d;
        try {
            Type type = new Z().getType();
            String queryParameter = uri2.getQueryParameter("extraParameters");
            return new AddItemToCartLink(strN, (Map) (queryParameter != null ? gson.e(queryParameter, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "extraParameters", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
