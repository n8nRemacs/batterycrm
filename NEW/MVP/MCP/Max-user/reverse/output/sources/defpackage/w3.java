package defpackage;

import java.io.Serializable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w3 implements z26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public w3(z26 z26Var, sm6 sm6Var) {
        this.a = 23;
        this.b = z26Var;
        this.c = (dtf) sm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x055d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0186  */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v59, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r7.a(r1, r0) == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [dtf, sm6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.l36
            if (r0 == 0) goto L13
            r0 = r8
            l36 r0 = (defpackage.l36) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            l36 r0 = new l36
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.o
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.g8j.b(r8)
            goto L6c
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            z26 r7 = r0.Y
            java.lang.Object r1 = r0.X
            defpackage.g8j.b(r8)
            goto L56
        L3a:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r6.b
            z26 r8 = (defpackage.z26) r8
            java.lang.Object r1 = r6.c
            dtf r1 = (defpackage.dtf) r1
            r0.X = r7
            r0.Y = r8
            r0.o = r3
            java.lang.Object r1 = r1.invoke(r7, r0)
            if (r1 != r4) goto L52
            goto L6b
        L52:
            r5 = r1
            r1 = r7
            r7 = r8
            r8 = r5
        L56:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6c
            r8 = 0
            r0.X = r8
            r0.Y = r8
            r0.o = r2
            java.lang.Object r7 = r7.a(r1, r0)
            if (r7 != r4) goto L6c
        L6b:
            return r4
        L6c:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r1.a(r9, r0) == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.a56
            if (r0 == 0) goto L13
            r0 = r9
            a56 r0 = (defpackage.a56) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            a56 r0 = new a56
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.X
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L40
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            w3 r8 = r0.d
            defpackage.g8j.b(r9)
            goto L72
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.Z
            w3 r1 = r0.d
            defpackage.g8j.b(r9)
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
            goto L57
        L40:
            defpackage.g8j.b(r9)
            java.lang.Object r9 = r7.c
            avg r9 = (defpackage.avg) r9
            r0.d = r7
            r0.Z = r8
            r0.X = r3
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r4) goto L54
            goto L70
        L54:
            r1 = r9
            r9 = r8
            r8 = r7
        L57:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r8.b
            z26 r1 = (defpackage.z26) r1
            r0.d = r8
            r5 = 0
            r0.Z = r5
            r0.X = r2
            java.lang.Object r9 = r1.a(r9, r0)
            if (r9 != r4) goto L72
        L70:
            return r4
        L71:
            r3 = 0
        L72:
            if (r3 == 0) goto L77
            qqg r8 = defpackage.qqg.a
            return r8
        L77:
            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            one.me.chats.forward.ForwardPickerScreen r0 = (one.me.chats.forward.ForwardPickerScreen) r0
            boolean r1 = r7 instanceof defpackage.tg6
            if (r1 == 0) goto L17
            r1 = r7
            tg6 r1 = (defpackage.tg6) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.o = r2
            goto L1c
        L17:
            tg6 r1 = new tg6
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r7 = r1.d
            int r2 = r1.o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.g8j.b(r7)
            goto L69
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r5.b
            z26 r7 = (defpackage.z26) r7
            r2 = r6
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.getClass()
            yy7[] r2 = one.me.chats.forward.ForwardPickerScreen.I0
            boolean r2 = r0.N0()
            if (r2 != 0) goto L69
            jxb r0 = r0.I0()
            jzb r0 = r0.c
            cg6 r0 = (defpackage.cg6) r0
            hbd r0 = r0.n
            mcf r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            vg6 r0 = (defpackage.vg6) r0
            if (r0 == 0) goto L69
            boolean r0 = r0.d
            if (r0 != r3) goto L69
            r1.o = r3
            java.lang.Object r6 = r7.a(r6, r1)
            g84 r7 = defpackage.g84.a
            if (r6 != r7) goto L69
            return r7
        L69:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            bj7 r0 = (defpackage.bj7) r0
            boolean r1 = r8 instanceof defpackage.yi7
            if (r1 == 0) goto L17
            r1 = r8
            yi7 r1 = (defpackage.yi7) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.o = r2
            goto L1c
        L17:
            yi7 r1 = new yi7
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r1.d
            int r2 = r1.o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.g8j.b(r8)
            goto L8c
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r6.b
            z26 r8 = (defpackage.z26) r8
            yh5 r7 = (defpackage.yh5) r7
            java.lang.Object r7 = r7.a
            java.util.List r7 = (java.util.List) r7
            r2 = 3
            vo6[] r2 = new defpackage.vo6[r2]
            tcf r4 = r0.X
            java.lang.Object r4 = r4.getValue()
            r5 = 0
            r2[r5] = r4
            tcf r4 = r0.s0
            java.lang.Object r4 = r4.getValue()
            r2[r3] = r4
            tcf r0 = r0.Z
            java.lang.Object r0 = r0.getValue()
            r4 = 2
            r2[r4] = r0
            java.util.List r0 = defpackage.ve3.j(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L68:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L7d
            java.lang.Object r4 = r0.next()
            r5 = r4
            vo6 r5 = (defpackage.vo6) r5
            boolean r5 = r5.c
            if (r5 == 0) goto L68
            r2.add(r4)
            goto L68
        L7d:
            java.util.ArrayList r7 = defpackage.ue3.T(r2, r7)
            r1.o = r3
            java.lang.Object r7 = r8.a(r7, r1)
            g84 r8 = defpackage.g84.a
            if (r7 != r8) goto L8c
            return r8
        L8c:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object k(Object obj, Continuation continuation) {
        Object value;
        zk7 xk7Var;
        vh vhVar = (vh) obj;
        tcf tcfVar = ((qk7) this.b).j;
        String str = (String) this.c;
        do {
            value = tcfVar.getValue();
            xk7Var = (zk7) value;
            xk7 xk7Var2 = xk7Var instanceof xk7 ? (xk7) xk7Var : null;
            if (xk7Var2 != null) {
                xk7 xk7Var3 = fni.a(xk7Var2.a, str) ? xk7Var2 : null;
                if (xk7Var3 != null) {
                    xk7Var = new xk7(xk7Var3.a, xk7Var3.b, xk7Var3.c, qk7.b(vhVar), xk7Var3.e);
                }
            }
        } while (!tcfVar.c(value, xk7Var));
        return qqg.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:722:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.z26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r31, kotlin.coroutines.Continuation r32) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ w3(Serializable serializable, z26 z26Var, int i) {
        this.a = i;
        this.c = serializable;
        this.b = z26Var;
    }

    public /* synthetic */ w3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
