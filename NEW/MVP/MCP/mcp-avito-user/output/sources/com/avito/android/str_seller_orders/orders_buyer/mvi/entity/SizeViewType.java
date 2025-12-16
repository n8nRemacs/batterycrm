package com.avito.android.str_seller_orders.orders_buyer.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StrOrdersBuyerState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/SizeViewType;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SizeViewType {

    /* renamed from: b, reason: collision with root package name */
    public static final SizeViewType f289081b;

    /* renamed from: c, reason: collision with root package name */
    public static final SizeViewType f289082c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SizeViewType[] f289083d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f289084e;

    static {
        SizeViewType sizeViewType = new SizeViewType("BIG", 0);
        f289081b = sizeViewType;
        SizeViewType sizeViewType2 = new SizeViewType("SMALL", 1);
        f289082c = sizeViewType2;
        SizeViewType[] sizeViewTypeArr = {sizeViewType, sizeViewType2};
        f289083d = sizeViewTypeArr;
        f289084e = c.a(sizeViewTypeArr);
    }

    public SizeViewType() {
        throw null;
    }

    public static SizeViewType valueOf(String str) {
        return (SizeViewType) Enum.valueOf(SizeViewType.class, str);
    }

    public static SizeViewType[] values() {
        return (SizeViewType[]) f289083d.clone();
    }
}
