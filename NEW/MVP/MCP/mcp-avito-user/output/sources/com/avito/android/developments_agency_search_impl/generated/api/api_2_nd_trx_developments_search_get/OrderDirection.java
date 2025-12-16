package com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Api2NdTrxDevelopmentsSearchGetRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search_impl/generated/api/api_2_nd_trx_developments_search_get/OrderDirection;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Asc", "Desc", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDirection {

    @c("asc")
    public static final OrderDirection Asc;

    @c("desc")
    public static final OrderDirection Desc;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ OrderDirection[] f139071c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f139072d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f139073b;

    static {
        OrderDirection orderDirection = new OrderDirection("Asc", 0, "asc");
        Asc = orderDirection;
        OrderDirection orderDirection2 = new OrderDirection("Desc", 1, "desc");
        Desc = orderDirection2;
        OrderDirection[] orderDirectionArr = {orderDirection, orderDirection2};
        f139071c = orderDirectionArr;
        f139072d = kotlin.enums.c.a(orderDirectionArr);
    }

    private OrderDirection(String str, int i12, String str2) {
        this.f139073b = str2;
    }

    public static OrderDirection valueOf(String str) {
        return (OrderDirection) Enum.valueOf(OrderDirection.class, str);
    }

    public static OrderDirection[] values() {
        return (OrderDirection[]) f139071c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f139073b.toString();
    }
}
