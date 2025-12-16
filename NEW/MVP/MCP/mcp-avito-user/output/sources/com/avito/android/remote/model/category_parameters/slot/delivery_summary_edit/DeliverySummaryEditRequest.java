package com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit;

import Y61.k;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DeliverySummaryEditRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0012\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary_edit/DeliverySummaryEditRequest;", "", "locationJwt", "", "categoryId", "price", "paramsMap", "", "paramsTree", "slotsTree", "itemId", "title", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategoryId", "()Ljava/lang/String;", "getDescription", "getItemId", "getLocationJwt", "getParamsMap", "()Ljava/util/Map;", "getParamsTree", "getPrice", "getSlotsTree", "getTitle", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliverySummaryEditRequest {

    @k
    private final String categoryId;

    @k
    private final String description;

    @k
    private final String itemId;

    @k
    private final String locationJwt;

    @k
    private final Map<String, String> paramsMap;

    @k
    private final Map<String, Object> paramsTree;

    @k
    private final String price;

    @k
    private final Map<String, Object> slotsTree;

    @k
    private final String title;

    public DeliverySummaryEditRequest(@k String str, @k String str2, @k String str3, @k Map<String, String> map, @k Map<String, ? extends Object> map2, @k Map<String, ? extends Object> map3, @k String str4, @k String str5, @k String str6) {
        this.locationJwt = str;
        this.categoryId = str2;
        this.price = str3;
        this.paramsMap = map;
        this.paramsTree = map2;
        this.slotsTree = map3;
        this.itemId = str4;
        this.title = str5;
        this.description = str6;
    }

    @k
    public final String getCategoryId() {
        return this.categoryId;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getItemId() {
        return this.itemId;
    }

    @k
    public final String getLocationJwt() {
        return this.locationJwt;
    }

    @k
    public final Map<String, String> getParamsMap() {
        return this.paramsMap;
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

    @k
    public final String getTitle() {
        return this.title;
    }
}
