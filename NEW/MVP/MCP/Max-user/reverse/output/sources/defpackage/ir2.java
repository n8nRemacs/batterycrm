package defpackage;

import one.me.profile.screens.members.ChatMembersScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class ir2 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ ir2(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        ChatMembersScreen chatMembersScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ChatMembersScreen.t0;
                chatMembersScreen.getRouter().C();
                return qqgVar;
            case 1:
                ((Long) obj).getClass();
                yy7[] yy7VarArr2 = ChatMembersScreen.t0;
                return chatMembersScreen.z0().u();
            default:
                yy7[] yy7VarArr3 = ChatMembersScreen.t0;
                chatMembersScreen.A0().Y.m(null, rd5.a);
                return qqgVar;
        }
    }
}
