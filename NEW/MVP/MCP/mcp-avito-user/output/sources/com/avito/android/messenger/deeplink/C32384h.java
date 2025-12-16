package com.avito.android.messenger.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ChannelBottomSheetInputLinkParser.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/deeplink/h;", "LKu/a;", "Lcom/avito/android/messenger/deeplink/ChannelBottomSheetInputLink;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.deeplink.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32384h extends AbstractC14350a<ChannelBottomSheetInputLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        try {
            Type type = new C32382g().getType();
            String queryParameter = uri.getQueryParameter("urlParams");
            Map map = (Map) (queryParameter != null ? gson.e(queryParameter, type) : null);
            String queryParameter2 = uri.getQueryParameter("apiUrl");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            return new ChannelBottomSheetInputLink(queryParameter2, uri.getQueryParameter("title"), uri.getQueryParameter("description"), uri.getQueryParameter(ChannelContext.Item.PLACEHOLDER), uri.getQueryParameter("defaultInput"), uri.getQueryParameter("actionButtonTitle"), uri.getQueryParameter("cancelButtonTitle"), map);
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "urlParams", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
