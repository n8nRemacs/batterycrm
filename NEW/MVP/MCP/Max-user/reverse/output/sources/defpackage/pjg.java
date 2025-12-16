package defpackage;

import android.util.Log;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
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

/* loaded from: classes.dex */
public final class pjg extends b2f {
    public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final g3e u = new g3e(1, 30.0f, 1);
    public static final l16 v = new l16(15, 14);
    public final XmlPullParserFactory m;

    public pjg() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static vjg h(vjg vjgVar) {
        return vjgVar == null ? new vjg() : vjgVar;
    }

    public static boolean i(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static l16 j(XmlPullParser xmlPullParser, l16 l16Var) throws SubtitleDecoderException, NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return l16Var;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return l16Var;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i != 0 && i2 != 0) {
                return new l16(i2, 14);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(i);
            sb.append(" ");
            sb.append(i2);
            throw new SubtitleDecoderException(sb.toString());
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return l16Var;
        }
    }

    public static void k(String str, vjg vjgVar) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        int i = xxg.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                int length2 = strArrSplit.length;
                StringBuilder sb = new StringBuilder(52);
                sb.append("Invalid number of entries for fontSize: ");
                sb.append(length2);
                sb.append(".");
                throw new SubtitleDecoderException(sb.toString());
            }
            matcher = pattern.matcher(strArrSplit[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 36);
            sb2.append("Invalid expression for fontSize: '");
            sb2.append(str);
            sb2.append("'.");
            throw new SubtitleDecoderException(sb2.toString());
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                vjgVar.j = 3;
                break;
            case "em":
                vjgVar.j = 2;
                break;
            case "px":
                vjgVar.j = 1;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(strGroup.length() + 30);
                sb3.append("Invalid unit for fontSize: '");
                sb3.append(strGroup);
                sb3.append("'.");
                throw new SubtitleDecoderException(sb3.toString());
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        vjgVar.k = Float.parseFloat(strGroup2);
    }

    public static g3e l(XmlPullParser xmlPullParser) throws SubtitleDecoderException, NumberFormatException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = xxg.a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        g3e g3eVar = u;
        int i3 = g3eVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = g3eVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new g3e(i3, i * f, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, defpackage.l16 r21, defpackage.kt r22, java.util.HashMap r23, java.util.HashMap r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjg.m(org.xmlpull.v1.XmlPullParser, java.util.HashMap, l16, kt, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qjg n(org.xmlpull.v1.XmlPullParser r21, defpackage.qjg r22, java.util.HashMap r23, defpackage.g3e r24) throws com.google.android.exoplayer2.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjg.n(org.xmlpull.v1.XmlPullParser, qjg, java.util.HashMap, g3e):qjg");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.vjg o(org.xmlpull.v1.XmlPullParser r18, defpackage.vjg r19) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjg.o(org.xmlpull.v1.XmlPullParser, vjg):vjg");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long p(java.lang.String r13, defpackage.g3e r14) throws com.google.android.exoplayer2.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjg.p(java.lang.String, g3e):long");
    }

    public static kt q(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strC = eti.c(xmlPullParser, "extent");
        if (strC == null) {
            return null;
        }
        Matcher matcher = s.matcher(strC);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", strC.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(strC) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new kt(i, Integer.parseInt(strGroup2), 10);
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", strC.length() != 0 ? "Ignoring malformed tts extent: ".concat(strC) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // defpackage.b2f
    public final gof e(int i, boolean z, byte[] bArr) throws XmlPullParserException, SubtitleDecoderException, NumberFormatException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.m.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new tjg("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            kt ktVarQ = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            g3e g3eVar = u;
            l16 l16Var = v;
            int i2 = 0;
            g3e g3eVarL = g3eVar;
            xa6 xa6Var = null;
            l16 l16VarJ = l16Var;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                qjg qjgVar = (qjg) arrayDeque.peek();
                if (i2 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            g3eVarL = l(xmlPullParserNewPullParser);
                            l16VarJ = j(xmlPullParserNewPullParser, l16Var);
                            ktVarQ = q(xmlPullParserNewPullParser);
                        }
                        g3e g3eVar2 = g3eVarL;
                        l16 l16Var2 = l16VarJ;
                        if (i(name)) {
                            if ("head".equals(name)) {
                                m(xmlPullParserNewPullParser, map, l16Var2, ktVarQ, map2, map3);
                            } else {
                                try {
                                    qjg qjgVarN = n(xmlPullParserNewPullParser, qjgVar, map2, g3eVar2);
                                    arrayDeque.push(qjgVarN);
                                    if (qjgVar != null) {
                                        if (qjgVar.m == null) {
                                            qjgVar.m = new ArrayList();
                                        }
                                        qjgVar.m.add(qjgVarN);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    pai.e("TtmlDecoder", "Suppressing parser error", e);
                                }
                            }
                            l16VarJ = l16Var2;
                            g3eVarL = g3eVar2;
                        } else {
                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                            Log.i("TtmlDecoder", strValueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(strValueOf) : new String("Ignoring unsupported tag: "));
                        }
                        i2++;
                        l16VarJ = l16Var2;
                        g3eVarL = g3eVar2;
                    } else if (eventType == 4) {
                        qjgVar.getClass();
                        qjg qjgVarA = qjg.a(xmlPullParserNewPullParser.getText());
                        if (qjgVar.m == null) {
                            qjgVar.m = new ArrayList();
                        }
                        qjgVar.m.add(qjgVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            qjg qjgVar2 = (qjg) arrayDeque.peek();
                            qjgVar2.getClass();
                            xa6Var = new xa6(qjgVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (xa6Var != null) {
                return xa6Var;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new SubtitleDecoderException("Unable to decode source", e3);
        }
    }
}
