package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class sm1 {
    public static boolean a(XmlPullParser xmlPullParser) {
        return xmlPullParser.next() != 3;
    }

    public static boolean b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    @j.N
    public static String c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String text;
        if (xmlPullParser.next() == 4) {
            text = xmlPullParser.getText();
            xmlPullParser.nextTag();
        } else {
            text = "";
        }
        return text.trim();
    }

    public static void d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i12 = 1;
        while (i12 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i12++;
            } else if (next == 3) {
                i12--;
            }
        }
    }

    public static void a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, str);
    }
}
