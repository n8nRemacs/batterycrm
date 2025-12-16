package com.airbnb.lottie.parser;

import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: AnimatableValueParser.java */
/* renamed from: com.airbnb.lottie.parser.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27300d {
    public static com.airbnb.lottie.model.animatable.a a(JsonReader jsonReader, C27291k c27291k) {
        return new com.airbnb.lottie.model.animatable.a(u.a(jsonReader, c27291k, 1.0f, C27303g.f59944a, false));
    }

    public static com.airbnb.lottie.model.animatable.b b(JsonReader jsonReader, C27291k c27291k, boolean z12) {
        return new com.airbnb.lottie.model.animatable.b(u.a(jsonReader, c27291k, z12 ? com.airbnb.lottie.utils.k.c() : 1.0f, C27308l.f59960a, false));
    }

    public static com.airbnb.lottie.model.animatable.d c(JsonReader jsonReader, C27291k c27291k) {
        return new com.airbnb.lottie.model.animatable.d(u.a(jsonReader, c27291k, 1.0f, r.f60026a, false));
    }

    public static com.airbnb.lottie.model.animatable.f d(JsonReader jsonReader, C27291k c27291k) {
        return new com.airbnb.lottie.model.animatable.f(u.a(jsonReader, c27291k, com.airbnb.lottie.utils.k.c(), B.f59921a, true));
    }
}
