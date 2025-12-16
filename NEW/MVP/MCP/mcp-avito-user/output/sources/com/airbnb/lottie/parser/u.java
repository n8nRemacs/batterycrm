package com.airbnb.lottie.parser;

import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* compiled from: KeyframesParser.java */
/* loaded from: classes10.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f60033a = JsonReader.a.a("k");

    public static ArrayList a(JsonReader jsonReader, C27291k c27291k, float f12, N n12, boolean z12) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.n() == JsonReader.Token.f59973g) {
            c27291k.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.b();
        while (jsonReader.f()) {
            if (jsonReader.p(f60033a) != 0) {
                jsonReader.u();
            } else if (jsonReader.n() == JsonReader.Token.f59968b) {
                jsonReader.a();
                if (jsonReader.n() == JsonReader.Token.f59974h) {
                    arrayList.add(t.b(jsonReader, c27291k, f12, n12, false, z12));
                } else {
                    while (jsonReader.f()) {
                        arrayList.add(t.b(jsonReader, c27291k, f12, n12, true, z12));
                    }
                }
                jsonReader.c();
            } else {
                arrayList.add(t.b(jsonReader, c27291k, f12, n12, false, z12));
            }
        }
        jsonReader.d();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i12;
        T t12;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            i12 = size - 1;
            if (i13 >= i12) {
                break;
            }
            com.airbnb.lottie.value.a aVar = (com.airbnb.lottie.value.a) arrayList.get(i13);
            i13++;
            com.airbnb.lottie.value.a aVar2 = (com.airbnb.lottie.value.a) arrayList.get(i13);
            aVar.f60140h = Float.valueOf(aVar2.f60139g);
            if (aVar.f60135c == 0 && (t12 = aVar2.f60134b) != 0) {
                aVar.f60135c = t12;
                if (aVar instanceof com.airbnb.lottie.animation.keyframe.i) {
                    ((com.airbnb.lottie.animation.keyframe.i) aVar).d();
                }
            }
        }
        com.airbnb.lottie.value.a aVar3 = (com.airbnb.lottie.value.a) arrayList.get(i12);
        if ((aVar3.f60134b == 0 || aVar3.f60135c == 0) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
