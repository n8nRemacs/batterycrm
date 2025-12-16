package defpackage;

import one.me.profile.screens.members.ChatMembersScreen;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final /* synthetic */ class hr2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ hr2(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ChatMembersScreen chatMembersScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ChatMembersScreen.t0;
                return new vr2(chatMembersScreen.y0(), 62);
            default:
                yy7[] yy7VarArr2 = ChatMembersScreen.t0;
                o91 o91Var = new o91(0, chatMembersScreen.z0(), vr2.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0, 11);
                long jY0 = chatMembersScreen.y0();
                fdc fdcVar = fdc.a;
                return new td9(new ir2(chatMembersScreen, 1), new g9(jY0, fdcVar.b(), fdcVar.getAccessor().d(HttpStatus.SC_PARTIAL_CONTENT), fdcVar.c(), fdcVar.getAccessor().d(208), fdcVar.f(), 1), o91Var);
        }
    }
}
