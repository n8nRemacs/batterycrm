package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class ebf extends dtf implements sm6 {
    public final /* synthetic */ StartConversationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebf(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.X = startConversationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ebf ebfVar = (ebf) l((ei4) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ebfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ebf ebfVar = new ebf(continuation, this.X);
        ebfVar.o = obj;
        return ebfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        uaf.c.s0((ei4) this.o);
        return qqg.a;
    }
}
