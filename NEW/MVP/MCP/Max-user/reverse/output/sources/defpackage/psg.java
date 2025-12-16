package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class psg {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final m8a h = new m8a();
    public final n9a i;
    public final String j;

    public psg(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7) {
        this.a = k18Var2;
        this.b = k18Var3;
        this.c = k18Var4;
        this.d = k18Var;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = k18Var7;
        Symbol symbol = o9a.a;
        this.i = new n9a();
        this.j = psg.class.getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.psg r4, long r5, java.util.Set r7, defpackage.q44 r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof defpackage.isg
            if (r0 == 0) goto L16
            r0 = r8
            isg r0 = (defpackage.isg) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.t0 = r1
            goto L1b
        L16:
            isg r0 = new isg
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r8 = r0.Z
            int r1 = r0.t0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            long r5 = r0.Y
            n9a r4 = r0.X
            java.util.Set r7 = r0.o
            psg r0 = r0.d
            defpackage.g8j.b(r8)
            r8 = r4
            r4 = r0
            goto L53
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            defpackage.g8j.b(r8)
            n9a r8 = r4.i
            r0.d = r4
            r0.o = r7
            r0.X = r8
            r0.Y = r5
            r0.t0 = r2
            java.lang.Object r0 = r8.e(r3, r0)
            g84 r1 = defpackage.g84.a
            if (r0 != r1) goto L53
            return r1
        L53:
            m8a r0 = r4.h     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.d(r5)     // Catch: java.lang.Throwable -> L6d
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6f
            boolean r7 = r0.removeAll(r7)     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L70
            m8a r4 = r4.h     // Catch: java.lang.Throwable -> L6d
            r4.g(r5)     // Catch: java.lang.Throwable -> L6d
            goto L70
        L6d:
            r4 = move-exception
            goto L78
        L6f:
            r7 = 0
        L70:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L6d
            r8.g(r3)
            return r4
        L78:
            r8.g(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psg.a(psg, long, java.util.Set, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, long r7, defpackage.q44 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.gsg
            if (r0 == 0) goto L13
            r0 = r9
            gsg r0 = (defpackage.gsg) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            gsg r0 = new gsg
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.Z
            int r1 = r0.t0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            long r7 = r0.Y
            long r5 = r0.X
            n9a r1 = r0.o
            psg r0 = r0.d
            defpackage.g8j.b(r9)
            goto L4f
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            defpackage.g8j.b(r9)
            r0.d = r4
            n9a r1 = r4.i
            r0.o = r1
            r0.X = r5
            r0.Y = r7
            r0.t0 = r2
            java.lang.Object r9 = r1.e(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r9 != r0) goto L4e
            return r0
        L4e:
            r0 = r4
        L4f:
            m8a r9 = r0.h     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r9.d(r5)     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L62
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L60
            r9.h(r5, r0)     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r5 = move-exception
            goto L75
        L62:
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L60
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> L60
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L60
            boolean r5 = r0.add(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L60
            r1.g(r3)
            return r5
        L75:
            r1.g(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psg.b(long, long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r6, long r8, defpackage.q44 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.jsg
            if (r0 == 0) goto L13
            r0 = r10
            jsg r0 = (defpackage.jsg) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            jsg r0 = new jsg
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.Z
            int r1 = r0.t0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            long r8 = r0.Y
            long r6 = r0.X
            n9a r1 = r0.o
            psg r0 = r0.d
            defpackage.g8j.b(r10)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.g8j.b(r10)
            r0.d = r5
            n9a r1 = r5.i
            r0.o = r1
            r0.X = r6
            r0.Y = r8
            r0.t0 = r2
            java.lang.Object r10 = r1.e(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r10 != r0) goto L4e
            return r0
        L4e:
            r0 = r5
        L4f:
            m8a r10 = r0.h     // Catch: java.lang.Throwable -> L70
            java.lang.Object r10 = r10.d(r6)     // Catch: java.lang.Throwable -> L70
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch: java.lang.Throwable -> L70
            if (r10 == 0) goto L72
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L70
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L70
            boolean r8 = r10.remove(r4)     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto L72
            boolean r8 = r10.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto L72
            m8a r8 = r0.h     // Catch: java.lang.Throwable -> L70
            r8.g(r6)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r6 = move-exception
            goto L7b
        L72:
            r2 = 0
        L73:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L70
            r1.g(r3)
            return r6
        L7b:
            r1.g(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psg.c(long, long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fa -> B:35:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0176 -> B:54:0x0177). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r22, defpackage.xs r24, defpackage.q44 r25) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psg.d(long, xs, q44):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:101|18|197|102|103|211|104|(1:106)(4:108|215|109|(14:111|203|112|113|191|114|115|217|116|117|195|118|131|(7:134|135|136|171|172|179|(0)(0)))(1:130))|107|131|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:91|(1:221)|92|93|219|94|95|209|96|97|213|98|(11:101|18|197|102|103|211|104|(1:106)(4:108|215|109|(14:111|203|112|113|191|114|115|217|116|117|195|118|131|(7:134|135|136|171|172|179|(0)(0)))(1:130))|107|131|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:111|(1:203)|112|113|191|114|115|217|116|117|195|118|131|(7:134|135|136|171|172|179|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:111|203|112|113|191|114|115|217|116|117|195|118|131|(7:134|135|136|171|172|179|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:79|(1:205)|80|201|81|82|193|83|84|189|85|86|199|87|88|(13:91|221|92|93|219|94|95|209|96|97|213|98|(11:101|18|197|102|103|211|104|(1:106)(4:108|215|109|(14:111|203|112|113|191|114|115|217|116|117|195|118|131|(7:134|135|136|171|172|179|(0)(0)))(1:130))|107|131|(0)))|48|176) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0489, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x048a, code lost:
    
        r1 = r6;
        r6 = r12;
        r5 = r14;
        r12 = r15;
        r27 = r29;
        r14 = r31;
        r29 = r33;
        r7 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0498, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x049b, code lost:
    
        r1 = r6;
        r6 = r12;
        r5 = r14;
        r12 = r15;
        r27 = r29;
        r14 = r31;
        r29 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04a8, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04aa, code lost:
    
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0514, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0515, code lost:
    
        r31 = r1;
        r2 = r27;
        r5 = r29;
        r29 = r6;
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0520, code lost:
    
        r14 = r33;
        r27 = r5;
        r5 = r6;
        r6 = r12;
        r30 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0529, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x052a, code lost:
    
        r31 = r1;
        r29 = r6;
        r6 = r14;
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0534, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0535, code lost:
    
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0537, code lost:
    
        r27 = r5;
        r5 = r10;
        r42 = r3;
        r3 = r1;
        r4 = r13;
        r1 = r29;
        r29 = r14;
        r44 = r11;
        r11 = r6;
        r12 = r15;
        r6 = r30;
        r30 = r7;
        r14 = r8;
        r9 = r44;
        r7 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0551, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0552, code lost:
    
        r1 = r3;
        r30 = r4;
        r2 = r27;
        r3 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x055a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x055b, code lost:
    
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0569, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x056a, code lost:
    
        r2 = r27;
        r27 = r47;
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0571, code lost:
    
        r42 = r6;
        r6 = r3;
        r3 = r32;
        r11 = r4;
        r4 = r5;
        r5 = r12;
        r12 = r15;
        r9 = r30;
        r30 = r42;
        r14 = r7;
        r7 = r10;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0584, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0585, code lost:
    
        r30 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0588, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0589, code lost:
    
        r47 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x058c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x058d, code lost:
    
        r32 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x035d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r10v26, types: [long] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x05f5 -> B:170:0x05fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x062d -> B:172:0x060b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x0661 -> B:184:0x066d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0226 -> B:34:0x0239). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x02c8 -> B:50:0x02d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0335 -> B:63:0x033e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0377 -> B:76:0x038a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.n8a r47, defpackage.q44 r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psg.e(n8a, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.w4a r11, defpackage.q44 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.osg
            if (r0 == 0) goto L13
            r0 = r12
            osg r0 = (defpackage.osg) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            osg r0 = new osg
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            w4a r11 = r0.o
            psg r0 = r0.d
            defpackage.g8j.b(r12)
            goto L4e
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.g8j.b(r12)
            k18 r12 = r10.a
            java.lang.Object r12 = r12.getValue()
            w63 r12 = (defpackage.w63) r12
            long r3 = r11.c
            r0.d = r10
            r0.o = r11
            r0.Z = r2
            java.lang.Object r12 = r12.h(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r12 != r0) goto L4d
            return r0
        L4d:
            r0 = r10
        L4e:
            pb2 r12 = (defpackage.pb2) r12
            qqg r1 = defpackage.qqg.a
            if (r12 != 0) goto L55
            goto Lab
        L55:
            long r3 = r12.a
            sz r11 = r11.d
            java.util.Iterator r11 = r11.iterator()
        L5d:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r5 = r11.next()
            r6 = r5
            fh9 r6 = (defpackage.fh9) r6
            long r6 = r6.a
            eh9 r8 = r12.c
            si9 r8 = r8.a
            long r8 = r8.b
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L5d
            goto L78
        L77:
            r5 = 0
        L78:
            if (r5 == 0) goto Lab
            k18 r11 = r0.c
            java.lang.Object r11 = r11.getValue()
            gx9 r11 = (defpackage.gx9) r11
            bsd r11 = r11.a
            rs4 r12 = defpackage.rs4.REGULAR
            si9 r11 = r11.m(r3, r12)
            if (r11 != 0) goto L8d
            goto Lab
        L8d:
            k18 r12 = r0.g
            java.lang.Object r12 = r12.getValue()
            c7c r12 = (defpackage.c7c) r12
            long r5 = r11.a
            java.util.concurrent.ConcurrentHashMap r12 = r12.c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r12.remove(r5)
            k18 r12 = r0.b
            java.lang.Object r12 = r12.getValue()
            ve2 r12 = (defpackage.ve2) r12
            r12.s0(r3, r11, r2)
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psg.f(w4a, q44):java.lang.Object");
    }
}
