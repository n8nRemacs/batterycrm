package com.avito.android.messenger.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FlowerRedirectLinkParser.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/deeplink/W;", "LKu/a;", "Lcom/avito/android/messenger/deeplink/FlowerRedirectLink;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class W extends AbstractC14350a<FlowerRedirectLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = Ku.i.n(uri, "path");
        boolean z12 = Boolean.parseBoolean(Ku.i.n(uri, "shouldWaitResponse"));
        DeepLink deepLinkB = xVar.b(Ku.i.n(uri, "redirectDeeplink"));
        try {
            Type type = new V().getType();
            String queryParameter = uri.getQueryParameter("extraRequestParams");
            return new FlowerRedirectLink(strN, z12, deepLinkB, (Map) (queryParameter != null ? gson.e(queryParameter, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "extraRequestParams", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
