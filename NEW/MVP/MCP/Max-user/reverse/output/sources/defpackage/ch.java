package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ch extends n2 {
    public final /* synthetic */ int d;
    public static final ch o = new ch(bh.DURATION, 300L, 0);
    public static final ch X = new ch(bh.PATH_DATA, "", 1);
    public static final ch Y = new ch(bh.PROPERTY_NAME, "", 2);
    public static final ch Z = new ch(bh.PROPERTY_X_NAME, "", 3);
    public static final ch s0 = new ch(bh.PROPERTY_Y_NAME, "", 4);
    public static final ch t0 = new ch(bh.REPEAT_COUNT, 0, 5);
    public static final ch u0 = new ch(bh.REPEAT_MODE, 1, 6);
    public static final ch v0 = new ch(bh.START_OFFSET, 0L, 7);
    public static final ch w0 = new ch(bh.VALUE_TYPE, new oh(0.0f), 8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch(bh bhVar, Object obj, int i) {
        super(bhVar, 1, obj);
        this.d = i;
    }

    @Override // defpackage.n2
    public final Object D(Context context, XmlResourceParser xmlResourceParser, int i) {
        Integer num;
        switch (this.d) {
            case 0:
                Long lI = cnf.i(xmlResourceParser.getAttributeValue(i));
                return Long.valueOf(lI != null ? lI.longValue() : 0L);
            case 1:
                return xmlResourceParser.getAttributeValue(i);
            case 2:
                return xmlResourceParser.getAttributeValue(i);
            case 3:
                return xmlResourceParser.getAttributeValue(i);
            case 4:
                return xmlResourceParser.getAttributeValue(i);
            case 5:
                return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
            case 6:
                return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
            case 7:
                return Long.valueOf(Long.parseLong(xmlResourceParser.getAttributeValue(i)));
            default:
                Iterator it = ve3.j(bh.VALUE_FROM, bh.VALUE_TO).iterator();
                while (true) {
                    if (it.hasNext()) {
                        num = (Integer) maj.a(xmlResourceParser).get(((bh) it.next()).a);
                        if (num != null) {
                        }
                    } else {
                        num = null;
                    }
                }
                String attributeValue = num != null ? xmlResourceParser.getAttributeValue(num.intValue()) : null;
                int i2 = (attributeValue == null || !vmf.V(attributeValue, '#')) ? Integer.parseInt(xmlResourceParser.getAttributeValue(i)) : 3;
                if (i2 == 0) {
                    return new oh(0.0f);
                }
                if (i2 == 1) {
                    return new ph(0);
                }
                if (i2 == 2) {
                    return new qh("");
                }
                if (i2 == 3) {
                    return new nh(0);
                }
                if (i2 == 4) {
                    return rh.a;
                }
                throw new IllegalStateException(wy1.h("unknown value type ", xmlResourceParser.getAttributeValue(i)));
        }
    }
}
