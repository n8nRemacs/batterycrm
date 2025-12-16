package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerticalSearchFilterFormItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/ItemType;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemType {

    /* renamed from: b, reason: collision with root package name */
    public static final ItemType f273430b;

    /* renamed from: c, reason: collision with root package name */
    public static final ItemType f273431c;

    /* renamed from: d, reason: collision with root package name */
    public static final ItemType f273432d;

    /* renamed from: e, reason: collision with root package name */
    public static final ItemType f273433e;

    /* renamed from: f, reason: collision with root package name */
    public static final ItemType f273434f;

    /* renamed from: g, reason: collision with root package name */
    public static final ItemType f273435g;

    /* renamed from: h, reason: collision with root package name */
    public static final ItemType f273436h;

    /* renamed from: i, reason: collision with root package name */
    public static final ItemType f273437i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ ItemType[] f273438j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f273439k;

    static {
        ItemType itemType = new ItemType("SELECT", 0);
        f273430b = itemType;
        ItemType itemType2 = new ItemType("MULTISELECT", 1);
        f273431c = itemType2;
        ItemType itemType3 = new ItemType("SEGMENTED", 2);
        f273432d = itemType3;
        ItemType itemType4 = new ItemType("ALL_FILTERS", 3);
        f273433e = itemType4;
        ItemType itemType5 = new ItemType("GEO_CONTROL", 4);
        f273434f = itemType5;
        ItemType itemType6 = new ItemType("CHECKBOX", 5);
        f273435g = itemType6;
        ItemType itemType7 = new ItemType("SWITCHER", 6);
        f273436h = itemType7;
        ItemType itemType8 = new ItemType("CHIPS", 7);
        f273437i = itemType8;
        ItemType[] itemTypeArr = {itemType, itemType2, itemType3, itemType4, itemType5, itemType6, itemType7, itemType8};
        f273438j = itemTypeArr;
        f273439k = kotlin.enums.c.a(itemTypeArr);
    }

    public ItemType() {
        throw null;
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) f273438j.clone();
    }
}
