package com.google.android.exoplayer2.util;

import org.xmlpull.v1.XmlPullParser;

/* compiled from: XmlPullParserUtil.java */
/* loaded from: classes6.dex */
public final class V {
    @j.P
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
