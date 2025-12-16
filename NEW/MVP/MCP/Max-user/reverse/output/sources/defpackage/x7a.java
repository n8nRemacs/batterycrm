package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x7a extends dtf implements sm6 {
    public final /* synthetic */ b8a X;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7a(long j, b8a b8aVar, Continuation continuation) {
        super(2, continuation);
        this.o = j;
        this.X = b8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        x7a x7aVar = (x7a) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        x7aVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new x7a(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int i = b8a.U0;
        long j = this.o;
        wqi.c("b8a", "seekToPosition, posMs %d", new Long(j));
        b8a b8aVar = this.X;
        b8aVar.d();
        px8 px8Var = b8aVar.w0;
        if (px8Var != null) {
            px8Var.D();
            ox8 ox8Var = px8Var.c;
            if (ox8Var.isConnected()) {
                ox8Var.seekTo(j);
            } else {
                a8i.l("MediaController", "The controller is not connected. Ignoring seekTo().");
            }
        }
        b8aVar.C0.m(null, new Long(j));
        b8aVar.Q0.m(null, new Float(n7j.b((float) (j / b8aVar.O0), 0.0f, 1.0f)));
        return qqg.a;
    }
}
