package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;

/* loaded from: classes2.dex */
public final class tb extends dtf implements sm6 {
    public final /* synthetic */ AdminsFromContactsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(Continuation continuation, AdminsFromContactsScreen adminsFromContactsScreen) {
        super(2, continuation);
        this.X = adminsFromContactsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tb tbVar = (tb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tb tbVar = new tb(continuation, this.X);
        tbVar.o = obj;
        return tbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String str = (String) this.o;
        yy7[] yy7VarArr = AdminsFromContactsScreen.t0;
        ((ac) this.X.c.getValue()).Y.setValue(str);
        return qqg.a;
    }
}
