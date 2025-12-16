package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/F8;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class F8 {

    /* renamed from: b, reason: collision with root package name */
    public static final F8 f34722b;

    /* renamed from: c, reason: collision with root package name */
    public static final F8 f34723c;

    /* renamed from: d, reason: collision with root package name */
    public static final F8 f34724d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ F8[] f34725e;

    static {
        F8 f82 = new F8("Focused", 0);
        f34722b = f82;
        F8 f83 = new F8("UnfocusedEmpty", 1);
        f34723c = f83;
        F8 f84 = new F8("UnfocusedNotEmpty", 2);
        f34724d = f84;
        f34725e = new F8[]{f82, f83, f84};
    }

    public F8() {
        throw null;
    }

    public static F8 valueOf(String str) {
        return (F8) Enum.valueOf(F8.class, str);
    }

    public static F8[] values() {
        return (F8[]) f34725e.clone();
    }
}
