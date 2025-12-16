package com.avito.android.lib.design.time_line;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivateTimeLineItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/time_line/ItemType;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ItemType {

    /* renamed from: b, reason: collision with root package name */
    public static final ItemType f180949b;

    /* renamed from: c, reason: collision with root package name */
    public static final ItemType f180950c;

    /* renamed from: d, reason: collision with root package name */
    public static final ItemType f180951d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ItemType[] f180952e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f180953f;

    static {
        ItemType itemType = new ItemType("ACTIVE", 0);
        f180949b = itemType;
        ItemType itemType2 = new ItemType("INACTIVE", 1);
        f180950c = itemType2;
        ItemType itemType3 = new ItemType("CURRENT", 2);
        f180951d = itemType3;
        ItemType[] itemTypeArr = {itemType, itemType2, itemType3};
        f180952e = itemTypeArr;
        f180953f = kotlin.enums.c.a(itemTypeArr);
    }

    public ItemType() {
        throw null;
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) f180952e.clone();
    }
}
