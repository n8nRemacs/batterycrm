package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes2.dex */
public final class oz3 extends dtf implements sm6 {
    public final /* synthetic */ ContactListWidget X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ View Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz3(ContactListWidget contactListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.X = contactListWidget;
        this.Y = j;
        this.Z = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oz3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new oz3(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        long j = this.Y;
        ContactListWidget contactListWidget = this.X;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = ContactListWidget.O0;
            zy3 zy3VarC0 = contactListWidget.C0();
            this.o = 1;
            obj = svi.i(((q2b) zy3VarC0.c).a(), new qy3(zy3VarC0, j, null), this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        List list = (List) (((List) obj).isEmpty() ? null : obj);
        if (list != null) {
            Long l = new Long(j);
            yy7[] yy7VarArr2 = ContactListWidget.O0;
            hs hsVar = contactListWidget.I0;
            yy7 yy7Var = ContactListWidget.O0[4];
            hsVar.b(contactListWidget, l);
            h6j.a(2).o(list).B(this.Z).v(vw4.d().getDisplayMetrics().density * 12.0f).build().u(contactListWidget);
        }
        return qqg.a;
    }
}
