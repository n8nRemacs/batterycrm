package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* renamed from: com.airbnb.lottie.parser.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27297a {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f59935a = JsonReader.a.a("k", "x", "y");

    public static com.airbnb.lottie.model.animatable.e a(JsonReader jsonReader, C27291k c27291k) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.n() == JsonReader.Token.f59968b) {
            jsonReader.a();
            while (jsonReader.f()) {
                arrayList.add(new com.airbnb.lottie.animation.keyframe.i(c27291k, t.b(jsonReader, c27291k, com.airbnb.lottie.utils.k.c(), A.f59920a, jsonReader.n() == JsonReader.Token.f59970d, false)));
            }
            jsonReader.c();
            u.b(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.value.a(s.b(jsonReader, com.airbnb.lottie.utils.k.c())));
        }
        return new com.airbnb.lottie.model.animatable.e(arrayList);
    }

    public static com.airbnb.lottie.model.animatable.o<PointF, PointF> b(JsonReader jsonReader, C27291k c27291k) {
        jsonReader.b();
        com.airbnb.lottie.model.animatable.e eVarA = null;
        com.airbnb.lottie.model.animatable.b bVarB = null;
        boolean z12 = false;
        com.airbnb.lottie.model.animatable.b bVarB2 = null;
        while (jsonReader.n() != JsonReader.Token.f59971e) {
            int iP2 = jsonReader.p(f59935a);
            if (iP2 != 0) {
                JsonReader.Token token = JsonReader.Token.f59973g;
                if (iP2 != 1) {
                    if (iP2 != 2) {
                        jsonReader.q();
                        jsonReader.u();
                    } else if (jsonReader.n() == token) {
                        jsonReader.u();
                        z12 = true;
                    } else {
                        bVarB = C27300d.b(jsonReader, c27291k, true);
                    }
                } else if (jsonReader.n() == token) {
                    jsonReader.u();
                    z12 = true;
                } else {
                    bVarB2 = C27300d.b(jsonReader, c27291k, true);
                }
            } else {
                eVarA = a(jsonReader, c27291k);
            }
        }
        jsonReader.d();
        if (z12) {
            c27291k.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new com.airbnb.lottie.model.animatable.i(bVarB2, bVarB);
    }
}
