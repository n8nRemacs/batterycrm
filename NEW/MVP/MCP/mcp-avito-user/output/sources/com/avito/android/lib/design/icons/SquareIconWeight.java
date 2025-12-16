package com.avito.android.lib.design.icons;

import Y61.k;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.text.C43044a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextIconWeight.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/icons/SquareIconWeight;", "", "_design-modules_icons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SquareIconWeight {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SquareIconWeight[] f179278b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f179279c;

    static {
        SquareIconWeight[] squareIconWeightArr = {new SquareIconWeight("SMALL", 0), new SquareIconWeight("REGULAR", 1), new SquareIconWeight("LARGE", 2)};
        f179278b = squareIconWeightArr;
        f179279c = c.a(squareIconWeightArr);
    }

    public SquareIconWeight() {
        throw null;
    }

    public static SquareIconWeight valueOf(String str) {
        return (SquareIconWeight) Enum.valueOf(SquareIconWeight.class, str);
    }

    public static SquareIconWeight[] values() {
        return (SquareIconWeight[]) f179278b.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        return ((Object) C43044a.e(lowerCase.charAt(0))) + lowerCase.substring(1);
    }
}
