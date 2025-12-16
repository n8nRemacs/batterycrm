package com.avito.android.comfortable_deal.data_source.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/data_source/model/ItemType;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ItemType {

    /* renamed from: b, reason: collision with root package name */
    public static final ItemType f120901b;

    /* renamed from: c, reason: collision with root package name */
    public static final ItemType f120902c;

    /* renamed from: d, reason: collision with root package name */
    public static final ItemType f120903d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ItemType[] f120904e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f120905f;

    static {
        ItemType itemType = new ItemType("TITLE_ITEM", 0);
        f120901b = itemType;
        ItemType itemType2 = new ItemType("NUMERATED_ITEM", 1);
        f120902c = itemType2;
        ItemType itemType3 = new ItemType("IMAGE_ITEM", 2);
        f120903d = itemType3;
        ItemType[] itemTypeArr = {itemType, itemType2, itemType3};
        f120904e = itemTypeArr;
        f120905f = c.a(itemTypeArr);
    }

    public ItemType() {
        throw null;
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) f120904e.clone();
    }
}
