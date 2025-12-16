package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f36 extends dtf implements em6 {
    public int X;
    public final /* synthetic */ ccd Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int o;
    public final /* synthetic */ sac s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f36(ccd ccdVar, int i, sac sacVar, Continuation continuation, int i2) {
        super(1, continuation);
        this.o = i2;
        this.Y = ccdVar;
        this.Z = i;
        this.s0 = sacVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.o) {
            case 0:
                sac sacVar = this.s0;
                return new f36(this.Y, this.Z, sacVar, (Continuation) obj, 0).n(qqg.a);
            default:
                sac sacVar2 = this.s0;
                return new f36(this.Y, this.Z, sacVar2, (Continuation) obj, 1).n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        switch (this.o) {
            case 0:
                int i = this.X;
                if (i == 0) {
                    g8j.b(obj);
                    List listB = zs0.b(this.Y, this.Z);
                    if (!((ArrayList) listB).isEmpty()) {
                        this.X = 1;
                        Object objH = ((pac) this.s0).a.h(listB, this);
                        g84 g84Var = g84.a;
                        if (objH == g84Var) {
                            return g84Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return Boolean.FALSE;
            default:
                int i2 = this.X;
                if (i2 == 0) {
                    g8j.b(obj);
                    List listB2 = zs0.b(this.Y, this.Z);
                    if (!((ArrayList) listB2).isEmpty()) {
                        this.X = 1;
                        Object objH2 = ((pac) this.s0).a.h(listB2, this);
                        g84 g84Var2 = g84.a;
                        if (objH2 == g84Var2) {
                            return g84Var2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return Boolean.TRUE;
        }
    }
}
