package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: DocumentDataParser.java */
/* renamed from: com.airbnb.lottie.parser.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27305i implements N<DocumentData> {

    /* renamed from: a, reason: collision with root package name */
    public static final C27305i f59946a = new C27305i();

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f59947b = JsonReader.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // com.airbnb.lottie.parser.N
    public final DocumentData a(JsonReader jsonReader, float f12) {
        boolean z12;
        int i12;
        DocumentData.Justification justification = DocumentData.Justification.f59629b;
        jsonReader.b();
        String strK = null;
        DocumentData.Justification justification2 = justification;
        float fH2 = 0.0f;
        float fH3 = 0.0f;
        float fH4 = 0.0f;
        float fH5 = 0.0f;
        int i13 = 0;
        int iA2 = 0;
        int iA3 = 0;
        boolean zG2 = true;
        String strK2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (jsonReader.f()) {
            switch (jsonReader.p(f59947b)) {
                case 0:
                    z12 = zG2;
                    strK = jsonReader.k();
                    zG2 = z12;
                    break;
                case 1:
                    z12 = zG2;
                    strK2 = jsonReader.k();
                    zG2 = z12;
                    break;
                case 2:
                    z12 = zG2;
                    fH2 = (float) jsonReader.h();
                    zG2 = z12;
                    break;
                case 3:
                    z12 = zG2;
                    i12 = iA3;
                    int i14 = jsonReader.i();
                    justification2 = (i14 > 2 || i14 < 0) ? justification : DocumentData.Justification.values()[i14];
                    iA3 = i12;
                    zG2 = z12;
                    break;
                case 4:
                    z12 = zG2;
                    i13 = jsonReader.i();
                    zG2 = z12;
                    break;
                case 5:
                    z12 = zG2;
                    fH3 = (float) jsonReader.h();
                    zG2 = z12;
                    break;
                case 6:
                    z12 = zG2;
                    fH4 = (float) jsonReader.h();
                    zG2 = z12;
                    break;
                case 7:
                    z12 = zG2;
                    iA2 = s.a(jsonReader);
                    zG2 = z12;
                    break;
                case 8:
                    iA3 = s.a(jsonReader);
                    break;
                case 9:
                    z12 = zG2;
                    fH5 = (float) jsonReader.h();
                    zG2 = z12;
                    break;
                case 10:
                    zG2 = jsonReader.g();
                    iA3 = iA3;
                    break;
                case 11:
                    z12 = zG2;
                    jsonReader.a();
                    i12 = iA3;
                    pointF = new PointF(((float) jsonReader.h()) * f12, ((float) jsonReader.h()) * f12);
                    jsonReader.c();
                    iA3 = i12;
                    zG2 = z12;
                    break;
                case 12:
                    jsonReader.a();
                    z12 = zG2;
                    pointF2 = new PointF(((float) jsonReader.h()) * f12, ((float) jsonReader.h()) * f12);
                    jsonReader.c();
                    iA3 = iA3;
                    zG2 = z12;
                    break;
                default:
                    jsonReader.q();
                    jsonReader.u();
                    break;
            }
        }
        jsonReader.d();
        DocumentData documentData = new DocumentData();
        documentData.f59616a = strK;
        documentData.f59617b = strK2;
        documentData.f59618c = fH2;
        documentData.f59619d = justification2;
        documentData.f59620e = i13;
        documentData.f59621f = fH3;
        documentData.f59622g = fH4;
        documentData.f59623h = iA2;
        documentData.f59624i = iA3;
        documentData.f59625j = fH5;
        documentData.f59626k = zG2;
        documentData.f59627l = pointF;
        documentData.f59628m = pointF2;
        return documentData;
    }
}
