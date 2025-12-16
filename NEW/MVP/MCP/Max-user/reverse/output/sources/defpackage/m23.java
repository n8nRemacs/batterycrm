package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes2.dex */
public final class m23 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListSearchScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m23(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.X = chatsListSearchScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        m23 m23Var = (m23) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        m23Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        m23 m23Var = new m23(continuation, this.X);
        m23Var.o = obj;
        return m23Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        hd5 hd5Var = hd5.a;
        g8j.b(obj);
        y23 y23Var = (y23) this.o;
        ChatsListSearchScreen chatsListSearchScreen = this.X;
        yy7[] yy7VarArr = ChatsListSearchScreen.I0;
        f1e f1eVar = f1e.CHATS_LIST_SEARCH_RESULT;
        lg8 lg8Var = lg8.d;
        String name = ChatsListSearchScreen.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, name, "updateState " + y23Var, null);
        }
        int iOrdinal = y23Var.a.ordinal();
        if (iOrdinal == 0) {
            chatsListSearchScreen.y0();
            chatsListSearchScreen.z0.E(hd5Var);
            chatsListSearchScreen.B0.E(hd5Var);
            chatsListSearchScreen.A0.E(Collections.singletonList(pc8.a));
        } else if (iOrdinal == 2) {
            tc7 tc7Var = y23Var.c;
            boolean z = y23Var.e;
            chatsListSearchScreen.A0.E(hd5Var);
            chatsListSearchScreen.z0.E(hd5Var);
            chatsListSearchScreen.B0.E(hd5Var);
            String name2 = ChatsListSearchScreen.class.getName();
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, name2, "idleSearchData.recentContacts = ".concat(ue3.N(tc7Var.a, null, null, null, null, 63)), null);
            }
            chatsListSearchScreen.u0.F(Collections.singletonList(tc7Var.a), new dj(z, chatsListSearchScreen, tc7Var, 1));
            gda.g((gda) chatsListSearchScreen.b.getValue(), f1e.CHATS_LIST_SEARCH_INITIAL);
        } else if (iOrdinal == 3) {
            List list = y23Var.d;
            boolean z2 = y23Var.e;
            boolean z3 = y23Var.f;
            chatsListSearchScreen.A0.E(hd5Var);
            chatsListSearchScreen.y0();
            chatsListSearchScreen.B0.E(hd5Var);
            chatsListSearchScreen.z0.F(list, new i23(z2, chatsListSearchScreen, z3));
            gda.g((gda) chatsListSearchScreen.b.getValue(), f1eVar);
        } else if (iOrdinal == 4) {
            chatsListSearchScreen.A0.E(hd5Var);
            chatsListSearchScreen.y0();
            chatsListSearchScreen.z0.E(hd5Var);
            chatsListSearchScreen.B0.F(Collections.singletonList(pd5.a), new vy1(17, chatsListSearchScreen));
            gda.g((gda) chatsListSearchScreen.b.getValue(), f1eVar);
        }
        return qqg.a;
    }
}
