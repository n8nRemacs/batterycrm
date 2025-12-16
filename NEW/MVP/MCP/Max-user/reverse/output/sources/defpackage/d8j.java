package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class d8j {
    public static final String a(Long l) {
        if (l.longValue() > 0) {
            return String.format(Locale.ENGLISH, "%d [%tF %tT %tL]", Arrays.copyOf(new Object[]{l, l, l, l}, 4));
        }
        return l + "ms";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:54|23|63|24|(7:27|28|29|30|50|(0)|(0)(0))|48) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        r15 = r1;
        r1 = r12;
        r12 = r8;
        r8 = r9;
        r10 = r13;
        r13 = r7;
        r7 = r11;
        r11 = r14;
        r14 = r3;
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        defpackage.wqi.c(r13, "retry api request: no connection, await for connection available", new java.lang.Object[0]);
        r17 = r2;
        r2 = new defpackage.sra(r11.g.g(defpackage.lcj.A0), new defpackage.mnd(r13), defpackage.pdf.e, defpackage.pdf.d);
        r1.d = r15;
        r1.o = r14;
        r1.X = r13;
        r1.Y = r12;
        r1.Z = r11;
        r1.s0 = r10;
        r1.t0 = r8;
        r1.u0 = r7;
        r1.v0 = r3;
        r4 = 2;
        r1.x0 = 2;
        r0 = defpackage.n8j.c(r2, r1);
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
    
        if (r0 != r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012b, code lost:
    
        r5 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0134, code lost:
    
        if (defpackage.d1g.c(r0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0136, code lost:
    
        r1.d = r15;
        r1.o = r14;
        r1.X = r13;
        r1.Y = r12;
        r1.Z = r11;
        r1.s0 = r10;
        r1.t0 = r8;
        r1.u0 = r7;
        r1.v0 = r3;
        r5 = 3;
        r1.x0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014f, code lost:
    
        if (defpackage.s8j.d(r8, r1) == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0176, code lost:
    
        defpackage.bxe.i(r12, new ru.ok.tamtam.folders.usecases.CustomApiException("Got api error in useCase=".concat(r13), r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0184, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0190, code lost:
    
        throw new ru.ok.tamtam.folders.usecases.MaxRetryCountExceededException("Got max retries for useCase=".concat(r13));
     */
    /* JADX WARN: Path cross not found for [B:34:0x00e2, B:42:0x012d], limit reached: 63 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c2 -> B:30:0x00cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x014f -> B:49:0x0152). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.hwa r19, defpackage.n2 r20, java.lang.String r21, defpackage.yi5 r22, long r23, int r25, defpackage.q44 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d8j.b(hwa, n2, java.lang.String, yi5, long, int, q44):java.lang.Object");
    }

    public static /* synthetic */ Object c(hwa hwaVar, n2 n2Var, String str, yi5 yi5Var, q44 q44Var) {
        int i = s65.d;
        return b(hwaVar, n2Var, str, yi5Var, v9j.h(1, y65.SECONDS), 3, q44Var);
    }
}
