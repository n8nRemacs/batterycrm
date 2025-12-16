package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s83 extends dtf implements um6 {
    public int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s83(int i, Continuation continuation) {
        super(3, continuation);
        this.o = 2;
        this.X = i;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                s83 s83Var = new s83(3, (Continuation) obj3, 0);
                s83Var.Y = (z26) obj;
                s83Var.Z = (lha) obj2;
                return s83Var.n(qqg.a);
            case 1:
                s83 s83Var2 = new s83((ty5) this.Z, (Continuation) obj3);
                s83Var2.Y = (Throwable) obj2;
                return s83Var2.n(qqg.a);
            case 2:
                s83 s83Var3 = new s83(this.X, (Continuation) obj3);
                s83Var3.Y = (fwe) obj;
                s83Var3.Z = (yeb) obj2;
                qqg qqgVar = qqg.a;
                s83Var3.n(qqgVar);
                return qqgVar;
            case 3:
                s83 s83Var4 = new s83(3, (Continuation) obj3, 3);
                s83Var4.Y = (z26) obj;
                s83Var4.Z = (lrc) obj2;
                return s83Var4.n(qqg.a);
            default:
                return new s83((ytf) this.Y, (bug) this.Z, (Continuation) obj3).n(qqg.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0228, code lost:
    
        if (defpackage.s8j.c(r8, r18) != r2) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0228 -> B:57:0x0180). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s83.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s83(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s83(ty5 ty5Var, Continuation continuation) {
        super(3, continuation);
        this.o = 1;
        this.Z = ty5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s83(ytf ytfVar, bug bugVar, Continuation continuation) {
        super(3, continuation);
        this.o = 4;
        this.Y = ytfVar;
        this.Z = bugVar;
    }
}
