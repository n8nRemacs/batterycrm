package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.chat.PickChatMembers;

/* loaded from: classes2.dex */
public final class nvb extends dtf implements sm6 {
    public final /* synthetic */ PickChatMembers X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvb(Continuation continuation, PickChatMembers pickChatMembers) {
        super(2, continuation);
        this.X = pickChatMembers;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nvb nvbVar = (nvb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nvbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nvb nvbVar = new nvb(continuation, this.X);
        nvbVar.o = obj;
        return nvbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((Boolean) this.o).booleanValue()) {
            yy7[] yy7VarArr = PickChatMembers.x0;
            PickChatMembers pickChatMembers = this.X;
            qsb.g((qsb) pickChatMembers.u0.getValue(), new s2i(pickChatMembers, 1));
        }
        return qqg.a;
    }
}
