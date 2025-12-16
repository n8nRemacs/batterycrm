package com.google.android.exoplayer2.text.ttml;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.util.V;
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
/* loaded from: classes6.dex */
public final class c extends com.google.android.exoplayer2.text.g {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f347004p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f347005q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f347006r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f347007s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f347008t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f347009u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f347010v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w, reason: collision with root package name */
    public static final b f347011w = new b(30.0f, 1, 1);

    /* renamed from: x, reason: collision with root package name */
    public static final a f347012x = new a(15);

    /* renamed from: o, reason: collision with root package name */
    public final XmlPullParserFactory f347013o;

    /* compiled from: TtmlDecoder.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f347014a;

        public a(int i12) {
            this.f347014a = i12;
        }
    }

    /* compiled from: TtmlDecoder.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f347015a;

        /* renamed from: b, reason: collision with root package name */
        public final int f347016b;

        /* renamed from: c, reason: collision with root package name */
        public final int f347017c;

        public b(float f12, int i12, int i13) {
            this.f347015a = f12;
            this.f347016b = i12;
            this.f347017c = i13;
        }
    }

    /* compiled from: TtmlDecoder.java */
    /* renamed from: com.google.android.exoplayer2.text.ttml.c$c, reason: collision with other inner class name */
    public static final class C10605c {

        /* renamed from: a, reason: collision with root package name */
        public final int f347018a;

        /* renamed from: b, reason: collision with root package name */
        public final int f347019b;

        public C10605c(int i12, int i13) {
            this.f347018a = i12;
            this.f347019b = i13;
        }
    }

    public c() throws XmlPullParserException {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f347013o = xmlPullParserFactoryNewInstance;
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
        Matcher matcher = f347010v.matcher(attributeValue);
        if (!matcher.matches()) {
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
            return aVar;
        }
    }

    public static void m(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        int i12 = U.f348106a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f347006r;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(AK.c.i(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(AK.c.k("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                gVar.f347052j = 3;
                break;
            case "em":
                gVar.f347052j = 2;
                break;
            case "px":
                gVar.f347052j = 1;
                break;
            default:
                throw new SubtitleDecoderException(AK.c.k("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        gVar.f347053k = Float.parseFloat(strGroup2);
    }

    public static b n(XmlPullParser xmlPullParser) throws SubtitleDecoderException, NumberFormatException {
        float f12;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i12 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i13 = U.f348106a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f12 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f12 = 1.0f;
        }
        b bVar = f347011w;
        int i14 = bVar.f347016b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i14 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new b(i12 * f12, i14, attributeValue4 != null ? Integer.parseInt(attributeValue4) : bVar.f347017c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(org.xmlpull.v1.XmlPullParser r22, java.util.HashMap r23, com.google.android.exoplayer2.text.ttml.c.a r24, @j.P com.google.android.exoplayer2.text.ttml.c.C10605c r25, java.util.HashMap r26, java.util.HashMap r27) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.c.o(org.xmlpull.v1.XmlPullParser, java.util.HashMap, com.google.android.exoplayer2.text.ttml.c$a, com.google.android.exoplayer2.text.ttml.c$c, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.text.ttml.d p(org.xmlpull.v1.XmlPullParser r21, @j.P com.google.android.exoplayer2.text.ttml.d r22, java.util.HashMap r23, com.google.android.exoplayer2.text.ttml.c.b r24) throws com.google.android.exoplayer2.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.c.p(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.d, java.util.HashMap, com.google.android.exoplayer2.text.ttml.c$b):com.google.android.exoplayer2.text.ttml.d");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x00ea. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* JADX WARN: Type inference failed for: r11v37, types: [com.google.android.exoplayer2.text.ttml.b] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v37, types: [com.google.android.exoplayer2.text.ttml.b] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v46, types: [com.google.android.exoplayer2.text.ttml.b] */
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
    /* JADX WARN: Type inference failed for: r1v50, types: [com.google.android.exoplayer2.text.ttml.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.text.ttml.g q(org.xmlpull.v1.XmlPullParser r19, com.google.android.exoplayer2.text.ttml.g r20) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.c.q(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.g):com.google.android.exoplayer2.text.ttml.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long r(java.lang.String r13, com.google.android.exoplayer2.text.ttml.c.b r14) throws com.google.android.exoplayer2.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.c.r(java.lang.String, com.google.android.exoplayer2.text.ttml.c$b):long");
    }

    @P
    public static C10605c s(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strA = V.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f347009u.matcher(strA);
        if (!matcher.matches()) {
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i12 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C10605c(i12, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.text.g
    public final com.google.android.exoplayer2.text.h i(int i12, byte[] bArr, boolean z12) throws XmlPullParserException, SubtitleDecoderException, NumberFormatException, IOException {
        a aVar;
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f347013o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e("", -3.4028235E38f, -3.4028235E38f, BeduinInputModel.MIN_TEXT_VERSION, BeduinInputModel.MIN_TEXT_VERSION, -3.4028235E38f, -3.4028235E38f, BeduinInputModel.MIN_TEXT_VERSION, -3.4028235E38f, BeduinInputModel.MIN_TEXT_VERSION));
            C10605c c10605cS = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i12), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarN = f347011w;
            a aVar2 = f347012x;
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
                            c10605cS = s(xmlPullParserNewPullParser);
                        }
                        a aVar3 = aVarL;
                        C10605c c10605c = c10605cS;
                        b bVar2 = bVarN;
                        if (k(name)) {
                            if ("head".equals(name)) {
                                aVar = aVar3;
                                bVar = bVar2;
                                o(xmlPullParserNewPullParser, map, aVar3, c10605c, map2, map3);
                            } else {
                                aVar = aVar3;
                                bVar = bVar2;
                                try {
                                    d dVarP = p(xmlPullParserNewPullParser, dVar, map2, bVar);
                                    arrayDeque.push(dVarP);
                                    if (dVar != null) {
                                        if (dVar.f347032m == null) {
                                            dVar.f347032m = new ArrayList();
                                        }
                                        dVar.f347032m.add(dVarP);
                                    }
                                } catch (SubtitleDecoderException e12) {
                                    C36605v.a("Suppressing parser error", e12);
                                    i13++;
                                }
                            }
                            aVarL = aVar;
                            bVarN = bVar;
                        } else {
                            xmlPullParserNewPullParser.getName();
                            i13++;
                            aVarL = aVar3;
                            bVarN = bVar2;
                        }
                        c10605cS = c10605c;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        d dVarA = d.a(xmlPullParserNewPullParser.getText());
                        if (dVar.f347032m == null) {
                            dVar.f347032m = new ArrayList();
                        }
                        dVar.f347032m.add(dVarA);
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
