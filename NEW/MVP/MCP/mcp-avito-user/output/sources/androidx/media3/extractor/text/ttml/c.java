package androidx.media3.extractor.text.ttml;

import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.N;
import androidx.media3.common.util.s;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import j.P;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: TtmlDecoder.java */
@J
/* loaded from: classes.dex */
public final class c extends androidx.media3.extractor.text.d {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f51367p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f51368q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f51369r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f51370s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f51371t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f51372u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f51373v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w, reason: collision with root package name */
    public static final b f51374w = new b(30.0f, 1, 1);

    /* renamed from: x, reason: collision with root package name */
    public static final a f51375x = new a(15);

    /* renamed from: o, reason: collision with root package name */
    public final XmlPullParserFactory f51376o;

    /* compiled from: TtmlDecoder.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f51377a;

        public a(int i12) {
            this.f51377a = i12;
        }
    }

    /* compiled from: TtmlDecoder.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f51378a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51379b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51380c;

        public b(float f12, int i12, int i13) {
            this.f51378a = f12;
            this.f51379b = i12;
            this.f51380c = i13;
        }
    }

    /* compiled from: TtmlDecoder.java */
    /* renamed from: androidx.media3.extractor.text.ttml.c$c, reason: collision with other inner class name */
    public static final class C1863c {

        /* renamed from: a, reason: collision with root package name */
        public final int f51381a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51382b;

        public C1863c(int i12, int i13) {
            this.f51381a = i12;
            this.f51382b = i13;
        }
    }

    public c() throws XmlPullParserException {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f51376o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e12) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e12);
        }
    }

    public static g j(@P g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean k(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE) || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static a l(XmlPullParser xmlPullParser, a aVar) throws SubtitleDecoderException, NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f51373v.matcher(attributeValue);
        if (!matcher.matches()) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            s.g();
            return aVar;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i12 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i13 = Integer.parseInt(strGroup2);
            if (i12 != 0 && i13 != 0) {
                return new a(i13);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i12 + " " + i13);
        } catch (NumberFormatException unused) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            s.g();
            return aVar;
        }
    }

    public static void m(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        int i12 = M.f47887a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f51369r;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(AK.c.i(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            s.g();
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(AK.c.k("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                gVar.f51415j = 3;
                break;
            case "em":
                gVar.f51415j = 2;
                break;
            case "px":
                gVar.f51415j = 1;
                break;
            default:
                throw new SubtitleDecoderException(AK.c.k("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        gVar.f51416k = Float.parseFloat(strGroup2);
    }

    public static b n(XmlPullParser xmlPullParser) throws SubtitleDecoderException, NumberFormatException {
        float f12;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i12 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i13 = M.f47887a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f12 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f12 = 1.0f;
        }
        b bVar = f51374w;
        int i14 = bVar.f51379b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i14 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new b(i12 * f12, i14, attributeValue4 != null ? Integer.parseInt(attributeValue4) : bVar.f51380c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0249 A[LOOP:0: B:3:0x000a->B:105:0x0249, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, androidx.media3.extractor.text.ttml.c.a r22, @j.P androidx.media3.extractor.text.ttml.c.C1863c r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.c.o(org.xmlpull.v1.XmlPullParser, java.util.HashMap, androidx.media3.extractor.text.ttml.c$a, androidx.media3.extractor.text.ttml.c$c, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.text.ttml.d p(org.xmlpull.v1.XmlPullParser r21, @j.P androidx.media3.extractor.text.ttml.d r22, java.util.HashMap r23, androidx.media3.extractor.text.ttml.c.b r24) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.c.p(org.xmlpull.v1.XmlPullParser, androidx.media3.extractor.text.ttml.d, java.util.HashMap, androidx.media3.extractor.text.ttml.c$b):androidx.media3.extractor.text.ttml.d");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x00ea. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* JADX WARN: Type inference failed for: r11v37, types: [androidx.media3.extractor.text.ttml.b] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v37, types: [androidx.media3.extractor.text.ttml.b] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v46, types: [androidx.media3.extractor.text.ttml.b] */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r1v50, types: [androidx.media3.extractor.text.ttml.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.text.ttml.g q(org.xmlpull.v1.XmlPullParser r19, androidx.media3.extractor.text.ttml.g r20) {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.c.q(org.xmlpull.v1.XmlPullParser, androidx.media3.extractor.text.ttml.g):androidx.media3.extractor.text.ttml.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long r(java.lang.String r13, androidx.media3.extractor.text.ttml.c.b r14) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.c.r(java.lang.String, androidx.media3.extractor.text.ttml.c$b):long");
    }

    @P
    public static C1863c s(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strA = N.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f51372u.matcher(strA);
        if (!matcher.matches()) {
            "Ignoring non-pixel tts extent: ".concat(strA);
            s.g();
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i12 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C1863c(i12, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            "Ignoring malformed tts extent: ".concat(strA);
            s.g();
            return null;
        }
    }

    @Override // androidx.media3.extractor.text.d
    public final androidx.media3.extractor.text.e i(int i12, byte[] bArr, boolean z12) throws XmlPullParserException, SubtitleDecoderException, NumberFormatException, IOException {
        a aVar;
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f51376o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e("", -3.4028235E38f, -3.4028235E38f, BeduinInputModel.MIN_TEXT_VERSION, BeduinInputModel.MIN_TEXT_VERSION, -3.4028235E38f, -3.4028235E38f, BeduinInputModel.MIN_TEXT_VERSION, -3.4028235E38f, BeduinInputModel.MIN_TEXT_VERSION));
            C1863c c1863cS = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i12), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarN = f51374w;
            a aVar2 = f51375x;
            int i13 = 0;
            h hVar = null;
            a aVarL = aVar2;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i13 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarN = n(xmlPullParserNewPullParser);
                            aVarL = l(xmlPullParserNewPullParser, aVar2);
                            c1863cS = s(xmlPullParserNewPullParser);
                        }
                        a aVar3 = aVarL;
                        C1863c c1863c = c1863cS;
                        b bVar2 = bVarN;
                        if (k(name)) {
                            if ("head".equals(name)) {
                                aVar = aVar3;
                                bVar = bVar2;
                                o(xmlPullParserNewPullParser, map, aVar3, c1863c, map2, map3);
                            } else {
                                aVar = aVar3;
                                bVar = bVar2;
                                try {
                                    d dVarP = p(xmlPullParserNewPullParser, dVar, map2, bVar);
                                    arrayDeque.push(dVarP);
                                    if (dVar != null) {
                                        if (dVar.f51395m == null) {
                                            dVar.f51395m = new ArrayList();
                                        }
                                        dVar.f51395m.add(dVarP);
                                    }
                                } catch (SubtitleDecoderException e12) {
                                    s.h("Suppressing parser error", e12);
                                    i13++;
                                }
                            }
                            aVarL = aVar;
                            bVarN = bVar;
                        } else {
                            xmlPullParserNewPullParser.getName();
                            s.f();
                            i13++;
                            aVarL = aVar3;
                            bVarN = bVar2;
                        }
                        c1863cS = c1863c;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        d dVarA = d.a(xmlPullParserNewPullParser.getText());
                        if (dVar.f51395m == null) {
                            dVar.f51395m = new ArrayList();
                        }
                        dVar.f51395m.add(dVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            d dVar2 = (d) arrayDeque.peek();
                            dVar2.getClass();
                            hVar = new h(dVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i13++;
                } else if (eventType == 3) {
                    i13--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e13) {
            throw new IllegalStateException("Unexpected error when reading input.", e13);
        } catch (XmlPullParserException e14) {
            throw new SubtitleDecoderException("Unable to decode source", e14);
        }
    }
}
