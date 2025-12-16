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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/icons/TextIconWeight;", "", "_design-modules_icons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TextIconWeight {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TextIconWeight[] f179280b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f179281c;

    static {
        TextIconWeight[] textIconWeightArr = {new TextIconWeight("THIN", 0), new TextIconWeight("REGULAR", 1), new TextIconWeight("BOLD", 2)};
        f179280b = textIconWeightArr;
        f179281c = c.a(textIconWeightArr);
    }

    public TextIconWeight() {
        throw null;
    }

    public static TextIconWeight valueOf(String str) {
        return (TextIconWeight) Enum.valueOf(TextIconWeight.class, str);
    }

    public static TextIconWeight[] values() {
        return (TextIconWeight[]) f179280b.clone();
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
