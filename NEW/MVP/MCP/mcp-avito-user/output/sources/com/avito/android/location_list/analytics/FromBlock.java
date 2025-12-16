package com.avito.android.location_list.analytics;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationListAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/analytics/FromBlock;", "", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FromBlock {

    /* renamed from: c, reason: collision with root package name */
    public static final FromBlock f181940c;

    /* renamed from: d, reason: collision with root package name */
    public static final FromBlock f181941d;

    /* renamed from: e, reason: collision with root package name */
    public static final FromBlock f181942e;

    /* renamed from: f, reason: collision with root package name */
    public static final FromBlock f181943f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ FromBlock[] f181944g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f181945h;

    /* renamed from: b, reason: collision with root package name */
    public final int f181946b;

    static {
        FromBlock fromBlock = new FromBlock("REFUSE", 0, 0);
        f181940c = fromBlock;
        FromBlock fromBlock2 = new FromBlock("REGION_TREE", 1, 2);
        f181941d = fromBlock2;
        FromBlock fromBlock3 = new FromBlock("MY_LOCATION", 2, 3);
        f181942e = fromBlock3;
        FromBlock fromBlock4 = new FromBlock("MY_LOCATION_APPROVE_BUTTON", 3, 4);
        f181943f = fromBlock4;
        FromBlock[] fromBlockArr = {fromBlock, fromBlock2, fromBlock3, fromBlock4};
        f181944g = fromBlockArr;
        f181945h = c.a(fromBlockArr);
    }

    public FromBlock(String str, int i12, int i13) {
        this.f181946b = i13;
    }

    public static FromBlock valueOf(String str) {
        return (FromBlock) Enum.valueOf(FromBlock.class, str);
    }

    public static FromBlock[] values() {
        return (FromBlock[]) f181944g.clone();
    }
}
