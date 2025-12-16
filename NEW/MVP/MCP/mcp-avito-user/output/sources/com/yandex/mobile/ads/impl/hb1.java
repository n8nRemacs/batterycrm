package com.yandex.mobile.ads.impl;

import android.text.Layout;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes8.dex */
public final class hb1 extends d41 {

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f386059n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f386060o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f386061p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q, reason: collision with root package name */
    static final Pattern f386062q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    static final Pattern f386063r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f386064s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f386065t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u, reason: collision with root package name */
    private static final b f386066u = new b(30.0f, 1, 1);

    /* renamed from: v, reason: collision with root package name */
    private static final a f386067v = new a(15);

    /* renamed from: m, reason: collision with root package name */
    private final XmlPullParserFactory f386068m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int f386069a;

        public a(int i12) {
            this.f386069a = i12;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final float f386070a;

        /* renamed from: b, reason: collision with root package name */
        final int f386071b;

        /* renamed from: c, reason: collision with root package name */
        final int f386072c;

        public b(float f12, int i12, int i13) {
            this.f386070a = f12;
            this.f386071b = i12;
            this.f386072c = i13;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        final int f386073a;

        /* renamed from: b, reason: collision with root package name */
        final int f386074b;

        public c(int i12, int i13) {
            this.f386073a = i12;
            this.f386074b = i13;
        }
    }

    public hb1() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f386068m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e12) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e12);
        }
    }

    @j.P
    private static c b(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strA = tm1.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f386064s.matcher(strA);
        if (!matcher.matches()) {
            yk1.a("Ignoring non-pixel tts extent: ", strA, "TtmlDecoder");
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i12 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new c(i12, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            yk1.a("Ignoring malformed tts extent: ", strA, "TtmlDecoder");
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.d41
    public final t71 a(byte[] bArr, int i12, boolean z12) throws XmlPullParserException, NumberFormatException, IOException, v71 {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f386068m.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new jb1("", -3.4028235E38f, -3.4028235E38f, BeduinInputModel.MIN_TEXT_VERSION, BeduinInputModel.MIN_TEXT_VERSION, -3.4028235E38f, -3.4028235E38f, BeduinInputModel.MIN_TEXT_VERSION, -3.4028235E38f, BeduinInputModel.MIN_TEXT_VERSION));
            c cVarB = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i12), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarA = f386066u;
            a aVarA = f386067v;
            int i13 = 0;
            mb1 mb1Var = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                ib1 ib1Var = (ib1) arrayDeque.peek();
                if (i13 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarA = a(xmlPullParserNewPullParser);
                            aVarA = a(xmlPullParserNewPullParser, f386067v);
                            cVarB = b(xmlPullParserNewPullParser);
                        }
                        c cVar = cVarB;
                        b bVar2 = bVarA;
                        a aVar = aVarA;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar2;
                                a(xmlPullParserNewPullParser, map, aVar, cVar, map2, map3);
                            } else {
                                bVar = bVar2;
                                try {
                                    ib1 ib1VarA = a(xmlPullParserNewPullParser, ib1Var, map2, bVar);
                                    arrayDeque.push(ib1VarA);
                                    if (ib1Var != null) {
                                        ib1Var.a(ib1VarA);
                                    }
                                } catch (v71 e12) {
                                    ka0.b("TtmlDecoder", "Suppressing parser error", e12);
                                }
                            }
                            bVarA = bVar;
                            cVarB = cVar;
                            aVarA = aVar;
                        } else {
                            ka0.c("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            bVar = bVar2;
                        }
                        bVarA = bVar;
                        cVarB = cVar;
                        aVarA = aVar;
                        i13++;
                    } else if (eventType == 4) {
                        ib1Var.getClass();
                        ib1Var.a(ib1.a(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            ib1 ib1Var2 = (ib1) arrayDeque.peek();
                            ib1Var2.getClass();
                            mb1Var = new mb1(ib1Var2, map, map2, map3);
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
            if (mb1Var != null) {
                return mb1Var;
            }
            throw new v71("No TTML subtitles found");
        } catch (IOException e13) {
            throw new IllegalStateException("Unexpected error when reading input.", e13);
        } catch (XmlPullParserException e14) {
            throw new v71("Unable to decode source", e14);
        }
    }

    @j.P
    private static Layout.Alignment b(String str) {
        String strB = bb.b(str);
        strB.getClass();
        switch (strB) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static b a(XmlPullParser xmlPullParser) throws NumberFormatException, v71 {
        float f12;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i12 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i13 = pc1.f388768a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f12 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new v71("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f12 = 1.0f;
        }
        b bVar = f386066u;
        int i14 = bVar.f386071b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i14 = Integer.parseInt(attributeValue3);
        }
        int i15 = bVar.f386072c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i15 = Integer.parseInt(attributeValue4);
        }
        return new b(i12 * f12, i14, i15);
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) throws NumberFormatException, v71 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f386065t.matcher(attributeValue);
        if (!matcher.matches()) {
            yk1.a("Ignoring malformed cell resolution: ", attributeValue, "TtmlDecoder");
            return aVar;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i12 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i13 = Integer.parseInt(strGroup2);
            if (i12 == 0 || i13 == 0) {
                throw new v71("Invalid cell resolution " + i12 + " " + i13);
            }
            return new a(i13);
        } catch (NumberFormatException unused) {
            yk1.a("Ignoring malformed cell resolution: ", attributeValue, "TtmlDecoder");
            return aVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0244 A[LOOP:0: B:3:0x000a->B:105:0x0244, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, com.yandex.mobile.ads.impl.hb1.a r22, @j.P com.yandex.mobile.ads.impl.hb1.c r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hb1.a(org.xmlpull.v1.XmlPullParser, java.util.HashMap, com.yandex.mobile.ads.impl.hb1$a, com.yandex.mobile.ads.impl.hb1$c, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.yandex.mobile.ads.impl.lb1 a(org.xmlpull.v1.XmlPullParser r16, com.yandex.mobile.ads.impl.lb1 r17) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hb1.a(org.xmlpull.v1.XmlPullParser, com.yandex.mobile.ads.impl.lb1):com.yandex.mobile.ads.impl.lb1");
    }

    private static lb1 a(@j.P lb1 lb1Var) {
        return lb1Var == null ? new lb1() : lb1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.yandex.mobile.ads.impl.ib1 a(org.xmlpull.v1.XmlPullParser r21, @j.P com.yandex.mobile.ads.impl.ib1 r22, java.util.HashMap r23, com.yandex.mobile.ads.impl.hb1.b r24) throws java.lang.NumberFormatException, com.yandex.mobile.ads.impl.v71 {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hb1.a(org.xmlpull.v1.XmlPullParser, com.yandex.mobile.ads.impl.ib1, java.util.HashMap, com.yandex.mobile.ads.impl.hb1$b):com.yandex.mobile.ads.impl.ib1");
    }

    private static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE) || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static void a(String str, lb1 lb1Var) throws v71 {
        Matcher matcher;
        String strGroup;
        int i12 = pc1.f388768a;
        String[] strArrSplit = str.split("\\s+", -1);
        if (strArrSplit.length == 1) {
            matcher = f386061p.matcher(str);
        } else if (strArrSplit.length == 2) {
            matcher = f386061p.matcher(strArrSplit[1]);
            ka0.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new v71(AK.c.i(strArrSplit.length, ".", Cif.a("Invalid number of entries for fontSize: ")));
        }
        if (matcher.matches()) {
            strGroup = matcher.group(3);
            strGroup.getClass();
            switch (strGroup) {
                case "%":
                    lb1Var.c(3);
                    break;
                case "em":
                    lb1Var.c(2);
                    break;
                case "px":
                    lb1Var.c(1);
                    break;
                default:
                    throw new v71(AK.c.k("Invalid unit for fontSize: '", strGroup, "'."));
            }
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            lb1Var.a(Float.parseFloat(strGroup2));
            return;
        }
        throw new v71(AK.c.k("Invalid expression for fontSize: '", str, "'."));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long a(java.lang.String r13, com.yandex.mobile.ads.impl.hb1.b r14) throws java.lang.NumberFormatException, com.yandex.mobile.ads.impl.v71 {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hb1.a(java.lang.String, com.yandex.mobile.ads.impl.hb1$b):long");
    }
}
