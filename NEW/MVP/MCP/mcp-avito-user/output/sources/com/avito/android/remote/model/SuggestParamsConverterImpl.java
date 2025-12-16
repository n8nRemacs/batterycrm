package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverter;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuggestParamsConverter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/SuggestParamsConverterImpl;", "Lcom/avito/android/remote/model/SuggestParamsConverter;", "searchParamsConverter", "Lcom/avito/android/remote/model/SearchParamsConverter;", "(Lcom/avito/android/remote/model/SearchParamsConverter;)V", "convertToMap", "", "", "searchParams", "Lcom/avito/android/remote/model/SearchParams;", PresentationTypeKt.PRESENTATION_TYPE, "Lcom/avito/android/remote/model/PresentationType;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SuggestParamsConverterImpl implements SuggestParamsConverter {

    @k
    private final SearchParamsConverter searchParamsConverter;

    @Inject
    public SuggestParamsConverterImpl(@k SearchParamsConverter searchParamsConverter) {
        this.searchParamsConverter = searchParamsConverter;
    }

    @Override // com.avito.android.remote.model.SuggestParamsConverter
    @k
    public Map<String, String> convertToMap(@k SearchParams searchParams, @l PresentationType presentationType) {
        HashMap map = new HashMap(SearchParamsConverter.DefaultImpls.convertToMap$default(this.searchParamsConverter, searchParams, null, false, presentationType, 6, null));
        map.remove("query");
        return map;
    }
}
