package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u7a extends dtf implements sm6 {
    public final /* synthetic */ b8a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7a(b8a b8aVar, Continuation continuation) {
        super(2, continuation);
        this.o = b8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        u7a u7aVar = (u7a) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        u7aVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new u7a(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        px8 px8Var;
        g8j.b(obj);
        b8a b8aVar = this.o;
        px8 px8Var2 = b8aVar.w0;
        if ((px8Var2 == null || px8Var2.getPlaybackState() != 3) && (px8Var = b8aVar.w0) != null) {
            px8Var.prepare();
        }
        px8 px8Var3 = b8aVar.w0;
        if (px8Var3 != null) {
            px8Var3.play();
        }
        return qqg.a;
    }
}
