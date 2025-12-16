package com.avito.android.universal_map.map;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UniversalMapBottomSheetSpec.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/UniversalMapBottomSheet;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniversalMapBottomSheet {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ UniversalMapBottomSheet[] f304836b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f304837c;

    static {
        UniversalMapBottomSheet[] universalMapBottomSheetArr = {new UniversalMapBottomSheet("PointInfo", 0), new UniversalMapBottomSheet("PointFilters", 1)};
        f304836b = universalMapBottomSheetArr;
        f304837c = kotlin.enums.c.a(universalMapBottomSheetArr);
    }

    public UniversalMapBottomSheet() {
        throw null;
    }

    public static UniversalMapBottomSheet valueOf(String str) {
        return (UniversalMapBottomSheet) Enum.valueOf(UniversalMapBottomSheet.class, str);
    }

    public static UniversalMapBottomSheet[] values() {
        return (UniversalMapBottomSheet[]) f304836b.clone();
    }
}
