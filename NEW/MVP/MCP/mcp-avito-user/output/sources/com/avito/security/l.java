package com.avito.security;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f338590a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f338591b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f338592c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f338593d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f338594e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f338595f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f338596g = new l();

    static {
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        y0.a((Object) charsetForName, "Charset.forName(\"UTF-8\")");
        f338590a = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        y0.a((Object) charsetForName2, "Charset.forName(\"UTF-16\")");
        f338591b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        y0.a((Object) charsetForName3, "Charset.forName(\"UTF-16BE\")");
        f338592c = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        y0.a((Object) charsetForName4, "Charset.forName(\"UTF-16LE\")");
        f338593d = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        y0.a((Object) charsetForName5, "Charset.forName(\"US-ASCII\")");
        f338594e = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        y0.a((Object) charsetForName6, "Charset.forName(\"ISO-8859-1\")");
        f338595f = charsetForName6;
    }

    private l() {
    }
}
