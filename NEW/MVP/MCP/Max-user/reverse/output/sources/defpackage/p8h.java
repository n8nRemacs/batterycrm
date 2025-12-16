package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p8h extends dtf implements sm6 {
    public final /* synthetic */ ach X;
    public final /* synthetic */ q8h Y;
    public final /* synthetic */ k7h Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8h(ach achVar, q8h q8hVar, k7h k7hVar, Continuation continuation) {
        super(2, continuation);
        this.X = achVar;
        this.Y = q8hVar;
        this.Z = k7hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p8h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p8h(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r9 == r0) goto L26;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            g84 r0 = defpackage.g84.a
            int r1 = r8.o
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            defpackage.g8j.b(r9)
            goto L9a
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            defpackage.g8j.b(r9)
            goto L89
        L1e:
            defpackage.g8j.b(r9)
            ach r9 = r8.X
            r1 = r9
            vbh r1 = (defpackage.vbh) r1
            int r1 = r1.c
            if (r1 == 0) goto L56
            q8h r9 = r8.Y
            java.lang.String r0 = r9.h
            boolean r9 = r9.z
            ach r1 = r8.X
            vbh r1 = (defpackage.vbh) r1
            java.lang.Throwable r1 = r1.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "VideoMessage Recording. VideoRecordEvent.Finalize hasError: isPaused: "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = ", error: "
            r2.append(r9)
            r2.append(r1)
            java.lang.String r9 = r2.toString()
            ach r1 = r8.X
            vbh r1 = (defpackage.vbh) r1
            java.lang.Throwable r1 = r1.d
            defpackage.wqi.e(r0, r9, r1)
            goto La8
        L56:
            q8h r1 = r8.Y
            java.lang.String r1 = r1.h
            l6b r5 = defpackage.wqi.a
            if (r5 != 0) goto L5f
            goto L76
        L5f:
            lg8 r6 = defpackage.lg8.d
            boolean r7 = r5.b(r6)
            if (r7 == 0) goto L76
            vbh r9 = (defpackage.vbh) r9
            va0 r9 = r9.b
            android.net.Uri r9 = r9.a
            java.lang.String r7 = "VideoMessage Recording. VideoRecordEvent.Finalize onVideoTaken "
            java.lang.String r9 = defpackage.ctd.i(r9, r7)
            r5.c(r6, r1, r9, r2)
        L76:
            k7h r9 = r8.Z
            ach r1 = r8.X
            vbh r1 = (defpackage.vbh) r1
            va0 r1 = r1.b
            android.net.Uri r1 = r1.a
            r8.o = r4
            java.lang.Object r9 = r9.e(r1, r8)
            if (r9 != r0) goto L89
            goto L99
        L89:
            q8h r9 = r8.Y
            boolean r9 = r9.z
            if (r9 == 0) goto La8
            k7h r9 = r8.Z
            r8.o = r3
            java.io.Serializable r9 = r9.c(r8)
            if (r9 != r0) goto L9a
        L99:
            return r0
        L9a:
            java.util.List r9 = (java.util.List) r9
            q8h r0 = r8.Y
            tcf r0 = r0.v
            d5h r1 = new d5h
            r1.<init>(r9)
            r0.m(r2, r1)
        La8:
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p8h.n(java.lang.Object):java.lang.Object");
    }
}
