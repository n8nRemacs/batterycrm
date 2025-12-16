package defpackage;

import org.apache.http.client.methods.HttpHead;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public abstract class v97 {
    static {
        new xx0(BasicHeaderValueFormatter.UNSAFE_CHARS.getBytes(lb2.a)).b = BasicHeaderValueFormatter.UNSAFE_CHARS;
        new xx0("\t ,=".getBytes(lb2.a)).b = "\t ,=";
    }

    public static final boolean a(ood oodVar) {
        if (fni.a(oodVar.a.c, HttpHead.METHOD_NAME)) {
            return false;
        }
        int i = oodVar.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || yxg.j(oodVar) != -1) {
            return true;
        }
        String strA = oodVar.X.a(HTTP.TRANSFER_ENCODING);
        if (strA == null) {
            strA = null;
        }
        return HTTP.CHUNK_CODING.equalsIgnoreCase(strA);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.mni r34, defpackage.ga7 r35, defpackage.j17 r36) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v97.b(mni, ga7, j17):void");
    }
}
