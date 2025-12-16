package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DismissValue;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DismissValue {

    /* renamed from: b, reason: collision with root package name */
    public static final DismissValue f32540b;

    /* renamed from: c, reason: collision with root package name */
    public static final DismissValue f32541c;

    /* renamed from: d, reason: collision with root package name */
    public static final DismissValue f32542d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DismissValue[] f32543e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f32544f;

    static {
        DismissValue dismissValue = new DismissValue("Default", 0);
        f32540b = dismissValue;
        DismissValue dismissValue2 = new DismissValue("DismissedToEnd", 1);
        f32541c = dismissValue2;
        DismissValue dismissValue3 = new DismissValue("DismissedToStart", 2);
        f32542d = dismissValue3;
        DismissValue[] dismissValueArr = {dismissValue, dismissValue2, dismissValue3};
        f32543e = dismissValueArr;
        f32544f = kotlin.enums.c.a(dismissValueArr);
    }

    public DismissValue() {
        throw null;
    }

    public static DismissValue valueOf(String str) {
        return (DismissValue) Enum.valueOf(DismissValue.class, str);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) f32543e.clone();
    }
}
