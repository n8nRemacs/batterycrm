package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes10.dex */
public class G implements N<com.airbnb.lottie.value.k> {

    /* renamed from: a, reason: collision with root package name */
    public static final G f59926a = new G();

    @Override // com.airbnb.lottie.parser.N
    public final com.airbnb.lottie.value.k a(JsonReader jsonReader, float f12) {
        boolean z12 = jsonReader.n() == JsonReader.Token.f59968b;
        if (z12) {
            jsonReader.a();
        }
        float fH2 = (float) jsonReader.h();
        float fH3 = (float) jsonReader.h();
        while (jsonReader.f()) {
            jsonReader.u();
        }
        if (z12) {
            jsonReader.c();
        }
        return new com.airbnb.lottie.value.k((fH2 / 100.0f) * f12, (fH3 / 100.0f) * f12);
    }
}
