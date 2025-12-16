package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes2.dex */
public final class nz3 extends dtf implements sm6 {
    public final /* synthetic */ ContactListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = contactListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nz3 nz3Var = (nz3) l((nx3) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nz3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nz3 nz3Var = new nz3(this.X, continuation);
        nz3Var.o = obj;
        return nz3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        nx3 nx3Var = (nx3) this.o;
        ContactListWidget contactListWidget = this.X;
        b0i b0iVar = contactListWidget.Z;
        ji0 ji0Var = contactListWidget.Y;
        b0i b0iVar2 = contactListWidget.X;
        yy7[] yy7VarArr = ContactListWidget.O0;
        contactListWidget.F0();
        CharSequence charSequenceA0 = contactListWidget.A0();
        qqg qqgVar = qqg.a;
        if (charSequenceA0 == null || charSequenceA0.length() == 0) {
            b0iVar2.E(((nx3) contactListWidget.C0().C0.a.getValue()).a);
            ji0Var.E(hd5.a);
            b0iVar.E(((nx3) contactListWidget.C0().C0.a.getValue()).c);
            return qqgVar;
        }
        b0iVar2.E(nx3Var.a);
        ji0Var.E(nx3Var.b);
        b0iVar.E(nx3Var.c);
        return qqgVar;
    }
}
