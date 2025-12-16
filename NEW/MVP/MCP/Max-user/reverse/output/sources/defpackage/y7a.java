package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y7a extends dtf implements sm6 {
    public final /* synthetic */ float X;
    public final /* synthetic */ b8a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7a(b8a b8aVar, float f, Continuation continuation) {
        super(2, continuation);
        this.o = b8aVar;
        this.X = f;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        y7a y7aVar = (y7a) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        y7aVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new y7a(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        px8 px8Var = this.o.w0;
        if (px8Var != null) {
            px8Var.D();
            ox8 ox8Var = px8Var.c;
            if (ox8Var.isConnected()) {
                ox8Var.setPlaybackSpeed(this.X);
            } else {
                a8i.l("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
            }
        }
        return qqg.a;
    }
}
