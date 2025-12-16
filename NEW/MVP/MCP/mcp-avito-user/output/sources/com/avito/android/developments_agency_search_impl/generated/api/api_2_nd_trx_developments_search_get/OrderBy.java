package com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Api2NdTrxDevelopmentsSearchGetRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/developments_agency_search_impl/generated/api/api_2_nd_trx_developments_search_get/OrderBy;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Price", "CompletionDate", "DevelopmentName", "DevelopmentViewCount", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderBy {

    @c("completion_date")
    public static final OrderBy CompletionDate;

    @c("development_name")
    public static final OrderBy DevelopmentName;

    @c("development_view_count")
    public static final OrderBy DevelopmentViewCount;

    @c("price")
    public static final OrderBy Price;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ OrderBy[] f139068c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f139069d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f139070b;

    static {
        OrderBy orderBy = new OrderBy("Price", 0, "price");
        Price = orderBy;
        OrderBy orderBy2 = new OrderBy("CompletionDate", 1, "completion_date");
        CompletionDate = orderBy2;
        OrderBy orderBy3 = new OrderBy("DevelopmentName", 2, "development_name");
        DevelopmentName = orderBy3;
        OrderBy orderBy4 = new OrderBy("DevelopmentViewCount", 3, "development_view_count");
        DevelopmentViewCount = orderBy4;
        OrderBy[] orderByArr = {orderBy, orderBy2, orderBy3, orderBy4};
        f139068c = orderByArr;
        f139069d = kotlin.enums.c.a(orderByArr);
    }

    private OrderBy(String str, int i12, String str2) {
        this.f139070b = str2;
    }

    public static OrderBy valueOf(String str) {
        return (OrderBy) Enum.valueOf(OrderBy.class, str);
    }

    public static OrderBy[] values() {
        return (OrderBy[]) f139068c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f139070b.toString();
    }
}
