package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class gbf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x26 Y;
    public final /* synthetic */ StartConversationScreen Z;
    public int o;
    public final /* synthetic */ taf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbf(x26 x26Var, Continuation continuation, StartConversationScreen startConversationScreen, taf tafVar) {
        super(2, continuation);
        this.Y = x26Var;
        this.Z = startConversationScreen;
        this.s0 = tafVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gbf) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gbf gbfVar = new gbf(this.Y, continuation, this.Z, this.s0);
        gbfVar.X = obj;
        return gbfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z26 z26Var = (z26) this.X;
            x92 x92Var = new x92(new rid(), z26Var, (Object) this.Z, (Object) this.s0, 7);
            this.o = 1;
            Object objD = this.Y.d(x92Var, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
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
