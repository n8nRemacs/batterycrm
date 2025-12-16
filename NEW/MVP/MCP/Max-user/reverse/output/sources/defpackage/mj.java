package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mj extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ wj Y;
    public final /* synthetic */ n8a Z;
    public ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(wj wjVar, n8a n8aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = wjVar;
        this.Z = n8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mj) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mj(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec A[LOOP:0: B:37:0x00e6->B:39:0x00ec, LOOP_END] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj.n(java.lang.Object):java.lang.Object");
    }
}
