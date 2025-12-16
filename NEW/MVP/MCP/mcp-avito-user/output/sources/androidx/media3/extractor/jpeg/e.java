package androidx.media3.extractor.jpeg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.N;
import androidx.media3.extractor.jpeg.b;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import j.P;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: XmpMotionPhotoDescriptionParser.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f50607a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f50608b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f50609c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @P
    public static b a(String str) throws XmlPullParserException, IOException, NumberFormatException {
        long j12;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!N.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a("Couldn't find xmp metadata", null);
        }
        AbstractC37401r1<b.a> abstractC37401r1C = AbstractC37401r1.C();
        long j13 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (N.c(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f50607a;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i13 >= 4) {
                        break loop0;
                    }
                    String strA = N.a(xmlPullParserNewPullParser, strArr[i13]);
                    if (strA == null) {
                        i13++;
                    } else if (Integer.parseInt(strA) == 1) {
                        String[] strArr2 = f50608b;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= 4) {
                                break;
                            }
                            String strA2 = N.a(xmlPullParserNewPullParser, strArr2[i14]);
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
                        String[] strArr3 = f50609c;
                        while (true) {
                            if (i12 >= 2) {
                                abstractC37401r1C = AbstractC37401r1.C();
                                break;
                            }
                            String strA3 = N.a(xmlPullParserNewPullParser, strArr3[i12]);
                            if (strA3 != null) {
                                abstractC37401r1C = AbstractC37401r1.I(new b.a("image/jpeg", 0L, 0L), new b.a("video/mp4", Long.parseLong(strA3), 0L));
                                break;
                            }
                            i12++;
                        }
                        j13 = j12;
                    }
                }
                return null;
            }
            if (N.c(xmlPullParserNewPullParser, "Container:Directory")) {
                abstractC37401r1C = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (N.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                abstractC37401r1C = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!N.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abstractC37401r1C.isEmpty()) {
            return null;
        }
        return new b(j13, abstractC37401r1C);
    }

    public static AbstractC37401r1<b.a> b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (N.c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = N.a(xmlPullParser, strConcat3);
                String strA2 = N.a(xmlPullParser, strConcat4);
                String strA3 = N.a(xmlPullParser, strConcat5);
                String strA4 = N.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return AbstractC37401r1.C();
                }
                aVar.g(new b.a(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!N.b(xmlPullParser, strConcat2));
        return aVar.i();
    }
}
