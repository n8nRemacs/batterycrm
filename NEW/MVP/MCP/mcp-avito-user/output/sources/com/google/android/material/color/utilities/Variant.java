package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@RestrictTo
/* loaded from: classes6.dex */
public final class Variant {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Variant[] f356334b = {new Variant("MONOCHROME", 0), new Variant("NEUTRAL", 1), new Variant("TONAL_SPOT", 2), new Variant("VIBRANT", 3), new Variant("EXPRESSIVE", 4), new Variant("FIDELITY", 5), new Variant("CONTENT", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    Variant EF5;

    public Variant() {
        throw null;
    }

    public static Variant valueOf(String str) {
        return (Variant) Enum.valueOf(Variant.class, str);
    }

    public static Variant[] values() {
        return (Variant[]) f356334b.clone();
    }
}
