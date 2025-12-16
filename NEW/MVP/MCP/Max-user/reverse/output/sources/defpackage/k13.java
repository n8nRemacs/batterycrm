package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.exception.ChatNotFoundException;

/* loaded from: classes2.dex */
public final class k13 extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ z13 Y;
    public final /* synthetic */ rid Z;
    public int o;
    public final /* synthetic */ ww3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k13(Object obj, Continuation continuation, z13 z13Var, rid ridVar, ww3 ww3Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = z13Var;
        this.Z = ridVar;
        this.s0 = ww3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k13) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k13(this.X, continuation, this.Y, this.Z, this.s0);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            hs2 hs2Var = (hs2) this.X;
            z13 z13Var = this.Y;
            pb2 pb2Var = (pb2) ((w63) z13Var.Z.getValue()).j(hs2Var.a).a.getValue();
            if (pb2Var == null) {
                return null;
            }
            ArrayList arrayListL = pb2Var.l();
            if (!arrayListL.isEmpty()) {
                Iterator it = arrayListL.iterator();
                while (it.hasNext()) {
                    if (this.s0.a.d(((ku3) it.next()).p())) {
                        w63 w63Var = (w63) z13Var.Z.getValue();
                        long j = pb2Var.a;
                        this.o = 1;
                        ve2 ve2VarI = w63Var.i();
                        pb2 pb2VarM = (pb2) ve2VarI.h.get(Long.valueOf(j));
                        if (pb2VarM == null) {
                            pb2VarM = ve2VarI.M(j);
                        }
                        if (pb2VarM != null) {
                            if (ve2VarI.K(j) == null) {
                                ((y3b) ((yi5) ve2VarI.p.get())).a(new ChatNotFoundException(vb9.e(j, "chat is null for #")));
                            } else {
                                vg2 vg2Var = (vg2) ve2VarI.y.get();
                                vg2Var.getClass();
                                pb2 pb2VarA = vg2Var.a(pb2VarM.a, ((z7c) vg2Var.c.getValue()).a.s(), pb2VarM.b, pb2VarM.c, pb2VarM.d, pb2VarM.o);
                                pb2VarA.t0((qv3) ve2VarI.s.get());
                                ve2VarI.d0(j, pb2VarA, true);
                            }
                        }
                        g84 g84Var = g84.a;
                        if (qqgVar == g84Var) {
                            return g84Var;
                        }
                    }
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g8j.b(obj);
        this.Z.a = true;
        return qqgVar;
    }
}
