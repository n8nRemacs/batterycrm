package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class TextRangeUnits {

    /* renamed from: b, reason: collision with root package name */
    public static final TextRangeUnits f59715b;

    /* renamed from: c, reason: collision with root package name */
    public static final TextRangeUnits f59716c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TextRangeUnits[] f59717d;

    static {
        TextRangeUnits textRangeUnits = new TextRangeUnits("PERCENT", 0);
        f59715b = textRangeUnits;
        TextRangeUnits textRangeUnits2 = new TextRangeUnits("INDEX", 1);
        f59716c = textRangeUnits2;
        f59717d = new TextRangeUnits[]{textRangeUnits, textRangeUnits2};
    }

    public TextRangeUnits() {
        throw null;
    }

    public static TextRangeUnits valueOf(String str) {
        return (TextRangeUnits) Enum.valueOf(TextRangeUnits.class, str);
    }

    public static TextRangeUnits[] values() {
        return (TextRangeUnits[]) f59717d.clone();
    }
}
