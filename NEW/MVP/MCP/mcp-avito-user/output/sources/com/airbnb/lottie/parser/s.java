package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import j.InterfaceC42156l;
import java.util.ArrayList;

/* compiled from: JsonUtils.java */
/* loaded from: classes10.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f60027a = JsonReader.a.a("x", "y");

    /* compiled from: JsonUtils.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60028a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f60028a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60028a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60028a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @InterfaceC42156l
    public static int a(JsonReader jsonReader) {
        jsonReader.a();
        int iH2 = (int) (jsonReader.h() * 255.0d);
        int iH3 = (int) (jsonReader.h() * 255.0d);
        int iH4 = (int) (jsonReader.h() * 255.0d);
        while (jsonReader.f()) {
            jsonReader.u();
        }
        jsonReader.c();
        return Color.argb(255, iH2, iH3, iH4);
    }

    public static PointF b(JsonReader jsonReader, float f12) {
        int iOrdinal = jsonReader.n().ordinal();
        if (iOrdinal == 0) {
            jsonReader.a();
            float fH2 = (float) jsonReader.h();
            float fH3 = (float) jsonReader.h();
            while (jsonReader.n() != JsonReader.Token.f59969c) {
                jsonReader.u();
            }
            jsonReader.c();
            return new PointF(fH2 * f12, fH3 * f12);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.n());
            }
            float fH4 = (float) jsonReader.h();
            float fH5 = (float) jsonReader.h();
            while (jsonReader.f()) {
                jsonReader.u();
            }
            return new PointF(fH4 * f12, fH5 * f12);
        }
        jsonReader.b();
        float fD2 = 0.0f;
        float fD3 = 0.0f;
        while (jsonReader.f()) {
            int iP2 = jsonReader.p(f60027a);
            if (iP2 == 0) {
                fD2 = d(jsonReader);
            } else if (iP2 != 1) {
                jsonReader.q();
                jsonReader.u();
            } else {
                fD3 = d(jsonReader);
            }
        }
        jsonReader.d();
        return new PointF(fD2 * f12, fD3 * f12);
    }

    public static ArrayList c(JsonReader jsonReader, float f12) {
        ArrayList arrayList = new ArrayList();
        jsonReader.a();
        while (jsonReader.n() == JsonReader.Token.f59968b) {
            jsonReader.a();
            arrayList.add(b(jsonReader, f12));
            jsonReader.c();
        }
        jsonReader.c();
        return arrayList;
    }

    public static float d(JsonReader jsonReader) {
        JsonReader.Token tokenN = jsonReader.n();
        int iOrdinal = tokenN.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) jsonReader.h();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + tokenN);
        }
        jsonReader.a();
        float fH2 = (float) jsonReader.h();
        while (jsonReader.f()) {
            jsonReader.u();
        }
        jsonReader.c();
        return fH2;
    }
}
