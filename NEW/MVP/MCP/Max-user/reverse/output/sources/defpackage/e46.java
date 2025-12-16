package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e46 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ uid Z;
    public uid o;
    public final /* synthetic */ z26 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e46(uid uidVar, z26 z26Var, Continuation continuation) {
        super(2, continuation);
        this.Z = uidVar;
        this.s0 = z26Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((e46) l(new na2(((na2) obj).a), (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        e46 e46Var = new e46(this.Z, this.s0, continuation);
        e46Var.Y = obj;
        return e46Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        uid uidVar;
        uid uidVar2;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            Object obj2 = ((na2) this.Y).a;
            boolean z = obj2 instanceof ma2;
            uidVar = this.Z;
            if (!z) {
                uidVar.a = obj2;
            }
            if (z) {
                la2 la2Var = obj2 instanceof la2 ? (la2) obj2 : null;
                Throwable th = la2Var != null ? la2Var.a : null;
                if (th != null) {
                    throw th;
                }
                Object obj3 = uidVar.a;
                if (obj3 != null) {
                    Object obj4 = obj3 != bqa.a ? obj3 : null;
                    this.Y = obj2;
                    this.o = uidVar;
                    this.X = 1;
                    Object objA = this.s0.a(obj4, this);
                    g84 g84Var = g84.a;
                    if (objA == g84Var) {
                        return g84Var;
                    }
                    uidVar2 = uidVar;
                }
                uidVar.a = bqa.c;
            }
            return qqg.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uidVar2 = this.o;
        g8j.b(obj);
        uidVar = uidVar2;
        uidVar.a = bqa.c;
        return qqg.a;
    }
}
