package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.chat.PickChatMembers;

/* loaded from: classes2.dex */
public final class lvb extends dtf implements sm6 {
    public final /* synthetic */ PickChatMembers X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvb(Continuation continuation, PickChatMembers pickChatMembers) {
        super(2, continuation);
        this.X = pickChatMembers;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lvb lvbVar = (lvb) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lvbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lvb lvbVar = new lvb(continuation, this.X);
        lvbVar.o = obj;
        return lvbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long[] jArrE0 = ue3.e0((Set) this.o);
        PickChatMembers pickChatMembers = this.X;
        hs hsVar = pickChatMembers.t0;
        yy7 yy7Var = PickChatMembers.x0[0];
        hsVar.b(pickChatMembers, jArrE0);
        return qqg.a;
    }
}
