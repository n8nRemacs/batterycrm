package org.threeten.bp.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class SignStyle {

    /* renamed from: b, reason: collision with root package name */
    public static final SignStyle f421957b;

    /* renamed from: c, reason: collision with root package name */
    public static final SignStyle f421958c;

    /* renamed from: d, reason: collision with root package name */
    public static final SignStyle f421959d;

    /* renamed from: e, reason: collision with root package name */
    public static final SignStyle f421960e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ SignStyle[] f421961f;

    static {
        SignStyle signStyle = new SignStyle("NORMAL", 0);
        f421957b = signStyle;
        SignStyle signStyle2 = new SignStyle("ALWAYS", 1);
        f421958c = signStyle2;
        SignStyle signStyle3 = new SignStyle("NEVER", 2);
        SignStyle signStyle4 = new SignStyle("NOT_NEGATIVE", 3);
        f421959d = signStyle4;
        SignStyle signStyle5 = new SignStyle("EXCEEDS_PAD", 4);
        f421960e = signStyle5;
        f421961f = new SignStyle[]{signStyle, signStyle2, signStyle3, signStyle4, signStyle5};
    }

    public SignStyle() {
        throw null;
    }

    public static SignStyle valueOf(String str) {
        return (SignStyle) Enum.valueOf(SignStyle.class, str);
    }

    public static SignStyle[] values() {
        return (SignStyle[]) f421961f.clone();
    }

    public final boolean a(boolean z12, boolean z13, boolean z14) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return (z12 && z13) ? false : true;
        }
        if (iOrdinal == 1 || iOrdinal == 4) {
            return true;
        }
        return (z13 || z14) ? false : true;
    }
}
