package defpackage;

import android.content.res.XmlResourceParser;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import one.me.sdk.richvector.internal.element.GroupElement;
import one.me.sdk.richvector.internal.element.Shape;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final class vb3 {
    public static final int a(vb3 vb3Var, XmlPullParser xmlPullParser, String str) {
        vb3Var.getClass();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static final void f(esg esgVar) {
        esgVar.b(1, new a4e(13));
    }

    public ClipPathElement b(XmlResourceParser xmlResourceParser) {
        int iA = a(this, xmlResourceParser, SdkMetricStatEvent.NAME_KEY);
        String attributeValue = iA != -1 ? xmlResourceParser.getAttributeValue(iA) : null;
        int iA2 = a(this, xmlResourceParser, "pathData");
        return new ClipPathElement(attributeValue, iA2 != -1 ? xmlResourceParser.getAttributeValue(iA2) : null);
    }

    public GroupElement c(XmlResourceParser xmlResourceParser) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        int iA = a(this, xmlResourceParser, SdkMetricStatEvent.NAME_KEY);
        String attributeValue = iA != -1 ? xmlResourceParser.getAttributeValue(iA) : null;
        int iA2 = a(this, xmlResourceParser, "pivotX");
        float fFloatValue = (iA2 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA2))) : fValueOf2).floatValue();
        int iA3 = a(this, xmlResourceParser, "pivotY");
        float fFloatValue2 = (iA3 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA3))) : fValueOf2).floatValue();
        int iA4 = a(this, xmlResourceParser, "rotation");
        float fFloatValue3 = (iA4 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA4))) : fValueOf2).floatValue();
        int iA5 = a(this, xmlResourceParser, "scaleX");
        float fFloatValue4 = (iA5 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA5))) : fValueOf).floatValue();
        int iA6 = a(this, xmlResourceParser, "scaleY");
        if (iA6 != -1) {
            fValueOf = Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA6)));
        }
        float fFloatValue5 = fValueOf.floatValue();
        int iA7 = a(this, xmlResourceParser, "translateX");
        float fFloatValue6 = (iA7 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA7))) : fValueOf2).floatValue();
        int iA8 = a(this, xmlResourceParser, "translateY");
        if (iA8 != -1) {
            fValueOf2 = Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA8)));
        }
        return new GroupElement(attributeValue, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, fValueOf2.floatValue(), null, null, 768, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public one.me.sdk.richvector.internal.element.PathElement d(android.content.res.XmlResourceParser r24) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb3.d(android.content.res.XmlResourceParser):one.me.sdk.richvector.internal.element.PathElement");
    }

    public Shape e(XmlResourceParser xmlResourceParser) {
        Float fValueOf;
        Float fValueOf2 = Float.valueOf(0.0f);
        int iA = a(this, xmlResourceParser, "viewportWidth");
        float fFloatValue = (iA != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA))) : fValueOf2).floatValue();
        int iA2 = a(this, xmlResourceParser, "viewportHeight");
        float fFloatValue2 = (iA2 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA2))) : fValueOf2).floatValue();
        int iA3 = a(this, xmlResourceParser, "alpha");
        int iMin = Math.min(255, (int) (255 * (iA3 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA3))) : Float.valueOf(1.0f)).floatValue()));
        int iA4 = a(this, xmlResourceParser, SdkMetricStatEvent.NAME_KEY);
        String attributeValue = iA4 != -1 ? xmlResourceParser.getAttributeValue(iA4) : null;
        int iA5 = a(this, xmlResourceParser, "width");
        if (iA5 != -1) {
            String attributeValue2 = xmlResourceParser.getAttributeValue(iA5);
            fValueOf = Float.valueOf(Float.parseFloat(attributeValue2.substring(0, attributeValue2.length() - (attributeValue2.endsWith("dip") ? 3 : 2))));
        } else {
            fValueOf = fValueOf2;
        }
        float fFloatValue3 = fValueOf.floatValue();
        int iA6 = a(this, xmlResourceParser, "height");
        if (iA6 != -1) {
            String attributeValue3 = xmlResourceParser.getAttributeValue(iA6);
            fValueOf2 = Float.valueOf(Float.parseFloat(attributeValue3.substring(0, attributeValue3.length() - (attributeValue3.endsWith("dip") ? 3 : 2))));
        }
        return new Shape(attributeValue, fFloatValue, fFloatValue2, iMin, fFloatValue3, fValueOf2.floatValue(), null, 64, null);
    }
}
