package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class dbf extends dtf implements sm6 {
    public final /* synthetic */ StartConversationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbf(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.X = startConversationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dbf dbfVar = (dbf) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dbfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dbf dbfVar = new dbf(continuation, this.X);
        dbfVar.o = obj;
        return dbfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        taf tafVar = (taf) this.o;
        if (tafVar == null) {
            throw new NoWhenBranchMatchedException();
        }
        tcf tcfVar = xz7.f;
        StartConversationScreen startConversationScreen = this.X;
        gw0.w(new mwd(new gbf(tcfVar, null, startConversationScreen, tafVar)), startConversationScreen.getViewLifecycleScope());
        api.c(startConversationScreen);
        return qqg.a;
    }
}
