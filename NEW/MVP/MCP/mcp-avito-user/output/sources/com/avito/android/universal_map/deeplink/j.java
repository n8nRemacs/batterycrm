package com.avito.android.universal_map.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToolbarSettings;
import com.avito.android.deep_linking.links.UniversalMapLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.ParametrizedEvent;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalMapDeepLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/universal_map/deeplink/j;", "LKu/a;", "Lcom/avito/android/deep_linking/links/UniversalMapLink;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends AbstractC14350a<UniversalMapLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = Ku.i.p(uri, "pointListRequest");
        String strP2 = Ku.i.p(uri, "pointInfoRequest");
        String queryParameter = uri.getQueryParameter("filtersInfoRequest");
        String queryParameter2 = uri.getQueryParameter("toolbarTitle");
        try {
            Type type = new g().getType();
            String queryParameter3 = uri.getQueryParameter("extraParameters");
            Map map = (Map) (queryParameter3 != null ? gson.e(queryParameter3, type) : null);
            String queryParameter4 = uri.getQueryParameter("screenName");
            try {
                Type type2 = new h().getType();
                String queryParameter5 = uri.getQueryParameter("toolbarSettings");
                ToolbarSettings toolbarSettings = (ToolbarSettings) (queryParameter5 != null ? gson.e(queryParameter5, type2) : null);
                try {
                    Type type3 = new i().getType();
                    String queryParameter6 = uri.getQueryParameter("onOpenEvent");
                    return new UniversalMapLink(strP, strP2, queryParameter, queryParameter2, toolbarSettings, map == null ? P0.c() : map, queryParameter4, (ParametrizedEvent) (queryParameter6 != null ? gson.e(queryParameter6, type3) : null), uri.getQueryParameter("onInitActions"));
                } catch (JsonParseException e12) {
                    throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "onOpenEvent", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
                }
            } catch (JsonParseException e13) {
                throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "toolbarSettings", DeeplinkParsingError.FieldConstraint.Json.f133986b, e13);
            }
        } catch (JsonParseException e14) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "extraParameters", DeeplinkParsingError.FieldConstraint.Json.f133986b, e14);
        }
    }
}
