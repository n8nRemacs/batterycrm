package defpackage;

import android.text.Spannable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class n6g {
    public static final Pattern a = Pattern.compile("#(?i)([\\p{L}0-9_]+)");

    public static void a(Spannable spannable, i88 i88Var, boolean z, int i) {
        pz1 pz1Var = new pz1(spannable, i88Var, i, 8);
        if (i88Var == i88.d) {
            c(spannable.toString(), b(i88Var, z), bpb.a, bpb.d, false, pz1Var);
        } else {
            c(spannable.toString(), b(i88Var, z), bpb.a, null, false, pz1Var);
        }
    }

    public static Pattern b(i88 i88Var, boolean z) {
        int iOrdinal = i88Var.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? m6g.a : m6g.a : z ? m6g.e : m6g.c : a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.CharSequence r5, java.util.regex.Pattern r6, java.util.regex.Pattern r7, java.util.regex.Pattern r8, boolean r9, defpackage.gu3 r10) {
        /*
            java.util.regex.Matcher r0 = r6.matcher(r5)
        L4:
            boolean r1 = r0.find()
            if (r1 == 0) goto Ldb
            java.util.regex.Matcher r1 = r7.matcher(r5)
        Le:
            boolean r2 = r1.find()
            if (r2 == 0) goto L51
            int r2 = r0.start()
            int r3 = r1.start()
            if (r2 < r3) goto L28
            int r2 = r0.end()
            int r3 = r1.end()
            if (r2 <= r3) goto L4
        L28:
            int r2 = r0.end()
            int r3 = r1.end()
            if (r2 > r3) goto L3c
            int r2 = r0.end()
            int r3 = r1.start()
            if (r2 >= r3) goto L4
        L3c:
            int r2 = r0.start()
            int r3 = r1.end()
            if (r2 > r3) goto Le
            int r2 = r0.end()
            int r3 = r1.end()
            if (r2 < r3) goto Le
            goto L4
        L51:
            if (r9 != 0) goto L88
            java.util.regex.Pattern r1 = defpackage.m6g.a
            if (r6 == r1) goto L58
            goto L88
        L58:
            java.util.regex.Pattern r1 = defpackage.m6g.e
            java.util.regex.Matcher r1 = r1.matcher(r5)
        L5e:
            boolean r2 = r1.find()
            if (r2 == 0) goto L88
            int r2 = r0.start()
            int r3 = r1.start()
            if (r2 < r3) goto L88
            int r2 = r0.end()
            int r3 = r1.end()
            if (r2 > r3) goto L88
            java.lang.String r2 = r1.group()
            java.lang.String r3 = r0.group()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L5e
            goto L4
        L88:
            if (r8 != 0) goto L8b
            goto Lb9
        L8b:
            java.util.regex.Matcher r1 = r8.matcher(r5)
        L8f:
            boolean r2 = r1.find()
            if (r2 == 0) goto Lb9
            int r2 = r0.start()
            int r3 = r1.start()
            if (r2 < r3) goto Lb9
            int r2 = r0.end()
            int r3 = r1.end()
            if (r2 > r3) goto Lb9
            java.lang.String r2 = r1.group()
            java.lang.String r3 = r0.group()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L8f
            goto L4
        Lb9:
            j6g r1 = new j6g     // Catch: java.lang.Throwable -> Lcf
            int r2 = r0.start()     // Catch: java.lang.Throwable -> Lcf
            int r3 = r0.end()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r4 = r0.group()     // Catch: java.lang.Throwable -> Lcf
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> Lcf
            r10.accept(r1)     // Catch: java.lang.Throwable -> Lcf
            goto L4
        Lcf:
            r1 = move-exception
            java.lang.String r2 = "n6g"
            java.lang.String r3 = r1.getMessage()
            defpackage.wqi.e(r2, r3, r1)
            goto L4
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n6g.c(java.lang.CharSequence, java.util.regex.Pattern, java.util.regex.Pattern, java.util.regex.Pattern, boolean, gu3):void");
    }
}
