package com.avito.android.remote.model.category_parameters.slot.delivery_summary;

import Y61.k;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DeliverySummarySlotConfig.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\f\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliverySummaryRequest;", "", "locationJwt", "", "categoryId", "price", "params", "", "paramsTree", "slotsTree", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getCategoryId", "()Ljava/lang/String;", "getLocationJwt", "getParams", "()Ljava/util/Map;", "getParamsTree", "getPrice", "getSlotsTree", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliverySummaryRequest {

    @k
    private final String categoryId;

    @k
    private final String locationJwt;

    @k
    private final Map<String, String> params;

    @k
    private final Map<String, Object> paramsTree;

    @k
    private final String price;

    @k
    private final Map<String, Object> slotsTree;

    public DeliverySummaryRequest(@k String str, @k String str2, @k String str3, @k Map<String, String> map, @k Map<String, ? extends Object> map2, @k Map<String, ? extends Object> map3) {
        this.locationJwt = str;
        this.categoryId = str2;
        this.price = str3;
        this.params = map;
        this.paramsTree = map2;
        this.slotsTree = map3;
    }

    @k
    public final String getCategoryId() {
        return this.categoryId;
    }

    @k
    public final String getLocationJwt() {
        return this.locationJwt;
    }

    @k
    public final Map<String, String> getParams() {
        return this.params;
    }

    @k
    public final Map<String, Object> getParamsTree() {
        return this.paramsTree;
    }

    @k
    public final String getPrice() {
        return this.price;
    }

    @k
    public final Map<String, Object> getSlotsTree() {
        return this.slotsTree;
    }
}
