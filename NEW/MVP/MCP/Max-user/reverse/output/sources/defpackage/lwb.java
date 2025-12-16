package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lwb extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nwb Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwb(nwb nwbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = nwbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lwb) l((qwb) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lwb lwbVar = new lwb(this.Y, continuation);
        lwbVar.X = obj;
        return lwbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            nwb r0 = r10.Y
            jve r1 = r0.g
            java.util.concurrent.atomic.AtomicLong r2 = r0.i
            int r3 = r10.o
            r4 = 2
            r5 = 1
            qqg r6 = defpackage.qqg.a
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L16
            defpackage.g8j.b(r11)
            return r6
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            defpackage.g8j.b(r11)
            return r6
        L22:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.X
            qwb r11 = (defpackage.qwb) r11
            boolean r3 = r11 instanceof defpackage.owb
            g84 r7 = defpackage.g84.a
            if (r3 == 0) goto L47
            owb r11 = (defpackage.owb) r11
            long r3 = r11.a
            long r8 = r2.get()
            int r11 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r11 == 0) goto L3c
            goto L68
        L3c:
            r10.o = r5
            hwb r11 = defpackage.hwb.a
            java.lang.Object r11 = r1.a(r11, r10)
            if (r11 != r7) goto L68
            goto L67
        L47:
            boolean r3 = r11 instanceof defpackage.pwb
            if (r3 == 0) goto L69
            pwb r11 = (defpackage.pwb) r11
            long r8 = r11.a
            long r2 = r2.get()
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 == 0) goto L58
            goto L68
        L58:
            iwb r11 = new iwb
            long r2 = r0.a
            r11.<init>(r2)
            r10.o = r4
            java.lang.Object r11 = r1.a(r11, r10)
            if (r11 != r7) goto L68
        L67:
            return r7
        L68:
            return r6
        L69:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwb.n(java.lang.Object):java.lang.Object");
    }
}
