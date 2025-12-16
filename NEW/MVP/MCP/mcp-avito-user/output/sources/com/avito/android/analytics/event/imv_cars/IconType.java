package com.avito.android.analytics.event.imv_cars;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImvInformationButtonClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/imv_cars/IconType;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IconType {

    /* renamed from: c, reason: collision with root package name */
    public static final IconType f90092c;

    /* renamed from: d, reason: collision with root package name */
    public static final IconType f90093d;

    /* renamed from: e, reason: collision with root package name */
    public static final IconType f90094e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ IconType[] f90095f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f90096g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f90097b;

    static {
        IconType iconType = new IconType("CARS_ITEM_CARD", 0, "auto_imv_details");
        f90092c = iconType;
        IconType iconType2 = new IconType("CARS_ITEM_ADD", 1, "auto_imv_details_creation");
        f90093d = iconType2;
        IconType iconType3 = new IconType("CARS_ITEM_EDIT", 2, "auto_imv_details_edit");
        f90094e = iconType3;
        IconType[] iconTypeArr = {iconType, iconType2, iconType3};
        f90095f = iconTypeArr;
        f90096g = c.a(iconTypeArr);
    }

    public IconType(String str, int i12, String str2) {
        this.f90097b = str2;
    }

    public static IconType valueOf(String str) {
        return (IconType) Enum.valueOf(IconType.class, str);
    }

    public static IconType[] values() {
        return (IconType[]) f90095f.clone();
    }
}
