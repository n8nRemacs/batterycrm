package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ParamSuggestionsByPhotoResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/ParamKeyValue;", "", "id", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getValue", "_avito-discouraged_avito-api_photo-picker"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParamKeyValue {

    @c("id")
    @k
    private final String id;

    @c("value")
    @k
    private final String value;

    public ParamKeyValue(@k String str, @k String str2) {
        this.id = str;
        this.value = str2;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
