package defpackage;

import java.util.Iterator;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class i23 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i23(zkb zkbVar, boolean z, boolean z2) {
        this.d = zkbVar;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.d;
                boolean z2 = this.c;
                yy7[] yy7VarArr = ChatsListSearchScreen.I0;
                if (z) {
                    chatsListSearchScreen.C0();
                }
                chatsListSearchScreen.D0(z2);
                break;
            default:
                zkb zkbVar = (zkb) this.d;
                boolean z3 = this.b;
                boolean z4 = this.c;
                ((ie8) zkbVar.b).n.log("OKRTCLmsAdapter", "capture state changed, isCapturing=" + z3 + ", isFailedStart=" + z4);
                d12 d12Var = ((ie8) zkbVar.b).r;
                if (d12Var != null) {
                    if (z3) {
                        Iterator it = d12Var.f.iterator();
                        while (it.hasNext()) {
                            ((ie8) it.next()).getClass();
                        }
                    } else if (!z4) {
                        d12Var.b();
                    }
                }
                ge8 ge8Var = ((ie8) zkbVar.b).x;
                if (ge8Var != null) {
                    ge8Var.a(z3);
                }
                ie8 ie8Var = (ie8) zkbVar.b;
                Iterator it2 = ie8Var.c.iterator();
                while (it2.hasNext()) {
                    ((je8) it2.next()).b(ie8Var);
                }
                break;
        }
    }

    public /* synthetic */ i23(boolean z, ChatsListSearchScreen chatsListSearchScreen, boolean z2) {
        this.b = z;
        this.d = chatsListSearchScreen;
        this.c = z2;
    }
}
