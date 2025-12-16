package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RealtyInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/RealtyCategory;", "", "(Ljava/lang/String;I)V", "SS", "ND", "ROOM", "HOUSE", "LAND", "GARAGE", "CRE", "ABROAD", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RealtyCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RealtyCategory[] $VALUES;

    /* renamed from: SS, reason: collision with root package name */
    @c("ss")
    public static final RealtyCategory f253655SS = new RealtyCategory("SS", 0);

    /* renamed from: ND, reason: collision with root package name */
    @c("nd")
    public static final RealtyCategory f253654ND = new RealtyCategory("ND", 1);

    @c("room")
    public static final RealtyCategory ROOM = new RealtyCategory("ROOM", 2);

    @c("house")
    public static final RealtyCategory HOUSE = new RealtyCategory("HOUSE", 3);

    @c("land")
    public static final RealtyCategory LAND = new RealtyCategory("LAND", 4);

    @c("garage")
    public static final RealtyCategory GARAGE = new RealtyCategory("GARAGE", 5);

    @c("cre")
    public static final RealtyCategory CRE = new RealtyCategory("CRE", 6);

    @c("abroad")
    public static final RealtyCategory ABROAD = new RealtyCategory("ABROAD", 7);

    private static final /* synthetic */ RealtyCategory[] $values() {
        return new RealtyCategory[]{f253655SS, f253654ND, ROOM, HOUSE, LAND, GARAGE, CRE, ABROAD};
    }

    static {
        RealtyCategory[] realtyCategoryArr$values = $values();
        $VALUES = realtyCategoryArr$values;
        $ENTRIES = kotlin.enums.c.a(realtyCategoryArr$values);
    }

    private RealtyCategory(String str, int i12) {
    }

    @k
    public static a<RealtyCategory> getEntries() {
        return $ENTRIES;
    }

    public static RealtyCategory valueOf(String str) {
        return (RealtyCategory) Enum.valueOf(RealtyCategory.class, str);
    }

    public static RealtyCategory[] values() {
        return (RealtyCategory[]) $VALUES.clone();
    }
}
