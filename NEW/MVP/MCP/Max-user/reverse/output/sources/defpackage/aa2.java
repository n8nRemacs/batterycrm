package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class aa2 extends t92 {
    public final x26 d;

    public aa2(int i, int i2, x74 x74Var, x26 x26Var) {
        super(x74Var, i, i2);
        this.d = x26Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    @Override // defpackage.t92, defpackage.x26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.z26 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.b
            r1 = -3
            g84 r2 = defpackage.g84.a
            if (r0 != r1) goto L6d
            x74 r0 = r7.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            cj0 r3 = new cj0
            r4 = 12
            r3.<init>(r4)
            x74 r4 = r5.a
            java.lang.Object r1 = r4.fold(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L27
            x74 r1 = r0.plus(r4)
            goto L2c
        L27:
            r1 = 0
            x74 r1 = defpackage.z6j.a(r0, r4, r1)
        L2c:
            boolean r3 = defpackage.fni.a(r1, r0)
            if (r3 == 0) goto L39
            java.lang.Object r6 = r5.n(r6, r7)
            if (r6 != r2) goto L74
            return r6
        L39:
            jbe r3 = defpackage.jbe.t0
            v74 r4 = r1.get(r3)
            v74 r0 = r0.get(r3)
            boolean r0 = defpackage.fni.a(r4, r0)
            if (r0 == 0) goto L6d
            x74 r0 = r7.getContext()
            boolean r3 = r6 instanceof defpackage.xde
            if (r3 != 0) goto L5c
            boolean r3 = r6 instanceof defpackage.kia
            if (r3 == 0) goto L56
            goto L5c
        L56:
            a40 r3 = new a40
            r3.<init>(r6, r0)
            r6 = r3
        L5c:
            z92 r0 = new z92
            r3 = 0
            r0.<init>(r5, r3)
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r1)
            java.lang.Object r6 = defpackage.ezi.a(r1, r6, r3, r0, r7)
            if (r6 != r2) goto L74
            return r6
        L6d:
            java.lang.Object r6 = super.d(r6, r7)
            if (r6 != r2) goto L74
            return r6
        L74:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa2.d(z26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.t92
    public final Object j(sac sacVar, Continuation continuation) {
        Object objN = n(new xde(sacVar), continuation);
        return objN == g84.a ? objN : qqg.a;
    }

    public abstract Object n(z26 z26Var, Continuation continuation);

    @Override // defpackage.t92
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
