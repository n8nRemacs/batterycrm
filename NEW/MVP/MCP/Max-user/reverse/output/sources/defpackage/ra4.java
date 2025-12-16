package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ra4 extends dtf implements sm6 {
    public final /* synthetic */ va4 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra4(va4 va4Var, Continuation continuation) {
        super(2, continuation);
        this.X = va4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ra4) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ra4(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8.a(r1, r7) == r5) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            va4 r0 = r7.X
            w8a r1 = r0.t0
            int r2 = r7.o
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            defpackage.g8j.b(r8)
            goto L47
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            defpackage.g8j.b(r8)
            goto L39
        L20:
            defpackage.g8j.b(r8)
            drd r8 = r0.i()
            r7.o = r4
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl r2 = r8.a
            iqb r4 = new iqb
            r6 = 20
            r4.<init>(r6, r8)
            java.lang.Object r8 = defpackage.i8j.a(r2, r4, r7)
            if (r8 != r5) goto L39
            goto L46
        L39:
            r1.d()
            jve r8 = r0.u0
            r7.o = r3
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r5) goto L47
        L46:
            return r5
        L47:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra4.n(java.lang.Object):java.lang.Object");
    }
}
