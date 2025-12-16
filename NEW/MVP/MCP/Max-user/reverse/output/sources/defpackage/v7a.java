package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v7a extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ mxi Y;
    public final /* synthetic */ b8a Z;
    public Bundle o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7a(mxi mxiVar, b8a b8aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = mxiVar;
        this.Z = b8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((v7a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new v7a(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ca A[PHI: r3
  0x02ca: PHI (r3v9 g84) = (r3v8 g84), (r3v16 g84) binds: [B:45:0x00f6, B:110:0x02c8] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7a.n(java.lang.Object):java.lang.Object");
    }
}
