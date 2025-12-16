package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h04 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ j04 Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h04(j04 j04Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j04Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((h04) l((ku3) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        h04 h04Var = new h04(this.Y, this.Z, continuation);
        h04Var.X = obj;
        return h04Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        j04 j04Var = this.Y;
        k18 k18Var = j04Var.h;
        int i = this.o;
        long j = this.Z;
        try {
            if (i == 0) {
                g8j.b(obj);
                if (u5j.h((ku3) this.X)) {
                    wqi.c(j04.class.getName(), "try to request info for #" + j, new Object[0]);
                    k1a k1aVar = (k1a) j04Var.s.getValue();
                    long j2 = this.Z;
                    int i2 = s65.d;
                    long jH = v9j.h(3, y65.SECONDS);
                    this.o = 1;
                    Object objS = k1aVar.s(j2, jH, this);
                    g84 g84Var = g84.a;
                    if (objS == g84Var) {
                        return g84Var;
                    }
                }
                return ((l24) k18Var.getValue()).c(j);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return ((l24) k18Var.getValue()).c(j);
        } catch (Throwable th) {
            wqi.e(j04.class.getName(), "fail to fetch noncontact #" + j, th);
            return new m11(13, ((l24) k18Var.getValue()).a(j));
        }
    }
}
