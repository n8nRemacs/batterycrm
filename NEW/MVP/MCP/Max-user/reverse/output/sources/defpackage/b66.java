package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b66 extends dtf implements um6 {
    public int X;
    public /* synthetic */ z26 Y;
    public /* synthetic */ Object[] Z;
    public final /* synthetic */ int o = 0;
    public final /* synthetic */ dtf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b66(Continuation continuation, ym6 ym6Var) {
        super(3, continuation);
        this.s0 = (dtf) ym6Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dtf, ym6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dtf, zm6] */
    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z26 z26Var = (z26) obj;
        Object[] objArr = (Object[]) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                b66 b66Var = new b66(continuation, (ym6) this.s0);
                b66Var.Y = z26Var;
                b66Var.Z = objArr;
                return b66Var.n(qqg.a);
            default:
                b66 b66Var2 = new b66(continuation, (zm6) this.s0);
                b66Var2.Y = z26Var;
                b66Var2.Z = objArr;
                return b66Var2.n(qqg.a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [dtf, ym6] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dtf, zm6] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        z26 z26Var;
        z26 z26Var2;
        b66 b66Var;
        switch (this.o) {
            case 0:
                int i = this.X;
                g84 g84Var = g84.a;
                if (i == 0) {
                    g8j.b(obj);
                    z26Var = this.Y;
                    Object[] objArr = this.Z;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.Y = z26Var;
                    this.X = 1;
                    obj = this.s0.b(obj2, obj3, obj4, obj5, this);
                    if (obj == g84Var) {
                        return g84Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g8j.b(obj);
                        return qqg.a;
                    }
                    z26Var = this.Y;
                    g8j.b(obj);
                }
                this.Y = null;
                this.X = 2;
                if (z26Var.a(obj, this) == g84Var) {
                    return g84Var;
                }
                return qqg.a;
            default:
                int i2 = this.X;
                g84 g84Var2 = g84.a;
                if (i2 == 0) {
                    g8j.b(obj);
                    z26Var2 = this.Y;
                    Object[] objArr2 = this.Z;
                    Object obj6 = objArr2[0];
                    Object obj7 = objArr2[1];
                    Object obj8 = objArr2[2];
                    Object obj9 = objArr2[3];
                    Object obj10 = objArr2[4];
                    this.Y = z26Var2;
                    this.X = 1;
                    obj = this.s0.k(obj6, obj7, obj8, obj9, obj10, this);
                    b66Var = this;
                    if (obj == g84Var2) {
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
                    z26Var2 = this.Y;
                    g8j.b(obj);
                    b66Var = this;
                }
                b66Var.Y = null;
                b66Var.X = 2;
                if (z26Var2.a(obj, this) == g84Var2) {
                    return g84Var2;
                }
                return qqg.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b66(Continuation continuation, zm6 zm6Var) {
        super(3, continuation);
        this.s0 = (dtf) zm6Var;
    }
}
