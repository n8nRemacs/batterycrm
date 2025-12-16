package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class txd extends dtf implements sm6 {
    public final /* synthetic */ byte[] X;
    public final /* synthetic */ enb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txd(enb enbVar, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.o = enbVar;
        this.X = bArr;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((txd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new txd(this.o, this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r9 = 0;
        r1 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[EDGE_INSN: B:77:0x006d->B:32:0x006d BREAK  A[LOOP:0: B:3:0x0016->B:9:0x0030], EDGE_INSN: B:78:0x006d->B:32:0x006d BREAK  A[LOOP:0: B:3:0x0016->B:9:0x0030]] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txd.n(java.lang.Object):java.lang.Object");
    }
}
