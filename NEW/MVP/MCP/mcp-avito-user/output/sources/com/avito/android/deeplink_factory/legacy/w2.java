package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DetailsSheetLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class w2 extends kotlin.jvm.internal.N implements Y41.l<Uri, DetailsSheetLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134349l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(E2 e22) {
        super(1);
        this.f134349l = e22;
    }

    @Override // Y41.l
    public final DetailsSheetLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134349l;
        Gson gson = e22.f134215d;
        t2 t2Var = new t2(uri2);
        try {
            Type type = new u2().getType();
            String queryParameter = uri2.getQueryParameter("contentJson");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE == null) {
                t2Var.invoke(new IllegalArgumentException("Parameter contentJson is null!"));
                throw null;
            }
            DetailsSheetLinkBody detailsSheetLinkBody = (DetailsSheetLinkBody) objE;
            Gson gson2 = e22.f134215d;
            try {
                Type type2 = new v2().getType();
                String queryParameter2 = uri2.getQueryParameter("displayEvent");
                return new DetailsSheetLink(detailsSheetLinkBody, (ParametrizedEvent) (queryParameter2 != null ? gson2.e(queryParameter2, type2) : null));
            } catch (JsonParseException e12) {
                throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "displayEvent", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
            }
        } catch (JsonParseException e13) {
            t2Var.invoke(e13);
            throw null;
        }
    }
}
