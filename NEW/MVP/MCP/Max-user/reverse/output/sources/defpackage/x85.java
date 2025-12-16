package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x85 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y85 Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ long s0;
    public final /* synthetic */ CharSequence t0;
    public final /* synthetic */ boolean u0;
    public final /* synthetic */ List v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x85(y85 y85Var, long j, long j2, CharSequence charSequence, boolean z, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = y85Var;
        this.Z = j;
        this.s0 = j2;
        this.t0 = charSequence;
        this.u0 = z;
        this.v0 = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((x85) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        x85 x85Var = new x85(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
        x85Var.X = obj;
        return x85Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019e  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x85.n(java.lang.Object):java.lang.Object");
    }
}
