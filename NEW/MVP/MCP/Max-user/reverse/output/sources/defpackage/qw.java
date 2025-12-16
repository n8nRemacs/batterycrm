package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qw extends dtf implements sm6 {
    public int X;
    public int Y;
    public /* synthetic */ Object Z;
    public int o;
    public final /* synthetic */ xw s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(xw xwVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = xwVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qw) l((List) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qw qwVar = new qw(this.s0, continuation);
        qwVar.Z = obj;
        return qwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.Y
            r2 = 0
            qqg r3 = defpackage.qqg.a
            r4 = 3
            r5 = 2
            xw r6 = r0.s0
            r7 = 1
            g84 r8 = defpackage.g84.a
            if (r1 == 0) goto L3b
            if (r1 == r7) goto L2d
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            defpackage.g8j.b(r18)
            return r3
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            int r1 = r0.X
            int r5 = r0.o
            defpackage.g8j.b(r18)
            r9 = r5
            r5 = r18
            goto L7e
        L2d:
            int r1 = r0.X
            int r9 = r0.o
            java.lang.Object r10 = r0.Z
            java.util.List r10 = (java.util.List) r10
            defpackage.g8j.b(r18)
            r11 = r18
            goto L6d
        L3b:
            defpackage.g8j.b(r18)
            java.lang.Object r1 = r0.Z
            r10 = r1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = defpackage.ue3.I(r10)
            boolean r1 = r1 instanceof defpackage.i37
            java.lang.Object r9 = defpackage.ue3.Q(r10)
            boolean r9 = r9 instanceof defpackage.i37
            k18 r11 = r6.o
            java.lang.Object r11 = r11.getValue()
            w63 r11 = (defpackage.w63) r11
            long r12 = r6.a
            r0.Z = r10
            r0.o = r1
            r0.X = r9
            r0.Y = r7
            java.lang.Object r11 = r11.r(r12, r0)
            if (r11 != r8) goto L68
            goto Lbc
        L68:
            r16 = r9
            r9 = r1
            r1 = r16
        L6d:
            pb2 r11 = (defpackage.pb2) r11
            r0.Z = r2
            r0.o = r9
            r0.X = r1
            r0.Y = r5
            java.io.Serializable r5 = r6.A(r11, r10, r0)
            if (r5 != r8) goto L7e
            goto Lbc
        L7e:
            java.util.List r5 = (java.util.List) r5
            iv6 r10 = r6.c
            if (r1 == 0) goto L86
            r12 = r7
            goto L87
        L86:
            r12 = 0
        L87:
            if (r9 == 0) goto L8b
            r13 = r7
            goto L8c
        L8b:
            r13 = 0
        L8c:
            int r14 = r5.size()
            java.lang.String r15 = " | hasPrev="
            java.lang.String r7 = ", count:"
            java.lang.String r11 = "Messages state, hasNext="
            java.lang.StringBuilder r7 = defpackage.ho7.p(r11, r12, r15, r13, r7)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            r10.u(r7)
            tcf r6 = r6.y
            hr9 r7 = new hr9
            if (r1 == 0) goto Lac
            r1 = 1
            goto Lad
        Lac:
            r1 = 0
        Lad:
            if (r9 == 0) goto Lb1
            r9 = 1
            goto Lb2
        Lb1:
            r9 = 0
        Lb2:
            r7.<init>(r5, r1, r9)
            r0.Y = r4
            r6.m(r2, r7)
            if (r3 != r8) goto Lbd
        Lbc:
            return r8
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw.n(java.lang.Object):java.lang.Object");
    }
}
