package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fkf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ikf Y;
    public final /* synthetic */ dgf Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkf(ikf ikfVar, dgf dgfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ikfVar;
        this.Z = dgfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fkf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fkf fkfVar = new fkf(this.Y, this.Z, continuation);
        fkfVar.X = obj;
        return fkfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            ikf r0 = r11.Y
            java.util.concurrent.atomic.AtomicLong r1 = r0.t0
            int r2 = r11.o
            qqg r3 = defpackage.qqg.a
            r4 = 0
            dgf r6 = r11.Z
            r7 = 1
            if (r2 == 0) goto L23
            if (r2 != r7) goto L1b
            java.lang.Object r0 = r11.X
            f84 r0 = (defpackage.f84) r0
            defpackage.g8j.b(r12)     // Catch: java.lang.Throwable -> L19
            goto L4b
        L19:
            r12 = move-exception
            goto L51
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            defpackage.g8j.b(r12)
            java.lang.Object r12 = r11.X
            f84 r12 = (defpackage.f84) r12
            long r8 = r6.a
            r1.compareAndSet(r4, r8)
            k18 r0 = r0.X     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L4d
            vr5 r0 = (defpackage.vr5) r0     // Catch: java.lang.Throwable -> L4d
            long r8 = r6.a     // Catch: java.lang.Throwable -> L4d
            uk3 r0 = r0.d(r8, r7)     // Catch: java.lang.Throwable -> L4d
            r11.X = r12     // Catch: java.lang.Throwable -> L4d
            r11.o = r7     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = defpackage.n8j.a(r0, r11)     // Catch: java.lang.Throwable -> L4d
            g84 r2 = defpackage.g84.a
            if (r0 != r2) goto L4a
            return r2
        L4a:
            r0 = r12
        L4b:
            r2 = r3
            goto L56
        L4d:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
        L51:
            ipd r2 = new ipd
            r2.<init>(r12)
        L56:
            java.lang.Throwable r12 = defpackage.kpd.a(r2)
            if (r12 == 0) goto L74
            boolean r2 = r12 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L73
            long r6 = r6.a
            r1.compareAndSet(r6, r4)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Can't add sticker set"
            defpackage.wqi.e(r0, r1, r12)
            goto L74
        L73:
            throw r12
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkf.n(java.lang.Object):java.lang.Object");
    }
}
