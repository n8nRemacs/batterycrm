package defpackage;

import java.io.IOException;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes2.dex */
public final class l23 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListSearchScreen X;
    public final /* synthetic */ fm9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l23(ChatsListSearchScreen chatsListSearchScreen, fm9 fm9Var, Continuation continuation) {
        super(2, continuation);
        this.X = chatsListSearchScreen;
        this.Y = fm9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((l23) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new l23(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        int i = this.o;
        fm9 fm9Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = ChatsListSearchScreen.I0;
            b43 b43VarZ0 = this.X.z0();
            long j = fm9Var.X.a;
            fh9 fh9Var = fm9Var.o;
            this.o = 1;
            obj = svi.i(((q2b) b43VarZ0.Y).b(), new e33(b43VarZ0, j, fh9Var, null), this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        Long l = (Long) obj;
        if (l != null) {
            a63.N0(a63.c, fm9Var.X.a, "local", new Long(l.longValue()), null, fm9Var.b, null, 104);
        }
        return qqg.a;
    }
}
