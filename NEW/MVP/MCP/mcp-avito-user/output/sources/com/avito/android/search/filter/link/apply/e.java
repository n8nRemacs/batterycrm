package com.avito.android.search.filter.link.apply;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersApplyLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search/filter/link/apply/e;", "LKu/a;", "Lcom/avito/android/search/filter/link/apply/FiltersApplyLink;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends AbstractC14350a<FiltersApplyLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        c cVar = new c(uri);
        try {
            Type type = new d().getType();
            String queryParameter = uri.getQueryParameter("values");
            if (queryParameter != null && (list = (List) gson.e(queryParameter, type)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    String queryParameter2 = uri.getQueryParameter("afterFiltersLoadedAction");
                    return new FiltersApplyLink(list, queryParameter2 != null ? xVar.b(queryParameter2) : null);
                }
            }
            cVar.invoke(new IllegalArgumentException("Parameter values is null!"));
            throw null;
        } catch (JsonParseException e12) {
            cVar.invoke(e12);
            throw null;
        }
    }
}
