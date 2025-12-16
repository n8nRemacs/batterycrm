package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.C20204c0;
import androidx.collection.q1;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes10.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f60038a = JsonReader.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f60039b = JsonReader.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final JsonReader.a f60040c = JsonReader.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    public static final JsonReader.a f60041d = JsonReader.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static C27291k a(JsonReader jsonReader) throws NumberFormatException {
        float f12;
        ArrayList arrayList;
        float f13;
        int i12;
        float f14;
        int i13;
        float f15;
        int i14;
        float f16;
        int i15;
        float f17;
        ArrayList arrayList2;
        float fC2 = com.airbnb.lottie.utils.k.c();
        C20204c0<Layer> c20204c0 = new C20204c0<>();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        q1<O2.c> q1Var = new q1<>();
        C27291k c27291k = new C27291k();
        jsonReader.b();
        float fH2 = 0.0f;
        int iH2 = 0;
        int iH3 = 0;
        float fH3 = 0.0f;
        float fH4 = 0.0f;
        while (jsonReader.f()) {
            switch (jsonReader.p(f60038a)) {
                case 0:
                    f17 = fC2;
                    arrayList2 = arrayList4;
                    iH2 = (int) jsonReader.h();
                    fC2 = f17;
                    arrayList4 = arrayList2;
                    break;
                case 1:
                    f17 = fC2;
                    arrayList2 = arrayList4;
                    iH3 = (int) jsonReader.h();
                    fC2 = f17;
                    arrayList4 = arrayList2;
                    break;
                case 2:
                    f17 = fC2;
                    arrayList2 = arrayList4;
                    fH3 = (float) jsonReader.h();
                    fC2 = f17;
                    arrayList4 = arrayList2;
                    break;
                case 3:
                    f17 = fC2;
                    arrayList2 = arrayList4;
                    fH2 = ((float) jsonReader.h()) - 0.01f;
                    fC2 = f17;
                    arrayList4 = arrayList2;
                    break;
                case 4:
                    f17 = fC2;
                    arrayList2 = arrayList4;
                    fH4 = (float) jsonReader.h();
                    fC2 = f17;
                    arrayList4 = arrayList2;
                    break;
                case 5:
                    f12 = fC2;
                    arrayList = arrayList4;
                    f13 = fH2;
                    i12 = iH3;
                    f14 = fH3;
                    String[] strArrSplit = jsonReader.k().split("\\.");
                    int i16 = Integer.parseInt(strArrSplit[0]);
                    int i17 = Integer.parseInt(strArrSplit[1]);
                    int i18 = Integer.parseInt(strArrSplit[2]);
                    if (i16 < 4 || (i16 <= 4 && (i17 < 4 || (i17 <= 4 && i18 < 0)))) {
                        c27291k.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fC2 = f12;
                    fH3 = f14;
                    arrayList4 = arrayList;
                    fH2 = f13;
                    iH3 = i12;
                    break;
                case 6:
                    f12 = fC2;
                    arrayList = arrayList4;
                    f13 = fH2;
                    i12 = iH3;
                    f14 = fH3;
                    jsonReader.a();
                    int i19 = 0;
                    while (jsonReader.f()) {
                        Layer layerA = v.a(jsonReader, c27291k);
                        if (layerA.f59778e == Layer.LayerType.f59800c) {
                            i19++;
                        }
                        arrayList3.add(layerA);
                        c20204c0.l(layerA.f59777d, layerA);
                        if (i19 > 4) {
                            com.airbnb.lottie.utils.e.b("You have " + i19 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    jsonReader.c();
                    fC2 = f12;
                    fH3 = f14;
                    arrayList4 = arrayList;
                    fH2 = f13;
                    iH3 = i12;
                    break;
                case 7:
                    arrayList = arrayList4;
                    f13 = fH2;
                    int i22 = iH3;
                    f14 = fH3;
                    jsonReader.a();
                    while (jsonReader.f()) {
                        ArrayList arrayList5 = new ArrayList();
                        C20204c0 c20204c02 = new C20204c0();
                        jsonReader.b();
                        String strK = null;
                        String strK2 = null;
                        String strK3 = null;
                        int i23 = 0;
                        int i24 = 0;
                        while (jsonReader.f()) {
                            int iP2 = jsonReader.p(f60039b);
                            if (iP2 != 0) {
                                if (iP2 == 1) {
                                    jsonReader.a();
                                    while (jsonReader.f()) {
                                        Layer layerA2 = v.a(jsonReader, c27291k);
                                        c20204c02.l(layerA2.f59777d, layerA2);
                                        arrayList5.add(layerA2);
                                        fC2 = fC2;
                                        i22 = i22;
                                    }
                                    i13 = i22;
                                    f15 = fC2;
                                    jsonReader.c();
                                } else if (iP2 == 2) {
                                    i23 = jsonReader.i();
                                } else if (iP2 == 3) {
                                    i24 = jsonReader.i();
                                } else if (iP2 == 4) {
                                    strK2 = jsonReader.k();
                                } else if (iP2 != 5) {
                                    jsonReader.q();
                                    jsonReader.u();
                                    i13 = i22;
                                    f15 = fC2;
                                } else {
                                    strK3 = jsonReader.k();
                                }
                                fC2 = f15;
                                i22 = i13;
                            } else {
                                strK = jsonReader.k();
                            }
                        }
                        int i25 = i22;
                        float f18 = fC2;
                        jsonReader.d();
                        if (strK2 != null) {
                            map2.put(strK, new com.airbnb.lottie.D(i23, i24, strK, strK2, strK3));
                        } else {
                            map.put(strK, arrayList5);
                        }
                        fC2 = f18;
                        i22 = i25;
                    }
                    i12 = i22;
                    f12 = fC2;
                    jsonReader.c();
                    fC2 = f12;
                    fH3 = f14;
                    arrayList4 = arrayList;
                    fH2 = f13;
                    iH3 = i12;
                    break;
                case 8:
                    f13 = fH2;
                    int i26 = iH3;
                    f14 = fH3;
                    jsonReader.b();
                    while (jsonReader.f()) {
                        if (jsonReader.p(f60040c) != 0) {
                            jsonReader.q();
                            jsonReader.u();
                        } else {
                            jsonReader.a();
                            while (jsonReader.f()) {
                                JsonReader.a aVar = C27310n.f60019a;
                                jsonReader.b();
                                String strK4 = null;
                                String strK5 = null;
                                String strK6 = null;
                                while (jsonReader.f()) {
                                    int iP3 = jsonReader.p(C27310n.f60019a);
                                    if (iP3 != 0) {
                                        ArrayList arrayList6 = arrayList4;
                                        if (iP3 == 1) {
                                            strK5 = jsonReader.k();
                                        } else if (iP3 == 2) {
                                            strK6 = jsonReader.k();
                                        } else if (iP3 != 3) {
                                            jsonReader.q();
                                            jsonReader.u();
                                        } else {
                                            jsonReader.h();
                                        }
                                        arrayList4 = arrayList6;
                                    } else {
                                        strK4 = jsonReader.k();
                                    }
                                }
                                jsonReader.d();
                                map3.put(strK5, new O2.b(strK4, strK5, strK6));
                                arrayList4 = arrayList4;
                            }
                            jsonReader.c();
                        }
                    }
                    arrayList = arrayList4;
                    jsonReader.d();
                    i12 = i26;
                    f12 = fC2;
                    fC2 = f12;
                    fH3 = f14;
                    arrayList4 = arrayList;
                    fH2 = f13;
                    iH3 = i12;
                    break;
                case 9:
                    f13 = fH2;
                    i14 = iH3;
                    f14 = fH3;
                    jsonReader.a();
                    while (jsonReader.f()) {
                        JsonReader.a aVar2 = C27309m.f59961a;
                        ArrayList arrayList7 = new ArrayList();
                        jsonReader.b();
                        double dH2 = 0.0d;
                        String strK7 = null;
                        String strK8 = null;
                        char cCharAt = 0;
                        while (jsonReader.f()) {
                            int iP4 = jsonReader.p(C27309m.f59961a);
                            if (iP4 == 0) {
                                cCharAt = jsonReader.k().charAt(0);
                            } else if (iP4 == 1) {
                                jsonReader.h();
                            } else if (iP4 == 2) {
                                dH2 = jsonReader.h();
                            } else if (iP4 == 3) {
                                strK7 = jsonReader.k();
                            } else if (iP4 == 4) {
                                strK8 = jsonReader.k();
                            } else if (iP4 != 5) {
                                jsonReader.q();
                                jsonReader.u();
                            } else {
                                jsonReader.b();
                                while (jsonReader.f()) {
                                    if (jsonReader.p(C27309m.f59962b) != 0) {
                                        jsonReader.q();
                                        jsonReader.u();
                                    } else {
                                        jsonReader.a();
                                        while (jsonReader.f()) {
                                            arrayList7.add((com.airbnb.lottie.model.content.l) C27304h.a(jsonReader, c27291k));
                                        }
                                        jsonReader.c();
                                    }
                                }
                                jsonReader.d();
                            }
                        }
                        jsonReader.d();
                        O2.c cVar = new O2.c(arrayList7, cCharAt, dH2, strK7, strK8);
                        q1Var.i(cVar.hashCode(), cVar);
                    }
                    jsonReader.c();
                    i12 = i14;
                    f12 = fC2;
                    arrayList = arrayList4;
                    fC2 = f12;
                    fH3 = f14;
                    arrayList4 = arrayList;
                    fH2 = f13;
                    iH3 = i12;
                    break;
                case 10:
                    jsonReader.a();
                    while (jsonReader.f()) {
                        jsonReader.b();
                        String strK9 = null;
                        float fH5 = 0.0f;
                        float fH6 = 0.0f;
                        while (jsonReader.f()) {
                            int iP5 = jsonReader.p(f60041d);
                            if (iP5 != 0) {
                                f16 = fH2;
                                if (iP5 == 1) {
                                    i15 = iH3;
                                    fH3 = fH3;
                                    fH5 = (float) jsonReader.h();
                                } else if (iP5 != 2) {
                                    jsonReader.q();
                                    jsonReader.u();
                                } else {
                                    i15 = iH3;
                                    fH3 = fH3;
                                    fH6 = (float) jsonReader.h();
                                }
                                fH2 = f16;
                                iH3 = i15;
                            } else {
                                f16 = fH2;
                                strK9 = jsonReader.k();
                            }
                            fH2 = f16;
                        }
                        jsonReader.d();
                        arrayList4.add(new O2.g(strK9, fH5, fH6));
                        iH3 = iH3;
                        fH3 = fH3;
                        fH2 = fH2;
                    }
                    f13 = fH2;
                    i14 = iH3;
                    f14 = fH3;
                    jsonReader.c();
                    i12 = i14;
                    f12 = fC2;
                    arrayList = arrayList4;
                    fC2 = f12;
                    fH3 = f14;
                    arrayList4 = arrayList;
                    fH2 = f13;
                    iH3 = i12;
                    break;
                default:
                    jsonReader.q();
                    jsonReader.u();
                    f12 = fC2;
                    arrayList = arrayList4;
                    f13 = fH2;
                    i12 = iH3;
                    f14 = fH3;
                    fC2 = f12;
                    fH3 = f14;
                    arrayList4 = arrayList;
                    fH2 = f13;
                    iH3 = i12;
                    break;
            }
        }
        float f19 = fC2;
        Rect rect = new Rect(0, 0, (int) (iH2 * f19), (int) (iH3 * f19));
        float fC3 = com.airbnb.lottie.utils.k.c();
        c27291k.f59592k = rect;
        c27291k.f59593l = fH3;
        c27291k.f59594m = fH2;
        c27291k.f59595n = fH4;
        c27291k.f59591j = arrayList3;
        c27291k.f59590i = c20204c0;
        c27291k.f59584c = map;
        c27291k.f59585d = map2;
        c27291k.f59586e = fC3;
        c27291k.f59589h = q1Var;
        c27291k.f59587f = map3;
        c27291k.f59588g = arrayList4;
        return c27291k;
    }
}
