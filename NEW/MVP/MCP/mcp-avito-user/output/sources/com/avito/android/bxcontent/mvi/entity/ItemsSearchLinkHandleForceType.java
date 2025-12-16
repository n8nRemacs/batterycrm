package com.avito.android.bxcontent.mvi.entity;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemsSearchLinkHandleForceType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/ItemsSearchLinkHandleForceType;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ItemsSearchLinkHandleForceType {

    /* renamed from: b, reason: collision with root package name */
    public static final ItemsSearchLinkHandleForceType f112038b;

    /* renamed from: c, reason: collision with root package name */
    public static final ItemsSearchLinkHandleForceType f112039c;

    /* renamed from: d, reason: collision with root package name */
    public static final ItemsSearchLinkHandleForceType f112040d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ItemsSearchLinkHandleForceType[] f112041e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f112042f;

    static {
        ItemsSearchLinkHandleForceType itemsSearchLinkHandleForceType = new ItemsSearchLinkHandleForceType("FORCE_FOLLOW", 0);
        f112038b = itemsSearchLinkHandleForceType;
        ItemsSearchLinkHandleForceType itemsSearchLinkHandleForceType2 = new ItemsSearchLinkHandleForceType("FORCE_UPDATE", 1);
        f112039c = itemsSearchLinkHandleForceType2;
        ItemsSearchLinkHandleForceType itemsSearchLinkHandleForceType3 = new ItemsSearchLinkHandleForceType("DEFAULT", 2);
        f112040d = itemsSearchLinkHandleForceType3;
        ItemsSearchLinkHandleForceType[] itemsSearchLinkHandleForceTypeArr = {itemsSearchLinkHandleForceType, itemsSearchLinkHandleForceType2, itemsSearchLinkHandleForceType3};
        f112041e = itemsSearchLinkHandleForceTypeArr;
        f112042f = kotlin.enums.c.a(itemsSearchLinkHandleForceTypeArr);
    }

    public ItemsSearchLinkHandleForceType() {
        throw null;
    }

    public static ItemsSearchLinkHandleForceType valueOf(String str) {
        return (ItemsSearchLinkHandleForceType) Enum.valueOf(ItemsSearchLinkHandleForceType.class, str);
    }

    public static ItemsSearchLinkHandleForceType[] values() {
        return (ItemsSearchLinkHandleForceType[]) f112041e.clone();
    }
}
