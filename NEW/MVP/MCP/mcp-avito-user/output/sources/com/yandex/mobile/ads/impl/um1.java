package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.ih0;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes8.dex */
final class um1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f390600a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f390601b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f390602c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @j.P
    public static ih0 a(String str) {
        try {
            return b(str);
        } catch (tr0 | NumberFormatException | XmlPullParserException unused) {
            ka0.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @j.P
    private static ih0 b(String str) throws XmlPullParserException, IOException, NumberFormatException {
        long j12;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!tm1.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw tr0.a("Couldn't find xmp metadata", (Exception) null);
        }
        com.yandex.mobile.ads.embedded.guava.collect.p<ih0.a> pVarI = com.yandex.mobile.ads.embedded.guava.collect.p.i();
        long j13 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (tm1.c(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f390600a;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i13 >= 4) {
                        break loop0;
                    }
                    String strA = tm1.a(xmlPullParserNewPullParser, strArr[i13]);
                    if (strA == null) {
                        i13++;
                    } else if (Integer.parseInt(strA) == 1) {
                        String[] strArr2 = f390601b;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= 4) {
                                break;
                            }
                            String strA2 = tm1.a(xmlPullParserNewPullParser, strArr2[i14]);
                            if (strA2 != null) {
                                j12 = Long.parseLong(strA2);
                                if (j12 == -1) {
                                    break;
                                }
                            } else {
                                i14++;
                            }
                        }
                        j12 = -9223372036854775807L;
                        String[] strArr3 = f390602c;
                        while (true) {
                            if (i12 >= 2) {
                                pVarI = com.yandex.mobile.ads.embedded.guava.collect.p.i();
                                break;
                            }
                            String strA3 = tm1.a(xmlPullParserNewPullParser, strArr3[i12]);
                            if (strA3 != null) {
                                pVarI = com.yandex.mobile.ads.embedded.guava.collect.p.a(new ih0.a("image/jpeg", 0L, 0L), new ih0.a("video/mp4", Long.parseLong(strA3), 0L));
                                break;
                            }
                            i12++;
                        }
                        j13 = j12;
                    }
                }
                return null;
            }
            if (tm1.c(xmlPullParserNewPullParser, "Container:Directory")) {
                pVarI = a(xmlPullParserNewPullParser, "Container", "Item");
            } else if (tm1.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                pVarI = a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!tm1.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (pVarI.isEmpty()) {
            return null;
        }
        return new ih0(j13, pVarI);
    }

    private static com.yandex.mobile.ads.embedded.guava.collect.p<ih0.a> a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i12 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c;
        p.a aVar = new p.a();
        String strA = up1.a(str, ":Item");
        String strA2 = up1.a(str, ":Directory");
        do {
            xmlPullParser.next();
            if (tm1.c(xmlPullParser, strA)) {
                String strA3 = up1.a(str2, ":Mime");
                String strA4 = up1.a(str2, ":Semantic");
                String strA5 = up1.a(str2, ":Length");
                String strA6 = up1.a(str2, ":Padding");
                String strA7 = tm1.a(xmlPullParser, strA3);
                String strA8 = tm1.a(xmlPullParser, strA4);
                String strA9 = tm1.a(xmlPullParser, strA5);
                String strA10 = tm1.a(xmlPullParser, strA6);
                if (strA7 != null && strA8 != null) {
                    aVar.b(new ih0.a(strA7, strA9 != null ? Long.parseLong(strA9) : 0L, strA10 != null ? Long.parseLong(strA10) : 0L));
                } else {
                    return com.yandex.mobile.ads.embedded.guava.collect.p.i();
                }
            }
        } while (!tm1.b(xmlPullParser, strA2));
        return aVar.a();
    }
}
