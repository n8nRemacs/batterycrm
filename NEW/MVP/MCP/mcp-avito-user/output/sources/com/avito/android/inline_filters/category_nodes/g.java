package com.avito.android.inline_filters.category_nodes;

import Ku.AbstractC14350a;
import Y61.k;
import android.net.Uri;
import com.avito.android.B2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SearchParamsFactory;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: CategoryTreeLink.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/category_nodes/g;", "LKu/a;", "Lcom/avito/android/inline_filters/category_nodes/CategoryTreeLink;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends AbstractC14350a<CategoryTreeLink> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final B2 f171076a;

    @Inject
    public g(@k B2 b22) {
        this.f171076a = b22;
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        SearchParams searchParamsFromUri = SearchParamsFactory.INSTANCE.fromUri(uri);
        boolean z12 = Boolean.parseBoolean(uri.getQueryParameter(SearchParamsConverterKt.TRUNCATE_TO_SUBTREE));
        try {
            Type type = new f().getType();
            String queryParameter = uri.getQueryParameter(PresentationTypeKt.PRESENTATION_TYPE);
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            B2 b22 = this.f171076a;
            b22.getClass();
            n<Object> nVar = B2.f67184X[27];
            return new CategoryTreeLink(searchParamsFromUri, (PresentationType) (((Boolean) b22.f67187C.a().invoke()).booleanValue() ? objE : null), Boolean.valueOf(z12));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), PresentationTypeKt.PRESENTATION_TYPE, DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
