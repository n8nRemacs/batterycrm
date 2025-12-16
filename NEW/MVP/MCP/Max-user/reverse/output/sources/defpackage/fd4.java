package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.ParserException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public class fd4 extends DefaultHandler implements xmb {
    public final XmlPullParserFactory a;
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] o = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] X = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public fd4() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = zxg.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new eae(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093 A[PHI: r13
  0x0093: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:128:0x01a3, B:120:0x0190, B:47:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd4.c(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        return attributeValue == null ? j : "INF".equals(attributeValue) ? BuildConfig.MAX_TIME_TO_UPLOAD : (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!gti.g(xmlPullParser, "BaseURL"));
        if (text != null && moi.b(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return lqi.c(new kl0(text, i, i2, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            kl0 kl0Var = (kl0) arrayList.get(i3);
            String strD = moi.d(kl0Var.a, text);
            String str = attributeValue3 == null ? strD : attributeValue3;
            if (z) {
                i = kl0Var.c;
                i2 = kl0Var.d;
                str = kl0Var.b;
            }
            arrayList2.add(new kl0(strD, i, i2, str));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0162  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd4.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static ku4 h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!gti.g(xmlPullParser, str));
        return new ku4(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = zxg.e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d6 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    public static float j(XmlPullParser xmlPullParser, float f) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
            }
        }
        return f;
    }

    public static rnc n(XmlPullParser xmlPullParser) {
        String strNextText = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "moreInformationURL");
        String str = attributeValue == null ? null : attributeValue;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "lang");
        String str2 = attributeValue2 == null ? null : attributeValue2;
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (gti.i(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (gti.i(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (gti.i(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                b(xmlPullParser);
            }
            String str3 = strNextText2;
            String str4 = strNextText;
            String str5 = strNextText3;
            if (gti.g(xmlPullParser, "ProgramInformation")) {
                return new rnc(str4, str3, str5, str, str2);
            }
            strNextText = str4;
            strNextText2 = str3;
            strNextText3 = str5;
        }
    }

    public static r7d o(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return new r7d(j, j2, attributeValue);
    }

    public static int q(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int r(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (dsi.b("http://dashif.org/guidelines/trickmode", ((ku4) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static gae s(XmlPullParser xmlPullParser, gae gaeVar) throws XmlPullParserException, NumberFormatException, IOException {
        long j = gaeVar != null ? gaeVar.a : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j2 = j;
        long j3 = gaeVar != null ? gaeVar.b : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j3 = Long.parseLong(attributeValue2);
        }
        long j4 = j3;
        long j5 = gaeVar != null ? gaeVar.d : 0L;
        long j6 = gaeVar != null ? gaeVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j5 = Long.parseLong(strArrSplit[0]);
            j6 = (Long.parseLong(strArrSplit[1]) - j5) + 1;
        }
        long j7 = j6;
        long j8 = j5;
        r7d r7dVarO = gaeVar != null ? (r7d) gaeVar.c : null;
        while (true) {
            xmlPullParser.next();
            if (gti.i(xmlPullParser, "Initialization")) {
                r7dVarO = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            r7d r7dVar = r7dVarO;
            if (gti.g(xmlPullParser, "SegmentBase")) {
                return new gae(r7dVar, j2, j4, j8, j7);
            }
            r7dVarO = r7dVar;
        }
    }

    public static aae t(XmlPullParser xmlPullParser, aae aaeVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException, NumberFormatException {
        long j6 = aaeVar != null ? aaeVar.a : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = aaeVar != null ? aaeVar.b : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = aaeVar != null ? aaeVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = aaeVar != null ? aaeVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == -9223372036854775807L ? j3 : j4;
        long j15 = j14 == BuildConfig.MAX_TIME_TO_UPLOAD ? -9223372036854775807L : j14;
        r7d r7dVarO = null;
        List listV = null;
        do {
            xmlPullParser.next();
            if (gti.i(xmlPullParser, "Initialization")) {
                r7dVarO = o(xmlPullParser, "sourceURL", "range");
            } else if (gti.i(xmlPullParser, "SegmentTimeline")) {
                listV = v(xmlPullParser, j7, j2);
            } else if (gti.i(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!gti.g(xmlPullParser, "SegmentList"));
        if (aaeVar != null) {
            if (r7dVarO == null) {
                r7dVarO = (r7d) aaeVar.c;
            }
            if (listV == null) {
                listV = aaeVar.f;
            }
            if (arrayList == null) {
                arrayList = aaeVar.j;
            }
        }
        return new aae(r7dVarO, j7, j9, j13, j11, listV, j15, arrayList, zxg.U(j5), zxg.U(j));
    }

    public static cae u(XmlPullParser xmlPullParser, cae caeVar, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, NumberFormatException, IOException {
        long j6;
        long j7 = caeVar != null ? caeVar.a : 1L;
        r7d r7dVarO = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = caeVar != null ? caeVar.b : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = caeVar != null ? caeVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = caeVar != null ? caeVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            ku4 ku4Var = (ku4) list.get(i);
            if (dsi.b("http://dashif.org/guidelines/last-segment-number", ku4Var.a)) {
                j6 = Long.parseLong(ku4Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == -9223372036854775807L ? j3 : j4;
        long j17 = j16 == BuildConfig.MAX_TIME_TO_UPLOAD ? -9223372036854775807L : j16;
        jkc jkcVarX = x(xmlPullParser, "media", caeVar != null ? caeVar.k : null);
        jkc jkcVarX2 = x(xmlPullParser, "initialization", caeVar != null ? caeVar.j : null);
        List listV = null;
        do {
            xmlPullParser.next();
            if (gti.i(xmlPullParser, "Initialization")) {
                r7dVarO = o(xmlPullParser, "sourceURL", "range");
            } else if (gti.i(xmlPullParser, "SegmentTimeline")) {
                listV = v(xmlPullParser, j8, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!gti.g(xmlPullParser, "SegmentTemplate"));
        if (caeVar != null) {
            if (r7dVarO == null) {
                r7dVarO = (r7d) caeVar.c;
            }
            if (listV == null) {
                listV = caeVar.f;
            }
        }
        return new cae(r7dVarO, j8, j10, j14, j15, j12, listV, j17, jkcVarX2, jkcVarX, zxg.U(j5), zxg.U(j));
    }

    public static ArrayList v(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        long j3;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (gti.i(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j5 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i2 = i;
                    j3 = j5;
                    jA = a(arrayList, jA, j4, i2, j3);
                } else {
                    j3 = j5;
                }
                if (j3 != -9223372036854775807L) {
                    jA = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j4 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!gti.g(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = zxg.a;
            a(arrayList, jA, j4, i, zxg.e0(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public static wz8 w(XmlPullParser xmlPullParser) {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (gti.i(xmlPullParser, "Latency")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "target");
                j = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "min");
                j2 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "max");
                j3 = attributeValue3 == null ? -9223372036854775807L : Long.parseLong(attributeValue3);
            } else if (gti.i(xmlPullParser, "PlaybackRate")) {
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "min");
                f = attributeValue4 == null ? -3.4028235E38f : Float.parseFloat(attributeValue4);
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "max");
                f2 = attributeValue5 == null ? -3.4028235E38f : Float.parseFloat(attributeValue5);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (gti.g(xmlPullParser, "ServiceDescription")) {
                return new wz8(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00ff. Please report as an issue. */
    public static jkc x(XmlPullParser xmlPullParser, String str, jkc jkcVar) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return jkcVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add("");
                int i = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i);
                String strSubstring2 = attributeValue.substring(i, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new jkc(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01fe A[LOOP:1: B:44:0x00cd->B:103:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ad4 k(org.xmlpull.v1.XmlPullParser r40, android.net.Uri r41) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd4.k(org.xmlpull.v1.XmlPullParser, android.net.Uri):ad4");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Pair l(XmlPullParser xmlPullParser, ArrayList arrayList, long j, long j2, long j3, long j4, boolean z) {
        String str;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j5;
        ArrayList arrayList4;
        Object obj;
        long j6;
        long j7;
        long j8;
        long j9;
        ArrayList arrayList5;
        ByteArrayOutputStream byteArrayOutputStream;
        long j10;
        ArrayList arrayList6;
        long j11;
        ArrayList arrayList7;
        String str3;
        String str4;
        ArrayList arrayList8;
        int i;
        String str5;
        String str6;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        long j12;
        String str7;
        ArrayList arrayList12;
        int i2;
        String str8;
        long j13;
        int i3;
        ArrayList arrayList13;
        String str9;
        String str10;
        String str11;
        int i4;
        String str12;
        ArrayList arrayList14;
        long j14;
        ArrayList arrayList15;
        String str13;
        String str14;
        ArrayList arrayList16;
        ArrayList arrayList17;
        fd4 fd4Var;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList18;
        int i5;
        ArrayList arrayList19;
        ArrayList arrayList20;
        String str18;
        String str19;
        ArrayList arrayList21;
        ArrayList arrayList22;
        long j15;
        int i6;
        float f;
        int i7;
        String str20;
        boolean z2;
        long j16;
        ymd umdVar;
        String str21;
        ArrayList arrayList23;
        String str22;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        boolean z3 = z;
        Object obj2 = null;
        String str23 = "id";
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long jI = i(xmlPullParser2, "start", j);
        long j17 = -9223372036854775807L;
        long j18 = j3 != -9223372036854775807L ? j3 + jI : -9223372036854775807L;
        String str24 = "duration";
        long jI2 = i(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList24 = new ArrayList();
        ArrayList arrayList25 = new ArrayList();
        ArrayList arrayList26 = new ArrayList();
        long jD = j2;
        hae haeVarU = null;
        long j19 = -9223372036854775807L;
        boolean z4 = false;
        while (true) {
            xmlPullParser2.next();
            String str25 = "BaseURL";
            if (gti.i(xmlPullParser2, "BaseURL")) {
                if (!z4) {
                    jD = d(xmlPullParser2, jD);
                    z4 = true;
                }
                arrayList26.addAll(e(xmlPullParser2, arrayList, z3));
                obj = obj2;
                str = str23;
                j8 = j17;
                str2 = str24;
                arrayList4 = arrayList24;
                arrayList2 = arrayList25;
                arrayList3 = arrayList26;
                j7 = j18;
                j6 = jI2;
            } else {
                String str26 = "SegmentTemplate";
                String str27 = "SegmentList";
                if (gti.i(xmlPullParser2, "AdaptationSet")) {
                    ArrayList arrayList27 = !arrayList26.isEmpty() ? arrayList26 : arrayList;
                    String attributeValue2 = xmlPullParser2.getAttributeValue(null, str23);
                    long j20 = attributeValue2 == null ? -1L : Long.parseLong(attributeValue2);
                    int iG = g(xmlPullParser2);
                    String str28 = "SegmentBase";
                    String attributeValue3 = xmlPullParser2.getAttributeValue(null, "mimeType");
                    String attributeValue4 = xmlPullParser2.getAttributeValue(null, "codecs");
                    String str29 = str23;
                    String attributeValue5 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalCodecs");
                    String attributeValue6 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalProfiles");
                    String attributeValue7 = xmlPullParser2.getAttributeValue(null, "width");
                    int i8 = attributeValue7 == null ? -1 : Integer.parseInt(attributeValue7);
                    String attributeValue8 = xmlPullParser2.getAttributeValue(null, "height");
                    int i9 = attributeValue8 == null ? -1 : Integer.parseInt(attributeValue8);
                    float fJ = j(xmlPullParser2, -1.0f);
                    int i10 = i9;
                    String attributeValue9 = xmlPullParser2.getAttributeValue(null, "audioSamplingRate");
                    int i11 = attributeValue9 == null ? -1 : Integer.parseInt(attributeValue9);
                    String str30 = "lang";
                    String attributeValue10 = xmlPullParser2.getAttributeValue(null, "lang");
                    String attributeValue11 = xmlPullParser2.getAttributeValue(null, "label");
                    ArrayList arrayList28 = new ArrayList();
                    ArrayList arrayList29 = new ArrayList();
                    String str31 = attributeValue11;
                    ArrayList arrayList30 = new ArrayList();
                    ArrayList arrayList31 = new ArrayList();
                    String str32 = "AdaptationSet";
                    ArrayList arrayList32 = new ArrayList();
                    String str33 = str24;
                    ArrayList arrayList33 = new ArrayList();
                    ArrayList arrayList34 = arrayList24;
                    ArrayList arrayList35 = new ArrayList();
                    ArrayList arrayList36 = arrayList25;
                    ArrayList arrayList37 = new ArrayList();
                    ArrayList arrayList38 = new ArrayList();
                    j5 = jD;
                    int i12 = i8;
                    float f2 = fJ;
                    String str34 = attributeValue10;
                    boolean z5 = false;
                    hae haeVarU2 = haeVarU;
                    long j21 = j19;
                    int iC = -1;
                    ArrayList arrayList39 = arrayList26;
                    int iH = iG;
                    String str35 = null;
                    while (true) {
                        xmlPullParser2.next();
                        if (gti.i(xmlPullParser2, str25)) {
                            if (!z5) {
                                jD = d(xmlPullParser2, jD);
                                z5 = true;
                            }
                            long j22 = jD;
                            arrayList38.addAll(e(xmlPullParser2, arrayList27, z3));
                            ArrayList arrayList40 = arrayList28;
                            arrayList12 = arrayList27;
                            arrayList15 = arrayList40;
                            str12 = str26;
                            str3 = attributeValue6;
                            str9 = attributeValue4;
                            str13 = str30;
                            arrayList8 = arrayList29;
                            j7 = j18;
                            str = str29;
                            j13 = j21;
                            i = i11;
                            str5 = str31;
                            arrayList14 = arrayList30;
                            str2 = str33;
                            arrayList4 = arrayList34;
                            arrayList2 = arrayList36;
                            arrayList9 = arrayList31;
                            arrayList11 = arrayList35;
                            str7 = str25;
                            i3 = i12;
                            arrayList3 = arrayList39;
                            str14 = str32;
                            arrayList10 = arrayList33;
                            str8 = str34;
                            arrayList13 = arrayList32;
                            j6 = jI2;
                            str11 = str27;
                            str10 = str28;
                            arrayList7 = arrayList38;
                            j12 = j22;
                        } else {
                            if (gti.i(xmlPullParser2, "ContentProtection")) {
                                Pair pairF = f(xmlPullParser2);
                                arrayList7 = arrayList38;
                                Object obj3 = pairF.first;
                                if (obj3 != null) {
                                    str35 = (String) obj3;
                                }
                                Object obj4 = pairF.second;
                                if (obj4 != null) {
                                    arrayList29.add((w45) obj4);
                                }
                                ArrayList arrayList41 = arrayList28;
                                arrayList12 = arrayList27;
                                arrayList15 = arrayList41;
                                str12 = str26;
                                str3 = attributeValue6;
                                str9 = attributeValue4;
                                arrayList8 = arrayList29;
                                str = str29;
                                j13 = j21;
                                i = i11;
                                str5 = str31;
                                str2 = str33;
                                arrayList4 = arrayList34;
                                arrayList2 = arrayList36;
                            } else {
                                arrayList7 = arrayList38;
                                if (gti.i(xmlPullParser2, "ContentComponent")) {
                                    String attributeValue12 = xmlPullParser2.getAttributeValue(null, str30);
                                    if (str34 == null) {
                                        str34 = attributeValue12;
                                    } else if (attributeValue12 != null) {
                                        hsi.g(str34.equals(attributeValue12));
                                    }
                                    int iG2 = g(xmlPullParser2);
                                    if (iH == -1) {
                                        iH = iG2;
                                    } else if (iG2 != -1) {
                                        hsi.g(iH == iG2);
                                    }
                                    ArrayList arrayList42 = arrayList28;
                                    arrayList12 = arrayList27;
                                    arrayList15 = arrayList42;
                                    str12 = str26;
                                    str3 = attributeValue6;
                                    str9 = attributeValue4;
                                    arrayList8 = arrayList29;
                                } else {
                                    if (gti.i(xmlPullParser2, "Role")) {
                                        arrayList32.add(h(xmlPullParser2, "Role"));
                                    } else if (gti.i(xmlPullParser2, "AudioChannelConfiguration")) {
                                        ArrayList arrayList43 = arrayList28;
                                        arrayList12 = arrayList27;
                                        arrayList15 = arrayList43;
                                        str12 = str26;
                                        str3 = attributeValue6;
                                        str9 = attributeValue4;
                                        arrayList8 = arrayList29;
                                        iC = c(xmlPullParser2, attributeValue4);
                                    } else if (gti.i(xmlPullParser2, "Accessibility")) {
                                        arrayList31.add(h(xmlPullParser2, "Accessibility"));
                                    } else if (gti.i(xmlPullParser2, "EssentialProperty")) {
                                        arrayList33.add(h(xmlPullParser2, "EssentialProperty"));
                                    } else if (gti.i(xmlPullParser2, "SupplementalProperty")) {
                                        arrayList35.add(h(xmlPullParser2, "SupplementalProperty"));
                                    } else {
                                        if (gti.i(xmlPullParser2, "Representation")) {
                                            str4 = str30;
                                            if (arrayList7.isEmpty()) {
                                                arrayList16 = arrayList27;
                                                arrayList17 = arrayList28;
                                                arrayList12 = arrayList16;
                                                fd4Var = this;
                                                str15 = str26;
                                                str16 = str27;
                                                str17 = str28;
                                                arrayList8 = arrayList29;
                                                arrayList18 = arrayList33;
                                                i5 = i12;
                                                str = str29;
                                                str5 = str31;
                                                arrayList19 = arrayList30;
                                                str6 = str32;
                                                str2 = str33;
                                                arrayList4 = arrayList34;
                                                arrayList2 = arrayList36;
                                                arrayList20 = arrayList37;
                                                str18 = attributeValue3;
                                                str19 = attributeValue5;
                                                arrayList21 = arrayList31;
                                                arrayList22 = arrayList35;
                                                j15 = jD;
                                                str7 = str25;
                                                i6 = i11;
                                                arrayList3 = arrayList39;
                                                f = f2;
                                                i7 = iC;
                                                str20 = attributeValue6;
                                                z2 = z;
                                            } else {
                                                arrayList17 = arrayList28;
                                                arrayList16 = arrayList7;
                                                arrayList12 = arrayList27;
                                                fd4Var = this;
                                                str15 = str26;
                                                str16 = str27;
                                                str17 = str28;
                                                arrayList8 = arrayList29;
                                                arrayList18 = arrayList33;
                                                i5 = i12;
                                                str = str29;
                                                str5 = str31;
                                                arrayList19 = arrayList30;
                                                str6 = str32;
                                                str2 = str33;
                                                arrayList4 = arrayList34;
                                                arrayList2 = arrayList36;
                                                arrayList20 = arrayList37;
                                                str18 = attributeValue3;
                                                str19 = attributeValue5;
                                                arrayList22 = arrayList35;
                                                j15 = jD;
                                                str7 = str25;
                                                i6 = i11;
                                                arrayList3 = arrayList39;
                                                f = f2;
                                                i7 = iC;
                                                str20 = attributeValue6;
                                                z2 = z;
                                                arrayList21 = arrayList31;
                                            }
                                            String str36 = attributeValue4;
                                            XmlPullParser xmlPullParser3 = xmlPullParser2;
                                            int i13 = iH;
                                            int i14 = i10;
                                            dd4 dd4VarP = fd4Var.p(xmlPullParser3, arrayList16, str18, str36, str19, str20, i5, i14, f, i7, i6, str34, arrayList32, arrayList21, arrayList18, arrayList22, haeVarU2, j18, jI2, j15, j21, j4, z2);
                                            i10 = i14;
                                            f2 = f;
                                            str8 = str34;
                                            arrayList9 = arrayList21;
                                            arrayList10 = arrayList18;
                                            arrayList11 = arrayList22;
                                            String str37 = str18;
                                            String str38 = str19;
                                            str3 = str20;
                                            arrayList13 = arrayList32;
                                            j6 = jI2;
                                            j13 = j21;
                                            i3 = i5;
                                            int i15 = i7;
                                            j12 = j15;
                                            i = i6;
                                            iH = xz9.h(dd4VarP.a.n);
                                            if (i13 != -1) {
                                                if (iH != -1) {
                                                    hsi.g(i13 == iH);
                                                }
                                                iH = i13;
                                            }
                                            ArrayList arrayList44 = arrayList20;
                                            arrayList44.add(dd4VarP);
                                            xmlPullParser2 = xmlPullParser3;
                                            arrayList37 = arrayList44;
                                            attributeValue3 = str37;
                                            str9 = str36;
                                            attributeValue5 = str38;
                                            j7 = j18;
                                            iC = i15;
                                            arrayList15 = arrayList17;
                                            arrayList14 = arrayList19;
                                            str12 = str15;
                                            str11 = str16;
                                            str10 = str17;
                                        } else {
                                            String str39 = str26;
                                            String str40 = str27;
                                            str3 = attributeValue6;
                                            str4 = str30;
                                            arrayList8 = arrayList29;
                                            str = str29;
                                            i = i11;
                                            ArrayList arrayList45 = arrayList28;
                                            str5 = str31;
                                            ArrayList arrayList46 = arrayList30;
                                            str6 = str32;
                                            str2 = str33;
                                            arrayList4 = arrayList34;
                                            arrayList2 = arrayList36;
                                            String str41 = str28;
                                            XmlPullParser xmlPullParser4 = xmlPullParser2;
                                            arrayList9 = arrayList31;
                                            arrayList10 = arrayList33;
                                            arrayList11 = arrayList35;
                                            int i16 = iH;
                                            j12 = jD;
                                            str7 = str25;
                                            arrayList12 = arrayList27;
                                            j6 = jI2;
                                            arrayList3 = arrayList39;
                                            ArrayList arrayList47 = arrayList37;
                                            i2 = iC;
                                            String str42 = attributeValue5;
                                            str8 = str34;
                                            String str43 = attributeValue3;
                                            ArrayList arrayList48 = arrayList32;
                                            String str44 = attributeValue4;
                                            j13 = j21;
                                            i3 = i12;
                                            arrayList13 = arrayList48;
                                            if (gti.i(xmlPullParser4, str41)) {
                                                haeVarU2 = s(xmlPullParser4, (gae) haeVarU2);
                                                iH = i16;
                                                xmlPullParser2 = xmlPullParser4;
                                                arrayList37 = arrayList47;
                                                attributeValue3 = str43;
                                                str9 = str44;
                                                attributeValue5 = str42;
                                                iC = i2;
                                                arrayList15 = arrayList45;
                                                arrayList14 = arrayList46;
                                                str12 = str39;
                                                str11 = str40;
                                                str14 = str6;
                                                str13 = str4;
                                                str10 = str41;
                                                j7 = j18;
                                            } else if (gti.i(xmlPullParser4, str40)) {
                                                long jD2 = d(xmlPullParser4, j13);
                                                arrayList37 = arrayList47;
                                                attributeValue3 = str43;
                                                str9 = str44;
                                                attributeValue5 = str42;
                                                str11 = str40;
                                                str10 = str41;
                                                long j23 = j18;
                                                xmlPullParser2 = xmlPullParser4;
                                                haeVarU2 = t(xmlPullParser2, (aae) haeVarU2, j23, j6, j12, jD2, j4);
                                                j6 = j6;
                                                j7 = j23;
                                                j13 = jD2;
                                                j12 = j12;
                                                iH = i16;
                                                iC = i2;
                                                arrayList15 = arrayList45;
                                                arrayList14 = arrayList46;
                                                str12 = str39;
                                            } else {
                                                arrayList37 = arrayList47;
                                                attributeValue3 = str43;
                                                str9 = str44;
                                                attributeValue5 = str42;
                                                str10 = str41;
                                                str11 = str40;
                                                long j24 = j18;
                                                i4 = i16;
                                                xmlPullParser2 = xmlPullParser4;
                                                j7 = j24;
                                                if (gti.i(xmlPullParser2, str39)) {
                                                    j12 = j12;
                                                    long jD3 = d(xmlPullParser2, j13);
                                                    str12 = str39;
                                                    haeVarU2 = u(xmlPullParser2, (cae) haeVarU2, arrayList11, j7, j6, j12, jD3, j4);
                                                    j13 = jD3;
                                                    iH = i4;
                                                    iC = i2;
                                                    arrayList15 = arrayList45;
                                                    arrayList14 = arrayList46;
                                                } else {
                                                    str12 = str39;
                                                    j12 = j12;
                                                    if (gti.i(xmlPullParser2, "InbandEventStream")) {
                                                        arrayList14 = arrayList46;
                                                        arrayList14.add(h(xmlPullParser2, "InbandEventStream"));
                                                        j14 = j13;
                                                        arrayList15 = arrayList45;
                                                        str13 = str4;
                                                    } else {
                                                        arrayList14 = arrayList46;
                                                        if (gti.i(xmlPullParser2, "Label")) {
                                                            str13 = str4;
                                                            String attributeValue13 = xmlPullParser2.getAttributeValue(null, str13);
                                                            String text = "";
                                                            while (true) {
                                                                xmlPullParser2.next();
                                                                j14 = j13;
                                                                if (xmlPullParser2.getEventType() == 4) {
                                                                    text = xmlPullParser2.getText();
                                                                } else {
                                                                    b(xmlPullParser2);
                                                                }
                                                                String str45 = text;
                                                                if (gti.g(xmlPullParser2, "Label")) {
                                                                    arrayList15 = arrayList45;
                                                                    arrayList15.add(new r08(attributeValue13, str45));
                                                                } else {
                                                                    text = str45;
                                                                    j13 = j14;
                                                                }
                                                            }
                                                        } else {
                                                            j14 = j13;
                                                            arrayList15 = arrayList45;
                                                            str13 = str4;
                                                            if (xmlPullParser2.getEventType() == 2) {
                                                                b(xmlPullParser2);
                                                            }
                                                        }
                                                    }
                                                    iH = i4;
                                                    j13 = j14;
                                                    str14 = str6;
                                                    iC = i2;
                                                }
                                            }
                                        }
                                        str14 = str6;
                                        str13 = str4;
                                    }
                                    ArrayList arrayList49 = arrayList28;
                                    arrayList12 = arrayList27;
                                    arrayList15 = arrayList49;
                                    str12 = str26;
                                    str3 = attributeValue6;
                                    str9 = attributeValue4;
                                    arrayList8 = arrayList29;
                                    str = str29;
                                    i = i11;
                                    str5 = str31;
                                    str6 = str32;
                                    str2 = str33;
                                    arrayList4 = arrayList34;
                                    arrayList2 = arrayList36;
                                    arrayList10 = arrayList33;
                                    arrayList11 = arrayList35;
                                    j12 = jD;
                                    str7 = str25;
                                    arrayList3 = arrayList39;
                                    arrayList14 = arrayList30;
                                    str13 = str30;
                                    arrayList9 = arrayList31;
                                    str8 = str34;
                                    j7 = j18;
                                    j6 = jI2;
                                    i2 = iC;
                                    str11 = str27;
                                    i4 = iH;
                                    j14 = j21;
                                    i3 = i12;
                                    arrayList13 = arrayList32;
                                    str10 = str28;
                                    iH = i4;
                                    j13 = j14;
                                    str14 = str6;
                                    iC = i2;
                                }
                                str = str29;
                                j13 = j21;
                                i = i11;
                                str5 = str31;
                                str2 = str33;
                                arrayList4 = arrayList34;
                                arrayList2 = arrayList36;
                            }
                            arrayList11 = arrayList35;
                            j12 = jD;
                            str7 = str25;
                            i3 = i12;
                            arrayList3 = arrayList39;
                            arrayList14 = arrayList30;
                            str14 = str32;
                            str13 = str30;
                            arrayList9 = arrayList31;
                            arrayList10 = arrayList33;
                            str8 = str34;
                            arrayList13 = arrayList32;
                            j7 = j18;
                            j6 = jI2;
                            str11 = str27;
                            str10 = str28;
                        }
                        if (gti.g(xmlPullParser2, str14)) {
                            ArrayList arrayList50 = new ArrayList(arrayList37.size());
                            int i17 = 0;
                            while (i17 < arrayList37.size()) {
                                ArrayList arrayList51 = arrayList37;
                                dd4 dd4Var = (dd4) arrayList51.get(i17);
                                ff6 ff6VarA = dd4Var.a.a();
                                String str46 = str5;
                                if (str46 == null || !arrayList15.isEmpty()) {
                                    ff6VarA.c = wg7.j(arrayList15);
                                } else {
                                    ff6VarA.b = str46;
                                }
                                String str47 = dd4Var.d;
                                if (str47 == null) {
                                    str47 = str35;
                                }
                                ArrayList arrayList52 = dd4Var.e;
                                int i18 = i17;
                                arrayList52.addAll(arrayList8);
                                long j25 = j7;
                                if (arrayList52.isEmpty()) {
                                    j16 = j6;
                                    arrayList37 = arrayList51;
                                } else {
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < arrayList52.size()) {
                                            w45 w45Var = (w45) arrayList52.get(i19);
                                            j16 = j6;
                                            if (!cy0.c.equals(w45Var.b) || (str22 = w45Var.c) == null) {
                                                i19++;
                                                j6 = j16;
                                            } else {
                                                arrayList52.remove(i19);
                                                str21 = str22;
                                            }
                                        } else {
                                            j16 = j6;
                                            str21 = null;
                                        }
                                    }
                                    if (str21 != null) {
                                        int i20 = 0;
                                        while (i20 < arrayList52.size()) {
                                            w45 w45Var2 = (w45) arrayList52.get(i20);
                                            if (cy0.b.equals(w45Var2.b) && w45Var2.c == null) {
                                                arrayList23 = arrayList51;
                                                arrayList52.set(i20, new w45(cy0.c, str21, w45Var2.d, w45Var2.o));
                                            } else {
                                                arrayList23 = arrayList51;
                                            }
                                            i20++;
                                            arrayList51 = arrayList23;
                                        }
                                    }
                                    arrayList37 = arrayList51;
                                    for (int size = arrayList52.size() - 1; size >= 0; size--) {
                                        w45 w45Var3 = (w45) arrayList52.get(size);
                                        if (w45Var3.o == null) {
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 < arrayList52.size()) {
                                                    w45 w45Var4 = (w45) arrayList52.get(i21);
                                                    if (w45Var4.o != null && w45Var3.o == null && w45Var4.a(w45Var3.b)) {
                                                        arrayList52.remove(size);
                                                    } else {
                                                        i21++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    ff6VarA.q = new y45(str47, arrayList52);
                                }
                                ArrayList arrayList53 = dd4Var.f;
                                arrayList53.addAll(arrayList14);
                                hf6 hf6Var = new hf6(ff6VarA);
                                wg7 wg7Var = dd4Var.b;
                                hae haeVar = dd4Var.c;
                                if (haeVar instanceof gae) {
                                    umdVar = new wmd(hf6Var, wg7Var, (gae) haeVar, arrayList53);
                                } else {
                                    if (!(haeVar instanceof y9e)) {
                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                    }
                                    umdVar = new umd(hf6Var, wg7Var, (y9e) haeVar, arrayList53);
                                }
                                arrayList50.add(umdVar);
                                i17 = i18 + 1;
                                j6 = j16;
                                str5 = str46;
                                j7 = j25;
                            }
                            arrayList4.add(new x8(j20, iH, arrayList50, arrayList9, arrayList10, arrayList11));
                        } else {
                            j18 = j7;
                            long j26 = j13;
                            ArrayList arrayList54 = arrayList12;
                            arrayList28 = arrayList15;
                            arrayList27 = arrayList54;
                            z3 = z;
                            jI2 = j6;
                            str27 = str11;
                            str28 = str10;
                            attributeValue6 = str3;
                            arrayList32 = arrayList13;
                            i11 = i;
                            i12 = i3;
                            str34 = str8;
                            arrayList31 = arrayList9;
                            arrayList33 = arrayList10;
                            arrayList39 = arrayList3;
                            arrayList34 = arrayList4;
                            arrayList36 = arrayList2;
                            arrayList29 = arrayList8;
                            str29 = str;
                            j21 = j26;
                            arrayList30 = arrayList14;
                            str30 = str13;
                            str32 = str14;
                            str25 = str7;
                            str31 = str5;
                            attributeValue4 = str9;
                            jD = j12;
                            arrayList35 = arrayList11;
                            arrayList38 = arrayList7;
                            str33 = str2;
                            str26 = str12;
                        }
                    }
                } else {
                    str = str23;
                    str2 = str24;
                    ArrayList arrayList55 = arrayList24;
                    arrayList2 = arrayList25;
                    arrayList3 = arrayList26;
                    j5 = jD;
                    long j27 = jI2;
                    if (gti.i(xmlPullParser2, "EventStream")) {
                        String attributeValue14 = xmlPullParser2.getAttributeValue(null, "schemeIdUri");
                        String str48 = attributeValue14 == null ? "" : attributeValue14;
                        String attributeValue15 = xmlPullParser2.getAttributeValue(null, SdkMetricStatEvent.VALUE_KEY);
                        String str49 = attributeValue15 == null ? "" : attributeValue15;
                        String attributeValue16 = xmlPullParser2.getAttributeValue(null, "timescale");
                        long j28 = attributeValue16 == null ? 1L : Long.parseLong(attributeValue16);
                        String attributeValue17 = xmlPullParser2.getAttributeValue(null, "presentationTimeOffset");
                        long j29 = attributeValue17 == null ? 0L : Long.parseLong(attributeValue17);
                        ArrayList arrayList56 = new ArrayList();
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
                        while (true) {
                            xmlPullParser2.next();
                            if (gti.i(xmlPullParser2, "Event")) {
                                String str50 = str;
                                String attributeValue18 = xmlPullParser2.getAttributeValue(null, str50);
                                long j30 = attributeValue18 == null ? 0L : Long.parseLong(attributeValue18);
                                String str51 = str2;
                                String attributeValue19 = xmlPullParser2.getAttributeValue(null, str51);
                                long j31 = attributeValue19 == null ? -9223372036854775807L : Long.parseLong(attributeValue19);
                                String attributeValue20 = xmlPullParser2.getAttributeValue(null, "presentationTime");
                                long j32 = attributeValue20 == null ? 0L : Long.parseLong(attributeValue20);
                                String str52 = zxg.a;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                str2 = str51;
                                str = str50;
                                long jE0 = zxg.e0(j31, 1000L, j28, roundingMode);
                                long jE02 = zxg.e0(j32 - j29, 1000000L, j28, roundingMode);
                                j10 = j28;
                                String attributeValue21 = xmlPullParser2.getAttributeValue(null, "messageData");
                                if (attributeValue21 == null) {
                                    attributeValue21 = null;
                                }
                                byteArrayOutputStream2.reset();
                                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                xmlSerializerNewSerializer.setOutput(byteArrayOutputStream2, StandardCharsets.UTF_8.name());
                                xmlPullParser2.nextToken();
                                while (!gti.g(xmlPullParser2, "Event")) {
                                    switch (xmlPullParser2.getEventType()) {
                                        case 0:
                                            arrayList6 = arrayList55;
                                            j11 = j29;
                                            xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                                            break;
                                        case 1:
                                            arrayList6 = arrayList55;
                                            j11 = j29;
                                            xmlSerializerNewSerializer.endDocument();
                                            break;
                                        case 2:
                                            arrayList6 = arrayList55;
                                            xmlSerializerNewSerializer.startTag(xmlPullParser2.getNamespace(), xmlPullParser2.getName());
                                            int i22 = 0;
                                            while (i22 < xmlPullParser2.getAttributeCount()) {
                                                xmlSerializerNewSerializer.attribute(xmlPullParser2.getAttributeNamespace(i22), xmlPullParser2.getAttributeName(i22), xmlPullParser2.getAttributeValue(i22));
                                                i22++;
                                                j29 = j29;
                                            }
                                            j11 = j29;
                                            break;
                                        case 3:
                                            arrayList6 = arrayList55;
                                            xmlSerializerNewSerializer.endTag(xmlPullParser2.getNamespace(), xmlPullParser2.getName());
                                            j11 = j29;
                                            break;
                                        case 4:
                                            xmlSerializerNewSerializer.text(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = j29;
                                            break;
                                        case 5:
                                            xmlSerializerNewSerializer.cdsect(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = j29;
                                            break;
                                        case 6:
                                            xmlSerializerNewSerializer.entityRef(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = j29;
                                            break;
                                        case 7:
                                            xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = j29;
                                            break;
                                        case 8:
                                            xmlSerializerNewSerializer.processingInstruction(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = j29;
                                            break;
                                        case 9:
                                            xmlSerializerNewSerializer.comment(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = j29;
                                            break;
                                        case 10:
                                            xmlSerializerNewSerializer.docdecl(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = j29;
                                            break;
                                        default:
                                            arrayList6 = arrayList55;
                                            j11 = j29;
                                            break;
                                    }
                                    xmlPullParser2.nextToken();
                                    j29 = j11;
                                    arrayList55 = arrayList6;
                                }
                                arrayList4 = arrayList55;
                                j9 = j29;
                                xmlSerializerNewSerializer.flush();
                                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                Long lValueOf = Long.valueOf(jE02);
                                if (attributeValue21 != null) {
                                    byteArray = attributeValue21.getBytes(StandardCharsets.UTF_8);
                                }
                                byte[] bArr = byteArray;
                                arrayList5 = arrayList56;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                arrayList5.add(Pair.create(lValueOf, new ni5(str48, str49, jE0, j30, bArr)));
                            } else {
                                arrayList4 = arrayList55;
                                j9 = j29;
                                arrayList5 = arrayList56;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                j10 = j28;
                                b(xmlPullParser2);
                            }
                            if (gti.g(xmlPullParser2, "EventStream")) {
                                long[] jArr = new long[arrayList5.size()];
                                ni5[] ni5VarArr = new ni5[arrayList5.size()];
                                for (int i23 = 0; i23 < arrayList5.size(); i23++) {
                                    Pair pair = (Pair) arrayList5.get(i23);
                                    jArr[i23] = ((Long) pair.first).longValue();
                                    ni5VarArr[i23] = (ni5) pair.second;
                                }
                                arrayList2.add(new ti5(str48, str49, jArr, ni5VarArr));
                                j6 = j27;
                                j7 = j18;
                            } else {
                                arrayList56 = arrayList5;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                j28 = j10;
                                arrayList55 = arrayList4;
                                j29 = j9;
                            }
                        }
                    } else {
                        arrayList4 = arrayList55;
                        if (gti.i(xmlPullParser2, "SegmentBase")) {
                            obj = null;
                            j6 = j27;
                            haeVarU = s(xmlPullParser2, null);
                            arrayList2 = arrayList2;
                            j7 = j18;
                            jD = j5;
                            j8 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (gti.i(xmlPullParser2, str27)) {
                                j8 = -9223372036854775807L;
                                long jD4 = d(xmlPullParser2, -9223372036854775807L);
                                long j33 = j18;
                                j6 = j27;
                                j7 = j33;
                                haeVarU = t(xmlPullParser2, null, j33, j27, j5, jD4, j4);
                                j19 = jD4;
                                arrayList2 = arrayList2;
                            } else {
                                j6 = j27;
                                j7 = j18;
                                j8 = -9223372036854775807L;
                                if (gti.i(xmlPullParser2, str26)) {
                                    long jD5 = d(xmlPullParser2, -9223372036854775807L);
                                    t76 t76Var = wg7.b;
                                    arrayList2 = arrayList2;
                                    haeVarU = u(xmlPullParser2, null, zjd.o, j7, j6, j5, jD5, j4);
                                    j19 = jD5;
                                } else {
                                    arrayList2 = arrayList2;
                                    if (gti.i(xmlPullParser2, "AssetIdentifier")) {
                                        h(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        b(xmlPullParser2);
                                    }
                                }
                            }
                            jD = j5;
                        }
                    }
                }
                j8 = -9223372036854775807L;
                obj = null;
                jD = j5;
            }
            if (gti.g(xmlPullParser2, "Period")) {
                return Pair.create(new lrb(attributeValue, jI, arrayList4, arrayList2), Long.valueOf(j6));
            }
            z3 = z;
            j18 = j7;
            jI2 = j6;
            j17 = j8;
            obj2 = obj;
            arrayList26 = arrayList3;
            arrayList24 = arrayList4;
            arrayList25 = arrayList2;
            str24 = str2;
            str23 = str;
        }
    }

    @Override // defpackage.xmb
    public final Object m(Uri uri, ve4 ve4Var) throws XmlPullParserException, ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            xmlPullParserNewPullParser.setInput(ve4Var, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return k(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.b(null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw ParserException.b(e, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ad A[PHI: r0
  0x02ad: PHI (r0v13 java.lang.String) = (r0v12 java.lang.String), (r0v34 java.lang.String) binds: [B:109:0x0268, B:125:0x02a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x055f A[LOOP:0: B:29:0x00a3->B:274:0x055f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x01ea A[EDGE_INSN: B:278:0x01ea->B:71:0x01ea BREAK  A[LOOP:0: B:29:0x00a3->B:274:0x055f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.dd4 p(org.xmlpull.v1.XmlPullParser r34, java.util.ArrayList r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.ArrayList r46, java.util.ArrayList r47, java.util.ArrayList r48, java.util.ArrayList r49, defpackage.hae r50, long r51, long r53, long r55, long r57, long r59, boolean r61) {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd4.p(org.xmlpull.v1.XmlPullParser, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, hae, long, long, long, long, long, boolean):dd4");
    }
}
