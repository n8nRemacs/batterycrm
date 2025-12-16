package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class f0i extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ h0i Z;
    public int o;
    public final /* synthetic */ List s0;
    public umh t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0i(int i, Object obj, Continuation continuation, h0i h0iVar, List list) {
        super(2, continuation);
        this.X = i;
        this.Y = obj;
        this.Z = h0iVar;
        this.s0 = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((f0i) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new f0i(this.X, this.Y, continuation, this.Z, this.s0);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        umh umhVar;
        int i;
        Object objA;
        int i2 = this.o;
        int i3 = 1;
        if (i2 == 0) {
            g8j.b(obj);
            umhVar = (umh) this.Y;
            fu6 fu6Var = (fu6) this.Z.d.getValue();
            long j = umhVar.c;
            this.t0 = umhVar;
            i = this.X;
            this.u0 = i;
            this.o = 1;
            objA = fu6Var.a(j, il0.a, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = this.u0;
            umhVar = this.t0;
            g8j.b(obj);
            i = i4;
            objA = obj;
        }
        cu6 cu6Var = (cu6) objA;
        toe toeVar = new toe(umhVar.c, 0, new r5g(cu6Var.a), null, null, new t18(cu6Var.c, cu6Var.b), yne.a, null, null, HttpStatus.SC_REQUEST_TIMEOUT);
        List list = this.s0;
        if (list.size() == 1) {
            i3 = 4;
        } else if (i != 0) {
            i3 = i == ve3.i(list) ? 3 : 2;
        }
        int i5 = i3;
        qsh qshVar = qsh.c;
        long j2 = umhVar.c;
        qshVar.getClass();
        return new wzh(toeVar, new ei4(":settings/webapp?bot_id=" + j2), umhVar.c, i5);
    }
}
