package com.akita.compose.theme.re23.preview;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomSheetPreview.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/theme/re23/preview/G2;", "", "re23_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class G2 {

    /* renamed from: c, reason: collision with root package name */
    public static final G2 f65338c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ G2[] f65339d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f65340e;

    /* renamed from: b, reason: collision with root package name */
    public final float f65341b;

    static {
        G2 g22 = new G2(0.3f, "FACTOR_0_3", 0);
        G2 g23 = new G2(0.5f, "FACTOR_0_5", 1);
        f65338c = g23;
        G2[] g2Arr = {g22, g23, new G2(0.7f, "FACTOR_0_7", 2), new G2(1.0f, "FACTOR_1_0", 3)};
        f65339d = g2Arr;
        f65340e = kotlin.enums.c.a(g2Arr);
    }

    public G2(float f12, String str, int i12) {
        this.f65341b = f12;
    }

    public static G2 valueOf(String str) {
        return (G2) Enum.valueOf(G2.class, str);
    }

    public static G2[] values() {
        return (G2[]) f65339d.clone();
    }
}
