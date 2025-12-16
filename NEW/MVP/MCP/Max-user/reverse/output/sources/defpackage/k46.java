package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class k46 extends dtf implements um6 {
    public int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public long o;
    public final /* synthetic */ long s0;
    public final /* synthetic */ x26 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k46(long j, x26 x26Var, Continuation continuation) {
        super(3, continuation);
        this.s0 = j;
        this.t0 = x26Var;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k46 k46Var = new k46(this.s0, this.t0, (Continuation) obj3);
        k46Var.Y = (f84) obj;
        k46Var.Z = (z26) obj2;
        return k46Var.n(qqg.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b3 -> B:24:0x00b6). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.X
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L24
            if (r1 != r3) goto L1c
            long r5 = r0.o
            java.lang.Object r1 = r0.Z
            ccd r1 = (defpackage.ccd) r1
            java.lang.Object r7 = r0.Y
            z26 r7 = (defpackage.z26) r7
            defpackage.g8j.b(r17)
            r8 = r17
            goto Lb6
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            defpackage.g8j.b(r17)
            java.lang.Object r1 = r0.Y
            f84 r1 = (defpackage.f84) r1
            java.lang.Object r5 = r0.Z
            z26 r5 = (defpackage.z26) r5
            r6 = 0
            long r8 = r0.s0
            int r6 = defpackage.s65.d(r8, r6)
            if (r6 <= 0) goto Lc1
            x26 r6 = r0.t0
            r7 = 2
            x26 r15 = defpackage.gw0.b(r6, r2, r7)
            boolean r6 = r15 instanceof defpackage.t92
            if (r6 == 0) goto L48
            r6 = r15
            t92 r6 = (defpackage.t92) r6
            goto L49
        L48:
            r6 = r4
        L49:
            if (r6 != 0) goto L56
            ba2 r10 = new ba2
            r13 = 14
            r12 = 0
            r11 = 0
            r14 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r6 = r10
        L56:
            ccd r1 = r6.m(r1)
            r7 = r5
            r5 = r8
        L5c:
            mbe r9 = new mbe
            x74 r8 = r0.b
            r9.<init>(r8)
            ibe r8 = r1.a()
            i46 r14 = new i46
            r14.<init>(r7, r4)
            r10 = r8
            kbe r8 = new kbe
            zva r10 = (defpackage.zva) r10
            java.lang.Object r11 = r10.b
            java.lang.Object r12 = r10.c
            um6 r12 = (defpackage.um6) r12
            java.lang.Object r13 = r10.d
            um6 r13 = (defpackage.um6) r13
            java.lang.Object r10 = r10.o
            r15 = r10
            um6 r15 = (defpackage.um6) r15
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r9.f(r8, r2)
            j46 r8 = new j46
            r8.<init>(r5, r4)
            long r10 = defpackage.s8j.f(r5)
            defpackage.kzi.b(r9, r10, r8)
            r0.Y = r7
            r0.Z = r1
            r0.o = r5
            r0.X = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = defpackage.mbe.X
            java.lang.Object r8 = r8.get(r9)
            boolean r8 = r8 instanceof defpackage.kbe
            if (r8 == 0) goto Lad
            java.lang.Object r8 = r9.c(r0)
            goto Lb1
        Lad:
            java.lang.Object r8 = r9.d(r0)
        Lb1:
            g84 r9 = defpackage.g84.a
            if (r8 != r9) goto Lb6
            return r9
        Lb6:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L5c
            qqg r1 = defpackage.qqg.a
            return r1
        Lc1:
            kotlinx.coroutines.TimeoutCancellationException r1 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r2 = "Timed out immediately"
            r1.<init>(r2, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k46.n(java.lang.Object):java.lang.Object");
    }
}
