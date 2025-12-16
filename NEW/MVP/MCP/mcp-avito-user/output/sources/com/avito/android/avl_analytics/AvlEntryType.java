package com.avito.android.avl_analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvlEntryType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_analytics/AvlEntryType;", "", "_avito_avl-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvlEntryType {

    /* renamed from: b, reason: collision with root package name */
    public static final AvlEntryType f98425b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AvlEntryType[] f98426c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f98427d;

    static {
        AvlEntryType avlEntryType = new AvlEntryType();
        f98425b = avlEntryType;
        AvlEntryType[] avlEntryTypeArr = {avlEntryType};
        f98426c = avlEntryTypeArr;
        f98427d = kotlin.enums.c.a(avlEntryTypeArr);
    }

    public static AvlEntryType valueOf(String str) {
        return (AvlEntryType) Enum.valueOf(AvlEntryType.class, str);
    }

    public static AvlEntryType[] values() {
        return (AvlEntryType[]) f98426c.clone();
    }
}
