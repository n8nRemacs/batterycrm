package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class znf implements fve {
    public final fve a;
    public final nv2 b;

    public znf(ci5 ci5Var, nv2 nv2Var) {
        this.a = ci5Var;
        this.b = nv2Var;
    }

    @Override // defpackage.fve
    public final List b() {
        return this.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.x26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.z26 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ynf
            if (r0 == 0) goto L13
            r0 = r6
            ynf r0 = (defpackage.ynf) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ynf r0 = new ynf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            defpackage.g8j.b(r6)
            goto L44
        L2d:
            defpackage.g8j.b(r6)
            xnf r6 = new xnf
            nv2 r1 = r4.b
            r6.<init>(r5, r1)
            r0.X = r2
            fve r5 = r4.a
            java.lang.Object r5 = r5.d(r6, r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L44
            return r6
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znf.d(z26, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
