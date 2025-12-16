package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m86 extends dtf implements sm6 {
    public final /* synthetic */ p86 X;
    public final /* synthetic */ gj7 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m86(p86 p86Var, gj7 gj7Var, Continuation continuation) {
        super(2, continuation);
        this.X = p86Var;
        this.Y = gj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((m86) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new m86(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        p86 p86Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            ch2 ch2Var = p86Var.b;
            String str = p86Var.a;
            long j = this.Y.b;
            this.o = 1;
            obj = ch2Var.g(j, str);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        qqg qqgVar = qqg.a;
        if (!zBooleanValue) {
            return qqgVar;
        }
        p86.a(p86Var);
        return qqgVar;
    }
}
