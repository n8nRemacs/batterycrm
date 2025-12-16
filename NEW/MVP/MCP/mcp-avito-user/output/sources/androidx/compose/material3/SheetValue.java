package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SheetDefaults.kt */
@InterfaceC21537e7
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SheetValue;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SheetValue {

    /* renamed from: b, reason: collision with root package name */
    public static final SheetValue f35417b;

    /* renamed from: c, reason: collision with root package name */
    public static final SheetValue f35418c;

    /* renamed from: d, reason: collision with root package name */
    public static final SheetValue f35419d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SheetValue[] f35420e;

    static {
        SheetValue sheetValue = new SheetValue("Hidden", 0);
        f35417b = sheetValue;
        SheetValue sheetValue2 = new SheetValue("Expanded", 1);
        f35418c = sheetValue2;
        SheetValue sheetValue3 = new SheetValue("PartiallyExpanded", 2);
        f35419d = sheetValue3;
        f35420e = new SheetValue[]{sheetValue, sheetValue2, sheetValue3};
    }

    public SheetValue() {
        throw null;
    }

    public static SheetValue valueOf(String str) {
        return (SheetValue) Enum.valueOf(SheetValue.class, str);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) f35420e.clone();
    }
}
