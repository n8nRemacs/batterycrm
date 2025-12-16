package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i36 extends dtf implements sm6 {
    public ccd X;
    public int Y;
    public long Z;
    public ok3 o;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ x26 u0;
    public final /* synthetic */ long v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i36(long j, x26 x26Var, Continuation continuation) {
        super(2, continuation);
        this.u0 = x26Var;
        this.v0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((i36) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        i36 i36Var = new i36(this.v0, this.u0, continuation);
        i36Var.t0 = obj;
        return i36Var;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Type inference failed for: r5v7, types: [ccd] */
    /* JADX WARN: Type inference failed for: r6v4, types: [ok3] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c1 -> B:16:0x00c4). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.s0
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L2a
            if (r1 != r2) goto L22
            long r3 = r0.Z
            int r1 = r0.Y
            ccd r5 = r0.X
            ok3 r6 = r0.o
            java.lang.Object r8 = r0.t0
            sac r8 = (defpackage.sac) r8
            defpackage.g8j.b(r22)
            r9 = r3
            r4 = r5
            r3 = r22
            r5 = r1
            r1 = r6
            r6 = r8
            goto Lc4
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2a:
            defpackage.g8j.b(r22)
            java.lang.Object r1 = r0.t0
            sac r1 = (defpackage.sac) r1
            rt7 r3 = defpackage.eoi.a()
            h36 r4 = new h36
            x26 r5 = r0.u0
            r4.<init>(r5, r3, r7)
            r5 = 4
            r6 = 2147483647(0x7fffffff, float:NaN)
            pv0 r5 = defpackage.gzi.a(r6, r2, r5)
            bd5 r8 = defpackage.bd5.a
            x74 r8 = defpackage.z6j.c(r1, r8)
            pac r9 = new pac
            r9.<init>(r8, r5)
            i84 r5 = defpackage.i84.a
            r9.start(r5, r9, r4)
            long r4 = r0.v0
            r19 = r4
            r4 = r9
            r9 = r19
            r5 = r6
            r6 = r1
            r1 = r3
        L5e:
            mbe r12 = new mbe
            x74 r3 = r0.b
            r12.<init>(r3)
            r3 = r1
            su7 r3 = (defpackage.su7) r3
            hbe r11 = r3.getOnJoin()
            f36 r17 = new f36
            r8 = 0
            r3 = r17
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = r11
            kbe r11 = new kbe
            ka5 r3 = (defpackage.ka5) r3
            java.lang.Object r8 = r3.a
            r13 = r8
            su7 r13 = (defpackage.su7) r13
            java.lang.Object r8 = r3.b
            r14 = r8
            um6 r14 = (defpackage.um6) r14
            java.lang.Object r3 = r3.c
            r15 = r3
            obe r15 = (defpackage.obe) r15
            kotlinx.coroutines.internal.Symbol r16 = defpackage.pbe.e
            r18 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r3 = 0
            r12.f(r11, r3)
            f36 r3 = new f36
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8)
            long r13 = defpackage.s8j.f(r9)
            defpackage.kzi.b(r12, r13, r3)
            r0.t0 = r6
            r0.o = r1
            r0.X = r4
            r0.Y = r5
            r0.Z = r9
            r0.s0 = r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.mbe.X
            java.lang.Object r3 = r3.get(r12)
            boolean r3 = r3 instanceof defpackage.kbe
            if (r3 == 0) goto Lbb
            java.lang.Object r3 = r12.c(r0)
            goto Lbf
        Lbb:
            java.lang.Object r3 = r12.d(r0)
        Lbf:
            g84 r8 = defpackage.g84.a
            if (r3 != r8) goto Lc4
            return r8
        Lc4:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L5e
            qqg r1 = defpackage.qqg.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i36.n(java.lang.Object):java.lang.Object");
    }
}
