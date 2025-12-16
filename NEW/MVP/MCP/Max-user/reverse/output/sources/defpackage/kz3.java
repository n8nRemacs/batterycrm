package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes2.dex */
public final class kz3 extends dtf implements sm6 {
    public final /* synthetic */ ContactListWidget X;
    public final /* synthetic */ dv6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz3(ContactListWidget contactListWidget, dv6 dv6Var, Continuation continuation) {
        super(2, continuation);
        this.X = contactListWidget;
        this.Y = dv6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kz3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kz3(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        dv6 dv6Var = this.Y;
        ContactListWidget contactListWidget = this.X;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = ContactListWidget.O0;
            zy3 zy3VarC0 = contactListWidget.C0();
            gx3 gx3Var = dv6Var.Y;
            this.o = 1;
            Object objI = svi.i(((q2b) zy3VarC0.c).b(), new ry3(zy3VarC0, gx3Var, null), this);
            g84 g84Var = g84.a;
            if (objI != g84Var) {
                objI = qqgVar;
            }
            if (objI == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        yy7[] yy7VarArr2 = ContactListWidget.O0;
        int iOrdinal = contactListWidget.C0().b.ordinal();
        if (iOrdinal == 0) {
            contactListWidget.f(dv6Var.a, false);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            y14 y14Var = y14.c;
            long j = dv6Var.a;
            y14Var.getClass();
            y14Var.p0().b(":profile?id=" + j + "&type=contact", null);
        }
        return qqgVar;
    }
}
