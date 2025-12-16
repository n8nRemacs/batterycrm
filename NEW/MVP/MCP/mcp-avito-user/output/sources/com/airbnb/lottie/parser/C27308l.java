package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: FloatParser.java */
/* renamed from: com.airbnb.lottie.parser.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27308l implements N<Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final C27308l f59960a = new C27308l();

    @Override // com.airbnb.lottie.parser.N
    public final Float a(JsonReader jsonReader, float f12) {
        return Float.valueOf(s.d(jsonReader) * f12);
    }
}
