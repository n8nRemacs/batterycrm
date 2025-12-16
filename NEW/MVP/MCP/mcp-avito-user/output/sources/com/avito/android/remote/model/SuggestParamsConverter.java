package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SuggestParamsConverter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/SuggestParamsConverter;", "", "convertToMap", "", "", "searchParams", "Lcom/avito/android/remote/model/SearchParams;", PresentationTypeKt.PRESENTATION_TYPE, "Lcom/avito/android/remote/model/PresentationType;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SuggestParamsConverter {

    /* compiled from: SuggestParamsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Map convertToMap$default(SuggestParamsConverter suggestParamsConverter, SearchParams searchParams, PresentationType presentationType, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertToMap");
            }
            if ((i12 & 2) != 0) {
                presentationType = null;
            }
            return suggestParamsConverter.convertToMap(searchParams, presentationType);
        }
    }

    @k
    Map<String, String> convertToMap(@k SearchParams searchParams, @l PresentationType presentationType);
}
