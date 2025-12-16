package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes2.dex */
public final class dz3 extends dtf implements sm6 {
    public final /* synthetic */ ContactListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = contactListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dz3 dz3Var = (dz3) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dz3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dz3 dz3Var = new dz3(this.X, continuation);
        dz3Var.o = obj;
        return dz3Var;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        api.c(this.X);
        if (cdaVar instanceof ei4) {
            y14.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof bib) {
            ccb ccbVar = new ccb(this.X);
            ccbVar.h("Ещё не реализовано");
            ccbVar.i();
        } else if (cdaVar instanceof haf) {
            ContactListWidget contactListWidget = this.X;
            yy7[] yy7VarArr = ContactListWidget.O0;
            contactListWidget.y0().f = 1;
            this.X.y0().d = rx1.a;
            haf hafVar = (haf) cdaVar;
            this.X.y0().i(tx1.CONTACT, hafVar.c);
            ContactListWidget contactListWidget2 = this.X;
            long j = hafVar.b;
            boolean z = hafVar.c;
            api.c(contactListWidget2);
            ((kj1) contactListWidget2.C0.getValue()).l(j, z, new cz3(j, z));
        }
        return qqg.a;
    }
}
