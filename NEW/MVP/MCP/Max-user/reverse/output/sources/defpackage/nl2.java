package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.profile.screens.media.ChatMediaListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class nl2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaListWidget b;

    public /* synthetic */ nl2(ChatMediaListWidget chatMediaListWidget, int i) {
        this.a = i;
        this.b = chatMediaListWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i;
        int i2 = this.a;
        int i3 = 2;
        ChatMediaListWidget chatMediaListWidget = this.b;
        switch (i2) {
            case 0:
                yy7[] yy7VarArr = ChatMediaListWidget.t0;
                return new kj1(new bwf(new nl2(chatMediaListWidget, i3)), new s2i(chatMediaListWidget, 0));
            case 1:
                yy7[] yy7VarArr2 = ChatMediaListWidget.t0;
                zk2 zk2Var = new zk2(chatMediaListWidget.getContext());
                zk2Var.setTitle(x8b.s0);
                int iOrdinal = chatMediaListWidget.A0().ordinal();
                if (iOrdinal == 0) {
                    i = y9b.w;
                } else if (iOrdinal == 1) {
                    i = y9b.i;
                } else if (iOrdinal == 2) {
                    i = y9b.v;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = y9b.x;
                }
                zk2Var.setIcon(i);
                return zk2Var;
            default:
                yy7[] yy7VarArr3 = ChatMediaListWidget.t0;
                return chatMediaListWidget.getRouter();
        }
    }
}
