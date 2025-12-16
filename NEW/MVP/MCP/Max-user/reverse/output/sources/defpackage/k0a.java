package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class k0a {
    public final q5b a;
    public final k18 b;
    public final z74 c;
    public final z74 d;
    public final ContextScope e;
    public final bwf f;

    public k0a(q5b q5bVar, lzf lzfVar, qi8 qi8Var, k18 k18Var, k18 k18Var2) {
        this.a = q5bVar;
        this.b = k18Var;
        q2b q2bVar = (q2b) lzfVar;
        z74 z74VarLimitedParallelism = q2bVar.b().limitedParallelism(1, "mini-chats-io");
        this.c = z74VarLimitedParallelism;
        this.d = q2bVar.a().limitedParallelism(1, "mini-chats-computation");
        ContextScope contextScopeA = d7j.a(z74VarLimitedParallelism);
        this.e = contextScopeA;
        this.f = new bwf(new nz(this, k18Var2));
        String name = k0a.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "instance created " + this, null);
            }
        }
        svi.e(contextScopeA, null, null, new d0a(qi8Var, this, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:11|30|(1:32)(1:33)|55|34|38|(1:40)(1:41)|42|(1:44)(1:46)|45|47|(1:49)(1:51)|50|52|15|(2:17|(3:22|(2:24|(1:21))|(1:57)(16:29|30|(0)(0)|55|34|38|(0)(0)|42|(0)(0)|45|47|(0)(0)|50|52|15|(2:53|54)(0)))(3:19|(0)|(0)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        defpackage.wqi.e(r6.getClass().getName(), "fail to decode protospans", r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:22:0x0091, B:19:0x0089], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[PHI: r7
  0x008f: PHI (r7v5 java.lang.Object) = (r7v3 java.lang.Object), (r7v6 java.lang.Object) binds: [B:25:0x00ab, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b2 -> B:30:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.k0a r38, java.util.List r39, defpackage.q44 r40) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0a.a(k0a, java.util.List, q44):java.lang.Object");
    }
}
