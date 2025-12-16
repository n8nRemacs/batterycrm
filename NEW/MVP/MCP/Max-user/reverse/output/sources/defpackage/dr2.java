package defpackage;

import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final /* synthetic */ class dr2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersCompactWidget b;

    public /* synthetic */ dr2(ChatMembersCompactWidget chatMembersCompactWidget, int i) {
        this.a = i;
        this.b = chatMembersCompactWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ChatMembersCompactWidget chatMembersCompactWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ChatMembersCompactWidget.Y;
                return new vr2(chatMembersCompactWidget.y0(), 60);
            default:
                yy7[] yy7VarArr2 = ChatMembersCompactWidget.Y;
                o91 o91Var = new o91(0, chatMembersCompactWidget.z0(), vr2.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0, 10);
                long jY0 = chatMembersCompactWidget.y0();
                fdc fdcVar = fdc.a;
                return new td9(new d92(3, chatMembersCompactWidget), new g9(jY0, fdcVar.b(), fdcVar.getAccessor().d(HttpStatus.SC_PARTIAL_CONTENT), fdcVar.c(), fdcVar.getAccessor().d(208), fdcVar.f(), 1), o91Var);
        }
    }
}
