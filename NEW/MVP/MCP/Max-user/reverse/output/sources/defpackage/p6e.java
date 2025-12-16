package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p6e extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ s6e Z;
    public int o;
    public final /* synthetic */ int s0;
    public final /* synthetic */ Long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6e(int i, s6e s6eVar, Long l, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = s6eVar;
        this.s0 = i;
        this.t0 = l;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p6e) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        p6e p6eVar = new p6e(this.s0, this.Z, this.t0, this.Y, continuation);
        p6eVar.X = obj;
        return p6eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010c A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6e.n(java.lang.Object):java.lang.Object");
    }
}
