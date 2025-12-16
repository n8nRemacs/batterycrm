package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/ClickStreamLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class M1 extends kotlin.jvm.internal.N implements Y41.l<Uri, ClickStreamLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134245l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(E2 e22) {
        super(1);
        this.f134245l = e22;
    }

    @Override // Y41.l
    public final ClickStreamLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Integer numY0;
        Uri uri2 = uri;
        E2 e22 = this.f134245l;
        e22.getClass();
        int iL2 = Ku.i.l(uri2, "id");
        String queryParameter = uri2.getQueryParameter("version");
        int iIntValue = (queryParameter == null || (numY0 = C43066x.y0(queryParameter)) == null) ? 1 : numY0.intValue();
        String queryParameter2 = uri2.getQueryParameter("redirect");
        Gson gson = e22.f134215d;
        try {
            Type type = new L1().getType();
            String queryParameter3 = uri2.getQueryParameter("params");
            return new ClickStreamLink(iL2, iIntValue, (Map) (queryParameter3 != null ? gson.e(queryParameter3, type) : null), queryParameter2 != null ? ((com.avito.android.deep_linking.x) e22.f134220i.getValue()).b(queryParameter2) : null);
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "params", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
