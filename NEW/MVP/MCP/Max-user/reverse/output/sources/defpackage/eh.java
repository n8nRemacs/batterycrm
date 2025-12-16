package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class eh extends n2 {
    @Override // defpackage.n2
    public final Object D(Context context, XmlResourceParser xmlResourceParser, int i) throws NumberFormatException {
        float fA;
        Object nhVar = (sh) ch.w0.G(context, xmlResourceParser);
        if (!(nhVar instanceof nh) && vmf.V(xmlResourceParser.getAttributeValue(i), '#')) {
            nhVar = new nh(0);
        }
        if (nhVar instanceof nh) {
            return new nh(maj.c(xmlResourceParser.getAttributeValue(i)));
        }
        if (nhVar instanceof oh) {
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            try {
                fA = tw4.a(context, attributeValue);
            } catch (NumberFormatException unused) {
                fA = Float.parseFloat(attributeValue);
            }
            return new oh(fA);
        }
        if (nhVar instanceof ph) {
            return new ph(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
        }
        if (nhVar instanceof qh) {
            return new qh(xmlResourceParser.getAttributeValue(i));
        }
        if (fni.a(nhVar, rh.a)) {
            throw new IllegalStateException(ho7.i("Undefined ", ((bh) this.b).a, " type"));
        }
        throw new NoWhenBranchMatchedException();
    }
}
