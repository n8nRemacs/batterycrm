package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c4c extends dtf implements sm6 {
    public Long X;
    public int Y;
    public /* synthetic */ Object Z;
    public Long o;
    public final /* synthetic */ e4c s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4c(e4c e4cVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = e4cVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((c4c) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        c4c c4cVar = new c4c(this.s0, continuation);
        c4cVar.Z = obj;
        return c4cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4c.n(java.lang.Object):java.lang.Object");
    }
}
