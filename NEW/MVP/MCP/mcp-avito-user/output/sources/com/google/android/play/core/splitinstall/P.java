package com.google.android.play.core.splitinstall;

import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class P {
    @j.P
    public static final String a(String str, XmlResourceParser xmlResourceParser) {
        for (int i12 = 0; i12 < xmlResourceParser.getAttributeCount(); i12++) {
            if (xmlResourceParser.getAttributeName(i12).equals(str)) {
                return xmlResourceParser.getAttributeValue(i12);
            }
        }
        return null;
    }

    public static final void b(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i12 = 1;
        while (i12 != 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i12++;
            } else if (next == 3) {
                i12--;
            }
        }
    }
}
