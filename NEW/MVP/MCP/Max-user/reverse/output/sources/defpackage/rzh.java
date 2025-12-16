package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class rzh implements cw7 {
    public final bx7 a;
    public final k18 b;
    public final Set c = Collections.singleton("unsupported_method_handler");
    public final pv0 d = gzi.a(0, 0, 7);
    public clh e;

    public rzh(bx7 bx7Var, k18 k18Var) {
        this.a = bx7Var;
        this.b = k18Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.cw7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r19
            bx7 r2 = r1.a
            boolean r3 = r0 instanceof defpackage.qzh
            if (r3 == 0) goto L19
            r3 = r0
            qzh r3 = (defpackage.qzh) r3
            int r4 = r3.Y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Y = r4
            goto L20
        L19:
            qzh r3 = new qzh
            q44 r0 = (defpackage.q44) r0
            r3.<init>(r1, r0)
        L20:
            java.lang.Object r0 = r3.o
            int r4 = r3.Y
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            rzh r2 = r3.d
            defpackage.g8j.b(r0)
            goto L88
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L37:
            defpackage.g8j.b(r0)
            tsg r0 = defpackage.usg.Companion     // Catch: java.lang.IllegalArgumentException -> L47
            zy7 r0 = r0.serializer()     // Catch: java.lang.IllegalArgumentException -> L47
            r4 = r18
            java.lang.Object r0 = r2.a(r0, r4)     // Catch: java.lang.IllegalArgumentException -> L47
            goto L54
        L47:
            r0 = move-exception
            java.lang.Class<bx7> r4 = defpackage.bx7.class
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = "json parse error"
            defpackage.wqi.e(r4, r6, r0)
            r0 = 0
        L54:
            usg r0 = (defpackage.usg) r0
            if (r0 != 0) goto L59
            goto Lad
        L59:
            ih5 r4 = new ih5
            java.lang.String r0 = r0.a
            hh5 r6 = new hh5
            java.lang.String r7 = "client.unsupported_method.unsupported_method"
            r6.<init>(r7)
            r4.<init>(r0, r6)
            rv7 r0 = new rv7
            eh5 r6 = defpackage.ih5.Companion
            zy7 r6 = r6.serializer()
            java.lang.String r2 = r2.b(r6, r4)
            java.lang.String r4 = "unsupported_method"
            r0.<init>(r4, r2)
            r3.d = r1
            r3.Y = r5
            pv0 r2 = r1.d
            java.lang.Object r0 = r2.h(r0, r3)
            g84 r2 = defpackage.g84.a
            if (r0 != r2) goto L87
            return r2
        L87:
            r2 = r1
        L88:
            clh r0 = r2.e
            if (r0 == 0) goto Lad
            k18 r2 = r2.b
            java.lang.Object r2 = r2.getValue()
            r6 = r2
            noh r6 = (defpackage.noh) r6
            long r8 = r0.a
            java.lang.String r10 = r0.b
            java.lang.Integer r13 = new java.lang.Integer
            r0 = 0
            r13.<init>(r0)
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r5)
            r15 = 128(0x80, float:1.8E-43)
            java.lang.String r7 = "unsupported_method"
            r11 = 0
            r12 = 1
            defpackage.noh.a(r6, r7, r8, r10, r11, r12, r13, r14, r15)
        Lad:
            qqg r0 = defpackage.qqg.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzh.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.cw7
    public final pv0 b() {
        return this.d;
    }

    @Override // defpackage.cw7
    public final Set c() {
        return this.c;
    }

    @Override // defpackage.cw7
    public final void d(clh clhVar) {
        this.e = clhVar;
    }
}
