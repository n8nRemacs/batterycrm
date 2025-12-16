package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mqe extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ere Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqe(ere ereVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ereVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mqe) l((bme) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mqe mqeVar = new mqe(this.Y, continuation);
        mqeVar.X = obj;
        return mqeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (defpackage.ere.v(r0, r9) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (defpackage.ere.v(r0, r9) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
    
        return r6;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqe.n(java.lang.Object):java.lang.Object");
    }
}
