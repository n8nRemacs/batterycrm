package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yjc extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ hkc Y;
    public ujc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjc(hkc hkcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = hkcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((yjc) l(bool, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yjc(this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.X
            qqg r1 = defpackage.qqg.a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            hkc r6 = r10.Y
            g84 r7 = defpackage.g84.a
            if (r0 == 0) goto L2a
            if (r0 == r5) goto L24
            if (r0 == r4) goto L20
            if (r0 != r3) goto L18
            defpackage.g8j.b(r11)
            return r1
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            defpackage.g8j.b(r11)
            goto L61
        L24:
            ujc r0 = r10.o
            defpackage.g8j.b(r11)
            goto L56
        L2a:
            defpackage.g8j.b(r11)
            k18 r11 = r6.c
            java.lang.Object r11 = r11.getValue()
            w63 r11 = (defpackage.w63) r11
            long r8 = r6.b
            hbd r11 = r11.j(r8)
            mcf r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            pb2 r11 = (defpackage.pb2) r11
            if (r11 == 0) goto L7f
            ujc r0 = defpackage.hkc.u(r6, r11)
            r10.o = r0
            r10.X = r5
            r8 = 200(0xc8, double:9.9E-322)
            java.lang.Object r11 = defpackage.s8j.c(r8, r10)
            if (r11 != r7) goto L56
            goto L7e
        L56:
            r10.o = r2
            r10.X = r4
            java.lang.Object r11 = defpackage.hkc.t(r6, r0, r10)
            if (r11 != r7) goto L61
            goto L7e
        L61:
            yy7[] r11 = defpackage.hkc.A0
            k18 r11 = r6.d
            java.lang.Object r11 = r11.getValue()
            lzf r11 = (defpackage.lzf) r11
            q2b r11 = (defpackage.q2b) r11
            wl8 r11 = r11.c()
            xjc r0 = new xjc
            r0.<init>(r6, r2)
            r10.X = r3
            java.lang.Object r11 = defpackage.svi.i(r11, r0, r10)
            if (r11 != r7) goto L7f
        L7e:
            return r7
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjc.n(java.lang.Object):java.lang.Object");
    }
}
