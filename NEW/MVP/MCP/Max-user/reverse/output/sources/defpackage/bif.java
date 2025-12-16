package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bif extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fif Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bif(fif fifVar, Continuation continuation) {
        super(2, continuation);
        this.Y = fifVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bif) l((z7e) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bif bifVar = new bif(this.Y, continuation);
        bifVar.X = obj;
        return bifVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        z7e z7eVar;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z7e z7eVar2 = (z7e) this.X;
            String name = fif.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, xc0.f("Sets loader. Section with sets exist:", z7eVar2 != null), null);
                }
            }
            if ((z7eVar2 instanceof lgf) && ((List) this.Y.d.getValue()).isEmpty()) {
                m2f m2fVarB = ((igf) this.Y.a.getValue()).b(((lgf) z7eVar2).c);
                this.X = z7eVar2;
                this.o = 1;
                Object objB = n8j.b(m2fVarB, this);
                if (objB == g84Var) {
                    return g84Var;
                }
                z7eVar = z7eVar2;
                obj = objB;
            }
            return qqg.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z7eVar = (z7e) this.X;
        g8j.b(obj);
        this.Y.f.updateAndGet(new k11(10, z7eVar));
        this.Y.d.m(null, (List) obj);
        return qqg.a;
    }
}
