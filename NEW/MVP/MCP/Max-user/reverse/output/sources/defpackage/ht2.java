package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;

/* loaded from: classes2.dex */
public final class ht2 extends dtf implements sm6 {
    public final /* synthetic */ ChatNotificationsSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht2(Continuation continuation, ChatNotificationsSettingsScreen chatNotificationsSettingsScreen) {
        super(2, continuation);
        this.X = chatNotificationsSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ht2 ht2Var = (ht2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ht2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ht2 ht2Var = new ht2(continuation, this.X);
        ht2Var.o = obj;
        return ht2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.c.E((List) this.o);
        return qqg.a;
    }
}
