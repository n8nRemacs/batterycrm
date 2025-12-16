package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dx2 extends dtf implements sm6 {
    public Serializable X;
    public int Y;
    public final /* synthetic */ zx2 Z;
    public Serializable o;
    public final /* synthetic */ long s0;
    public final /* synthetic */ Long t0;
    public final /* synthetic */ ArrayList u0;
    public final /* synthetic */ ArrayList v0;
    public final /* synthetic */ vf6 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx2(zx2 zx2Var, long j, Long l, ArrayList arrayList, ArrayList arrayList2, vf6 vf6Var, Continuation continuation) {
        super(2, continuation);
        this.Z = zx2Var;
        this.s0 = j;
        this.t0 = l;
        this.u0 = arrayList;
        this.v0 = arrayList2;
        this.w0 = vf6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dx2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dx2(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x015e, code lost:
    
        if (r0 != r10) goto L49;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx2.n(java.lang.Object):java.lang.Object");
    }
}
