package com.avito.android.activeOrders;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrdersNeedActionResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/activeOrders/ItemType;", "", "(Ljava/lang/String;I)V", "GOODS_ORDER", "SHOW_ALL", "_avito_active-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ItemType {

    @com.google.gson.annotations.c("goodsOrder")
    public static final ItemType GOODS_ORDER;

    @com.google.gson.annotations.c("showAll")
    public static final ItemType SHOW_ALL;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ItemType[] f68211b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f68212c;

    static {
        ItemType itemType = new ItemType("GOODS_ORDER", 0);
        GOODS_ORDER = itemType;
        ItemType itemType2 = new ItemType("SHOW_ALL", 1);
        SHOW_ALL = itemType2;
        ItemType[] itemTypeArr = {itemType, itemType2};
        f68211b = itemTypeArr;
        f68212c = kotlin.enums.c.a(itemTypeArr);
    }

    private ItemType(String str, int i12) {
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) f68211b.clone();
    }
}
