package com.avito.android.analytics.event.imv_cars;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImvCarsInformationButtonShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/imv_cars/EntryPointType;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EntryPointType {

    /* renamed from: c, reason: collision with root package name */
    public static final EntryPointType f90086c;

    /* renamed from: d, reason: collision with root package name */
    public static final EntryPointType f90087d;

    /* renamed from: e, reason: collision with root package name */
    public static final EntryPointType f90088e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EntryPointType[] f90089f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f90090g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f90091b;

    static {
        EntryPointType entryPointType = new EntryPointType("ITEM_CARD", 0, "auto_imv_card");
        f90086c = entryPointType;
        EntryPointType entryPointType2 = new EntryPointType("ITEM_ADD", 1, "auto_imv_add");
        f90087d = entryPointType2;
        EntryPointType entryPointType3 = new EntryPointType("ITEM_EDIT", 2, "auto_imv_edit");
        f90088e = entryPointType3;
        EntryPointType[] entryPointTypeArr = {entryPointType, entryPointType2, entryPointType3};
        f90089f = entryPointTypeArr;
        f90090g = c.a(entryPointTypeArr);
    }

    public EntryPointType(String str, int i12, String str2) {
        this.f90091b = str2;
    }

    public static EntryPointType valueOf(String str) {
        return (EntryPointType) Enum.valueOf(EntryPointType.class, str);
    }

    public static EntryPointType[] values() {
        return (EntryPointType[]) f90089f.clone();
    }
}
