package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class spf {
    public static final Pattern b = Pattern.compile("\\s");
    public final pf2 a;

    public spf(pf2 pf2Var) {
        this.a = pf2Var;
    }

    public static List a(List list, Predicate predicate) {
        if (list == null) {
            return hd5.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            gpf gpfVar = null;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            wr0 wr0Var = (wr0) obj;
            if ((predicate.test(wr0Var) ? wr0Var : null) != null) {
                long j = (wr0Var.a * 31) + i;
                String str = wr0Var.c;
                gpfVar = new gpf(j, 3, str, wr0Var.d, str, null, null, null);
            }
            if (gpfVar != null) {
                arrayList.add(gpfVar);
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0116, code lost:
    
        if (r2 == r7) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.xpf r12, java.lang.String r13, int r14, java.util.List r15, defpackage.qpf r16, defpackage.q44 r17) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spf.b(xpf, java.lang.String, int, java.util.List, qpf, q44):java.lang.Object");
    }
}
