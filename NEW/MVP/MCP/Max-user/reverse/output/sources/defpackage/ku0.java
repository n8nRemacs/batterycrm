package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ku0 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku0(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ku0) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ku0 ku0Var = new ku0(this.Y, continuation);
        ku0Var.X = obj;
        return ku0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r0.a(defpackage.w76.a, r6) != r3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L25
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            java.lang.Object r0 = r6.X
            z26 r0 = (defpackage.z26) r0
            defpackage.g8j.b(r7)
        L13:
            r7 = r0
            goto L2c
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r0 = r6.X
            z26 r0 = (defpackage.z26) r0
            defpackage.g8j.b(r7)
            goto L42
        L25:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.X
            z26 r7 = (defpackage.z26) r7
        L2c:
            x74 r0 = r6.b
            boolean r0 = defpackage.eoi.j(r0)
            if (r0 == 0) goto L4f
            r6.X = r7
            r6.o = r2
            long r4 = r6.Y
            java.lang.Object r0 = defpackage.s8j.d(r4, r6)
            if (r0 != r3) goto L41
            goto L4e
        L41:
            r0 = r7
        L42:
            r6.X = r0
            r6.o = r1
            w76 r7 = defpackage.w76.a
            java.lang.Object r7 = r0.a(r7, r6)
            if (r7 != r3) goto L13
        L4e:
            return r3
        L4f:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku0.n(java.lang.Object):java.lang.Object");
    }
}
