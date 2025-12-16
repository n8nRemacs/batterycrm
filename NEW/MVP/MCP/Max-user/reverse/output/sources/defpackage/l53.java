package defpackage;

import one.me.chats.list.ChatsListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class l53 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatsListWidget b;

    public /* synthetic */ l53(ChatsListWidget chatsListWidget, int i) {
        this.a = i;
        this.b = chatsListWidget;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        z = true;
        ChatsListWidget chatsListWidget = this.b;
        switch (i) {
            case 0:
                if (fni.a(chatsListWidget.b, "all.chat.folder")) {
                    return (ay3) l14.a.getAccessor().c(556);
                }
                ay3.a.getClass();
                return zx3.b;
            case 1:
                yy7[] yy7VarArr = ChatsListWidget.L0;
                return chatsListWidget.getRouter();
            case 2:
                yy7[] yy7VarArr2 = ChatsListWidget.L0;
                mk4 mk4Var = (mk4) bi0.a.getAccessor().c(551);
                String str = chatsListWidget.b;
                fu2 fu2Var = new fu2(11);
                mk4Var.getClass();
                return new b73(str, fu2Var);
            case 3:
                yy7[] yy7VarArr3 = ChatsListWidget.L0;
                if (((v03) chatsListWidget.B0().L0.getValue()).b && !chatsListWidget.A0().M0()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                yy7[] yy7VarArr4 = ChatsListWidget.L0;
                return new k53((ay3) chatsListWidget.o.getValue(), chatsListWidget.b, (kj1) chatsListWidget.H0.getValue());
            case 5:
                yy7[] yy7VarArr5 = ChatsListWidget.L0;
                return new zh0(new bwf(new l53(chatsListWidget, 2)), false, null, 62);
            case 6:
                yy7[] yy7VarArr6 = ChatsListWidget.L0;
                x3b x3bVar = new x3b(chatsListWidget.getContext());
                x3bVar.setIcon(yud.z0);
                x3bVar.setTitle(new n5g(g3d.chats_list_empty_state_title));
                mgb.a(x3bVar, new ue(8, x3bVar, chatsListWidget));
                return x3bVar;
            case 7:
                yy7[] yy7VarArr7 = ChatsListWidget.L0;
                a63.c.p0().b(":settings/folder/members-picker?folder_id=".concat(chatsListWidget.b), null);
                return qqg.a;
            case 8:
                yy7[] yy7VarArr8 = ChatsListWidget.L0;
                return new kj1(new bwf(new l53(chatsListWidget, z ? 1 : 0)), new s2i(chatsListWidget, 0));
            default:
                yy7[] yy7VarArr9 = ChatsListWidget.L0;
                return new g23(chatsListWidget.A0(), new l53(chatsListWidget, 3), l14.a.getAccessor().d(487));
        }
    }
}
