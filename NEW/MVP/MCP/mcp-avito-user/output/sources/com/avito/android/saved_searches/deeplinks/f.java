package com.avito.android.saved_searches.deeplinks;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchLink;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/saved_searches/deeplinks/f;", "LKu/a;", "Lcom/avito/android/libs/saved_searches/deeplinks/SavedSearchLink;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends AbstractC14350a<SavedSearchLink> {
    @Inject
    public f() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter("subscriptionId");
        try {
            Type type = new e().getType();
            String queryParameter2 = uri.getQueryParameter("params");
            return new SavedSearchLink(queryParameter, uri.getQueryParameter("categoryId"), uri.getQueryParameter("fromPage"), (Map) (queryParameter2 != null ? gson.e(queryParameter2, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "params", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
