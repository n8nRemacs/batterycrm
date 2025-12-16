package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hsg extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ psg Y;
    public final /* synthetic */ long Z;
    public Throwable o;
    public final /* synthetic */ long[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsg(psg psgVar, long j, long[] jArr, Continuation continuation) {
        super(2, continuation);
        this.Y = psgVar;
        this.Z = j;
        this.s0 = jArr;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hsg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hsg(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        if (defpackage.psg.a(r0, r3, r5, r17) != r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f7, code lost:
    
        if (defpackage.psg.a(r0, r3, r6, r17) != r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:25:0x007f, B:28:0x008c, B:30:0x0094, B:16:0x0036, B:22:0x005c, B:19:0x003f), top: B:45:0x000f }] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsg.n(java.lang.Object):java.lang.Object");
    }
}
