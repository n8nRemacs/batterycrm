package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetValue {

    /* renamed from: b, reason: collision with root package name */
    public static final ModalBottomSheetValue f32953b;

    /* renamed from: c, reason: collision with root package name */
    public static final ModalBottomSheetValue f32954c;

    /* renamed from: d, reason: collision with root package name */
    public static final ModalBottomSheetValue f32955d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ModalBottomSheetValue[] f32956e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f32957f;

    static {
        ModalBottomSheetValue modalBottomSheetValue = new ModalBottomSheetValue("Hidden", 0);
        f32953b = modalBottomSheetValue;
        ModalBottomSheetValue modalBottomSheetValue2 = new ModalBottomSheetValue("Expanded", 1);
        f32954c = modalBottomSheetValue2;
        ModalBottomSheetValue modalBottomSheetValue3 = new ModalBottomSheetValue("HalfExpanded", 2);
        f32955d = modalBottomSheetValue3;
        ModalBottomSheetValue[] modalBottomSheetValueArr = {modalBottomSheetValue, modalBottomSheetValue2, modalBottomSheetValue3};
        f32956e = modalBottomSheetValueArr;
        f32957f = kotlin.enums.c.a(modalBottomSheetValueArr);
    }

    public ModalBottomSheetValue() {
        throw null;
    }

    public static ModalBottomSheetValue valueOf(String str) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, str);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) f32956e.clone();
    }
}
