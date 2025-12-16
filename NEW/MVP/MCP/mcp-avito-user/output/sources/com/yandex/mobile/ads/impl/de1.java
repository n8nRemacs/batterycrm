package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.net.URL;

/* loaded from: classes8.dex */
public final class de1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f384588a;

    /* renamed from: b, reason: collision with root package name */
    private final URL f384589b;

    /* renamed from: c, reason: collision with root package name */
    private final String f384590c;

    private de1(String str, URL url, String str2) {
        this.f384588a = str;
        this.f384589b = url;
        this.f384590c = str2;
    }

    public static de1 a(URL url) {
        return new de1(null, url, null);
    }

    public final String b() {
        return this.f384588a;
    }

    public final String c() {
        return this.f384590c;
    }

    public final URL a() {
        return this.f384589b;
    }

    public static de1 a(String str, URL url, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                return new de1(str, url, str2);
            }
            throw new IllegalArgumentException("VerificationParameters is null or empty");
        }
        throw new IllegalArgumentException("VendorKey is null or empty");
    }
}
