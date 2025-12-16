package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DialogDeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29733j extends kotlin.jvm.internal.N implements Y41.l<Uri, DialogDeepLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134302l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29733j(E2 e22) {
        super(1);
        this.f134302l = e22;
    }

    @Override // Y41.l
    public final DialogDeepLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134302l;
        e22.getClass();
        DialogDeepLink.ControlsDirection controlsDirection = kotlin.jvm.internal.L.f(uri2.getQueryParameter("controlsDirection"), "horizontal") ? DialogDeepLink.ControlsDirection.f133264b : DialogDeepLink.ControlsDirection.f133265c;
        String queryParameter = uri2.getQueryParameter("isCancellable");
        Boolean boolValueOf = queryParameter != null ? Boolean.valueOf(Boolean.parseBoolean(queryParameter)) : null;
        boolean z12 = Boolean.parseBoolean(uri2.getQueryParameter("shouldShowCloseControl"));
        String queryParameter2 = uri2.getQueryParameter("title");
        String str = queryParameter2 == null ? "" : queryParameter2;
        String queryParameter3 = uri2.getQueryParameter("text");
        String queryParameter4 = uri2.getQueryParameter("imageName");
        Gson gson = e22.f134215d;
        try {
            Type type = new C29730i().getType();
            String queryParameter5 = uri2.getQueryParameter("buttons");
            List list = (List) (queryParameter5 != null ? gson.e(queryParameter5, type) : null);
            return new DialogDeepLink(controlsDirection, boolValueOf != null ? boolValueOf.booleanValue() : true, z12, queryParameter3 != null ? queryParameter3 : "", list == null ? C42784z0.f406748b : list, str, queryParameter4, uri2.getQueryParameter("lightThemeImageUrl"), uri2.getQueryParameter("darkThemeImageUrl"), uri2.getQueryParameter(BeduinPromoBlockModel.SERIALIZED_NAME_THEME));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "buttons", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
