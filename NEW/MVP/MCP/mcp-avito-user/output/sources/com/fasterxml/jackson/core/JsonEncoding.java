package com.fasterxml.jackson.core;

import com.adjust.sdk.Constants;

/* loaded from: classes3.dex */
public enum JsonEncoding {
    f341013e("UTF8", Constants.ENCODING, false),
    f341014f("UTF16_BE", "UTF-16BE", true),
    f341015g("UTF16_LE", "UTF-16LE", false),
    f341016h("UTF32_BE", "UTF-32BE", true),
    f341017i("UTF32_LE", "UTF-32LE", false);


    /* renamed from: b, reason: collision with root package name */
    public final String f341019b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f341020c;

    /* renamed from: d, reason: collision with root package name */
    public final int f341021d;

    JsonEncoding(String str, String str2, boolean z12) {
        this.f341019b = str2;
        this.f341020c = z12;
        this.f341021d = i;
    }
}
