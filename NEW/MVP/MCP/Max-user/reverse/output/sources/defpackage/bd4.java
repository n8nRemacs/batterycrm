package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class bd4 extends fd4 {
    public final Handler Y = new Handler(Looper.getMainLooper());
    public pl0 Z;

    public bd4() {
        Collections.singleton(new lcj(27));
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0288 A[LOOP:1: B:45:0x00c9->B:128:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0252 A[SYNTHETIC] */
    @Override // defpackage.fd4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ad4 k(org.xmlpull.v1.XmlPullParser r42, android.net.Uri r43) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd4.k(org.xmlpull.v1.XmlPullParser, android.net.Uri):ad4");
    }

    @Override // defpackage.fd4
    public final dd4 p(XmlPullParser xmlPullParser, ArrayList arrayList, String str, String str2, String str3, String str4, int i, int i2, float f, int i3, int i4, String str5, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, hae haeVar, long j, long j2, long j3, long j4, long j5, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "quality");
        if (attributeValue == null) {
            attributeValue = "";
        }
        dd4 dd4VarP = super.p(xmlPullParser, arrayList, str, str2, str3, str4, i, i2, f, i3, i4, str5, arrayList2, arrayList3, arrayList4, arrayList5, haeVar, j, j2, j3, j4, j5, z);
        hf6 hf6Var = dd4VarP.a;
        if (vmf.F(attributeValue)) {
            return dd4VarP;
        }
        ty9 ty9Var = hf6Var.l;
        if (ty9Var == null) {
            ty9Var = new ty9(new ry9[0]);
        }
        ty9 ty9VarA = ty9Var.a(new hyg(attributeValue));
        ff6 ff6VarA = hf6Var.a();
        ff6VarA.k = ty9VarA;
        return new dd4(new hf6(ff6VarA), dd4VarP.b, dd4VarP.c, dd4VarP.d, dd4VarP.e, dd4VarP.f, dd4VarP.h, dd4VarP.i, dd4VarP.g);
    }
}
