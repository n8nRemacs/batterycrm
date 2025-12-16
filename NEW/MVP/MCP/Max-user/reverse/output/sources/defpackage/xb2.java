package defpackage;

import one.me.profile.screens.members.ChatAdminsScreen;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final /* synthetic */ class xb2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAdminsScreen b;

    public /* synthetic */ xb2(ChatAdminsScreen chatAdminsScreen, int i) {
        this.a = i;
        this.b = chatAdminsScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ChatAdminsScreen chatAdminsScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ChatAdminsScreen.u0;
                return new hc2(chatAdminsScreen.z0());
            default:
                yy7[] yy7VarArr2 = ChatAdminsScreen.u0;
                jx0 jx0Var = new jx0(1, chatAdminsScreen.y0(), hc2.class, "getContextMenuActions", "getContextMenuActions(J)Ljava/util/List;", 0, 3);
                o91 o91Var = new o91(0, chatAdminsScreen.y0(), hc2.class, "getButtonActions", "getButtonActions()Lkotlinx/coroutines/flow/Flow;", 0, 8);
                long jZ0 = chatAdminsScreen.z0();
                fdc fdcVar = fdc.a;
                return new td9(jx0Var, new wb2(jZ0, fdcVar.b(), fdcVar.d(), fdcVar.getAccessor().d(HttpStatus.SC_PARTIAL_CONTENT), fdcVar.c(), fdcVar.getAccessor().d(208), fdcVar.f()), o91Var);
        }
    }
}
