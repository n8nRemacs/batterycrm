package com.akita.compose.theme.re23.preview;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptionListPreview.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/theme/re23/preview/J1;", "", "re23_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class J1 {

    /* renamed from: b, reason: collision with root package name */
    public static final J1 f65367b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ J1[] f65368c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f65369d;

    static {
        J1 j12 = new J1("DEFAULT", 0);
        J1 j13 = new J1("PARAMETER_LINE", 1);
        f65367b = j13;
        J1[] j1Arr = {j12, j13};
        f65368c = j1Arr;
        f65369d = kotlin.enums.c.a(j1Arr);
    }

    public J1() {
        throw null;
    }

    public static J1 valueOf(String str) {
        return (J1) Enum.valueOf(J1.class, str);
    }

    public static J1[] values() {
        return (J1[]) f65368c.clone();
    }
}
