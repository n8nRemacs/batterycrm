package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ju7 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ r30 Y;
    public final /* synthetic */ i13 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju7(r30 r30Var, i13 i13Var, Continuation continuation) {
        super(2, continuation);
        this.Y = r30Var;
        this.Z = i13Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ju7) l((hu7) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ju7 ju7Var = new ju7(this.Y, this.Z, continuation);
        ju7Var.X = obj;
        return ju7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r11.join(r10) == r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            r30 r0 = r10.Y
            java.lang.Object r1 = r0.a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.c
            cj0 r2 = (defpackage.cj0) r2
            int r3 = r10.o
            qqg r4 = defpackage.qqg.a
            r5 = 2
            r6 = 1
            g84 r7 = defpackage.g84.a
            if (r3 == 0) goto L2d
            if (r3 == r6) goto L25
            if (r3 != r5) goto L1d
            defpackage.g8j.b(r11)
            goto L91
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            java.lang.Object r3 = r10.X
            java.lang.String r3 = (java.lang.String) r3
            defpackage.g8j.b(r11)
            goto L5a
        L2d:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.X
            hu7 r11 = (defpackage.hu7) r11
            java.lang.String r3 = r11.a
            x9f r11 = r11.b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Peek from queue job="
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            r2.invoke(r1, r8)
            boolean r8 = r11.isCancelled()
            if (r8 != 0) goto L6c
            r10.X = r3
            r10.o = r6
            java.lang.Object r11 = r11.join(r10)
            if (r11 != r7) goto L5a
            goto L90
        L5a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r6 = "Executed job="
            r11.<init>(r6)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r2.invoke(r1, r11)
            goto L7d
        L6c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r6 = "Cancelled job="
            r11.<init>(r6)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r2.invoke(r1, r11)
        L7d:
            java.lang.Object r11 = r0.o
            java.util.concurrent.ConcurrentHashMap r11 = (java.util.concurrent.ConcurrentHashMap) r11
            r11.remove(r3)
            r11 = 0
            r10.X = r11
            r10.o = r5
            i13 r11 = r10.Z
            r11.invoke(r10)
            if (r4 != r7) goto L91
        L90:
            return r7
        L91:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju7.n(java.lang.Object):java.lang.Object");
    }
}
