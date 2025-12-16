package com.yandex.mobile.ads.impl;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

/* loaded from: classes8.dex */
public final class oi {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f388552a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f388553b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f388554c = Charset.forName(Constants.ENCODING);

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f388555d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f388556e;

    static {
        Charset.forName("UTF-16BE");
        f388555d = Charset.forName("UTF-16LE");
        f388556e = Charset.forName("UTF-16");
    }
}
