package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bl extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ te8 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(te8 te8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = te8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((bl) l((z26) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bl blVar = new bl(this.Y, continuation);
        blVar.X = obj;
        return blVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r11 == null) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008c -> B:13:0x0036). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            te8 r0 = r10.Y
            java.lang.Object r1 = r0.a
            wk r1 = (defpackage.wk) r1
            int r2 = r10.o
            r3 = 3
            r4 = 2
            r5 = 1
            g84 r6 = defpackage.g84.a
            if (r2 == 0) goto L2e
            if (r2 == r5) goto L26
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            goto L26
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r2 = r10.X
            z26 r2 = (defpackage.z26) r2
            defpackage.g8j.b(r11)
            goto L71
        L26:
            java.lang.Object r2 = r10.X
            z26 r2 = (defpackage.z26) r2
            defpackage.g8j.b(r11)
            goto L36
        L2e:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.X
            z26 r11 = (defpackage.z26) r11
            r2 = r11
        L36:
            java.lang.Object r11 = r0.c
            nwa r11 = (defpackage.nwa) r11
            r11.invoke()
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L5a
            int r11 = defpackage.s65.d
            r11 = 10
            y65 r7 = defpackage.y65.SECONDS
            long r7 = defpackage.v9j.h(r11, r7)
            r10.X = r2
            r10.o = r5
            java.lang.Object r11 = defpackage.s8j.d(r7, r10)
            if (r11 != r6) goto L36
            goto L8e
        L5a:
            long r7 = r1.a
            al r11 = new al
            r9 = 0
            r11.<init>(r0, r9)
            r10.X = r2
            r10.o = r4
            long r7 = defpackage.s8j.f(r7)
            java.lang.Object r11 = defpackage.yei.g(r7, r11, r10)
            if (r11 != r6) goto L71
            goto L8e
        L71:
            if (r11 != 0) goto L36
            xk r11 = new xk
            long r7 = r1.a
            java.lang.String r7 = defpackage.s65.n(r7)
            java.lang.String r8 = "Application Not Responding for at least "
            java.lang.String r7 = r8.concat(r7)
            r11.<init>(r7)
            r10.X = r2
            r10.o = r3
            java.lang.Object r11 = r2.a(r11, r10)
            if (r11 != r6) goto L36
        L8e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.n(java.lang.Object):java.lang.Object");
    }
}
