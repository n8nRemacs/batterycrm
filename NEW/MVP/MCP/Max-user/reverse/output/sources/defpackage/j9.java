package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;

/* loaded from: classes2.dex */
public final class j9 extends dtf implements sm6 {
    public final /* synthetic */ AddChatAdminsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(Continuation continuation, AddChatAdminsScreen addChatAdminsScreen) {
        super(2, continuation);
        this.X = addChatAdminsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        j9 j9Var = (j9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        j9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        j9 j9Var = new j9(continuation, this.X);
        j9Var.o = obj;
        return j9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        sd9 sd9Var = (sd9) this.o;
        boolean z = sd9Var instanceof od9;
        qqg qqgVar = qqg.a;
        AddChatAdminsScreen addChatAdminsScreen = this.X;
        if (z) {
            yy7[] yy7VarArr = AddChatAdminsScreen.t0;
            cpi.c(addChatAdminsScreen.z0());
            kkc kkcVar = kkc.c;
            long jY0 = addChatAdminsScreen.y0();
            long j = ((od9) sd9Var).a;
            kkcVar.getClass();
            StringBuilder sb = new StringBuilder(":profile/edit/admin_permission?chat_id=");
            sb.append(jY0);
            sb.append("&contact_id=");
            kkcVar.p0().b(ho7.k(sb, j, "&permissions_type=setup_new_admin"), null);
            return qqgVar;
        }
        if (sd9Var instanceof nd9) {
            yy7[] yy7VarArr2 = AddChatAdminsScreen.t0;
            cpi.c(addChatAdminsScreen.z0());
            fbb searchView = addChatAdminsScreen.z0().getSearchView();
            if (searchView != null) {
                searchView.b();
            }
            bcb bcbVar = addChatAdminsScreen.s0;
            if (bcbVar != null) {
                bcbVar.a();
            }
            ccb ccbVar = new ccb(addChatAdminsScreen);
            ccbVar.h(z7.e(addChatAdminsScreen.getContext(), x8b.e2));
            ccbVar.e(new qcb(yud.r1));
            addChatAdminsScreen.s0 = ccbVar.i();
        }
        return qqgVar;
    }
}
