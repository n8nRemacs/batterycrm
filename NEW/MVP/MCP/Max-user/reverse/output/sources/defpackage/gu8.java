package defpackage;

import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gu8 extends dtf implements um6 {
    public /* synthetic */ nsb X;
    public /* synthetic */ nsb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gu8(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        nsb nsbVar = (nsb) obj;
        nsb nsbVar2 = (nsb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                gu8 gu8Var = new gu8(3, continuation, 0);
                gu8Var.X = nsbVar;
                gu8Var.Y = nsbVar2;
                return gu8Var.n(qqg.a);
            case 1:
                gu8 gu8Var2 = new gu8(3, continuation, 1);
                gu8Var2.X = nsbVar;
                gu8Var2.Y = nsbVar2;
                return gu8Var2.n(qqg.a);
            default:
                gu8 gu8Var3 = new gu8(3, continuation, 2);
                gu8Var3.X = nsbVar;
                gu8Var3.Y = nsbVar2;
                return gu8Var3.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                nsb nsbVar = this.X;
                nsb nsbVar2 = this.Y;
                int iOrdinal = nsbVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iOrdinal2 = nsbVar2.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            return d9c.b;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return d9c.a;
            case 1:
                g8j.b(obj);
                return Boolean.valueOf(Build.VERSION.SDK_INT >= 34 && this.X == nsb.b && this.Y == nsb.a);
            default:
                g8j.b(obj);
                nsb nsbVar3 = this.X;
                nsb nsbVar4 = this.Y;
                nsb nsbVar5 = nsb.a;
                return Boolean.valueOf(nsbVar3 == nsbVar5 || nsbVar4 == nsbVar5);
        }
    }
}
