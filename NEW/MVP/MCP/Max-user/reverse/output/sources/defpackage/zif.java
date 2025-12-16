package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zif extends dtf implements sm6 {
    public final /* synthetic */ bjf X;
    public final /* synthetic */ Long Y;
    public final /* synthetic */ Long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zif(bjf bjfVar, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.X = bjfVar;
        this.Y = l;
        this.Z = l2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zif) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zif(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = bjf.A0;
            vr5 vr5Var = (vr5) this.X.d.getValue();
            Long l = this.Y;
            final long jLongValue = l.longValue();
            Long l2 = this.Z;
            final long jLongValue2 = l2.longValue();
            vr5Var.getClass();
            wqi.c("vr5", "setFavoriteStickerSetMoved: stickerSetId=%d, targetPositionStickerId=%d", l, l2);
            int i2 = 2;
            ik3 ik3Var = new ik3(vr5Var.a(), i2, new sr5(0, jLongValue, jLongValue2));
            final gs5 gs5Var = (gs5) vr5Var.X.getValue();
            gs5Var.getClass();
            uk3 uk3VarD = new ik3(ik3Var, 0, new ik3(new wk3(3, new drf() { // from class: ds5
                @Override // defpackage.drf
                public final Object get() {
                    final gs5 gs5Var2 = gs5Var;
                    final long j = jLongValue;
                    final long j2 = jLongValue2;
                    return gs5Var2.a(new Callable() { // from class: fs5
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            hwa hwaVar = gs5Var2.a;
                            return Long.valueOf(hwaVar.u().c(new mu(hwaVar.t().a.k(), 5, j, j2, -1), false, 0L, (12 & 8) != 0 ? 0 : 1));
                        }
                    });
                }
            }).h(new kce(20, ou.class)), i2, new er5(21)).h(gs5Var.d)).e(new er5(8)).d(new p6() { // from class: tr5
                @Override // defpackage.p6
                public final void run() {
                    wqi.c("vr5", "setFavoriteStickerSetMoved: success move stickerSetId=%d, to position of stickerSetId=%d", Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
                }
            });
            this.o = 1;
            Object objA = n8j.a(uk3VarD, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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
