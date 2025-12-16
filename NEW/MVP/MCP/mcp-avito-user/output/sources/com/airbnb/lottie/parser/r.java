package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: IntegerParser.java */
/* loaded from: classes10.dex */
public class r implements N<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final r f60026a = new r();

    @Override // com.airbnb.lottie.parser.N
    public final Integer a(JsonReader jsonReader, float f12) {
        return Integer.valueOf(Math.round(s.d(jsonReader) * f12));
    }
}
