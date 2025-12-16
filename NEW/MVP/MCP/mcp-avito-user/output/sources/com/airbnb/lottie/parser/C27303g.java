package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: ColorParser.java */
/* renamed from: com.airbnb.lottie.parser.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27303g implements N<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final C27303g f59944a = new C27303g();

    @Override // com.airbnb.lottie.parser.N
    public final Integer a(JsonReader jsonReader, float f12) {
        boolean z12 = jsonReader.n() == JsonReader.Token.f59968b;
        if (z12) {
            jsonReader.a();
        }
        double dH2 = jsonReader.h();
        double dH3 = jsonReader.h();
        double dH4 = jsonReader.h();
        double dH5 = jsonReader.n() == JsonReader.Token.f59974h ? jsonReader.h() : 1.0d;
        if (z12) {
            jsonReader.c();
        }
        if (dH2 <= 1.0d && dH3 <= 1.0d && dH4 <= 1.0d) {
            dH2 *= 255.0d;
            dH3 *= 255.0d;
            dH4 *= 255.0d;
            if (dH5 <= 1.0d) {
                dH5 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dH5, (int) dH2, (int) dH3, (int) dH4));
    }
}
