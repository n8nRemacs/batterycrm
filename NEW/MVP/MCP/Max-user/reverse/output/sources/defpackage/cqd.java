package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class cqd implements cs3 {
    public final bwf a;
    public final k18 b;
    public final tgg c;
    public final String d = cqd.class.getName();
    public final wce e;
    public final ConcurrentLinkedQueue f;
    public final n9a g;

    public cqd(bwf bwfVar, k18 k18Var, tgg tggVar) {
        this.a = bwfVar;
        this.b = k18Var;
        this.c = tggVar;
        int i = hr3.$EnumSwitchMapping$0[tggVar.a().ordinal()];
        int i2 = (i == 1 || i == 2) ? 10 : 7;
        int i3 = xce.a;
        this.e = new wce(i2);
        this.f = new ConcurrentLinkedQueue();
        Symbol symbol = o9a.a;
        this.g = new n9a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:4|(1:6)(1:7))(0)|8|50|(1:(1:(12:12|54|13|32|34|(1:36)|26|(2:28|29)(4:39|(1:41)(2:42|(1:44))|45|46)|37|38|48|49)(2:17|18))(1:19))(3:20|(1:23)|31)|52|24|25|26|(0)(0)|37|38|48|49) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r11.a(r1) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:34:0x0085, B:26:0x0063, B:28:0x0069, B:39:0x0096, B:42:0x00a2, B:44:0x00aa, B:36:0x008b, B:33:0x0080, B:13:0x0031, B:29:0x006f), top: B:50:0x0025, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:34:0x0085, B:26:0x0063, B:28:0x0069, B:39:0x0096, B:42:0x00a2, B:44:0x00aa, B:36:0x008b, B:33:0x0080, B:13:0x0031, B:29:0x006f), top: B:50:0x0025, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [j9a] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j9a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007b -> B:32:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0080 -> B:34:0x0085). Please report as a decompilation issue!!! */
    @Override // defpackage.cs3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r10 = this;
            qqg r0 = defpackage.qqg.a
            boolean r1 = r11 instanceof defpackage.aqd
            if (r1 == 0) goto L15
            r1 = r11
            aqd r1 = (defpackage.aqd) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1c
        L15:
            aqd r1 = new aqd
            q44 r11 = (defpackage.q44) r11
            r1.<init>(r10, r11)
        L1c:
            java.lang.Object r11 = r1.Y
            g84 r2 = defpackage.g84.a
            int r3 = r1.s0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L47
            if (r3 == r5) goto L3f
            if (r3 != r4) goto L37
            java.util.Iterator r3 = r1.X
            j9a r5 = r1.o
            cqd r7 = r1.d
            defpackage.g8j.b(r11)     // Catch: java.lang.Throwable -> L35
            goto L7e
        L35:
            r11 = move-exception
            goto L80
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            j9a r3 = r1.o
            cqd r5 = r1.d
            defpackage.g8j.b(r11)
            goto L5a
        L47:
            defpackage.g8j.b(r11)
            n9a r3 = r10.g
            r1.d = r10
            r1.o = r3
            r1.s0 = r5
            java.lang.Object r11 = r3.e(r6, r1)
            if (r11 != r2) goto L59
            goto L7d
        L59:
            r5 = r10
        L5a:
            java.util.concurrent.ConcurrentLinkedQueue r11 = r5.f     // Catch: java.lang.Throwable -> Lb5
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Lb5
            r7 = r5
            r5 = r3
            r3 = r11
        L63:
            boolean r11 = r3.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r11 == 0) goto L96
            java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> L93
            ebg r11 = (defpackage.ebg) r11     // Catch: java.lang.Throwable -> L93
            r1.d = r7     // Catch: java.lang.Throwable -> L35
            r1.o = r5     // Catch: java.lang.Throwable -> L35
            r1.X = r3     // Catch: java.lang.Throwable -> L35
            r1.s0 = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r11 = r11.a(r1)     // Catch: java.lang.Throwable -> L35
            if (r11 != r2) goto L7e
        L7d:
            return r2
        L7e:
            r8 = r0
            goto L85
        L80:
            ipd r8 = new ipd     // Catch: java.lang.Throwable -> L93
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L93
        L85:
            java.lang.Throwable r11 = defpackage.kpd.a(r8)     // Catch: java.lang.Throwable -> L93
            if (r11 == 0) goto L63
            java.lang.String r8 = r7.d     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = "Error closing connection during pool shutdown"
            defpackage.wqi.e(r8, r9, r11)     // Catch: java.lang.Throwable -> L93
            goto L63
        L93:
            r11 = move-exception
            r3 = r5
            goto Lb6
        L96:
            java.util.concurrent.ConcurrentLinkedQueue r11 = r7.f     // Catch: java.lang.Throwable -> L93
            r11.clear()     // Catch: java.lang.Throwable -> L93
            java.lang.String r11 = r7.d     // Catch: java.lang.Throwable -> L93
            l6b r1 = defpackage.wqi.a     // Catch: java.lang.Throwable -> L93
            if (r1 != 0) goto La2
            goto Laf
        La2:
            lg8 r2 = defpackage.lg8.d     // Catch: java.lang.Throwable -> L93
            boolean r3 = r1.b(r2)     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto Laf
            java.lang.String r3 = "Connection pool closed"
            r1.c(r2, r11, r3, r6)     // Catch: java.lang.Throwable -> L93
        Laf:
            n9a r5 = (defpackage.n9a) r5
            r5.g(r6)
            return r0
        Lb5:
            r11 = move-exception
        Lb6:
            n9a r3 = (defpackage.n9a) r3
            r3.g(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqd.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
    
        if (r0 != r4) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:38:0x00ca, B:40:0x00d4, B:43:0x00db, B:45:0x00e1, B:49:0x00eb, B:55:0x00fd, B:62:0x0120, B:52:0x00f2, B:54:0x00f8), top: B:77:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:38:0x00ca, B:40:0x00d4, B:43:0x00db, B:45:0x00e1, B:49:0x00eb, B:55:0x00fd, B:62:0x0120, B:52:0x00f2, B:54:0x00f8), top: B:77:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r12v6, types: [ebg] */
    /* JADX WARN: Type inference failed for: r16v0, types: [ebg] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ebg] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ebg] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cqd] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.cs3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ly5 r18, defpackage.q44 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqd.b(ly5, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:22:0x005d, B:25:0x0069, B:27:0x0071), top: B:41:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.cs3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ebg r8, defpackage.q44 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Connection returned to pool, pool size="
            boolean r1 = r9 instanceof defpackage.bqd
            if (r1 == 0) goto L15
            r1 = r9
            bqd r1 = (defpackage.bqd) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1a
        L15:
            bqd r1 = new bqd
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.Y
            g84 r2 = defpackage.g84.a
            int r3 = r1.s0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L44
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            cqd r8 = r1.d
            defpackage.g8j.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            n9a r8 = r1.X
            ebg r2 = r1.o
            cqd r1 = r1.d
            defpackage.g8j.b(r9)
            r9 = r8
            r8 = r2
            goto L5d
        L44:
            defpackage.g8j.b(r9)
            boolean r9 = r8 instanceof defpackage.ebg
            if (r9 == 0) goto L91
            n9a r9 = r7.g
            r1.d = r7
            r1.o = r8
            r1.X = r9
            r1.s0 = r5
            java.lang.Object r1 = r9.e(r6, r1)
            if (r1 != r2) goto L5c
            goto L9b
        L5c:
            r1 = r7
        L5d:
            java.util.concurrent.ConcurrentLinkedQueue r2 = r1.f     // Catch: java.lang.Throwable -> L87
            r2.offer(r8)     // Catch: java.lang.Throwable -> L87
            java.lang.String r8 = r1.d     // Catch: java.lang.Throwable -> L87
            l6b r2 = defpackage.wqi.a     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L69
            goto L89
        L69:
            lg8 r3 = defpackage.lg8.d     // Catch: java.lang.Throwable -> L87
            boolean r4 = r2.b(r3)     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L89
            java.util.concurrent.ConcurrentLinkedQueue r4 = r1.f     // Catch: java.lang.Throwable -> L87
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L87
            r5.append(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L87
            r2.c(r3, r8, r0, r6)     // Catch: java.lang.Throwable -> L87
            goto L89
        L87:
            r8 = move-exception
            goto L8d
        L89:
            r9.g(r6)
            goto L9e
        L8d:
            r9.g(r6)
            throw r8
        L91:
            r1.d = r7
            r1.s0 = r4
            java.lang.Object r8 = r8.a(r1)
            if (r8 != r2) goto L9c
        L9b:
            return r2
        L9c:
            r8 = r7
        L9d:
            r1 = r8
        L9e:
            wce r8 = r1.e
            r8.c()
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqd.c(ebg, q44):java.lang.Object");
    }
}
