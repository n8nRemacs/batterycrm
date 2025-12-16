package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/BottomDrawerValue;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomDrawerValue {

    /* renamed from: b, reason: collision with root package name */
    public static final BottomDrawerValue f32449b;

    /* renamed from: c, reason: collision with root package name */
    public static final BottomDrawerValue f32450c;

    /* renamed from: d, reason: collision with root package name */
    public static final BottomDrawerValue f32451d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BottomDrawerValue[] f32452e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f32453f;

    static {
        BottomDrawerValue bottomDrawerValue = new BottomDrawerValue("Closed", 0);
        f32449b = bottomDrawerValue;
        BottomDrawerValue bottomDrawerValue2 = new BottomDrawerValue("Open", 1);
        f32450c = bottomDrawerValue2;
        BottomDrawerValue bottomDrawerValue3 = new BottomDrawerValue("Expanded", 2);
        f32451d = bottomDrawerValue3;
        BottomDrawerValue[] bottomDrawerValueArr = {bottomDrawerValue, bottomDrawerValue2, bottomDrawerValue3};
        f32452e = bottomDrawerValueArr;
        f32453f = kotlin.enums.c.a(bottomDrawerValueArr);
    }

    public BottomDrawerValue() {
        throw null;
    }

    public static BottomDrawerValue valueOf(String str) {
        return (BottomDrawerValue) Enum.valueOf(BottomDrawerValue.class, str);
    }

    public static BottomDrawerValue[] values() {
        return (BottomDrawerValue[]) f32452e.clone();
    }
}
