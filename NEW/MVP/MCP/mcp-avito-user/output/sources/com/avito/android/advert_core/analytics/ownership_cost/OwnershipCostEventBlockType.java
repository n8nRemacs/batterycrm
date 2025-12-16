package com.avito.android.advert_core.analytics.ownership_cost;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OwnershipCostEventBlockType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/ownership_cost/OwnershipCostEventBlockType;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OwnershipCostEventBlockType {

    /* renamed from: c, reason: collision with root package name */
    public static final OwnershipCostEventBlockType f82833c;

    /* renamed from: d, reason: collision with root package name */
    public static final OwnershipCostEventBlockType f82834d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ OwnershipCostEventBlockType[] f82835e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f82836f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82837b;

    static {
        OwnershipCostEventBlockType ownershipCostEventBlockType = new OwnershipCostEventBlockType("ITEM", 0, "item");
        f82833c = ownershipCostEventBlockType;
        OwnershipCostEventBlockType ownershipCostEventBlockType2 = new OwnershipCostEventBlockType("BOTTOM_SHEET", 1, "modal");
        f82834d = ownershipCostEventBlockType2;
        OwnershipCostEventBlockType[] ownershipCostEventBlockTypeArr = {ownershipCostEventBlockType, ownershipCostEventBlockType2};
        f82835e = ownershipCostEventBlockTypeArr;
        f82836f = c.a(ownershipCostEventBlockTypeArr);
    }

    public OwnershipCostEventBlockType(String str, int i12, String str2) {
        this.f82837b = str2;
    }

    public static OwnershipCostEventBlockType valueOf(String str) {
        return (OwnershipCostEventBlockType) Enum.valueOf(OwnershipCostEventBlockType.class, str);
    }

    public static OwnershipCostEventBlockType[] values() {
        return (OwnershipCostEventBlockType[]) f82835e.clone();
    }
}
