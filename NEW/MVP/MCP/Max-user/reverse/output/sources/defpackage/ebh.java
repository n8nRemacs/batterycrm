package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ebh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cbh Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebh(cbh cbhVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = cbhVar;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ((ebh) l((z26) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ebh ebhVar = new ebh(this.Y, this.Z, continuation);
        ebhVar.X = obj;
        return ebhVar;
    }

    /* JADX WARN: Path cross not found for [B:13:0x0034, B:16:0x004e], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x004e, B:13:0x0034], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[PHI: r0
  0x002c: PHI (r0v3 z26) = (r0v1 z26), (r0v2 z26), (r0v8 z26) binds: [B:10:0x0024, B:17:0x0058, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0058 -> B:11:0x002c). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L24
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L14
            java.lang.Object r0 = r6.X
            z26 r0 = (defpackage.z26) r0
            defpackage.g8j.b(r7)
            goto L2c
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r0 = r6.X
            z26 r0 = (defpackage.z26) r0
            defpackage.g8j.b(r7)
            goto L4e
        L24:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.X
            z26 r7 = (defpackage.z26) r7
            r0 = r7
        L2c:
            cbh r7 = r6.Y
            boolean r4 = r7.d()
            if (r4 == 0) goto L4e
            long r4 = r7.e()
            y65 r7 = defpackage.y65.MILLISECONDS
            long r4 = defpackage.v9j.i(r4, r7)
            s65 r7 = new s65
            r7.<init>(r4)
            r6.X = r0
            r6.o = r2
            java.lang.Object r7 = r0.a(r7, r6)
            if (r7 != r3) goto L4e
            goto L5a
        L4e:
            r6.X = r0
            r6.o = r1
            long r4 = r6.Z
            java.lang.Object r7 = defpackage.s8j.d(r4, r6)
            if (r7 != r3) goto L2c
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebh.n(java.lang.Object):java.lang.Object");
    }
}
