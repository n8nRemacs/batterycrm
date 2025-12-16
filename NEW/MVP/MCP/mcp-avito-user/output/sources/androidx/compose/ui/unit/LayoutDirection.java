package androidx.compose.ui.unit;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LayoutDirection.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/LayoutDirection;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutDirection {

    /* renamed from: b, reason: collision with root package name */
    public static final LayoutDirection f42838b;

    /* renamed from: c, reason: collision with root package name */
    public static final LayoutDirection f42839c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ LayoutDirection[] f42840d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f42841e;

    static {
        LayoutDirection layoutDirection = new LayoutDirection("Ltr", 0);
        f42838b = layoutDirection;
        LayoutDirection layoutDirection2 = new LayoutDirection("Rtl", 1);
        f42839c = layoutDirection2;
        LayoutDirection[] layoutDirectionArr = {layoutDirection, layoutDirection2};
        f42840d = layoutDirectionArr;
        f42841e = kotlin.enums.c.a(layoutDirectionArr);
    }

    public LayoutDirection() {
        throw null;
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) f42840d.clone();
    }
}
