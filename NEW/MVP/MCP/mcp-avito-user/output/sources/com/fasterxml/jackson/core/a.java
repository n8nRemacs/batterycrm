package com.fasterxml.jackson.core;

/* compiled from: Base64Variants.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Base64Variant f341118a;

    /* renamed from: b, reason: collision with root package name */
    public static final Base64Variant f341119b;

    /* renamed from: c, reason: collision with root package name */
    public static final Base64Variant f341120c;

    /* renamed from: d, reason: collision with root package name */
    public static final Base64Variant f341121d;

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f341118a = base64Variant;
        f341119b = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", true, '=', base64Variant.f341009i, Integer.MAX_VALUE);
        f341120c = new Base64Variant(base64Variant, "PEM", true, '=', base64Variant.f341009i, 64);
        StringBuilder sb2 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb2.setCharAt(sb2.indexOf("+"), '-');
        sb2.setCharAt(sb2.indexOf("/"), '_');
        f341121d = new Base64Variant("MODIFIED-FOR-URL", sb2.toString(), false, (char) 0, Integer.MAX_VALUE);
    }
}
