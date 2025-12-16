package com.avito.android.search_suggest.link;

import Ku.AbstractC14350a;
import Tu.C15406a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsFactory;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.search_suggest.SearchSuggestInternalShowLink;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchSuggestInternalShowLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search_suggest/link/e;", "LKu/a;", "Lcom/avito/android/search_suggest/SearchSuggestInternalShowLink;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends AbstractC14350a<SearchSuggestInternalShowLink> {
    @Inject
    public e() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        NavigationBarStyle navigationBarStyle;
        SearchParams searchParamsFromUri = SearchParamsFactory.INSTANCE.fromUri(uri);
        String queryParameter = uri.getQueryParameter("query");
        String str = queryParameter == null ? "" : queryParameter;
        String queryParameter2 = uri.getQueryParameter("hint");
        String str2 = queryParameter2 == null ? "" : queryParameter2;
        C15406a c15406a = C15406a.f15971a;
        String queryParameter3 = uri.getQueryParameter("serpSpaceType");
        c15406a.getClass();
        SerpSpaceType serpSpaceTypeA = C15406a.a(queryParameter3);
        PresentationType presentationTypeFromString = PresentationType.INSTANCE.fromString(uri.getQueryParameter(PresentationTypeKt.PRESENTATION_TYPE));
        try {
            try {
                Type type = new d().getType();
                String queryParameter4 = uri.getQueryParameter("navigationBarStyle");
                navigationBarStyle = (NavigationBarStyle) (queryParameter4 != null ? gson.e(queryParameter4, type) : null);
            } catch (JsonParseException e12) {
                throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "navigationBarStyle", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
            }
        } catch (DeeplinkParsingError.WrongParameterValue unused) {
            navigationBarStyle = null;
        }
        return new SearchSuggestInternalShowLink(str, str2, searchParamsFromUri, presentationTypeFromString, serpSpaceTypeA, navigationBarStyle);
    }
}
