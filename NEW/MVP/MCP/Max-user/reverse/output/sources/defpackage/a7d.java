package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class a7d {
    public final long a;
    public final g1h b;
    public final List c;
    public final List d;
    public final HashMap e = new HashMap();

    public a7d(long j, g1h g1hVar, List list, ArrayList arrayList, ArrayList arrayList2) {
        this.a = j;
        this.b = g1hVar;
        Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(arrayList2);
    }

    public static BigInteger a(String str, y6d y6dVar) {
        if (str == null) {
            return null;
        }
        try {
            return new BigInteger(str);
        } catch (NumberFormatException e) {
            y6dVar.logException("RTCStat", "stat.parse", e);
            return null;
        }
    }

    public static long b(String str, y6d y6dVar) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            y6dVar.logException("RTCStat", "stat.parse", e);
            return -1L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142 A[LOOP:4: B:76:0x0140->B:77:0x0142, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c A[PHI: r35
  0x019c: PHI (r35v20 java.lang.String) = 
  (r35v11 java.lang.String)
  (r35v12 java.lang.String)
  (r35v13 java.lang.String)
  (r35v14 java.lang.String)
  (r35v15 java.lang.String)
  (r35v16 java.lang.String)
  (r35v17 java.lang.String)
  (r35v18 java.lang.String)
  (r35v21 java.lang.String)
 binds: [B:115:0x0207, B:111:0x01f9, B:107:0x01eb, B:103:0x01de, B:99:0x01d0, B:95:0x01c3, B:91:0x01b6, B:87:0x01a7, B:84:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.a7d d(defpackage.y6d r65, org.webrtc.StatsReport[] r66) {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a7d.d(y6d, org.webrtc.StatsReport[]):a7d");
    }

    public final u42 c() {
        for (u42 u42Var : this.d) {
            if (u42Var.k) {
                return u42Var;
            }
        }
        return null;
    }
}
