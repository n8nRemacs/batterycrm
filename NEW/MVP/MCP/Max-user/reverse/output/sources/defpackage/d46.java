package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class d46 extends dtf implements em6 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d46(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.o = i;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.o) {
            case 0:
                return new d46((z26) this.Y, (uid) this.Z, continuation, 0).n(qqg.a);
            default:
                return new d46((qi8) this.Y, (yw9) this.Z, continuation, 1).n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                uid uidVar = (uid) this.Z;
                int i = this.X;
                if (i == 0) {
                    g8j.b(obj);
                    z26 z26Var = (z26) this.Y;
                    Symbol symbol = bqa.a;
                    Object obj2 = uidVar.a;
                    if (obj2 == symbol) {
                        obj2 = null;
                    }
                    this.X = 1;
                    Object objA = z26Var.a(obj2, this);
                    g84 g84Var = g84.a;
                    if (objA == g84Var) {
                        return g84Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                uidVar.a = null;
                return qqg.a;
            default:
                yw9 yw9Var = (yw9) this.Z;
                int i2 = this.X;
                g84 g84Var2 = g84.a;
                if (i2 == 0) {
                    g8j.b(obj);
                    qi8 qi8Var = (qi8) this.Y;
                    this.X = 1;
                    if (qi8Var.a(this) == g84Var2) {
                        return g84Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g8j.b(obj);
                        return qqg.a;
                    }
                    g8j.b(obj);
                }
                yw9Var.l.O(yw9Var, yw9.o[0], null);
                n9a n9aVar = yw9Var.m;
                i13 i13Var = new i13(yw9Var, null, 1);
                this.X = 2;
                if (oxi.b(n9aVar, yw9Var, i13Var, this) == g84Var2) {
                    return g84Var2;
                }
                return qqg.a;
        }
    }
}
