package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes2.dex */
public final class r23 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListSearchScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r23(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.X = chatsListSearchScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        r23 r23Var = (r23) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        r23Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        r23 r23Var = new r23(continuation, this.X);
        r23Var.o = obj;
        return r23Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        api.c(this.X);
        if (cdaVar instanceof aib) {
            a63 a63Var = a63.c;
            long jLongValue = ((Number) ((aib) cdaVar).a).longValue();
            a63Var.p0().b(":settings/folder/by-chat?id=" + jLongValue, null);
        } else if (cdaVar instanceof u2a) {
            a63.c.p0().b(a9h.d(((Number) ((u2a) cdaVar).a).longValue(), ":profile/change-owner?chat_id=", "&leave_chat=true"), null);
        } else if (cdaVar instanceof ei4) {
            a63.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
