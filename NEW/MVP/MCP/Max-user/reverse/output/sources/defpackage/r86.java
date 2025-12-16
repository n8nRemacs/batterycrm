package defpackage;

import java.util.UUID;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r86 extends dtf implements sm6 {
    public final /* synthetic */ t86 X;
    public final /* synthetic */ f86 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r86(t86 t86Var, f86 f86Var, Continuation continuation) {
        super(2, continuation);
        this.X = t86Var;
        this.Y = f86Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r86) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new r86(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            String str = (String) this.X.a;
            f86 f86Var = this.Y;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "Creating recommended folder with filters=" + f86Var.d, null);
                }
            }
            ((va4) ((k18) this.X.d).getValue()).getClass();
            pd6 pd6Var = new pd6(UUID.randomUUID().toString(), this.Y.b.toString(), null, null, this.Y.d, null, 92);
            t86 t86Var = this.X;
            this.o = 1;
            if (t86.a(t86Var, pd6Var, this) == g84Var) {
                return g84Var;
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
