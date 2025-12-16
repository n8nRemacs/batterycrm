package androidx.media3.common.util;

import j.P;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: XmlPullParserUtil.java */
@J
/* loaded from: classes.dex */
public final class N {
    @P
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i12 = 0; i12 < attributeCount; i12++) {
            if (xmlPullParser.getAttributeName(i12).equals(str)) {
                return xmlPullParser.getAttributeValue(i12);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }
}
