package org.threeten.bp.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class TextStyle {

    /* renamed from: b, reason: collision with root package name */
    public static final TextStyle f421962b;

    /* renamed from: c, reason: collision with root package name */
    public static final TextStyle f421963c;

    /* renamed from: d, reason: collision with root package name */
    public static final TextStyle f421964d;

    /* renamed from: e, reason: collision with root package name */
    public static final TextStyle f421965e;

    /* renamed from: f, reason: collision with root package name */
    public static final TextStyle f421966f;

    /* renamed from: g, reason: collision with root package name */
    public static final TextStyle f421967g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ TextStyle[] f421968h;

    static {
        TextStyle textStyle = new TextStyle("FULL", 0);
        f421962b = textStyle;
        TextStyle textStyle2 = new TextStyle("FULL_STANDALONE", 1);
        f421963c = textStyle2;
        TextStyle textStyle3 = new TextStyle("SHORT", 2);
        f421964d = textStyle3;
        TextStyle textStyle4 = new TextStyle("SHORT_STANDALONE", 3);
        f421965e = textStyle4;
        TextStyle textStyle5 = new TextStyle("NARROW", 4);
        f421966f = textStyle5;
        TextStyle textStyle6 = new TextStyle("NARROW_STANDALONE", 5);
        f421967g = textStyle6;
        f421968h = new TextStyle[]{textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6};
    }

    public TextStyle() {
        throw null;
    }

    public static TextStyle valueOf(String str) {
        return (TextStyle) Enum.valueOf(TextStyle.class, str);
    }

    public static TextStyle[] values() {
        return (TextStyle[]) f421968h.clone();
    }
}
