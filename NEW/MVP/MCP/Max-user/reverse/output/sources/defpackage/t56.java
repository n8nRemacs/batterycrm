package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class t56 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x26 Y;
    public final /* synthetic */ n4 Z;
    public int o;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t56(x26 x26Var, e9a e9aVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = x26Var;
        this.Z = (n4) e9aVar;
        this.s0 = obj;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((t56) l((xve) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e9a, n4] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        t56 t56Var = new t56(this.Y, this.Z, this.s0, continuation);
        t56Var.X = obj;
        return t56Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [e9a, n4, z26] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            int iOrdinal = ((xve) this.X).ordinal();
            ?? r0 = this.Z;
            if (iOrdinal == 0) {
                this.o = 1;
                Object objD = this.Y.d(r0, this);
                g84 g84Var = g84.a;
                if (objD == g84Var) {
                    return g84Var;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Symbol symbol = kve.a;
                Object obj2 = this.s0;
                if (obj2 == symbol) {
                    r0.g();
                } else {
                    r0.h(obj2);
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
