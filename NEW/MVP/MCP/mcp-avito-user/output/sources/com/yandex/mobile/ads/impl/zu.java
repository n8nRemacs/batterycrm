package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class zu implements rm1<FalseClick> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f392348a = new sm1();

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.P
    public final FalseClick a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Long lValueOf;
        this.f392348a.getClass();
        xmlPullParser.require(2, null, "FalseClick");
        this.f392348a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "interval");
        if (attributeValue != null) {
            try {
                lValueOf = Long.valueOf(Long.parseLong(attributeValue));
            } catch (Exception unused) {
            }
        } else {
            lValueOf = null;
        }
        this.f392348a.getClass();
        String strC = sm1.c(xmlPullParser);
        if (TextUtils.isEmpty(strC) || lValueOf == null) {
            return null;
        }
        return new FalseClick(strC, lValueOf.longValue());
    }
}
