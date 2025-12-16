package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wrd extends dtf implements sm6 {
    public final /* synthetic */ bsd X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrd(bsd bsdVar, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = bsdVar;
        this.Y = j;
        this.Z = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wrd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wrd(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r9 == r4) goto L17;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.o
            bsd r1 = r8.X
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            defpackage.g8j.b(r9)
            goto L57
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            defpackage.g8j.b(r9)
            goto L4a
        L1e:
            defpackage.g8j.b(r9)
            lq9 r9 = r1.d()
            r8.o = r3
            r9.getClass()
            java.lang.String r0 = "SELECT * FROM messages WHERE chat_id = ? AND server_id = ?"
            dsd r0 = defpackage.dsd.c(r2, r0)
            long r5 = r8.Y
            r0.k(r3, r5)
            long r5 = r8.Z
            android.os.CancellationSignal r3 = defpackage.xrf.m(r0, r2, r5)
            lrd r5 = r9.a
            jq9 r6 = new jq9
            r7 = 2
            r6.<init>(r9, r0, r7)
            java.lang.Object r9 = defpackage.k7j.a(r5, r3, r6, r8)
            if (r9 != r4) goto L4a
            goto L56
        L4a:
            gj9 r9 = (defpackage.gj9) r9
            if (r9 == 0) goto L5a
            r8.o = r2
            java.lang.Object r9 = r1.h(r9, r8)
            if (r9 != r4) goto L57
        L56:
            return r4
        L57:
            si9 r9 = (defpackage.si9) r9
            return r9
        L5a:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrd.n(java.lang.Object):java.lang.Object");
    }
}
