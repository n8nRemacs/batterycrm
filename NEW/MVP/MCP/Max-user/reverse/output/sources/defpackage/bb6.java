package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.folders.usecases.NotFoundFolderException;

/* loaded from: classes2.dex */
public final class bb6 extends dtf implements sm6 {
    public final /* synthetic */ cb6 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;
    public int o;
    public final /* synthetic */ n8a s0;
    public final /* synthetic */ n8a t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb6(cb6 cb6Var, String str, String str2, n8a n8aVar, n8a n8aVar2, Continuation continuation) {
        super(2, continuation);
        this.X = cb6Var;
        this.Y = str;
        this.Z = str2;
        this.s0 = n8aVar;
        this.t0 = n8aVar2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bb6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bb6(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        String str = (String) this.X.b;
        String str2 = this.Y;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, ho7.i("Updating chats 'relative' for folder(", str2, ")"), null);
            }
        }
        Object value = this.X.f().h(this.Y).getValue();
        cb6 cb6Var = this.X;
        String str3 = this.Y;
        f86 f86Var = (f86) value;
        if (f86Var == null) {
            bxe.i((yi5) cb6Var.a, new NotFoundFolderException(str3));
        }
        if (f86Var != null) {
            cb6 cb6Var2 = this.X;
            String str4 = this.Z;
            n8a n8aVarI = dsi.i(f86Var.o);
            n8aVarI.b(this.s0);
            n8aVarI.m(this.t0);
            cb6Var2.getClass();
            pd6 pd6VarL = cb6.l(f86Var, str4, n8aVarI);
            this.o = 1;
            if (cb6.a(cb6Var2, pd6VarL, this) == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
