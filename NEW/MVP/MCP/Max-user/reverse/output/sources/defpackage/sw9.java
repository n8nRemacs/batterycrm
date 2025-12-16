package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sw9 extends dtf implements em6 {
    public int X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw9(o2b o2bVar, si9 si9Var, pb2 pb2Var, Continuation continuation) {
        super(1, continuation);
        this.o = 1;
        this.Y = o2bVar;
        this.Z = si9Var;
        this.s0 = pb2Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.o) {
            case 0:
                return new sw9((yw9) this.s0, continuation, 0).n(qqg.a);
            case 1:
                return new sw9((o2b) this.Y, (si9) this.Z, (pb2) this.s0, continuation).n(qqg.a);
            default:
                return new sw9((q9b) this.s0, continuation, 2).n(qqg.a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:4|(1:139)|(1:(1:(1:(1:(1:(4:11|12|161|82)(2:18|19))(8:20|143|21|157|78|(1:80)|161|82))(6:27|153|28|141|155|71))(9:34|147|35|151|63|(4:66|141|155|71)|80|161|82))(4:41|159|42|138))(3:48|145|49)|149|56|(3:151|63|(0))|80|161|82) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (defpackage.k7j.b(r13.a, new defpackage.bm4(11, r13), r12) == r5) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cb, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cd, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0115, code lost:
    
        if (defpackage.k7j.b(r13.a, new defpackage.bm4(10, r13), r12) == r5) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d6 A[EXC_TOP_SPLITTER, PHI: r4
  0x00d6: PHI (r4v7 ru.ok.tamtam.android.db.room.OneMeRoomDatabase) = 
  (r4v4 ru.ok.tamtam.android.db.room.OneMeRoomDatabase)
  (r4v6 ru.ok.tamtam.android.db.room.OneMeRoomDatabase)
  (r4v14 ru.ok.tamtam.android.db.room.OneMeRoomDatabase)
 binds: [B:57:0x00c7, B:62:0x00cf, B:35:0x0067] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw9.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sw9(Object obj, Continuation continuation, int i) {
        super(1, continuation);
        this.o = i;
        this.s0 = obj;
    }
}
