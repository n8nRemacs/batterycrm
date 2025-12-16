package defpackage;

import java.util.UUID;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q86 extends dtf implements sm6 {
    public final /* synthetic */ t86 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ n8a Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q86(t86 t86Var, String str, n8a n8aVar, Continuation continuation) {
        super(2, continuation);
        this.X = t86Var;
        this.Y = str;
        this.Z = n8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((q86) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new q86(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            String str = (String) this.X.a;
            String str2 = this.Y;
            n8a n8aVar = this.Z;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    if (!wqi.a()) {
                        str2 = "*****";
                    }
                    l6bVar.c(lg8Var, str, "Creating custom folder with title=" + str2 + " and included=" + n8aVar, null);
                }
            }
            ((va4) ((k18) this.X.d).getValue()).getClass();
            pd6 pd6Var = new pd6(UUID.randomUUID().toString(), this.Y, this.Z, null, null, null, 116);
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
