package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class iu extends l0g implements Serializable {
    public long X;
    public List c;
    public List d;
    public List o;

    public iu(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
        if (this.d == null) {
            this.d = Collections.EMPTY_LIST;
        }
        if (this.o == null) {
            this.o = Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    @Override // defpackage.l0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.tm9 r17, java.lang.String r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu.d(tm9, java.lang.String):void");
    }

    @Override // defpackage.pj0
    public final String toString() {
        int iA = zdi.a(this.c);
        int iA2 = zdi.a(this.d);
        int iA3 = zdi.a(this.o);
        long j = this.X;
        StringBuilder sbK = wy1.k("{stickers=", iA, "stickerSets=", iA2, "backgrounds=");
        sbK.append(iA3);
        sbK.append(", marker=");
        sbK.append(j);
        sbK.append("}");
        return sbK.toString();
    }
}
