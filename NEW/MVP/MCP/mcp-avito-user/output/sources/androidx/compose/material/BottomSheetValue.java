package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetValue {

    /* renamed from: b, reason: collision with root package name */
    public static final BottomSheetValue f32454b;

    /* renamed from: c, reason: collision with root package name */
    public static final BottomSheetValue f32455c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BottomSheetValue[] f32456d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f32457e;

    static {
        BottomSheetValue bottomSheetValue = new BottomSheetValue("Collapsed", 0);
        f32454b = bottomSheetValue;
        BottomSheetValue bottomSheetValue2 = new BottomSheetValue("Expanded", 1);
        f32455c = bottomSheetValue2;
        BottomSheetValue[] bottomSheetValueArr = {bottomSheetValue, bottomSheetValue2};
        f32456d = bottomSheetValueArr;
        f32457e = kotlin.enums.c.a(bottomSheetValueArr);
    }

    public BottomSheetValue() {
        throw null;
    }

    public static BottomSheetValue valueOf(String str) {
        return (BottomSheetValue) Enum.valueOf(BottomSheetValue.class, str);
    }

    public static BottomSheetValue[] values() {
        return (BottomSheetValue[]) f32456d.clone();
    }
}
