package com.avito.android.remote.model.search.map;

import Y61.k;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: SaveDrawAreaResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/search/map/SaveDrawAreaResponse;", "", SearchParamsConverterKt.DRAW_ID, "", "(Ljava/lang/String;)V", "getDrawId", "()Ljava/lang/String;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SaveDrawAreaResponse {

    @c(SearchParamsConverterKt.DRAW_ID)
    @k
    private final String drawId;

    public SaveDrawAreaResponse(@k String str) {
        this.drawId = str;
    }

    @k
    public final String getDrawId() {
        return this.drawId;
    }
}
