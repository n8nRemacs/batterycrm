package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public final class h66 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cb8 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h66(cb8 cb8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = cb8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((h66) l((sac) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        h66 h66Var = new h66(this.Y, continuation);
        h66Var.X = obj;
        return h66Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, wta] */
    /* JADX WARN: Type inference failed for: r0v6, types: [wta] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        fz1 fz1Var;
        Object obj2;
        ?? r0 = this.o;
        int i = 1;
        cb8 cb8Var = this.Y;
        g84 g84Var = g84.a;
        try {
        } catch (Throwable th) {
            ep4 ep4Var = gy4.a;
            x74 x74VarPlus = MainDispatcherLoader.dispatcher.getImmediate().plus(bia.a);
            g66 g66Var = new g66(cb8Var, r0, null);
            this.X = th;
            this.o = 4;
            if (svi.i(x74VarPlus, g66Var, this) != g84Var) {
                throw th;
            }
        }
        if (r0 == 0) {
            g8j.b(obj);
            fz1 fz1Var2 = new fz1(i, (sac) this.X);
            ep4 ep4Var2 = gy4.a;
            wl8 immediate = MainDispatcherLoader.dispatcher.getImmediate();
            e66 e66Var = new e66(cb8Var, fz1Var2, null);
            this.X = fz1Var2;
            this.o = 1;
            fz1Var = fz1Var2;
            if (svi.i(immediate, e66Var, this) != g84Var) {
            }
            return g84Var;
        }
        if (r0 != 1) {
            if (r0 == 2) {
                Object obj3 = (wta) this.X;
                g8j.b(obj);
                obj2 = obj3;
                this.X = obj2;
                this.o = 3;
                s8j.b(this);
                return g84Var;
            }
            if (r0 == 3) {
                g8j.b(obj);
                throw new KotlinNothingValueException();
            }
            if (r0 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th2 = (Throwable) this.X;
            g8j.b(obj);
            throw th2;
        }
        ?? r02 = (wta) this.X;
        g8j.b(obj);
        fz1Var = r02;
        ep4 ep4Var3 = gy4.a;
        wl8 immediate2 = MainDispatcherLoader.dispatcher.getImmediate();
        f66 f66Var = new f66(cb8Var, fz1Var, null);
        this.X = fz1Var;
        this.o = 2;
        obj2 = fz1Var;
        if (svi.i(immediate2, f66Var, this) == g84Var) {
            return g84Var;
        }
        this.X = obj2;
        this.o = 3;
        s8j.b(this);
        return g84Var;
    }
}
