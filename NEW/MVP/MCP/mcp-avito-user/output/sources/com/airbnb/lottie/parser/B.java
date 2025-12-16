package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: PointFParser.java */
/* loaded from: classes10.dex */
public class B implements N<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final B f59921a = new B();

    @Override // com.airbnb.lottie.parser.N
    public final PointF a(JsonReader jsonReader, float f12) {
        JsonReader.Token tokenN = jsonReader.n();
        if (tokenN == JsonReader.Token.f59968b) {
            return s.b(jsonReader, f12);
        }
        if (tokenN == JsonReader.Token.f59970d) {
            return s.b(jsonReader, f12);
        }
        if (tokenN != JsonReader.Token.f59974h) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenN);
        }
        PointF pointF = new PointF(((float) jsonReader.h()) * f12, ((float) jsonReader.h()) * f12);
        while (jsonReader.f()) {
            jsonReader.u();
        }
        return pointF;
    }
}
