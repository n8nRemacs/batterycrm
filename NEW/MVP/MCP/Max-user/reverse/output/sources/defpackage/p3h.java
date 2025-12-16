package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p3h extends dtf implements sm6 {
    public List X;
    public int Y;
    public int Z;
    public pb2 o;
    public int s0;
    public final /* synthetic */ List t0;
    public final /* synthetic */ s3h u0;
    public final /* synthetic */ long v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3h(List list, s3h s3hVar, long j, Continuation continuation) {
        super(2, continuation);
        this.t0 = list;
        this.u0 = s3hVar;
        this.v0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p3h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p3h(this.t0, this.u0, this.v0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (defpackage.s3h.a(r0, r14, r10, r13) == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c9 -> B:36:0x00cc). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3h.n(java.lang.Object):java.lang.Object");
    }
}
