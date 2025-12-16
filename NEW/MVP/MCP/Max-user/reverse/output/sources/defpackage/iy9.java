package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.settings.MessagesSettingsScreen;

/* loaded from: classes2.dex */
public final class iy9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy9(Continuation continuation, MessagesSettingsScreen messagesSettingsScreen) {
        super(2, continuation);
        this.X = messagesSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        iy9 iy9Var = (iy9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        iy9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iy9 iy9Var = new iy9(continuation, this.X);
        iy9Var.o = obj;
        return iy9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof ei4) {
            hy9.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
