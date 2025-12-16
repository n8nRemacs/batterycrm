package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xnf implements z26 {
    public final z26 a;
    public final nv2 b;

    public xnf(z26 z26Var, nv2 nv2Var) {
        this.a = z26Var;
        this.b = nv2Var;
    }

    @Override // defpackage.z26
    public final Object a(Object obj, Continuation continuation) {
        return this.a.a(obj, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q44] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.q44 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.wnf
            if (r0 == 0) goto L13
            r0 = r8
            wnf r0 = (defpackage.wnf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            wnf r0 = new wnf
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            int r1 = r0.Z
            qqg r2 = defpackage.qqg.a
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2c
            defpackage.g8j.b(r8)
            return r2
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            iwd r1 = r0.o
            xnf r4 = r0.d
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L3c
            goto L59
        L3c:
            r8 = move-exception
            goto L73
        L3e:
            defpackage.g8j.b(r8)
            iwd r1 = new iwd
            z26 r8 = r7.a
            x74 r6 = r0.b
            r1.<init>(r8, r6)
            nv2 r8 = r7.b     // Catch: java.lang.Throwable -> L3c
            r0.d = r7     // Catch: java.lang.Throwable -> L3c
            r0.o = r1     // Catch: java.lang.Throwable -> L3c
            r0.Z = r4     // Catch: java.lang.Throwable -> L3c
            r8.invoke(r1, r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r5) goto L58
            goto L71
        L58:
            r4 = r7
        L59:
            r1.o()
            z26 r8 = r4.a
            boolean r1 = r8 instanceof defpackage.xnf
            if (r1 == 0) goto L72
            xnf r8 = (defpackage.xnf) r8
            r1 = 0
            r0.d = r1
            r0.o = r1
            r0.Z = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r5) goto L72
        L71:
            return r5
        L72:
            return r2
        L73:
            r1.o()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xnf.b(q44):java.lang.Object");
    }
}
