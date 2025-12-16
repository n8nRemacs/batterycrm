package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kj extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ n8a Y;
    public final /* synthetic */ wj Z;
    public ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(wj wjVar, n8a n8aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = n8aVar;
        this.Z = wjVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kj) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kj(this.Z, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0127 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj.n(java.lang.Object):java.lang.Object");
    }
}
