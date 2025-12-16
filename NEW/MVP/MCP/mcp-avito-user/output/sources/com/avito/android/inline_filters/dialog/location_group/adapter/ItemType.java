package com.avito.android.inline_filters.dialog.location_group.adapter;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupFilterItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/ItemType;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ItemType {

    /* renamed from: b, reason: collision with root package name */
    public static final ItemType f171707b;

    /* renamed from: c, reason: collision with root package name */
    public static final ItemType f171708c;

    /* renamed from: d, reason: collision with root package name */
    public static final ItemType f171709d;

    /* renamed from: e, reason: collision with root package name */
    public static final ItemType f171710e;

    /* renamed from: f, reason: collision with root package name */
    public static final ItemType f171711f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ItemType[] f171712g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f171713h;

    static {
        ItemType itemType = new ItemType("SELECT", 0);
        f171707b = itemType;
        ItemType itemType2 = new ItemType("BOOLEAN", 1);
        f171708c = itemType2;
        ItemType itemType3 = new ItemType("CHIPS", 2);
        f171709d = itemType3;
        ItemType itemType4 = new ItemType("SELECT_WITH_TITLE", 3);
        f171710e = itemType4;
        ItemType itemType5 = new ItemType("LOCAL_PRIORITY", 4);
        f171711f = itemType5;
        ItemType[] itemTypeArr = {itemType, itemType2, itemType3, itemType4, itemType5};
        f171712g = itemTypeArr;
        f171713h = kotlin.enums.c.a(itemTypeArr);
    }

    public ItemType() {
        throw null;
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) f171712g.clone();
    }
}
