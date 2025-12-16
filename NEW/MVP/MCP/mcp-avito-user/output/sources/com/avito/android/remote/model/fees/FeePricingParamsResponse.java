package com.avito.android.remote.model.fees;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FeePricingParamsResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/fees/FeePricingParamsResponse;", "", "params", "", "Lcom/avito/android/remote/model/fees/FeePricingParamsResult;", "(Ljava/util/List;)V", "getParams", "()Ljava/util/List;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FeePricingParamsResponse {

    @c("params")
    @k
    private final List<FeePricingParamsResult> params;

    public FeePricingParamsResponse(@k List<FeePricingParamsResult> list) {
        this.params = list;
    }

    @k
    public final List<FeePricingParamsResult> getParams() {
        return this.params;
    }
}
