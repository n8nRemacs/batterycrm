package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i1a extends dtf implements sm6 {
    public final /* synthetic */ k1a X;
    public final /* synthetic */ long[] Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1a(k1a k1aVar, Continuation continuation, long[] jArr) {
        super(2, continuation);
        this.X = k1aVar;
        this.Y = jArr;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((i1a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new i1a(this.X, continuation, this.Y);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g84 g84Var = g84.a;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                hwa hwaVar = (hwa) this.X.b.getValue();
                fh2 fh2Var = new fh2(this.Y);
                this.o = 1;
                obj = hwaVar.F(fh2Var, this);
                if (obj == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            long[] jArr = this.Y;
            jx3 jx3Var = (jx3) obj;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "MissedContactsController", "success CONTACT_INFO request: " + jx3Var + "; " + ys.z(63, jArr) + "}", null);
                }
            }
            return (jx3) obj;
        } catch (Throwable th) {
            wqi.e("MissedContactsController", "fail to fetch contact info ".concat(ys.z(63, this.Y)), th);
            return null;
        }
    }
}
