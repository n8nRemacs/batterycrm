package com.avito.android.remote.model.fees;

import Y61.k;
import com.avito.android.gson.d;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FeePricingParamsResult.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/fees/FeePricingParamsResult;", "", "categoryId", "", "paramIds", "", "(Ljava/lang/String;Ljava/util/List;)V", "getCategoryId", "()Ljava/lang/String;", "getParamIds", "()Ljava/util/List;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FeePricingParamsResult {

    @c("categoryId")
    @k
    private final String categoryId;

    @c("paramIds")
    @k
    private final List<String> paramIds;

    public FeePricingParamsResult(@k String str, @k List<String> list) {
        this.categoryId = str;
        this.paramIds = list;
    }

    @k
    public final String getCategoryId() {
        return this.categoryId;
    }

    @k
    public final List<String> getParamIds() {
        return this.paramIds;
    }
}
