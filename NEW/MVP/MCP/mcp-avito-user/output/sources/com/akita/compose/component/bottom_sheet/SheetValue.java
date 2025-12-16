package com.akita.compose.component.bottom_sheet;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomSheetState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/SheetValue;", "", "bottom-sheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SheetValue {

    /* renamed from: b, reason: collision with root package name */
    public static final SheetValue f60561b;

    /* renamed from: c, reason: collision with root package name */
    public static final SheetValue f60562c;

    /* renamed from: d, reason: collision with root package name */
    public static final SheetValue f60563d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SheetValue[] f60564e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f60565f;

    static {
        SheetValue sheetValue = new SheetValue("Hidden", 0);
        f60561b = sheetValue;
        SheetValue sheetValue2 = new SheetValue("Expanded", 1);
        f60562c = sheetValue2;
        SheetValue sheetValue3 = new SheetValue("PartiallyExpanded", 2);
        f60563d = sheetValue3;
        SheetValue[] sheetValueArr = {sheetValue, sheetValue2, sheetValue3};
        f60564e = sheetValueArr;
        f60565f = kotlin.enums.c.a(sheetValueArr);
    }

    public SheetValue() {
        throw null;
    }

    public static SheetValue valueOf(String str) {
        return (SheetValue) Enum.valueOf(SheetValue.class, str);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) f60564e.clone();
    }
}
