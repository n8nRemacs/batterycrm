package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xw2 extends dtf implements sm6 {
    public final /* synthetic */ pb2 X;
    public final /* synthetic */ zx2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw2(pb2 pb2Var, zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.X = pb2Var;
        this.Y = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xw2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xw2(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        ei4 ei4Var;
        pb2 pb2Var = this.X;
        long j = pb2Var.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            zx2 zx2Var = this.Y;
            if (pb2Var.b.e(((w4e) ((pb3) zx2Var.y0.getValue())).s())) {
                wv2.c.getClass();
                ei4Var = new ei4(":profile/attaches?id=" + j);
            } else {
                wv2 wv2Var = wv2.c;
                boolean zB = zx2Var.B();
                wv2Var.getClass();
                ei4Var = new ei4(":profile?id=" + j + "&type=local_chat&is_opened_from_dialog=" + zB);
            }
            jve jveVar = zx2Var.c1;
            this.o = 1;
            Object objA = jveVar.a(ei4Var, this);
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
