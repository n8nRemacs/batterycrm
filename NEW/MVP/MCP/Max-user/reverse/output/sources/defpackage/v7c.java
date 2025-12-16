package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v7c extends dtf implements sm6 {
    public w7c X;
    public Context Y;
    public Iterator Z;
    public List o;
    public Map.Entry s0;
    public int t0;
    public final /* synthetic */ w7c u0;
    public final /* synthetic */ Context v0;
    public final /* synthetic */ List w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7c(w7c w7cVar, Context context, List list, Continuation continuation) {
        super(2, continuation);
        this.u0 = w7cVar;
        this.v0 = context;
        this.w0 = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((v7c) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new v7c(this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007e -> B:18:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0084 -> B:20:0x0085). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.t0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            if (r0 != r1) goto L16
            java.util.Map$Entry r0 = r9.s0
            java.util.Iterator r3 = r9.Z
            android.content.Context r4 = r9.Y
            w7c r5 = r9.X
            java.util.List r6 = r9.o
            defpackage.g8j.b(r10)
            goto L81
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            defpackage.g8j.b(r10)
            w7c r10 = r9.u0
            java.lang.Object r0 = r10.a
            k18 r0 = (defpackage.k18) r0
            java.lang.Object r0 = r0.getValue()
            ef0 r0 = (defpackage.ef0) r0
            android.content.Context r3 = r9.v0
            java.util.LinkedHashMap r0 = r0.c(r3, r2)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.List r4 = r9.w0
            r5 = r10
            r6 = r4
            r4 = r3
            r3 = r0
        L41:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto La0
            java.lang.Object r10 = r3.next()
            r0 = r10
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r10 = r0.getKey()
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L41
            java.lang.Object r10 = r0.getValue()
            yyg r10 = (defpackage.yyg) r10
            xyg r10 = r10.a
            if (r10 == 0) goto L84
            java.lang.Object r7 = r5.a
            k18 r7 = (defpackage.k18) r7
            java.lang.Object r7 = r7.getValue()
            ef0 r7 = (defpackage.ef0) r7
            r9.o = r6
            r9.X = r5
            r9.Y = r4
            r9.Z = r3
            r9.s0 = r0
            r9.t0 = r1
            java.lang.Object r10 = r7.d(r4, r10, r9)
            g84 r7 = defpackage.g84.a
            if (r10 != r7) goto L81
            return r7
        L81:
            wuf r10 = (defpackage.wuf) r10
            goto L85
        L84:
            r10 = r2
        L85:
            c7g r7 = new c7g
            java.lang.Object r8 = r0.getValue()
            yyg r8 = (defpackage.yyg) r8
            b7g r10 = defpackage.woi.i(r8, r10)
            r7.<init>(r10)
            android.util.LruCache r10 = defpackage.x6g.a
            java.lang.Object r10 = r0.getKey()
            of0 r10 = (defpackage.of0) r10
            defpackage.x6g.a(r10, r7)
            goto L41
        La0:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7c.n(java.lang.Object):java.lang.Object");
    }
}
