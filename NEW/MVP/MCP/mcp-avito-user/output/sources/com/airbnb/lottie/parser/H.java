package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ShapeDataParser.java */
/* loaded from: classes10.dex */
public class H implements N<com.airbnb.lottie.model.content.j> {

    /* renamed from: a, reason: collision with root package name */
    public static final H f59927a = new H();

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f59928b = JsonReader.a.a("c", "v", "i", "o");

    @Override // com.airbnb.lottie.parser.N
    public final com.airbnb.lottie.model.content.j a(JsonReader jsonReader, float f12) {
        if (jsonReader.n() == JsonReader.Token.f59968b) {
            jsonReader.a();
        }
        jsonReader.b();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zG2 = false;
        while (jsonReader.f()) {
            int iP2 = jsonReader.p(f59928b);
            if (iP2 == 0) {
                zG2 = jsonReader.g();
            } else if (iP2 == 1) {
                arrayListC = s.c(jsonReader, f12);
            } else if (iP2 == 2) {
                arrayListC2 = s.c(jsonReader, f12);
            } else if (iP2 != 3) {
                jsonReader.q();
                jsonReader.u();
            } else {
                arrayListC3 = s.c(jsonReader, f12);
            }
        }
        jsonReader.d();
        if (jsonReader.n() == JsonReader.Token.f59969c) {
            jsonReader.c();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new com.airbnb.lottie.model.content.j(new PointF(), false, Collections.emptyList());
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i12 = 1; i12 < size; i12++) {
            PointF pointF2 = (PointF) arrayListC.get(i12);
            int i13 = i12 - 1;
            arrayList.add(new O2.a(com.airbnb.lottie.utils.j.a((PointF) arrayListC.get(i13), (PointF) arrayListC3.get(i13)), com.airbnb.lottie.utils.j.a(pointF2, (PointF) arrayListC2.get(i12)), pointF2));
        }
        if (zG2) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i14 = size - 1;
            arrayList.add(new O2.a(com.airbnb.lottie.utils.j.a((PointF) arrayListC.get(i14), (PointF) arrayListC3.get(i14)), com.airbnb.lottie.utils.j.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.model.content.j(pointF, zG2, arrayList);
    }
}
