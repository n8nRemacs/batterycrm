package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: SearchParametersBlockDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SearchParametersBlockDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/rating_details_mvi/SearchParametersEntry$SearchParametersBlock;", "<init>", "()V", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchParametersBlockDeserializer implements com.google.gson.h<SearchParametersEntry.SearchParametersBlock> {
    @Override // com.google.gson.h
    public final SearchParametersEntry.SearchParametersBlock deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.internal.x<String, com.google.gson.i> xVar = kVarI.f362194b;
        if (xVar.containsKey(SearchParamsConverterKt.SORT)) {
            return (SearchParametersEntry.SearchParametersBlock) gVar.b(kVarI.D(SearchParamsConverterKt.SORT), SearchParametersEntry.SearchParametersBlock.Sort.class);
        }
        if (xVar.containsKey("inlineBoolFilter")) {
            return (SearchParametersEntry.SearchParametersBlock) gVar.b(kVarI.D("inlineBoolFilter"), SearchParametersEntry.SearchParametersBlock.InlineBoolFilter.class);
        }
        throw new IllegalArgumentException("Unexpected json: " + iVar);
    }
}
