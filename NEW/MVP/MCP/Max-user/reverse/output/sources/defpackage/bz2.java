package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bz2 extends dtf implements um6 {
    public /* synthetic */ veb X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        veb vebVar = (veb) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                bz2 bz2Var = new bz2(3, continuation, 0);
                bz2Var.X = vebVar;
                bz2Var.Y = yebVar;
                qqg qqgVar = qqg.a;
                bz2Var.n(qqgVar);
                return qqgVar;
            case 1:
                bz2 bz2Var2 = new bz2(3, continuation, 1);
                bz2Var2.X = vebVar;
                bz2Var2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                bz2Var2.n(qqgVar2);
                return qqgVar2;
            default:
                bz2 bz2Var3 = new bz2(3, continuation, 2);
                bz2Var3.X = vebVar;
                bz2Var3.Y = yebVar;
                qqg qqgVar3 = qqg.a;
                bz2Var3.n(qqgVar3);
                return qqgVar3;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                this.X.onThemeChanged(this.Y);
                break;
            case 1:
                g8j.b(obj);
                this.X.onThemeChanged(this.Y);
                break;
            default:
                g8j.b(obj);
                this.X.onThemeChanged(this.Y);
                break;
        }
        return qqg.a;
    }
}
