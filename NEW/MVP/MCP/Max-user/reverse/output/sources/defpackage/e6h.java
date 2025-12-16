package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e6h extends dtf implements sm6 {
    public Object X;
    public ArrayList Y;
    public long Z;
    public i6h o;
    public int s0;
    public final /* synthetic */ i6h t0;
    public final /* synthetic */ List u0;
    public final /* synthetic */ ArrayList v0;
    public final /* synthetic */ long w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6h(i6h i6hVar, List list, ArrayList arrayList, long j, Continuation continuation) {
        super(2, continuation);
        this.t0 = i6hVar;
        this.u0 = list;
        this.v0 = arrayList;
        this.w0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((e6h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new e6h(this.t0, this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
    
        r3 = r10.i;
        r7 = defpackage.wqi.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        if (r7 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        if (r7.b(r0) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        r7.c(r0, r3, "Fetching video messages was completed successful", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
    
        r0 = r10.l;
        r16.o = r12;
        r16.X = r5;
        r16.Y = null;
        r16.Z = r8;
        r16.s0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
    
        if (r0.a(r2, r16) != r4) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[Catch: CancellationException -> 0x0025, all -> 0x00cd, TryCatch #3 {all -> 0x00cd, blocks: (B:37:0x00bc, B:39:0x00c2, B:44:0x00d1, B:45:0x00d5, B:47:0x00db, B:49:0x00e7, B:55:0x00f9, B:52:0x00ee, B:54:0x00f4), top: B:70:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e A[EDGE_INSN: B:75:0x013e->B:62:0x013e BREAK  A[LOOP:1: B:45:0x00d5->B:76:?], SYNTHETIC] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6h.n(java.lang.Object):java.lang.Object");
    }
}
